class Solution {
    public String solution(int[] numbers, String hand) {
        int now = -1;
        String answer = "";
        int lastL = 0;
        int lastR = 0;

        for(int i=0; i<numbers.length; i++){
            now = numbers[i];
            switch(now){
                case 1 : case 4 : case 7:
                    answer += "L";
                    lastL = now;
                    break;
                case 3 : case 6 : case 9:
                    answer += "R";
                    lastR = now;
                    break;
                case 2: case 5: case 8: case 0:
                    int disL2 = distance(lastL, now);
                    int disR2 = distance(lastR, now);
                    if (disL2 == disR2){
                        if (hand.charAt(0)=='r'){
                            answer += "R";
                            lastR = now;
                        }
                        else {
                            answer += "L";
                            lastL = now;
                        }
                    }
                    else if (disL2 > disR2){
                        answer += "R";
                        lastR = now;
                    }
                    else {
                        answer += "L";
                        lastL = now;
                    }
                    break;
                default :
                    break;
            }
        }
        
        return answer;
    }
    
    public static int distance(int last, int noww){
        String [] num = {"13", "00", "10", "20", "01", "11", "21", "02", "12", "22"};
        int one = Character.getNumericValue(num[noww].charAt(0)) - Character.getNumericValue(num[last].charAt(0));
        int two = Character.getNumericValue(num[noww].charAt(1)) - Character.getNumericValue(num[last].charAt(1));

        int dist = one*one + two*two;
    
        return dist;
    }
}