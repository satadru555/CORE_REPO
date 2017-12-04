package Property;

import java.io.FileInputStream;
import java.util.Properties;

public class FileinputStream {

public static void main(String [] args){
 
	Properties p = new Properties();
	FileInputStream inputstream=null;
	
	try{
		inputstream = new FileInputStream("conf.properties");
		p.load(inputstream);
		
		System.out.println("Property  is "+p.getProperty("db.username"));
		System.out.println("Property  is "+p.getProperty("db.password"));
		System.out.println("Property  is "+p.getProperty("db.url"));
		System.out.println("Property  is "+p.getProperty("db.dilect"));
		
	}catch(Exception e){
		System.out.println("Excption is"+e);
	}
	
	
 }
	
}
