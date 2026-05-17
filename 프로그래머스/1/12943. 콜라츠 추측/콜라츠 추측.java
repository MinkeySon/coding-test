class Solution {
    public int solution(int num) {
        int answer = 0;
        long chgNum = (long) num;
        
        while(chgNum != 1){
            if (answer >= 500){
                answer = -1;
                break;
            }
            // 짝수
            if (chgNum % 2 == 0){
                chgNum = chgNum / 2;
            }else{
                chgNum = (chgNum * 3) + 1;
            }
            
            answer ++;
        }
        
        return answer;
    }
}