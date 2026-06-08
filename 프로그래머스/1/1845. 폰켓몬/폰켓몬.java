import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int count = 0; int maxSize = nums.length / 2;
        
        for (int e : nums){
            int value = hm.getOrDefault(e, 0);
            
            if (value == 0){
                count++;
                hm.put(e, 1);
            }
        }
        
        answer = (maxSize > count) ? count : maxSize;
        
        
        return answer;
    }
}