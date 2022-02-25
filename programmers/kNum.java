// 0225

import java.util.*;

class Solution {
    public List<Integer> solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<Integer>();
        
        int index = 0;
        
        while(index<commands.length){
            List<Integer> temp = new ArrayList<Integer>();
            for (int i=commands[index][0]-1; i<commands[index][1]; i++){
                temp.add(array[i]);
            }
            Collections.sort(temp);
            answer.add(temp.get(commands[index][2]-1));
            index++;
        }
        
        
        return answer;
    }
}