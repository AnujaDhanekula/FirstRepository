package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;
import java.util.Iterator;

 class Student implements Comparable <Student>
 {

		String name;
		String age;
		String city;
		
		@Override
		public String toString() {
			return "name=" + name + ", age=" + age + ", city=" + city + "";
		}

		public Student(String name, String age, String city) {
			super();
			this.name = name;
			this.age = age;
			this.city = city;
		}
		public int compareTo(Student s) 
		{
			if(age.compareTo(s.age)<0)
				return -1;
			else if(age.compareTo(s.age)>0)
				return 1;
			else
			return 0;

		}

}


 
public class CollectionObject 
{
	
	public static void main(String[] args) 
	{
		Student s1=new Student ("anuja","20","sap");
		Student s2=new Student ("kavya","21","vij");
		Student s3=new Student ("nissi","22","gnt");
		
		ArrayList ar=new ArrayList();
		ar.add(s1);
		ar.add(s2);
		ar.add(s3);
		
		Collections.sort(ar);
		System.out.println("Sorting Order"+ar);
		Collections.reverse(ar);
		System.out.println("Reverse Order"+ar);
		
	}

}
