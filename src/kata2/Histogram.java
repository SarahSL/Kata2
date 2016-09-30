package kata2;

import java.util.HashMap;

public class Histogram<T> {
   private final T[] vector;

    public Histogram(T[] vector) {
        this.vector = vector;
    }

    public T[] getVector() {
        return vector;
    }
   
    public HashMap<T,Integer> getHistogram(){
        HashMap<T,Integer> histogram=new HashMap<>();
        for (T key : vector) {
            if(!histogram.containsKey(key)){
                histogram.put(key,0);
            }
            histogram.put(key, histogram.get(key)+1);
        }
        return histogram;
    }
   
   }

