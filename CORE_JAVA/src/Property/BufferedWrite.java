package Property;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class BufferedWrite {

	public static void main(String [] args){
		
	File file = new File("D:/File.txt");
	
	BufferedWriter bw = null;
	FileWriter fw = null;
	
	
	try{
	
		String content = "This is the content to write into file\n";
		fw = new  FileWriter(file);
		bw = new BufferedWriter(fw);
		bw.write(content);
		
		System.out.println("Done");
		
	}catch(Exception e){
		
		System.out.println("Exception is "+e.getMessage());
	}finally {

		try {

			if (bw != null)
				bw.close();

			if (fw != null)
				fw.close();

		} catch (Exception ex) {

			ex.printStackTrace();

		}
	
	}
		
	}
	
}
