package category;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import junit4.TestCases;
import junit4.Testcase;
import org.junit.experimental.categories.*;

@RunWith(Categories.class)
@Categories.IncludeCategory({PerformancesTests.class,RegressionTests.class})
//@Categories.IncludeCategory(PerformancesTests.class)
//@Categories.ExcludeCategory(RegressionTests.class)
@Suite.SuiteClasses({FunctionTest1.class,FunctionTest2.class})

public class TestSuite 
{

}
