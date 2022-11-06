import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class SauravDemo {

	
	@Test
	public void m1() {
	
		Response response=RestAssured.get("https://reqres.in/api/users?page=2");
		
		System.out.println(response.asString());
//		response.getStatusCode();
//		response.asString();
		
		
		
		
		
		
		
		
		
		
	}
}
