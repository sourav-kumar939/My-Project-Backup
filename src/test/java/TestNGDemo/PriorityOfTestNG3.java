package TestNGDemo;

import org.testng.annotations.Test;

public class PriorityOfTestNG3 {
	
	@Test()
	public void c_method(){
		System.out.println("I'm in method C");
	}
	@Test()
	public void b_method(){
		System.out.println("I'm in method B");
	}
	@Test(priority=6)
	public void a_method(){
		System.out.println("I'm in method A");
	}
	@Test(priority=0,enabled=true)
	public void e_method(){
		System.out.println("I'm in method E");
	}
	@Test(priority=6)
	public void d_method(){
		System.out.println("I'm in method D");
	}

}
