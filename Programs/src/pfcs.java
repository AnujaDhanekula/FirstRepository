import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Consumer;;

public class pfcs
{
		String name;
		 int marks;
		 
		 pfcs (String name,int marks)
		{
			super();
			this.name=name;
			this.marks=marks;
		}
public static void main(String[] args) 
	{
		
		ArrayList<pfcs> list = new ArrayList<pfcs>();
		
		pfcs s1=new pfcs("anuja",80);
		pfcs s2=new pfcs("siri",70);
		pfcs s3=new pfcs("ruchi",60);
		pfcs s4=new pfcs("mydhili",50);
		pfcs s5=new pfcs("rishi",70);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		
		Predicate <pfcs > p=student->student.marks>=60;
		
		System.out.println(p.test(s1));
		
		Function <pfcs,String> f= m->{
			int marks=m.marks;
			 if(marks>=80)
			 return "A grade";
			 else if(marks>=60)
				 return "b grade";
			 else if(marks>=50)
				 return "c grade";
			 else if(marks>=35)
				 return "d grade";
			 else
				 return "e grade failed";
			 };
			 
			 Consumer<pfcs> c=s->{
				 System.out.println("Student name:"+s.name);
				 System.out.println("Student marks:"+s.marks);
				 System.out.println("Student grade:"+f.apply(s));
				 System.out.println();
			 };
			 
			 /*if(p.test(s3))
				 c.accept(s4);
			 else
				 System.out.println("Student failed....");*/
			 
			 for(pfcs s:list)
			 {
				 if(p.test(s))
					 c.accept(s);
			 }
	}

}
