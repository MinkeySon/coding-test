import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        int size = food.length;
        StringBuilder sb = new StringBuilder();
        
        for (int i=1; i<size; i++){
            
            if(food[i] % 2 == 0){
                
                int even = food[i] / 2;
                
                for (int j=0; j<even; j++){
                    sb.append(i);    
                }
                
            }else{
                if (food[i] == 1) {
                    continue ;
                }else{
                    int odd = food[i] / 2;
                    
                    for (int k=0; k<odd; k++){
                        sb.append(i);
                    }
                }
            }
        }
        
        answer += sb.toString();
        answer += "0";
        
        String reverseS = sb.reverse().toString();
        answer += reverseS;
                
        return answer;
    }
}