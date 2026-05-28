import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int size = commands.length;
        int[] answer = new int[size];
        
        for (int i=0; i<size; i++){
            int[] tmpArr = commands[i];
            int startIdx = tmpArr[0] - 1;
            int endIdx = tmpArr[1];
            int targetIdx = tmpArr[2] - 1;
            
            int[] copyArr = Arrays.copyOfRange(array, startIdx, endIdx);
            
            Arrays.sort(copyArr);
            
            int targetNum = copyArr[targetIdx];
            answer[i] = targetNum;
        }
        
        return answer;
    }
}