import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        Double sqrt = Math.sqrt(n);
        
        if(sqrt % 1 != 0){
            return -1;
        }else{
            System.out.println(sqrt);
            answer = (long) Math.pow(sqrt + 1, 2);
        }
        
        return answer;
    }
}