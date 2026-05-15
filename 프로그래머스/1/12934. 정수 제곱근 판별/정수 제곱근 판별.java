import java.util.*;

class Solution {
    public long solution(long n) {
        long answer = 0;
        
        long sqrt = (long) Math.sqrt(n);
        
        if ((sqrt * sqrt) != n){
            return -1;
        }else{
            System.out.println(sqrt);
            answer = (sqrt+1) * (sqrt+1);   
        }
        
        return answer;
    }
}