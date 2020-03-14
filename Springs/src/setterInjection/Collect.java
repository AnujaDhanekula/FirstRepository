package setterInjection;

import java.util.Iterator;
import java.util.List;

public class Collect {
String id;
String name;
//private List<String> address; 
private Address address;  
Collect()
{
	
}

@Override
public String toString() {
	return "Collect [id=" + id + ", name=" + name + ", address=" + address + "]";
}

public Address  getAddress() {
	return address;
}
public void setAddress(Address  address) {
	this.address = address;
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
public void display() {
	System.out.println(id+" "+name);  
    System.out.println(address);  
	/*System.out.println(id+" "+name); 
	
    System.out.println("answers are:");
    
    Iterator<String> itr=answers.iterator();  
    while(itr.hasNext()){  
        System.out.println(itr.next());  
}
*/
}
}
