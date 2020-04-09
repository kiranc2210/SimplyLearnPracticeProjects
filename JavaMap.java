package git;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class JavaMap {

	public static void main(String[] args) {
	
		 HashMap<String, Double> map = new HashMap<String, Double>();
         
	        //Adding some elements to HashMap
	         
	        map.put("Ashwin", 87.55);
	         
	        map.put("Bharat", 95.65);
	         
	        map.put("Chetan", 68.13);
	         
	        map.put("Dhanjay", 74.23);
	         
	        map.put("Kartik", 65.42);
	         
	        //HashMap can have one null key and multiple null values
	         
	        map.put(null, null);
	         
	        map.put("Sandesh", null);
	         
	        //Getting the size of the map
	         
	        System.out.println("Size Of The Map : "+map.size());
	         
	        System.out.println("-----------------");
	         
	        //Displaying the elements
	         
	        System.out.println("The elements are :");
	         
	        Set<String> set=map.keySet();
	         
	        @SuppressWarnings("rawtypes")
			Iterator keySetIterator = set.iterator();
	         
	        while (keySetIterator.hasNext()) 
	        {
	            Object key = keySetIterator.next();
	             
	            System.out.println(key+"  : "+map.get(key));
	        }
	         
	        System.out.println("-----------------");
	         
	        //Checking the map for a particular key/value
	         
	        System.out.println("Does this map has Chetan as key? "+map.containsKey("Chetan"));
	         
	        System.out.println("Does this map has 74.23 as value? "+map.containsValue(74.23));
	         
	        System.out.println("-----------------");
	         
	        //Removing an element from the map
	         
	        System.out.println("Value removed from the map : "+map.remove("Kartik"));
	        
	        
	        System.out.println("--------###########################################---------");
	        
	        HashMap<Integer, String> hmap = new HashMap<Integer, String>();
	        
	        //add elements to HashMap
	        hmap.put(1, "AA");
	        hmap.put(2, "BB");
	        hmap.put(3, "CC");
	        hmap.put(4, "DD");
	    
	        // Create another HashMap
	        HashMap<Integer, String> hmap2 = new HashMap<Integer, String>();
	    
	    
	        hmap2.put(11, "Hello");
	        hmap2.put(22, "Hi");
	  
	        hmap2.putAll(hmap);
	  
	        System.out.println("HashMap 2 contains: "+ hmap2);
	        
	        Set<Integer> keys = hmap.keySet();

	        System.out.println("Set of Keys contains: ");
	     
	     
	        Iterator<Integer> it = keys.iterator();
	        
	        while(it.hasNext()){
	           System.out.println(it.next());
	}
	

}
}
