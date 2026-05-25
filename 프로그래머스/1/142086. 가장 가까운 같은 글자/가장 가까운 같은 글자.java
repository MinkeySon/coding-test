class Solution {
    public int[] solution(String s) {
        int size = s.length();
        int[] answer = new int[size];
        
        for (int i=0; i<size; i++){
            
            char c = s.charAt(i);
            int index = s.indexOf(c);
            
            if (index == i){
                answer[i] = -1;
            }
            
            for (int j=i+1; j<size; j++){
                char compC = s.charAt(j);
                
                if (compC == c){
                    answer[j] = j - i;
                }
                
            }
        }
        
        return answer;
    }
}