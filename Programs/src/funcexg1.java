import java.util.ArrayList;
import java.util.function.*;
/*public class funcexg1 {
	String name;
	 int marks;
	funcexg1 (String name,int marks)
	{
		super();
		this.name=name;
		this.marks=marks;
	}
	 public boolean equals(Object obj)
		{
				
				
		 funcexg1  s =(funcexg1)obj;
				
				if(name.equals(s.name)&&marks==(s.marks))
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
			return "funcexg1 [name=" + name + ", marks=" + marks + "]";
	 }
	 public static void display(Function<String,Integer> list)
		{
			for (funcexg1  s :list)
			{
				if(f.apply(s))
				{
					System.out.println(s);
				}
			}
		}

	public static void main(String[] args) 
	{
		 funcexg1 stud1=new  funcexg1 ("anuja",80);
		 funcexg1 stud2=new  funcexg1 ("siri",80);
		 funcexg1 stud3=new  funcexg1 ("ruchi",60);
		 funcexg1 stud4=new  funcexg1 ("mydhili",75);
		 funcexg1 stud5=new  funcexg1 ("rishi",70);
		 funcexg1 stud6=new  funcexg1 ("shannu",55);
		 
		 Function <funcexg1,String> f= marks->{
		 if(marks.marks<=60)
		 return "c grade";
		 else if(marks.marks<=70)
			 return "b grade";
		 else if(marks.marks<=80)
			 return "a grade";
		 else
			 return "Not qualified";
		 };
		 System.out.println(f.apply(stud1));

		 Predicate <funcexg1> p1=student->student.name.equals("anuja");
			
			Predicate <funcexg1> p2=student->student.marks==70;
			
			
			
			ArrayList<funcexg1> list = new ArrayList<funcexg1>();
			
			list.add(stud1);
			list.add(stud2);
			list.add(stud3);
			list.add(stud4);
			list.add(stud5);
			list.add(stud6);
			display(p1.and(p2),list);
			
	}
		

}*/
