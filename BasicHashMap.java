package for_interview;

import java.util.HashMap;

public class BasicHashMap {
	 
    public static void main(String a[]){
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        //add key-value pair to hashmap
        int i=1;
        hm.put("first",i);
        hm.put("second", i);
        hm.put("third",i);
        hm.put("third",i+1);
        System.out.println(hm);
       
    }
}
