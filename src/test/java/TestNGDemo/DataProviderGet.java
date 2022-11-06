package TestNGDemo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderGet {
	
	@Test(dataProvider = "dp2",dataProviderClass = DataProviderDataSupplier.class)
	public void TestLogin(String s) throws Exception {
		System.out.println(s);
	}

	

}
