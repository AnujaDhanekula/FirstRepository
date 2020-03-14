package category;

import org.junit.Test;
import org.junit.experimental.categories.Category;


public class FunctionTest2 
{
	
	@Category({PerformancesTests.class, RegressionTests.class})
    @Test
    public void test1() 
	{
		System.out.println("In FunctionTest2 in PerformancesTests and RegressionsTests Category");
		
    }

    @Category(RegressionTests.class)
    @Test
    public void test2() 
    {
    	System.out.println("In FunctionTest2 in RegressionsTests Category");
       
    }
}

