// 0216~0217

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int[] nonclr = new int[N+1]; //N+1
        int[] clr = new int[N];
        
        double[][] fail = new double[N][2];
        
        for (int i =0 ; i<stages.length; i++){
            nonclr[stages[i]-1]++;
        }
        
        for (int i = 0; i<N; i++){
            for (int j =i; j<N; j++){
                clr[i] += nonclr[j];
                if ((j==N-1)&&(nonclr[N] != 0)) clr[i] += nonclr[N];
            }
            fail[i][1] = i+1;
        }
        
        for (int k = 0; k<N; k++){
            if (clr[k] == 0) fail[k][0] = 0.0;
            else {
                fail[k][0] = (double)nonclr[k]/clr[k];
                
            }
           
        } 
        Arrays.sort(fail, (o1, o2) -> {
           if(o1[0] == o2[0]){
               return Double.compare(o1[1], o2[1]);
           } else {
               return Double.compare(o2[0], o1[0]);
           }
        });
        /*for (int i = 0; i<N; i++){
            for (int j=0; j<2; j++){
                System.out.print(fail[i][j] + "  ");
            }
            System.out.println("");
        }*/

        for (int m = 0; m<answer.length; m++){
            answer[m] = (int)fail[m][1];
        }
        return answer;
    }
}