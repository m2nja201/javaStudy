import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] count = new int[20];
        Queue<Integer> que = new LinkedList<>();
        
        for (int i= 0 ; i<progresses.length; i++){
            int day = (100-progresses[i])/speeds[i];
            if ((100-progresses[i])%speeds[i] != 0){
                day++;
            }
            que.add(day);
        }
        
        int last = 0;
        
        Stack<Integer> ans = new Stack<>();
        boolean flag = false;
        while(!que.isEmpty()){
            int temp = que.poll();
            System.out.println(temp);
            
            if (ans.size() == 0){
                ans.push(1);
                last = temp;
            } else {
                if (temp <= last){
                    int temp2 = ans.peek();
                    ans.pop();
                    temp2++;
                    ans.add(temp2);
                    last = temp;
                }
                else {
                    ans.add(1);
                    last = temp;
                }
            }
        }
        
        int[] answer = new int[ans.size()];
        for (int i = ans.size()-1; i>=0; i--){
            answer[i] = ans.peek();
            ans.pop();
        }
        
        return answer;
    }
}