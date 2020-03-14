package streams;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesExample {

	public static void main(String[] args) throws IOException
	{
		Properties prop =new Properties();
		FileReader fout =new FileReader("C:\\Users\\Admin\\Desktop\\Anuja\\prop.properties");
		prop.load(fout);
		System.out.println(prop.getProperty("uname"));
		System.out.println(prop.getProperty("pwd"));
		Set s=prop.stringPropertyNames();
		System.out.println(s);
		fout.close();
		
	}

}
