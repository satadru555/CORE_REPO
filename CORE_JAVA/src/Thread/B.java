package Thread;

public class B {

	
	public  synchronized void d2(A a) {
		
		try {
			
			Thread.sleep(5000);
		}catch(Exception e){
			System.out.println("Exception is "+e.getMessage());
			
		}
		
		a.last();
	}
	
	public synchronized void last() {
		
		System.out.println("In B Class");
	}
}
