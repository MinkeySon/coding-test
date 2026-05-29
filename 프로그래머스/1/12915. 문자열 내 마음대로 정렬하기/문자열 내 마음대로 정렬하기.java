import java.util.*;

class Solution {
    public String[] solution(String[] strings, int n) {
        int size = strings.length;
        String[] answer = new String[size];
        String[][] arr = new String[size][size];
        
        for (int i=0; i<size; i++){
            String words = String.valueOf(strings[i].charAt(n));
            arr[i][0] = strings[i];
            arr[i][1] = words;
        }
        
        Arrays.sort(arr, new Comparator<String []>(){
            @Override
            public int compare(String[] o1, String[] o2){
                if (o1[1].equals(o2[1])){
                    return o1[0].compareTo(o2[0]);
                }
                
                return o1[1].compareTo(o2[1]);
            }
        });
        
        for (int i=0; i<size; i++){
            answer[i] = arr[i][0];
        }
        
        return answer;
    }
}