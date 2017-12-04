package Property;


import java.io.FileOutputStream;
import java.util.Properties;

public class FileoutputStream {
	
	public static void main(String [] args){
		
		
		Properties prop = new Properties();
		FileOutputStream input=null;
		try{
			
			input = new FileOutputStream("D:/config.properties");
			//input = new FileOutputStream("classpath:conf.properties");
			prop.setProperty("TITAN", "SATADRU");
			prop.setProperty("TITAN_555", "SATADRU HATES COMPUTER SCIENCE BUT TAKES IT AS CHALLENGE TO SURVIVE IN THIS WORLD");
			
			//prop.load(input);
			prop.store(input, null);
			
			System.out.println("Store successfull");
			
		}catch(Exception e ){
			System.out.println("Exception is"+e);
		}
		
	}

}
