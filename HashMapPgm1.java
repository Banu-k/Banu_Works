package HashMap;
import java.util.*;
/*
class Hash{
	int id;
	String name;
	String address;
	
	 void Hash(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;
	}
}
*/

public class HashMapPgm1 {
	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Banu");
		map.put(2, "Rekha");
		map.put(3, "Bhuna");
		
		map.put(1, "Sweety"); // trying duplicate, it will overwrite to 1=> Sweety 2=> Rekha 3=> Bhuna
		
		
		for(Map.Entry m : map.entrySet()){
		    System.out.println(m.getKey()+" "+m.getValue());
		   }
		
		// add new values
		System.out.println("Add Value: ");
		map.put(4, "Ruwaid");
		
		for(Map.Entry m : map.entrySet()){
		    System.out.println(m.getKey()+" "+m.getValue());
		   }
		
		// remove values
		System.out.println("Remove Value: ");
		map.remove(2);
		for(Map.Entry m : map.entrySet()){
		    System.out.println(m.getKey()+" "+m.getValue());
		   }
		
		// replace the value
		System.out.println("Replace Value: ");
		map.replace(4,"Tommy");
		for(Map.Entry m : map.entrySet()){
		    System.out.println(m.getKey()+" "+m.getValue());
		   }
		
		/*
		HashMap<Integer, Hash> mapping = new HashMap<Integer, Hash>();
		Hash h1 = new Hash(1, "Banu", "Anakaputhur");
		Hash h2 = new Hash(2, "rekha", "Anakaputhur");
		Hash h3 = new Hash(3, "Bhuna", "Anakaputhur");
		
		mapping.put(1, h1);
		mapping.put(2, h2);
		mapping.put(3, h3);
		
		for(Map.Entry<Integer, Hash> entry:map.entrySet()){    
	        int key=entry.getKey();  
	        Hash b=entry.getValue();  
	        System.out.println(key+" Details:");  
	        System.out.println(b.id+" "+b.name+" "+b.address);   
	    } 
		*/
	}
}
