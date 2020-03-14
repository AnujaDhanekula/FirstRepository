import java.util.ArrayList;
import java.util.function.Predicate;
public class PrediEg1 
{
	 String empname;
	 String empdesig;
	 Float empsal;
	 String empcity;
	 
	 public   PrediEg1 (String empname,String empdesig,String empcity,Float empsal)
	 {
		
		 this.empname=empname;
		 this.empdesig=empdesig;
		 this.empsal=empsal;
		 this.empcity=empcity;
	 }
	 
	 public boolean equals(Object obj)
	{
			
			
			PrediEg1  e =(PrediEg1 )obj;
			
			if(empname.equals(e.empname)&&empdesig.equals(e.empdesig)&&empsal==e.empsal &&empcity==e.empcity)
			{
				return true;
			}
			else
			{
				return false;
			}
	}
	@Override
	public String toString() 
	{
		return "PrediEg1 [empname=" + empname + ", empdesig=" + empdesig + ", empsal=" + empsal + ", empcity=" + empcity
				+ "]";
	}
	public static void display(Predicate <PrediEg1> p,ArrayList<PrediEg1> list)
	{
		for (PrediEg1  e :list)
		{
			if(p.test(e))
			{
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args)
	{
		PrediEg1 emp1= new PrediEg1 ("anuja","manager","Hyderabad",100000000f);
		
		PrediEg1 emp2= new PrediEg1 ("anu","team lead","Secundrabad",199887766f);
		
		PrediEg1 emp3= new PrediEg1 ("a","team mem","Sattenapalii",15000f);
		
		PrediEg1 emp4= new PrediEg1 ("b","manager","Hyderabad",100000f);
		
		PrediEg1 emp5= new PrediEg1 ("c","team lead","Secundrabad",199887f);
		
		PrediEg1 emp6= new PrediEg1 ("d","team mem","Sattenapalii",150000f);
		
		
		Predicate <PrediEg1> p1=employ->employ.empdesig.equals("manager");
		
		Predicate <PrediEg1> p2=employ->employ.empcity.equals("Hyderabad");
		
		Predicate <PrediEg1> p3=employ->employ.empsal<20000;
		
		
		ArrayList<PrediEg1> list = new ArrayList<PrediEg1>();
		
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		list.add(emp5);
		list.add(emp6);
		display(p2.and(p3),list);
		
		System.out.println(emp2);
		
		if(emp1.equals(emp2))
			System.out.println("Both r equal");
		else
			System.out.println("Not equal");
		
		
	}
	

}
