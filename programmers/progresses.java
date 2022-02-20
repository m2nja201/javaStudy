import java.util.*;

public class progresses {
    public static int[] solution(int[] progresses, int[] speeds) {
        int[] count = new int[20];
        Queue<Integer> que = new LinkedList<>();
        
        for (int i= 0 ; i<progresses.length; i++){
            int day = (100-progresses[i])/speeds[i];
            if ((100-progresses[i])%speeds[i] != 0){
                day++;
            }
            que.add(day);
        }
        
        Stack<Integer> ans = new Stack<>();
        boolean flag = false;
        while(!que.isEmpty()){
            int temp = que.poll();
			if(que.isEmpty()) {
				if (flag) break;
				else ans.push(1);
				break;
			}
			ans.push(1);
            if (temp >= que.peek()) {
                if (ans.size() == 0){ 
                    ans.push(2);
                    que.poll();
                    flag = true;
                }
                else {
                    int temp2 = ans.peek();
					ans.pop();
					temp2++;
					ans.add(temp2);
                }
            }
            else {
                ans.push(1);
				flag = false;
            }
        }
        
        int[] answer = new int[ans.size()];
        for (int i = ans.size()-1; i>=0; i--){
            answer[i] = ans.peek();
            ans.pop();
        }
        
        return answer;
    }
	
	public static void main(String [] args){
		int[] input = {95, 90, 99, 99, 80, 99};
		int[] speed = {1, 1, 1, 1, 1, 1};

		System.out.println(solution(input, speed).toString());
	}
}