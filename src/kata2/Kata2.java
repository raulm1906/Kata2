package kata2;

import java.util.HashMap;
import java.util.Map;


public class Kata2 {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] data = {1,4,10,-1,4,10,4,4,1,-1,9,1,9,10,-1};
        Histogram histo = new Histogram(data);
        
        Map<Integer,Integer> histogr = histo.getHistogram();
        
        for (Integer key : histogr.keySet()){
            System.out.println(key + "===>" + histogr.get(key));
            
        }
        
    }
    
}
