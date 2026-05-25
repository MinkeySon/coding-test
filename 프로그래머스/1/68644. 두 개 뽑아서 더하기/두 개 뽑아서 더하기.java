import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        List<Integer> lst = new ArrayList<>();
        int size = numbers.length;
        
        for (int i=0; i<size; i++){
            int firstNum = numbers[i];
            
            for (int j=i+1; j<size; j++){
                int secondNum = numbers[j];
                int sum = firstNum + secondNum;
                
                if (!lst.contains(sum)){
                    lst.add(sum);
                }
            }
        }
        
        Collections.sort(lst);
        
        int[] answer = lst.stream().mapToInt(Integer::intValue).toArray();
        
        return answer;
    }
}