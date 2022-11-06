package TestNGDemo;

import org.testng.annotations.Test;
@Test(groups= {"all"})
public class GroupsDemo {
	
	@Test(groups= {"smoke"})
	public void test4() {
		System.out.println("test4");
	}

	@Test(groups= {"smoke","functional","sanity"})
	public void test5() {
		System.out.println("test5");
	}

	@Test(groups= {"functional", "regression"})
	public void test6() {
		System.out.println("test6");
	}

	@Test
	public void test7() {
		System.out.println("test7");
	}

}
