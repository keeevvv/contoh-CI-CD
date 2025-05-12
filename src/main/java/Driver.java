import src.main.java.Counter;

public class Driver {

	public static void main(String[] args) {
		
		Counter counter = new Counter();
		
		System.out.println("COUNTER:" + counter.getCounts());
		
		counter.increment();
		
		System.out.println("counter:" + counter.getCount());
		
		counter.decrement();
		
		System.out.println("counter:" + counter.getCount());
		
	}

}
