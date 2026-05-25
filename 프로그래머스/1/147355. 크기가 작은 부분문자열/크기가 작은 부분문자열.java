import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int size = p.length();
        int start = 0;
        int end = start + size;
        int tSize = t.length();
        Long compNum = Long.parseLong(p);
        
        while (end <= tSize){
            Long tmp = Long.parseLong(t.substring(start, end));
            
            if (compNum >= tmp){
                
                answer ++;
            }
            
            start++; end++;
        }
        
        return answer;
    }
}