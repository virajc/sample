package misc;
import java.util.Timer;
import java.util.TimerTask;


public class tym {
	public static void main(String[] args) {
		Timer t = new Timer();
		
		t.schedule(new TimerTask() {
			public void run()
			{
				foo();
//				t.cancel();
			}
		},5000);
		
		t=null;
		
		Primes s1=new Primes();  
		Primes s2=new Primes();  
		  s1=null;  
		  s2=null;
		Runtime.getRuntime().gc();
		System.out.println(t);		
	}
	@Override
	public void finalize() {
		System.out.println("GC");
	}
	
	private static void foo() {
		System.out.println("Hi");

	}
}
