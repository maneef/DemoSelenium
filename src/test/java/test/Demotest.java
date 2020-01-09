package test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demotest {
	
	@BeforeSuite
	public static void test1() {
		System.out.println("Test method 1");
	}
	
	@BeforeTest
	public static void test2() {
		System.out.println("Test method 2");
	}
	@BeforeClass
	public static void test3() {
		System.out.println("Test method 3");
	}
	
	@BeforeMethod
	public static void test4() {
		System.out.println("Test method 4");
	}
	
	@Test
	public static void test5() {
		System.out.println("Test method 5");
	}
	
	@AfterMethod
	public static void test6() {
		System.out.println("Test method 6");
	}
	
	@AfterClass
	public static void test7() {
		System.out.println("Test method 7");
	}
	
	@AfterTest
	public static void test8() {
		System.out.println("Test method 8");
	}
	
	@AfterSuite
	public static void test9() {
		System.out.println("Test method 9");
	}

	@Test(dataProvider = "values")
	public static void a(String uname,String pass) {
		System.out.println(uname);
		System.out.println(pass);
	}
	
	@Test
	public static void b() {
		int aa = 50;
		int bb = 50;
		System.out.println("Test method b");
		Assert.assertTrue(10<20);
		System.out.println("Maneef");
		Assert.assertEquals(aa,bb,"Passsssssssssss");
	}
	
	@Test(priority = 1,enabled=false)
	public static void c() {
		System.out.println("Test method c");
	}
	
	@Test(priority = 3,enabled=false)
	public static void d() {
		System.out.println("Test method d");
	}
	
	@DataProvider
	public static Object[][] values() {
		Object[][] data = {{"us1","p1"},{"us2","p2"},{"us1","p1"}};
		return data;
	}
	
	
}
