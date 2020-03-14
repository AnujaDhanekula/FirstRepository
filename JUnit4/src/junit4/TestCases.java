package junit4;
import static org.junit.Assert.assertEquals;

import org.junit.*;
public class TestCases 
{
	@BeforeClass
	public static void beforeClass()
	{
		System.out.println("Before all methods in the class.");
	}
	@Before
	public void beforeAllTests()
	{
		System.out.println("This will execute before every test.");
	}
	
	@Test
	public void test1()
	{
		System.out.println("This is my Test1......");
	}
	@Test
	public void test2()
	{
		System.out.println("This is my Test2......");
	}
	@Ignore
	@Test
	public void test3()
	{
		System.out.println("i am a ignored test case.");
	}
	@Test(timeout=2000)
	public void test4()
	{
		System.out.println("Time out is used.");
		try
		{
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	@Test(expected= ArithmeticException.class)
	public void testException()
	{
		int a=10,b=0,c=a/b;
		System.out.println(c);
		String str="Hello";
		System.out.println(str.charAt(9));
	}
	@Test
	public void test5()
	{
		HelloWorld hw=new HelloWorld();
		assertEquals("Hello Message",hw.message1());
	}
	@After
	public void afterTest()
	{
		System.out.println("This will be executed after every test case......");
	}

	@AfterClass
	public static void afterAllTests()
	{
		System.out.println("After all methods in the class.");
	}
}
