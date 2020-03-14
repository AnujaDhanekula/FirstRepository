package streams;
import java.io.*;

public class SerialiazationExample {

	public static void main(String[] args) throws IOException
	{
		String datafile="C:\\Users\\Admin\\Desktop\\Anuja\\emp.txt";
		ObjectOutputStream out=null;
		try
		{
			Employee emp1=new Employee(1,"anuja",2000.00);
			Employee emp2=new Employee(2,"anujadhanekula",3000.00);
			out=new ObjectOutputStream
					(new BufferedOutputStream
							(new FileOutputStream(datafile)));
			out.writeObject(emp1);
			out.writeObject(emp2);
				
		}
		finally
		{
			if(out!=null)
			{
				out.close();
			}
		}
		System.out.println("Object State is Saved............");
	}

}
