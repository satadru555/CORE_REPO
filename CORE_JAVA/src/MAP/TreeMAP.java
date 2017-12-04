package MAP;
import java.util.TreeMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TreeMAP {

	public static void main(String [] args){
		
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		//tm.put(null, "");
		tm.put(1, "TITAN");
		tm.put(2, "SANTANU");
		tm.put(3, "PRAMIT");
		tm.put(4, "SUBROJEET");
		
        Set set =  tm.entrySet();
	    
	    Iterator i = set.iterator();
	    
	    while(i.hasNext()){
	    	
	    	Map.Entry<Integer,String> mapEntry = (Entry<Integer, String>) i.next();
	    	
	    	System.out.println("The  key are "+mapEntry.getKey()+" Values are "+mapEntry.getValue());
	    }
	} 
			
		
	}
	

