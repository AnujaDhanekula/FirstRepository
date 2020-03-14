package java844334;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

 class Students {
	String name;
	int marks;
	Students(String name,int marks){
	    this.name=name;
	    this.marks=marks;
	}

}

public class StudentResult 
{
	ArrayList<Students> list=new ArrayList<Students>();
	
    Students s1=new Students("Anuja",80);
    Students s2=new Students("Siri",76);
    Students s3=new Students("Mydhili",90);
    Students s4=new Students("ruchi",30);   
     /*list.add(s1);
     list.add(s2);
     list.add(s3);
     list.add(s4);*/
   // System.out.println("Students who are passed:");
    	Predicate<Students>p=s->s.marks>=40;
    	
    	Function<Students,String>f=stu->{
    			int m=stu.marks;
    				if(m>=80)
    						return "Distinction";
    				else if(m>=60 && m<=79)
    						return "FirsT Class";
    				else if(m>=40 && m<=50)
    						return "Second class";
    				else
    						return "fail";
    			};
    	Consumer<Students>c=s->{
    							System.out.print(s.name+"  ");
    							System.out.println(f.apply(s));
    							};
    				
    for(Students s:list)
    {
    	if(p.test(s))
    	{
           c.accept(s);
    	}
     }
}

}

