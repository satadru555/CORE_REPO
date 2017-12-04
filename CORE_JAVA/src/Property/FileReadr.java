package Property;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
public class FileReadr {

	public static void main(String [] args) throws IOException{
		
		Properties property = new Properties();
		try {
			FileReader reader = new FileReader("conf.properties");
			property.load(reader);
			
			System.out.println("Property  is "+property.getProperty("db.username"));
			System.out.println("Property  is "+property.getProperty("db.password"));
			System.out.println("Property  is "+property.getProperty("db.url"));
			System.out.println("Property  is "+property.getProperty("db.dilect"));
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
