package TestNGDemo.ExecuteFailedTestCases;


import org.testng.Assert;
import org.testng.annotations.Test;



public class TestDemo2  {
	
	@Test
	public void test01() {
		Assert.assertTrue(false);
	}
	
	
	@Test
	public void test02() {
		Assert.assertEquals(false, true);
	}
	
	@Test
	public void test03() {
		Assert.assertTrue(true);
	}

}
