package kata2;

import java.util.HashMap;

public class Histogram {
    private final int[] vector;

    public Histogram(int[] vector) {
        this.vector = vector;
    }

    public int[] getVector() {
        return vector;
    }
    
    public HashMap<Integer,Integer> getHistogram(){
        HashMap<Integer,Integer> histogram =new HashMap<>();
         for (int key:vector){
            if(histogram.containsKey(key)){
                histogram.put(key,histogram.get(key)+1);
            }else{
                histogram.put(key,1);
            }
        }
         return histogram;
    }
}

