import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        for (int i=0; i<n; i++){
            long result = (long) x + ((long) x * i);
            answer[i] = result;
        }
        
        return answer;
    }
}