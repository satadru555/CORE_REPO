package Thread;

public class A {

	
	public  void d1(B b) {
		
		try {
			
			Thread.sleep(5000);
		}catch(Exception e){
			System.out.println("Exception is "+e.getMessage());
			
		}
		
		b.last();
	}
	
	public synchronized void last() {
		
		System.out.println("In A Class");
	}
}
