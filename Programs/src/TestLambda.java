interface family
{
	public void members();
}
/*class names implements family
{
	public void members(string fname, string lname)
	{
		System.out.println("Anuja" , "Dhanekula"  +fname,+lname);
	}
}*/
public class TestLambda {

	public static void main(String[] args) {
		family names=()->System.out.println("Anuja Dhanekula");
		names.members();

	}

}
