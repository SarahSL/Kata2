package kata2;

import java.util.HashMap;

public class Kata2 {
    
    public static void main(String[] args) {
        int[] vector={2,2,11,4,2,6,11,2,3,5,11,5};
        HashMap<Integer,Integer> histogram = new HashMap<>();
        
        for (int key:vector){
            if(histogram.containsKey(key)){
                histogram.put(key,histogram.get(key)+1);
            }else{
                histogram.put(key,1);
            }
        }
        for(int key : histogram.keySet()){
            System.out.println(key + "-->" + histogram.get(key));
        }
    }
}
