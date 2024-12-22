package SeleniumFrameworkUdemy.tes;

import org.testng.annotations.Test;

public class T extends PerentT {
	
	
	
	@Test
	public void testRun() {
		
		System.out.println("I am Child");
		
		doThis();
		
		T1 obj = new T1(4);
		
	   System.out.println(obj.increment());
		
		System.out.println(obj.decrement());
		
		
		
		
		
	}

}
