package Externalize;//External.txtExternal.txt

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjcteOutputSTREAM {
	
	public static void main(String args[]){
		
		FileOutputStream fop = null;
		File file;
		ObjectOutputStream obj=null;
		
	
		
		try{
			file = new File("D:/External.txt");
			fop = new FileOutputStream(file);
			
			obj = new ObjectOutputStream(fop);
			
			Employee e = new Employee();
			e.setName("Satadru");
			e.setAge(26);
			
			
			 obj.writeObject(e);
			
		}catch(Exception e){
			System.out.println("Exception is "+e);
			
		}
		
		
	}

}
