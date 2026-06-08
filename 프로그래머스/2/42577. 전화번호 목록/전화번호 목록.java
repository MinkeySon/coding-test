import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Arrays.sort(phone_book);
        
        int size = phone_book.length;
        
        for (int i=1; i<size; i++){
            String tmp = phone_book[i-1];
            String e = phone_book[i];
            
            if (e.startsWith(tmp)){
                answer = false;
                break;
            }
        }
        
        return answer;
    }
}