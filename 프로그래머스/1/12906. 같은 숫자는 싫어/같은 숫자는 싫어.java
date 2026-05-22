import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        int[] answer;
        List<Integer> lst = new ArrayList<>();
        
        int size = arr.length;
        int newNum = 0;
        
        for (int i=0; i<size; i++){
            if (i==0){
                newNum = arr[i];
                lst.add(newNum);
            }
            
            if (arr[i] == newNum){
                continue;
            }else{
                newNum = arr[i];
                lst.add(newNum);
            }
        }
        
        answer = lst.stream().mapToInt(Integer::intValue)
                             .toArray();

        return answer;
    }
}