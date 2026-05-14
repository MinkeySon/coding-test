import java.util.*;

class Solution {
    public long solution(long n) {
        
        String input = Long.toString(n);
        char[] cArray = input.toCharArray();
        
        Arrays.sort(cArray);
        String tmp = new StringBuilder(new String(cArray)).reverse().toString();
        
        return Long.parseLong(tmp);
    }
}