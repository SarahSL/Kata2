package kata2;

import java.util.HashMap;

public class Kata2 {
    
    public static void main(String[] args) {
        Integer [] vector={2,2,11,4,2,6,11,2,3,5,11,5};
      //  Double[] vector={2.1,2.1,11.3,4.2,2.1,4.2,11.3,5.5,3.7,5.3,11.3,5.5};
      //  String[] vector={"Sarah","Cristina","Jaime","Sarah","Jorge","Cristina","Judith","C.Judith"};
        Histogram histo=new Histogram(vector);
        HashMap<Object,Integer> histogram = histo.getHistogram();
        for(Object key : histogram.keySet()){
            System.out.println(key + "-->" + histogram.get(key));
        }
    }
}
