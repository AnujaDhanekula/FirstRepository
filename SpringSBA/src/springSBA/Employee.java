package springSBA;

public class Employee 
{
	private String name;  
	private String id;  
	private String dept; 
	private String desg; 
	private String company; 
	private String email;
	
	
	public Employee() {
		super();
	}

	public Employee(String name, String id, String dept, String desg, String company, String email) {
		super();
		this.name = name;
		this.id = id;
		this.dept = dept;
		this.desg = desg;
		this.company = company;
		this.email = email;
	}
	
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
}
