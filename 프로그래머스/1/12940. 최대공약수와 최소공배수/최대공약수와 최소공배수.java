import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        
        int firstAns = getFirstAns(n, m);
        int secondAns = getSecondAns(n, m);
        // System.out.println("firstAns: " + firstAns);
        // System.out.println("secondAns: " + secondAns);
        
        int[] answer = {firstAns, secondAns};
        
        return answer;
    }
    
    public int getFirstAns(int n, int m){
        int result = 0;
        List<Integer> nLst = new ArrayList<>();
        List<Integer> mLst = new ArrayList<>();
        
        for (int i=1; i * i <= n; i++){
            if (n % i == 0){
                int pare = n / i;
                nLst.add(i);
                nLst.add(pare);
            }
        }
        
        for (int j=1; j*j <= m; j++){
            if (m % j == 0){
                int pare = m / j;
                mLst.add(j);
                mLst.add(pare);
            }
        }
        
        for (int k=0; k<nLst.size(); k++){
                int num = nLst.get(k);
            for (int h=0; h<mLst.size(); h++){
                int compNum = mLst.get(h);
                
                if (num == compNum && result < num){
                    result = num;
                }
            }
        }
        
        return result;
    }
    
    public int getSecondAns(int n, int m){
        int result = 0;
        int max = Math.max(n, m); int min = Math.min(n, m);
        
        int step = 1;
        
        while(true){
            int tmpMax = max * step;
            
            for (int i=1; min * i <= tmpMax; i++){
                int tmpMin = min * i;
                
                if (tmpMin == tmpMax){
                    return tmpMin;
                }
            }
            step++;
        }
    }
}