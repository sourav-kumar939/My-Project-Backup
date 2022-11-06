package TestNGDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo2 {
	
	
	//Return Type 1:- Multi-Dimensional
	
//	@Test(dataProvider="m2")
//	public void m1(String username,String pwsd) {
//		System.out.println();
//	}
//	
//	@DataProvider()
//	public String[][] m2(){
//		String[][] str={{"Admin","123"},{"Ankit","147"}};
//		return str;
//	}
	
	//Return Type 1:- Jacked Array Multi-Dimensional
	
//	@Test(dataProvider="m2")
//	public void m1(String[] str) {
//	for(int i=0;i<str.length;i++) {
//		System.out.println(str[i]);
//	}
//	System.out.println(">>");
//}
//	
//	@DataProvider()
//	public String[][] m2(){
//		String[][] s=new String[][] {
//			
//			{"abc","123","vcx","oip","478"},
//			{"987","wes"},
//			{"25"},
//			{"eqwq","tts","yuwgdq","uygwq","589","896324"}
//		};
//			return s;
//	}
	
	
	//Return Type 2:- Iterator<Object>
	
//	@Test(dataProvider = "dp1")
//	public void TestLogin(String s) throws Exception {
//		System.out.println(s);
//	}
//
//	@DataProvider()
//	public Iterator<String> dp1() {
//		List<String> data = new ArrayList();
//		data.add("Yadagiri");
//		data.add("Jhon");
//		return data.iterator();
//	}
	
	
	//Return Type 3:- Iterator<Object[]>
	
	@Test(dataProvider = "dp1")
	public void TestLogin(Object[] s) throws Exception {
		System.out.println(s[0]+" >> "+s[1]);
	}

	@DataProvider()
	public Iterator<Object[]> dp1() {
		Set<Object[]> data = new HashSet();
		data.add(new Object[] {"Yadagiri",123});
		data.add(new Object[] {"Jhon",456});
		return data.iterator();
	}

}
