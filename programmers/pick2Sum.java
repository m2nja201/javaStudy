// 0215 (SUCCESS)

import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        Vector<Integer> ans = new Vector<Integer>();
        int start = 0;
        
        for (start = 0; start<numbers.length; start++){
            for (int i = 0; i<numbers.length; i++){
                if (i != start){
                    if (ans.indexOf(numbers[start]+numbers[i]) == -1){
                        ans.add(numbers[start]+numbers[i]);
                    }
                
                }
            }
        }

        int[] answer = new int[ans.size()];
        for (int j=0; j<ans.size(); j++){
            answer[j] = ans.get(j);
            int jj = ans.get(j);
        }
        Arrays.sort(answer);
        return answer;
    }
}