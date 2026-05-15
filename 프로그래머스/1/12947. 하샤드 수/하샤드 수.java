class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        int sum = 0;
        int tmp = x;
        while (true){
            if(x < 10){
                sum += x;
                break;
            }
            sum += x % 10;
            x = x / 10;
        }
        
        if (tmp % sum == 0){
            answer = true;
        }else{
            answer = false;
        }
        
        return answer;
    }
}