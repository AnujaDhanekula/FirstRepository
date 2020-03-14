import java.util.Stack;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.addElement("india");
		v.add("china");
		v.addElement("Japan");
		v.addElement("uk");
		System.out.println(v);
		v.insertElementAt("America",2);
		System.out.println(v);
		v.remove(2);
		System.out.println(v);
		v.removeElementAt(2);
		System.out.println(v);
		
		Stack s=new Stack();
		s.push("java");
		s.push(".net");
		s.push("selenium");
		System.out.println(s);
		
		String temp=(String) s.pop();
		
		System.out.println(temp);
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s);
		
		
		
	}

}
