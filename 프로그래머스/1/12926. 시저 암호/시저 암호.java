import java.util.*;

class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        char[] arr = s.toCharArray();
        
        for (int i=0; i<arr.length; i++){
            if (arr[i] == ' '){
                continue;
            }else{
                int tmp = (int) arr[i] + n;
                
                if (Character.isLowerCase(arr[i]) && tmp > 122){
                    tmp = tmp - 26;
                }
                
                if (Character.isUpperCase(arr[i]) && tmp > 90){
                    tmp = tmp - 26;
                }
                
                arr[i] = (char) tmp;
            }
        }
        
        answer = new String(arr);
        
        return answer;
    }
}