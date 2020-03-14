package streams;
import java.io.*;
public class Deserialiazation {

	public static void main(String[] args) throws FileNotFoundException,IOException
	{
		ObjectInputStream in=null;
		String datafile="C:\\Users\\Admin\\Desktop\\Anuja\\emp.txt";
		try {
			in=new ObjectInputStream(
					new BufferedInputStream(
							new FileInputStream(datafile)));
			while(true)
			{
				Employee empobj= (Employee) in.readObject();
				empobj.printEmployee();
				
			}
		}
		catch(Exception e)
		{
			//System.out.println(e);
		}

	}

}
