import java.util.PriorityQueue;
class Student
{
	@Override
	public String toString() {
		return "Student [htno=" + htno + ", name=" + name + "]";
	}
	String htno;
	String name;
	Student(String htno,String name)
	 {
		 
		 this.htno=htno;
		 this.name=name;
	 }
}
public class QueuesExample {

	public static void main(String[] args)
	{
	//PriorityQueue pq= new PriorityQueue();
	PriorityQueue<Student> pq1= new PriorityQueue<Student>();
	Student s1=new Student("1","siri");
	Student s2=new Student("2","ruchi");
	Student s3=new Student("3","mydhili");
	pq1.add(s1);
	pq1.add(s2);
	pq1.add(s3);
	
	System.out.println(pq1);
	pq1.remove();
	System.out.println(pq1);
	/*pq.add(10);
	pq.add(20);
	pq.add(30);
	pq.add(25);
	System.out.println(pq);
	pq.remove();
	System.out.println("after removal..."+pq);
	pq.add(15);
	System.out.println("After adding:"+pq);*/
	
	}

}
