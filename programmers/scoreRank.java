import java.util.Arrays;
import java.util.Comparator;

class Solution{
    
    public int[] solution(int[] answers) {
        
        int[] num1 = {1, 2, 3, 4, 5};
        int[] num2 = {2, 1, 2, 3, 2, 4};
        int[] num3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[][] correct = {{0,3},{0,2},{0,1}};
        
        for (int i=0; i<answers.length; i++){
            if(answers[i]==num1[i%5]){
                correct[2][0]++;
            }
            if(answers[i]==num2[i%6]){
                correct[1][0]++;
            }
            if(answers[i]==num3[i%10]){
                correct[0][0]++;
            }
        }
        
        Arrays.sort(correct, new Comparator<int[]>(){
            public int compare(int[] t1, int[] t2){
                return t1[0]-t2[0];
            }
        });
        
        
        String str=String.valueOf(correct[2][1]);
        if (correct[1][0]==correct[2][0]) str += String.valueOf(correct[1][1]);
        if(correct[0][0]==correct[2][0]) str += String.valueOf(correct[0][1]);
        
        int[] answer= new int[str.length()];
        for (int i=0; i<str.length(); i++){
            answer[i] = Integer.parseInt(str.substring(i,i+1));
        }
        return answer;
       
    }
}