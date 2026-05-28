import java.util.*;

class Solution {
    
    public static HashMap<String, String> hm = new HashMap<>();
    
    public int solution(String s) {
        int answer = 0;
        hm.put("zero", "0");
        hm.put("one", "1");
        hm.put("two", "2");
        hm.put("three", "3");
        hm.put("four", "4");
        hm.put("five", "5");
        hm.put("six", "6");
        hm.put("seven", "7");
        hm.put("eight", "8");
        hm.put("nine", "9");
        
        int start=0; int end=0;
        int size = s.length();
        
        StringBuilder sb = new StringBuilder();
        
        while (end <= size){
            String tmp = s.substring(start, end);
            
            // 정수이면
            if (isDigit(tmp)){
                sb.append(tmp);
                start++; end++;
            }
            
            // 정수가 아니면
            else{
                
                // 온전한 영단어 o
                if(hm.getOrDefault(tmp, null) != null){
                    String value = hm.get(tmp);
                    sb.append(value);
                    start = end;
                    end++;
                }
                
                // 온전한 영단어 x
                else{
                    end++;
                }
            }
        }
        
        answer = Integer.parseInt(sb.toString());
        
        return answer;
    }
    
    public boolean isDigit(String s){
        try {
            int changed = Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}