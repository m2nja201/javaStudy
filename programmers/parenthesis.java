// 0219

import java.util.*;

class Solution {
    public boolean checkRight(String str){
        Stack<String> st1 = new Stack<>();

        if(str.length() == 0) return true;
        
        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i) == '(') {
                st1.push("(");
            }
            if (str.charAt(i) == ')'){
                if (st1.size() != 0){
                    st1.pop();
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
    
    public String balance(String str){
        StringBuffer u = new StringBuffer();
        StringBuffer v = new StringBuffer();
        
        if (str == "") return "";
        
        int open = 0;
        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i) == '(') open++;
            else open--;
            
            if(open == 0){ // 짝이 맞음(균형)
                u.append(str.substring(0, i+1)); // )(
                v.append(str.substring(i+1)); // 
                
                if(checkRight(u.toString())){
                    u.append(balance(v.toString()));
                }
                else {
                    StringBuffer sb = new StringBuffer();
                    sb.append("(");
                    sb.append(balance(v.toString()));
                    sb.append(")");
                    sb.append(reverse(u.toString()));
                    return sb.toString();
                }
                break;
            }
        }
        return u.toString();
    }
    
    public String reverse(String str){
        StringBuffer Rsb = new StringBuffer();
        for (int i = 0; i<str.length(); i++){
            if(i==0) continue;
            if(i == str.length()-1) continue;
            if (str.charAt(i) == '(') Rsb.append(")");
            else Rsb.append("(");
        }
        return (Rsb.toString());
    }
    
    public String solution(String p) {
        String answer = "";
        
        if(checkRight(p)){
            answer = p;
        }
        else {
            answer = balance(p);
        }
        return answer;
    }
}

