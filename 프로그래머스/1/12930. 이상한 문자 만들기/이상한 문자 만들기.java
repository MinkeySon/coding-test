import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        
        String[] arr = s.split(" ", -1);
        int totalSize = arr.length;
        
        for (int i=0; i<arr.length; i++){
            String word = arr[i];
            int size = word.length();
            StringBuilder sb = new StringBuilder();
            String[] wordArr = word.split("");
            
            for (int j=0; j<size; j++){
                int index = j + 1;
                
                if (index % 2 == 0){
                    wordArr[j] = wordArr[j].toLowerCase();
                }else{
                    wordArr[j] = wordArr[j].toUpperCase();
                }
            }
            
            for (String tmp : wordArr){
                sb.append(tmp);
            }
            arr[i] = sb.toString();
        }
        
        for (int i=0; i<totalSize; i++){
            if (i == totalSize -1){
                answer += arr[i];
            }else{
                answer += arr[i] + " ";
            }
        }
        
        return answer;
    }
}