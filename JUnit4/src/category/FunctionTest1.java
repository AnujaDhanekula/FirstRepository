package category;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class FunctionTest1 
{
	 	@Category(PerformancesTests.class)
	    @Test
	    public void test1() 
	 	{
	 		System.out.println("In FunctionTest1 in PerformancesTests Category");
	       
	    }

	    
		@Test
	    public void test2() 
	    {
			System.out.println("In FunctionTest1");
			
	    }


}



