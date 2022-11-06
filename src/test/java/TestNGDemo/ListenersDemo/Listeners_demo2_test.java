package TestNGDemo.ListenersDemo;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import TestNGDemo.Library.BaseClass;


@Listeners(Listeners_demo2.class)
public class Listeners_demo2_test extends BaseClass {

	@BeforeMethod
	public void OpenBrowser() {
		setup();

	}

	@AfterMethod
	public void TitleMatch() {
		driver.quit();

	}

	@Test
	public void take_screenshot_test() {

		Assert.assertEquals(false, true);
	}

}
