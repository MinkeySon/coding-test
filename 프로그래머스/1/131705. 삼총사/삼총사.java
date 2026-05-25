import java.util.*;

class Solution {
    public int solution(int[] number) {
        int answer = 0;
        int size = number.length;
        
        HashMap<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < size - 2; i++){
                int firstNum = number[i];
            
            for (int j = i + 1; j < size -1; j++){
                    int secondNum = number[j];
            
                for (int k = j + 1; k < size; k++){
                    int thirdNum = number[k];
                    int sum = firstNum + secondNum + thirdNum;
                    
                    if (sum == 0){
                        answer++;
                    }
                }
            }
        }
        
        return answer;
    }
}