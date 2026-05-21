import java.util.*;

class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};
        int subSize = arr1[0].length;
        int totalSize = arr1.length;
        
        answer = new int[totalSize][subSize];
        
        for (int i=0; i<totalSize; i++){
            for (int j=0; j<subSize; j++){
                int sum = arr1[i][j] + arr2[i][j];
                answer[i][j] = sum;
            }
        }
        
        return answer;
    }
}