public class GenericDemo<A> {
A a;
A b;
public GenericDemo(A obj1,A obj2)
{
a=obj1;
b=obj2;
}
public void display()
{
System.out.println(a+" , "+b);
}
public A reta()
{
return a;
}
public A retb()
{
return b;
}

public static void main(String[] args) {

 GenericDemo obj=new GenericDemo(11,33);
 int x=(int)obj.reta();
 int y=(int)obj.retb();
 int z=x+y;
System.out.println("Addition is"+z);

GenericDemo obj1=new GenericDemo("Hello","World");
obj1.display();
}
}
