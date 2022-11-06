package com.practice;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Test(groups = {"all"} )
public class Groups {
	
	@Test(groups = {"shoping"} )
	public void test_1() {
		System.out.println("test_1");
	}
	@Test(groups = {"marketing"} )
	public void test_2() {
		System.out.println("test_2");
	}
	@Test(groups = {"clothings"} )
	public void test_3() {
		System.out.println("test_3");
	}
	
	@Test(groups = {"books"},enabled = false )
	public void test_4() {
		System.out.println("test_4");
	}

}
