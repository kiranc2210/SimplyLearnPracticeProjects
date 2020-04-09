package git;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.Vector;

public class JavaCollectionAssist {

	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {

		System.out.println("####### ArrayList ############");
		ArrayList<Integer> list = new ArrayList<>();

		// Adding elements to ArrayList

		list.add(10);

		list.add(20);

		list.add(30);

		list.add(40);

		System.out.println(list.size()); // Output : 4

		// Removing an element at index 0

		list.remove(0);

		System.out.println(list.size()); // Output : 3

		System.out.println(list);

		// Retrieving element at index 2

		System.out.println(list.get(2)); // Output : 30

		// Setting value of element at index 2

		list.set(2, 2222);

		System.out.println(list); // Output : [10, 20, 2222, 40]

		// Inserting element at index 1

		list.add(1, 1111);

		System.out.println(list); // Output : [10, 1111, 20, 2222, 40]

		System.out.println("####### vector ############");

		Vector<Integer> vector = new Vector<Integer>(3);

		System.out.println(vector.capacity());

		vector.add(10);

		vector.add(20);

		vector.add(30);

		vector.add(40);

		System.out.println(vector.capacity());

		System.out.println(vector.size());

		vector.setSize(10);

		System.out.println(vector.size());

		System.out.println(vector);

		vector.setSize(3);

		System.out.println(vector);

		System.out.println("####### Linked List ############");

		LinkedList<String> llist = new LinkedList<String>();

		llist.add("JAVA");

		llist.add("J2EE");

		llist.add("JSP");

		llist.add("SERVLETS");

		llist.add("JDBC");

		System.out.println(llist);

		String s = "JSP";

		boolean contains = llist.contains(s);

		if (contains) {

			System.out.println(list.indexOf(s)); // Output : 2
		}

		s = "STRUTS";

		contains = llist.contains("STRUTS");

		if (contains) {

			System.out.println(llist.indexOf(s));

		}
		System.out.println("####### HashSey  ############");
		
		HashSet<String> set = new HashSet<String>();
		 
 
        set.add("JAVA");
 
        set.add("JSP");
 
        set.add("STRUTS");
 
        set.add("HIBERNATE");
 
        set.add("JSP");
 
        set.add("JAVA");
  
        System.out.println(set); 
        
        System.out.println("####### HashMap  ############");
        
      //Defining the HashMap
        
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
         
        Set hset = map.keySet();
         
        Iterator keySetIterator = hset.iterator();
         
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
       
       
		

	}
}