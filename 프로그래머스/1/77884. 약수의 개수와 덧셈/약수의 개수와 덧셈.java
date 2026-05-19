class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        
        for (int start = left; start <= right; start++){
           int divisorNum = findDivisor(start);
            
           if (divisorNum % 2 == 0) {
               answer += start;
           } else{
               answer -= start;
           }
        }
        
        return answer;
    }
    
    public int findDivisor(int e){
        if (e == 1){
            return 1;
        }
        
        int cnt = 2;
        
        for (int i=2; i * i <= e; i++){
            if (e % i == 0){
                cnt += 2;
                if (i*i == e){
                    cnt -= 1;
                }
            }
        }
        
        return cnt;
    }
}