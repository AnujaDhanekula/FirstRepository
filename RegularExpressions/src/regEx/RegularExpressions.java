package regEx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions 
{

public static void main(String[] args)
{

	Pattern p=Pattern.compile(".a");
	Matcher m=p.matcher("sa");
	boolean b=m.matches();
	System.out.println(b);//true
	
	boolean b1=Pattern.matches(".s","as");
	System.out.println(b1);//true

//false(x and y come more than once)
System.out.println(Pattern.matches("[xyz]","xxyyzz"));//false
//true bcz set returns only 1 character
System.out.println(Pattern.matches("[xyz]","x"));//true
System.out.println(Pattern.matches("[xyz]","y"));//true
System.out.println(Pattern.matches("[xyz]","z"));//true
//true bcz it repeats for 3 times
System.out.println(Pattern.matches("[xyz]{3}","xyz"));//true
System.out.println(Pattern.matches("[xyz]{3}","xxx"));//true
System.out.println(Pattern.matches("[xyz]{3}","yyy"));//true
System.out.println(Pattern.matches("[xyz]{3}","zzz"));//true
System.out.println(Pattern.matches("[xyz]{3}","xya"));//false
System.out.println(Pattern.matches("[xyz]{3}","xyzanuja"));//false
	
System.out.println(Pattern.matches("\\D","m"));//true
System.out.println(Pattern.matches("\\D","ms"));//false bcoz return only 1 character
System.out.println(Pattern.matches("\\D","1"));//false
System.out.println(Pattern.matches("\\D*","abc"));//true bcz * represenst repetition
System.out.println(Pattern.matches("\\d","m"));//false bcz d returns numbers
System.out.println(Pattern.matches("\\d","1"));//true
System.out.println(Pattern.matches("\\d","123"));//false bcoz return only 1 character
System.out.println(Pattern.matches("\\d*","123"));//true 
System.out.println("for IP address,Pancard,Passwords");


}

}