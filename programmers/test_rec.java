// 0217~0218

class Solution {
    public int[] solution(int[][] v) {
        int[] answer = new int[2];
        int[] mid = new int[2];

        int a = 0; int b = 0; int c = 0; int d = 0; // 1y, 2y, 1x, 2x

        //int v0 = (v[0][0] - v[1][0]) * (v[0][0] - v[2][0]) + (v[0][1] - v[1][1]) * (v[0][1] - v[2][1]);
        //int v1 = (v[1][0] - v[0][0]) * (v[1][0] - v[2][0]) + (v[1][1] - v[0][1]) * (v[1][1] - v[2][1]);
        //int v2 = (v[2][0] - v[0][0]) * (v[2][0] - v[1][0]) + (v[2][1] - v[0][1]) * (v[2][1] - v[2][1]);

        // v[1]이 중앙값
        if (dot(v[0][0], v[0][1], v[1][0], v[1][1], v[2][0], v[2][1])) {
            c = v[0][0];  
            a = v[0][1];
            d = v[2][0];  
            b = v[2][1];
            mid[0] = v[1][0];
            mid[1] = v[1][1];
        }
        else if (dot(v[1][0], v[1][1], v[2][0], v[2][1], v[0][0], v[0][1])){
            c = v[0][0];  
            a = v[0][1];
            d = v[1][0];  
            b = v[1][1];
            mid[0] = v[2][0];
            mid[1] = v[2][1];
        }
        else if (dot(v[1][0], v[1][1], v[0][0], v[0][1], v[2][0], v[2][1])){
            c = v[1][0]; 
            a = v[1][1];
            d = v[2][0];  
            b = v[2][1];
            mid[0] = v[0][0];
            mid[1] = v[0][1];
        }

        int dx = 1;
        int dy = 1;
        double preY1 = 1.0;
        double preY2 = 1.0;
        int temp = 1;
        
        for (int i = 1; i<100000000; i++){
            dx = i;
            preY1 = cal(1, (-a-b), (a*b + (c-i)*(d-i)), 0);
            preY2 = cal(1, (-a-b), (a*b + (c-i)*(d-i)), 1);
            
            if(isNatural(preY1)){
                dy = (int)preY1;
                if (((dx == c) && (dy == a)) || ((dx == d) && (dy == b)) || ((dx == mid[0]) && (dy == mid[1]))){
                    if(isNatural(preY2)){
                        dy = (int)preY2;
                        if (((dx == c) && (dy == a)) || ((dx == d) && (dy == b)) || ((dx == mid[0]) && (dy == mid[1]))){}
                        else {
                            dy = (int)preY2;
                            if (height2(dx, dy, c, a) == height2(mid[0], mid[1], d, b)) break;
                        }
                    }
                }
                else { 
                    dy = (int)preY1;
                    if (height2(dx, dy, c, a) == height2(mid[0], mid[1], d, b)) break;
                }
            }
            
        } 
        answer[0] = dx;
        answer[1] = dy;

        return answer;
    }

    public boolean isNatural(double num){
        if (num < 0) return false;
        if ((int)num == Math.ceil(num)) {
            return true;
        }
        else return false;
    }

    public double cal(int aa, int bb, int cc ,int ii){
        double an = 0;
        if (ii == 0){
            an = (-bb + Math.sqrt(bb*bb - 4*aa*cc)) / (2*aa);
        }
        if (ii == 1){
            an = (-bb - Math.sqrt(bb*bb - 4*aa*cc)) / (2*aa);
        }
        return an;
    }

    public boolean dot(int q, int w, int e, int r, int t, int y){
        int vec1x = q - e;
        int vec1y = w - r;
        int vec2x = t - e;
        int vec2y = y - r;
        if ((vec1x*vec2x + vec1y*vec2y) == 0) return true;
        else return false;
    }

    public int height2(int q, int w, int e, int r){
        return ((int)(Math.pow((q-e), 2)) + (int)(Math.pow((w-r), 2)));
    }
}