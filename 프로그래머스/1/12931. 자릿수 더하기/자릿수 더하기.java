import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        if (n == 0) return 0;
        
        int size = Integer.toString(n).length();
        
        for (int i=size; i>=0; i--){
            answer += n / (int) Math.pow(10, i);
            n = n % (int) Math.pow(10, i);
        }

        return answer;
    }
}