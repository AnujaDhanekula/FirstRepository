import java.util.HashSet;
import java.util.TreeSet;
import java.util.Collections;
class Employ1 implements Comparable  <Employ1>
{
	
	String eid;
	String name;
	public Employ1(String eid,String name) 
	{
		super();
		this.eid=eid;
		this.name=name;
	}
	@Override
	public String toString() {
		return "eid=" + eid + ", name=" + name ;
	}
	
	@Override
	public int compareTo(Employ1 employ) {
		if(eid.compareTo(employ.eid)<0)
			return -1;
		else if(eid.compareTo(employ.eid)>0)
			return 1;
		else
		return 0;
	}
	
	
}
public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet s=new TreeSet();
		s.add("india");
		s.add("china");
		s.add("japan");
		s.add("swedan");
		s.add("india");
		s.add("china");
		s.add("America");
		s.add("");
		System.out.println(s);
		
		TreeSet hs1= new TreeSet();
		
		hs1.add(new Employ1("1","anu"));
		hs1.add(new Employ1("2","siri"));
		hs1.add(new Employ1("3","ruchi"));
		hs1.add(new Employ1("4","mydhili"));
		System.out.println(hs1);
		
	}

}
