package unittesting;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.ValueSource;

public class JunitTestClass 
{
	@BeforeAll
	public static void beforeClassBegins()
	{
		System.out.println("This method will execute before begining of class.");
	}
	@AfterAll
	public static void afterClassEnds()
	{
		System.out.println("This method will execute after class is Ended.");
	}
	@Test
	public void test2()
	{
		System.out.println("This is my Test2......");
	}
	@BeforeEach
	public void preMethod()
	{
		System.out.println("This will be executed before every test cases.....");
	}
	
	@Test
	@RepeatedTest(3)
	public void test1()
	{
		System.out.println("This is my Test1......");
	}
	@AfterEach
	public void postMethod()
	{
		System.out.println("This will be executed after every test case......");
	}
	@ParameterizedTest
	@ValueSource(strings= {"Anuja","Dhanekula","I LOVE YOU"})
	void loginTest(String str)
	{
		System.out.println(str);
	}
	@Disabled
	public void test3()
	{
		System.out.println("This is not Executed...........");
	}
	/*@Test(timeout=500)
	public void timeTest()
	{
		try
		{
		System.out.println("this method have to executed within the time.....");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}*/
	
	
}
