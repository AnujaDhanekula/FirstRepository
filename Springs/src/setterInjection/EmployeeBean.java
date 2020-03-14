package setterInjection;

public class EmployeeBean {
	private String fullName ;
private DepartmentBean departmentbean;

public EmployeeBean() {
	
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public DepartmentBean getDepartmentbean() {
	return departmentbean;
}
public void setDepartmentbean(DepartmentBean departmentbean) {
	this.departmentbean = departmentbean;
}

}
