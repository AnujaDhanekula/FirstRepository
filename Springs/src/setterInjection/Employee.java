package setterInjection;
  

public class Employee {  
private String id;  
private String name;  
private String city;  

  public Employee()
  {
	  
  }
public String getId() {  
    return id;  
}  
public void setId(String id) {  
    this.id = id;  
}  
public String getName() {  
    return name;  
}  
public void setName(String name) {  
    this.name = name;  
}  
  
public String getCity() {  
    return city;  
}  
public void setCity(String city) {  
    this.city = city;  
}  
void display(){  
    System.out.println(id+" "+name+" "+city);  
}  
  
}  
