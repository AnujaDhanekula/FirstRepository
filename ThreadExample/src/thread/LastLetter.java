package thread;

import java.util.Scanner;
import java.util.StringTokenizer;

public class LastLetter {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String:");
		String n = sc.nextLine();
		System.out.println(display(n));
	}

	public static String display(String input)
	{
		String str1 = null;
		
		StringTokenizer st = new StringTokenizer(input, " ");
		
		StringBuffer sb = new StringBuffer();
		
		while (st.hasMoreTokens())
		{
		str1 = st.nextToken();
		String str2 = str1.substring(str1.length() - 1);
		String str3 = str2.toUpperCase();
		sb.append(str3).append("$");
		}
		sb.deleteCharAt(sb.length() - 1);
		return sb.toString();

	}

}
