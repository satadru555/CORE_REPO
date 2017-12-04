package MAP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMAP {

	public static void main(String [] args){
		
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		
		
		hm.put(100,"Satadru");
		hm.put(101,"Sanatnu");
		hm.put(102,"Pramit");
		hm.put(103,"Sarbo");
		hm.put(104,"Surbojeet");
		hm.put(105,"Shoban");
		hm.put( null, "cccccccccc");
		hm.put( null, "dddddddddd");
	    System.out.println("For Loop:");
		 
		 /*for(Map.Entry<Integer,String> mapEntry : hm.entrySet() ){
			 
			 System.out.println("The  key are "+mapEntry.getKey()+" Values are "+mapEntry.getValue());
		 }*/
	    
	    Set set =  hm.entrySet();
	    
	    Iterator i = set.iterator();
	    
	    while(i.hasNext()){
	    	
	    	Map.Entry<Integer,String> mapEntry = (Entry<Integer, String>) i.next();
	    	
	    	System.out.println("The  key are "+mapEntry.getKey()+" Values are "+mapEntry.getValue());
	    }
	}
}
