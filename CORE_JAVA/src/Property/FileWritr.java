package Property;


import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
public class FileWritr {

	public static void main(String [] args) throws IOException{
		
		Properties property = new Properties();
		try {
		
			FileWriter writer = new FileWriter("conf.properties");
			property.setProperty("db.username", "GWA");
			property.setProperty("db.password", "GWA");
			property.setProperty("db.url", "waist.scotiabank.bns/gwa/logon/gwaLogon.bns");
			property.setProperty("db.showsql", "true");
			property.setProperty("db.hibernatecache", "secondlevelCache");
			
			property.store(writer, null);
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
