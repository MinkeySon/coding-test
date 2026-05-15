class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        String[] arr = s.split("");
        int pCount = 0;
        int yCount = 0;
        
        for (String tmp : arr){
            if (tmp.toUpperCase().equals("P")){
                pCount++;
            }
            else if (tmp.toUpperCase().equals("Y")){
                yCount++;
            }
        }
        
        if (pCount != yCount){
            answer = false;
        }

        return answer;
    }
}