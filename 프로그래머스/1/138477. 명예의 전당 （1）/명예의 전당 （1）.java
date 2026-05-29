import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int size = score.length;
        int[] answer = new int[size];
        List<Integer> lst = new ArrayList<>();
        
        for (int i=0; i<size; i++){
            int e = score[i];
            
            // 비어있거나 k개 미만이면
            if (lst.isEmpty() || lst.size() < k) {
                lst.add(e);
                Collections.sort(lst);
                answer[i] = lst.get(0);
            }
            
            // k개부터
            else{
                lst.add(e);
                Collections.sort(lst);
                lst.remove(0);
                answer[i] = lst.get(0);
            }
        }
        
        return answer;
    }
}