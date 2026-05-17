import java.util.*;

class Solution {
    public List<Integer> solution(int[] arr, int divisor) {
        
        List<Integer> answer = new ArrayList<>();
        Arrays.sort(arr);
        
        for (int e : arr){
            if (e % divisor == 0){
                answer.add(e);
            }
        }
        
        if (answer.isEmpty()){
            answer.add(-1);
        }
        
        System.out.println("answer: "+answer);
        
        return answer;
    }
}