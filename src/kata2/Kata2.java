package kata2;

import java.util.HashMap;
import java.util.Map;


public class Kata2 {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] data = {"Perico","Fulanito","Antonio","Alberto","Fulanito","Antonio","Fulanito","Fulanito","Perico","Alberto","Paco","Perico","Paco","Antonio","Alberto"};
        Histogram histo = new Histogram(data);
        
        Map<String,Integer> histogr = histo.getHistogram();
        
        for (String key : histogr.keySet()){
            System.out.println(key + "===>" + histogr.get(key));
            
        }
        
    }
    
}
