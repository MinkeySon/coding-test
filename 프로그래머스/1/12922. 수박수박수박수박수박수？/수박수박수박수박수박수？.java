class Solution {
    public String solution(int n) {
        String answer = "";
        String evenSub = "수박";
        String oddSub = "수";
        int mok = n / 2;
        
        for (int i=0; i<mok; i++){
            answer += evenSub;
        }
        
        if (n % 2 != 0){
            answer += oddSub;
        }
        
        return answer;
    }
}