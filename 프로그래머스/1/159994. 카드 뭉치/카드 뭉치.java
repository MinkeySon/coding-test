import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        int size = goal.length;
        int maxIdx1 = cards1.length-1;
        int maxIdx2 = cards2.length-1;
        int idxG = 0; int idx1 = 0; int idx2 = 0;
        
        while (idxG < size){
            
            String valG = goal[idxG];
            String val1 = cards1[idx1];
            String val2 = cards2[idx2];
            
            // cards1 에 있을 경우
            if (valG.equals(val1)){
                
                // 최대 인덱스를 넘지 않게끔
                if (idx1 < maxIdx1){
                    idx1++;
                    idxG++;
                }else{
                    idxG++;   
                }
            }
            
            // cards2 에 있을 경우
            else if (valG.equals(val2)){
                
                // 최대 인덱스를 넘지 않게끔
                if (idx2 < maxIdx2){
                    idx2++;
                    idxG++;
                }else{
                    idxG++;   
                }
            }else{
                answer = "No";
                break;
            }
        }
        
        return answer;
    }
}