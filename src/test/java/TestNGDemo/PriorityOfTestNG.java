package TestNGDemo;

import org.testng.annotations.Test;

public class PriorityOfTestNG {
	
	@Test(priority=1)
	public void a() {
		System.out.println("Its A");
	}
	
	@Test(priority=2)
	public void b() {
		System.out.println("Its B");
	}
	
	@Test
	public void c() {
		System.out.println("its C");
	}
	
	@Test
	public void d() {
		System.out.println("its D");
	}
	
	@Test
	public void e(){
		System.out.println("its E");
	}

}
