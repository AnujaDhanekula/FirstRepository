import java.util.Collections;
import java.util.ArrayList;
public class CollectionExg 
{
	public static void main(String[] args)
	{
	ArrayList co1=new ArrayList();
		
	co1.add("java");
	co1.add("Dotnet");
	
	co1.add("oracle");
	co1.add("selenium");
	
	System.out.println("elements in orginal order:");
	System.out.println(co1);
	Collections.sort(co1);
	System.out.println("elements in sorted order:"+co1);
	Collections.reverse(co1);
	System.out.println("elements in reverse order:"+co1);
	
	
	ArrayList co2=new ArrayList();
	
	/*Collections.copy(co2, co1);
	System.out.println("elements in second array list.......");*/
	
	System.out.println(co2);
	
	Collections.fill(co1, "lANGUAGE");
	System.out.println("After filling....");
	
	System.out.println(co1);
	
	boolean flag=Collections.disjoint(co1, co2);
	System.out.println(flag);
	}

}

/*class Employe
{
	String eid;
	String ename;
	public Employe(String eid,String ename)
	{
		super();
		this.eid=eid;
		this.ename=ename;
	}
	@Override
	public String toString() {
		return "Employe [eid=" + eid + ", ename=" + ename + "]";
	}
	 
}*/	
	/*public class CollectionExg 

String htno;
String name;
 CollectionExg(String htno,String name)
 {
	 
	 this.htno=htno;
	 this.name=name;
 }

@Override
public String toString() {
	return "CollectionExg [htno=" + htno + ", name=" + name + "]";
}


	
	

	/*ArrayList co2=new ArrayList();
	
	co2.add("data science");
	co2.add("python");
	co2.add("big data");
	
	co1.addAll(co2);
	
	System.out.println(co1);
	System.out.println(a);
	co2.add("Ruby");
	
	if(co1.contains(co2))
		System.out.println("Element Found");
	else
		System.out.println("Element not Found");
	
	co1.remove("java");
	System.out.println("After removal..........." +" " +co1);
	
	co1.retainAll(co2);
	System.out.println("After retainAll....." +" "+co1);*/
		
		/*CollectionExg s1=new CollectionExg("123","anuja");
		CollectionExg s2=new CollectionExg("345","anuja Dhanekula");
		CollectionExg s3=new CollectionExg("567","anu");
		ArrayList<CollectionExg > ar=new ArrayList();
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		System.out.println(ar);
		
		Iterator itr=ar.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		
		ar.forEach(System.out::println);
		
		for(CollectionExg s:ar)
		{
			System.out.println(s.htno +"" +s.name);
		}
		
		Employe e1=new Employe("1","siri");
		Employe e2=new Employe("2","ruchi");
		Employe e3=new Employe("3","mydhili");
		ar.add(e1);
		ar.add(e2);
		ar.add(e3);
		System.out.println(ar);
		
	*/
