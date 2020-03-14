import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
class clggrps
		{
			String deptno1;
			String deptno2;
			String deptno3;
			
			public clggrps(String deptno1, String deptno2, String deptno3) 
			{
				super();
				this.deptno1 = deptno1;
				this.deptno2 = deptno2;
				this.deptno3 = deptno3;
			}

			@Override
			public String toString() {
				return "clggrps [deptno1=" + deptno1 + ", deptno2=" + deptno2 + ", deptno3=" + deptno3 + "]";
			}
		}
public class mapexample1 
{

			public static void main(String[] args) 
			{
				
				HashMap<String,clggrps> hm=new HashMap<String,clggrps>();
				hm.put( "jntu",new clggrps("cse","ece","it"));
				hm.put( "ov" ,new clggrps("cse","civil","mech"));
				hm.put(" svu", new clggrps("it","ece","civil"));
				
				System.out.println(hm);
				
				Scanner s = new Scanner(System.in);
				
				System.out.println("the department u want:");
				
				String se=s.next();
				
				Set keys =hm.entrySet();
				
				Iterator itr1=keys.iterator();
				
				while(itr1.hasNext())
				{
					
					Map.Entry  entry = (Map.Entry)itr1.next();
					
					clggrps depts=(clggrps)entry.getValue();
				
					if((depts.deptno1.equals(se)) || (depts.deptno2.equals( se)) ||(depts.deptno1.equals( se)))
					{
						System.out.println(entry.getKey());
					}
				}
			}
				
}