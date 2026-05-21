import java.util.*;

class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int size = s.length();
        
        if (size != 4 && size != 6){
            return false;
        }
        
        String[] arr = s.split("");
        
        try{
            for (String tmp : arr){
                int changToInt = Integer.parseInt(tmp);
            }
        } catch(Exception e){
            answer = false;
        }
        
        return answer;
    }
}