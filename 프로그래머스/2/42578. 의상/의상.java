import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hm = new HashMap<>();
        
        for (String[] arr : clothes){
            String kind = arr[1];
            int value = hm.getOrDefault(kind, 0);
            
            if (value == 0){
                hm.put(kind, 1);
            }else{
                int updated = value + 1;
                hm.put(kind, updated);    
            }
            
        }
        
        for (int value : hm.values()){
            answer *= value + 1;
        }
                
        return answer -1;
    }
    
    public int comb(int n, int r){
        long child = 1; long momA = 1; long momB = 1;
        
        for (int i=n; i>0; i--){
            child *= i;
        }
        
        for (int j=r; j>0; j--){
            momA *= j;
        }
        
        for (int k=n-r; k>0; k--){
            momB *= k;
        }
        
        int result = (int) (child / (momA * momB));
        return result;
    }
}