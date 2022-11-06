package TestNGDemo;

import org.testng.annotations.DataProvider;

public class DataProviderDataSupplier {
	
	@DataProvider
	public String[] dp1() {
		String[] data = new String[] {
				"Yadagiri",
				"Jhon",
				"Rebecca",
				"Smith"
		};
		return data;
	}
	
	@DataProvider
	public String[] dp2() {
		String[] data = new String[] {
				"Sumanth",
				"Teju",
				"Cena",
				"Robert"
		};
		return data;
	}

}
