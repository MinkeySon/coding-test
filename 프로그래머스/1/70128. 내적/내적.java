import java.util.*;

class Solution {
    public int solution(int[] a, int[] b) {
        long answer = 0;
        int size = a.length;
        
        for (int i=0; i<size; i++){
            answer += (long) a[i] * (long) b[i];
        }
        
        return (int) answer;
    }
}