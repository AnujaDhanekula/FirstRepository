import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.*;
class Student implements Comparable <Student>
{
String htno;
String name;
	public Student(String htno,String name)
	{
	 super();
	 this.htno=htno;
	 this.name=name;
	}

@Override
public String toString() {
	return "htno=" + htno + ", name=" + name  ;
	}
public int compareTo(Student student) 
{
	if(name.compareTo(student.name)<0)
		return -1;
	else if(name.compareTo(student.name)>0)
		return 1;
	else
	return 0;

}
}
class Comparableexg
{

	public static void main (String[] args) 
	{
		Student s1=new Student("123","kavya");
		Student s2=new Student("345","yamini");
		Student s3=new Student("567","vaani");
		
		ArrayList ar=new ArrayList();
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);		
		Collections.sort(ar);
		System.out.println("elements in sorted order:"+ar);
		Collections.reverse(ar);
		System.out.println("elements in reverse order:"+ar);
	}

}