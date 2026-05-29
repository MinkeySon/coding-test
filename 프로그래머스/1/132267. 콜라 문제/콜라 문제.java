class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while (n>=a){
            int div = n / a;
            int rem = n % a;
            int plus = (n / a) * b;
            
            answer += plus;
            n = n - (div * a) + plus;
        }
        
        return answer;
    }
}