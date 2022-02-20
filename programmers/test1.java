import java.util.*;
class test1 {

    public static String[] solution(String[] records) {

        // Stack
        String name, act;

        int[] count = {0, 0}; // share comment
        String temp = "";

        Stack<Pair> alarm = new Stack<Pair>();
        Queue<Pair> restore = new LinkedList<Pair>();
        StringBuffer newName = new StringBuffer();

        // 다시!
        for (int i = 0; i<records.length; i++){
            if (records[i].equals("check notification")) {
                restore.add(alarm.peek());
                alarm.pop();
                continue;
            } // 보관함에 옮기기
            
            int index = records[i].indexOf(" "); // 공백 기준으로 나누기
            name = records[i].substring(0, index);
            act = records[i].substring(index + 1);

            if (alarm.size() == 0){
                alarm.add(new Pair(name, act));
            }
            else { // 진행부분
                if (alarm.peek().second.equals(act)){
                    // 알람 peek의 act값이 현재 act랑 같을 때
                    // 1. count = 1일 때
                    if (ActingNum(act) == 0){
                        temp = alarm.peek().first;
                        if (count[0] == 1){
                            newName.append(temp).append(" and ").append(name);
                        }
                        else if (count[0] > 1){
                            newName.append(temp).append(" and ").append(count[0]).append(" others");
                        }
                        count[0]++;
                        count[1] = 0;
                    }
                    else {
                        temp = alarm.peek().first;
                        if (count[1] == 1){
                            newName.append(temp).append(" and ").append(name);
                        }
                        else if (count[1] > 1){
                            newName.append(temp).append(" and ").append(count[1]).append(" others");                            
                        }
                        count[1]++;
                        count[0] = 0;
                    }
                    alarm.pop();
                    alarm.push(new Pair(newName.toString(), act));
                    newName.setLength(0);
                } else{
                    // 알람 peek의 act 값이 현재 act랑 다르고 act가 share면 comment값 0 초기화
                    if(ActingNum(act) == 0){
                        count[1] = 0;
                        count[0]++;
                    }
                    else {
                        count[0] = 0;
                        count[1]++;
                    }
                }
            }
            System.out.println(name+ " : "+act+"  count[share] = "+count[0]+"    count[comment] = "+count[1]);
        }
        

        String[] answer = new String[restore.size()];
        int p = 0;
        while (!restore.isEmpty()){
            if (restore.peek().second.equals("share")){
                answer[p] = restore.peek().first + " shared your post";
                p++;
                restore.poll();
            }
            else {
                answer[p] = restore.peek().first + " commented on your post";
                p++;
                restore.poll();
            }
        }

        return answer;
    }


	
	public static void main(String [] args){
		String[] array = {"john share", "mary comment", "jay share", "check notification", "check notification", "sally comment", "james share", "check notification", "lee share", "laura share", "will share", "check notification", "alice comment", "check notification"};
		int output = 0;
		System.out.println(solution(array).toString());
	}
}

class Pair {
    String first = "";
    String second = "";

    Pair(String nickname, String Action){
        this.first = nickname;
        this.second = Action;
    }
}
