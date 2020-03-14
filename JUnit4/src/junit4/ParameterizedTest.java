package junit4;

import junit4.Add2Num;
import org.junit.Test;
import org.junit.runner.*;
import org.junit.runners.*;
import org.junit.runners.Parameterized.*;
import java.util.*;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

@RunWith(value = Parameterized.class)
public class ParameterizedTest 
{

    private int numberA;
    private int numberB;
    private int expected;

   
    public ParameterizedTest(int numberA, int numberB, int expected) 
    {
        this.numberA = numberA;
        this.numberB = numberB;
        this.expected = expected;
    }

	
    @Parameters
    public static Collection<Object[]> data() 
    {
        return Arrays.asList(new Object[][]
        		{
        	
                {1, 1, 2},
                {2, 2, 4},
                {8, 2, 10},
                {4, 5, 9},
                {5, 5, 10}
                
        		});
    }

    @Test
    public void test_addTwoNumbes() 
    {
        assertThat(Add2Num.add(numberA, numberB), is(expected));
        System.out.println("Operation SuccesFully Done...........");
    }


	

}
