package Thread;

public class DeadLock extends Thread{

        A a = new A();
	
		B b = new B();
	
	public void m() {
		 
    
		
		this.start();
		
		a.d1(b);
		
		
	}
	
	 public void run() {
		 
			
			b.d2(a);
			 
		 }
	 
		public static void main (String [] args) {
			
			
			DeadLock d = new DeadLock();
			
			d.m();
		}
	
}
