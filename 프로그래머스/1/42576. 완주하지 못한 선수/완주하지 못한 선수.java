import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap <String, Integer> hm = new HashMap<>();
        
        for (String s : participant){
            int value = hm.getOrDefault(s, 0);
            hm.put(s, value + 1);
        }
        
        for (String s : completion){
            int value = hm.get(s);
            hm.put(s, value - 1); 
        }
        
        for (String s : participant){
            int value = hm.get(s);
            
            if (value != 0){
                answer = s;
            }
        }
                
        return answer;
    }
}