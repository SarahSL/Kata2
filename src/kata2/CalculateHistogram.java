package kata2;

public class CalculateHistogram {
    
    public static<T> Histogram<T> computeHistogram(T[] vector){
        Histogram<T> histo= new Histogram<>();
        for (T key : vector) {
            histo.increment(key);
        }
        return histo; 
    }
}
