class Solution {
    public String solution(String phone_number) {
        String answer = "";
        
        int size = phone_number.length();
        char[] charArray = phone_number.toCharArray();
        
        for (int i=0; i<size-4; i++){
            charArray[i] = '*';
        }
        
        answer = new String (charArray);
        
        System.out.println("변환: " + answer);
        
        return answer;
    }
}