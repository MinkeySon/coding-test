import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        
        while (n != 0){
            int rem = n % 3;
            sb.append(rem);
            n = n / 3;
        }
        
        String reverseSb = sb.reverse().toString();
        String[] arr = reverseSb.split("");
        long result = 0;
        
        for (int i=0; i<arr.length; i++){
            result += Long.parseLong(arr[i]) * (long) Math.pow(3, i);
        }
        
        return (int) result;
    }
}