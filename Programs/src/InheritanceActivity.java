
class Employee
{
	long employeeId;
	 String employeeName;
	 String employeeAddress;
	 Long employeePhone;
	 double basicSalary;
	 double specialAllowance = 250.80;
	double hra  = 1000.50 ;
	
	public Employee(long id,String name, String address,long phone)
	{
	
		employeeId=id;
	employeeName=name;
		employeeAddress=address;
		employeePhone=phone;
	}
	public void calculateSalary(double basicSalary)
	{
		double salary =  basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * hra/100);
		System.out.println("salary of Trainee:"+salary);
	}
	public void calculateTransportAllowance(double basicSalary)
	{
		double transportAllowance = 10*basicSalary /100;
		System.out.println(" employee allowance = trainee allowance:"+transportAllowance);
	}
	
}
class Manager extends Employee
{
	
	public Manager(long id,String name,String address,long phone,double salary)
	
	{
		super(126534,"peter","chennai india",237844);
		employeeId=id;
		employeeName=name;
		employeeAddress=address;
		employeePhone=phone;
		basicSalary=salary;
		
	}
	public void calculateSalary(double  basicSalary)
	{
		 double salary =  basicSalary + ( basicSalary * specialAllowance/100) + ( basicSalary * hra/100);
		System.out.println("salary of manager:"+salary);
	}
	public void calculateTransportAllowance(double basicSalary)
	{
		double transportAllowance = 15*basicSalary /100;
		System.out.println("manager allowance :"+transportAllowance);
	}
}
class Trainee extends Employee
{
	
	public Trainee(long id,String name,String address,long phone,double salary)
	{
		super(29846,"jack","mumbai india",442085);
		employeeId=id;
		employeeName=name;
		employeeAddress=address;
		employeePhone=phone;
		basicSalary=salary;
	}
	
	
}
public class InheritanceActivity {

	public static void main(String[] args) {

		Manager obj1= new Manager(126534,"peter","chennai=india",237844,65000);
		obj1.calculateTransportAllowance(65000);
		obj1.calculateSalary(65000);
		Trainee obj2=new Trainee(29846,"jack","mumbai india",442085,45000);
		obj2.calculateTransportAllowance(45000);
		obj2.calculateSalary(45000);
	}

}
