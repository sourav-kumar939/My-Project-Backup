package TestNGDemo.ListenersDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test2  {

	@Test
	public void testMethod1() {
		System.out.println("i'm inside testMethod1");
	}
	
	@Test
	public void testMethod2() {
		System.out.println("i'm inside testMethod2");
		Assert.assertTrue(false);
	}
	
	@Test(timeOut = 1000)
	public void testMethod3() throws Exception {
		Thread.sleep(2000);
		System.out.println("i'm inside testMethod3");
	}
	
	@Test(dependsOnMethods = "testMethod3")
	public void testMethod4() {
		System.out.println("i'm inside testMethod4");
	}

	
	

}
