import java.util.HashSet;
import java.util.Iterator;

class employ
{
	String eid;
	String name;
	public employ(String eid,String name) 
	{
		super();
		this.eid=eid;
		this.name=name;
	}
	@Override
	public String toString() {
		return "eid=" + eid + ", name=" + name;
	}
	
}
public class SetExample {

	public static void main(String[] args) {
		HashSet <String>hs= new HashSet<String>();
		hs.add("india");
		hs.add("china");
		hs.add("japan");
		hs.add("swedan");
		hs.add("india");
		hs.add("china");
		hs.add("");
		hs.add("");
		System.out.println(hs);
		
		HashSet hs1= new HashSet();
		hs1.add(new employ("1","anu"));
		hs1.add(new Employ1("2","siri"));
		hs1.add(new Employ1("3","ruchi"));
		hs1.add(new Employ1("4","mydhili"));
		Iterator itr=hs1.iterator();
		
		hs1.forEach(System.out::println);
	}

}
