package Externalize;

import java.io.File;
import java.io.FileInputStream;
//import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;



public class ObjectInputSTREAM {

	public static void main(String []args){
		
		FileInputStream fop = null;
		File file;
		ObjectInputStream obj=null;
		
		
		try{
			
			
			file = new File("D:/External.txt");
			fop = new FileInputStream(file);
			obj = new ObjectInputStream(fop);
			
			Employee e=(Employee)obj.readObject();
			
			System.out.println(" Employee  Name "+e.getName());
			
			System.out.println(" Employee  age "+e.getAge());
			
			//System.out.println(" Employee  city "+e.City);
			
		}catch(Exception e){
			
			System.out.println("Excetion is "+e.getMessage());
			
		}
		
		
	}
	
	
	
}
