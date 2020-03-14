package main;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import dao.StudentDAOImpl;
import data.Students;
import springs.Student;

public class TestStudent {

	public static void main(String[] args) 
	{
		
		Scanner sc=new Scanner(System.in);
		
		boolean result=false;
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Student.xml");
		
		StudentDAOImpl sdao=(StudentDAOImpl) context.getBean("sdaoimpl");
		
		int Choice;
		do
		{
		System.out.println("===========Student CRUD Operations==============");
		System.out.println("Menu:\n"
				+ "1).To Insert with the saveStudentByPst operation in a Students Table.\n"
				+"2).To Insert with the Object by using Create Method in a Students Table.\n"
				+ "3).To Update a Record In Students Table.\n"
				+ "4).To Delete a Record in the students Table.\n"
				+ "5).For Displaying Students list.\n"
				+ "6)Enter 6 to Quit..");
		System.out.println("Choose an option");
		Choice=sc.nextInt();
		switch(Choice)
		{
		case 1:   //To Insert a record in the Table......
				System.out.println("Enter details to Insert with the saveStudentByPst operation:");
			
				System.out.println("Enter Student Id:");
				int id =sc.nextInt();
				System.out.println("Enter Student First_Name:");
				String First_Name=sc.next();
				System.out.println("Enter Student Last_Name:");
				String Last_Name=sc.next();
				System.out.println("Enter Student Age");
				int Age=sc.nextInt();
				
				Students student1 =new Students();
				student1.setId(id);
				student1.setFirst_Name(First_Name);
				student1.setLast_Name(Last_Name);
				student1.setAge(Age);
			
				result=sdao.saveStudentByPst(student1);
				if(result)
					System.out.println("Insertion Fail....... ");
				else
					System.out.println("Insertion Done.......");
				break;
		case 2:   //To Insert a record in the Table......
				System.out.println("Enter details to Insert with Object by using Create Method.....");
		
				System.out.println("Enter Student Id:");
				id =sc.nextInt();
				System.out.println("Enter Student First_Name:");
				First_Name=sc.next();
				System.out.println("Enter Student Last_Name:");
				Last_Name=sc.next();
				System.out.println("Enter Student Age");
				Age=sc.nextInt();
			
				Students student2 =new Students();
				student2.setId(id);
				student2.setFirst_Name(First_Name);
				student2.setLast_Name(Last_Name);
				student2.setAge(Age);
				sdao.create(student2);
				break;
			

		case 3: //To Update a Record In Students Table........
			
				System.out.println("Enter Student Id to Update:");
				id =sc.nextInt();
				System.out.println("Enter Student First_Name:");
				First_Name=sc.next();
				System.out.println("Enter Student Last_Name:");
				Last_Name=sc.next();
				System.out.println("Enter Student Age");
				Age=sc.nextInt();
			
				Students student3 =new Students();
				student3.setId(id);
				student3.setFirst_Name(First_Name);
				student3.setLast_Name(Last_Name);
				student3.setAge(Age);
			
				sdao.update(student3);
				break;

		case 4:  //To Delete a Record in the students Table.......
				System.out.println("Enter id to Delete data");
				id=sc.nextInt();
				sdao.delete(id);
				break;

		case 5:  //For Displaying students list.........
				List<Students> students =sdao.getStudents();
			 
				Iterator<Students> itr=students.iterator();
				for(Students s:students)
				{
					System.out.println(s.getId()+" "+s.getFirst_Name()+" " +s.getLast_Name()+" "+s.getAge());
				}
			
				sdao.getStudents();
				break;
				
		case 6:  	//To Quit the Menu ......
			System.exit(0);
			break;
			
		default:
			System.out.println("Enter a Valid Option:");
			break;
		}
		
		}while(Choice!=0);

	}
		
}


