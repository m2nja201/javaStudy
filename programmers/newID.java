// 0217
// 신규 아이디 추천

class Solution {
    public String solution(String new_id) {
        String answer = "";
        StringBuffer preAns = new StringBuffer();
        
        // 1단계
        new_id = new_id.toLowerCase();
        
        
        // 2단계 
        for(int i=0; i<new_id.length(); i++){
            char here = new_id.charAt(i);
            if(((here >= 97)&&(here <= 122))||(here == 45) || (here == 46) || (here == 95) || ((here >= 48) && (here <= 57))){
                if (preAns.length() != 0) { // 3단계
                    if (((preAns.charAt(preAns.length()-1)) == 46) && (here == 46)) {
                    }
                    else preAns.append(here);
                }
                else {
                    preAns.append(here);
                    
                }
            }
        }
        
        // 4단계
        if (preAns.length() == 0) preAns.append("a");
        
        // 5단계
        if ((preAns.length() > 0) && ((preAns.charAt(preAns.length()-1)) == 46)) preAns.deleteCharAt(preAns.length()-1);
        if ((preAns.length() > 0) && (preAns.charAt(0) == 46)) preAns.deleteCharAt(0);
        
        // 6단계
        if ((preAns.length() >= 16) && (preAns.length() > 0)) preAns.delete(15, preAns.length());
        if ((preAns.length() > 0) && ((preAns.charAt(preAns.length()-1)) == 46)) preAns.deleteCharAt(preAns.length()-1);
        
        if (preAns.length() == 0) preAns.append("a");
        
        System.out.println(preAns.toString());
        // 7단계
        while ((preAns.length() < 3) && (preAns.length() > 0)) {
            preAns.append(preAns.charAt(preAns.length() - 1));
        } 
        
        answer = preAns.toString();
        return answer;
        
    }
}