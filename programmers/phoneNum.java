// 0218
// Lv.2 전화번호 목록

import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Arrays.sort(phone_book);
        // boolean startsWith 메서드 사용하기 (substring 안써도 됨)
        
        for (int i = 0; i<phone_book.length -1; i++){
            if (phone_book[i+1].startsWith(phone_book[i])) { 
                answer = false;
                break;
            }
        }
        /*
        for (int i=0; i<phone_book.length; i++){
            for (int j = phone_book.length - 1; j >= 0; j--){
                if ((i != j) && (phone_book[i].length() <= phone_book[j].length())) {
                    if (phone_book[i].equals(phone_book[j].substring(0, (phone_book[i].length())))){
                        answer = false;
                        break;
                    }
                }
            }
            if (answer == false) break;
        }     */   
        return answer;
    }
}