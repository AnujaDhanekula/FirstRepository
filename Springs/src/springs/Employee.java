package springs;

public class Employee 
{
String name;
String id;
String dept;
String desg;
String company;
String email;

public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public String getDesg() {
	return desg;
}
public void setDesg(String desg) {
	this.desg = desg;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public void displayemp()
{
	System.out.println("Employee Name: "+name);
	System.out.println("Employee Id: "+id);
	System.out.println("Employee Department: "+dept);
	System.out.println("Employee Designation: "+desg);
	System.out.println("Employee Company: "+company);
	System.out.println("Employee Email: "+email);
	
}
public void startMethod()
{
	System.out.println("Employee bean Initialization done........");
}
public void destroyMethod()
{
	System.out.println("Employee bean is deactivating........");
}
}