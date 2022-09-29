package kata2;

import java.util.HashMap;
import java.util.Map;


public class Kata2 {

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] data = {1,4,10,-1,4,10,4,4,1,-1,9,1,9,10,-1};
        Map<Integer, Integer> histogram = new HashMap<Integer,Integer>();
       
        for (int i = 0; i < data.length; i++) {
            histogram.put(data[i],histogram.containsKey(data[i]) ? histogram.get(data[i])+1:1);
        }
        
        for (Integer key : histogram.keySet()){
            System.out.println(key + "===>" + histogram.get(key));
            
        }
        
    }
    
}
