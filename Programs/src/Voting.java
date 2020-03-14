
public class Voting {
	public Voting() {

					}
	public void testAge(int age) throws InsufficientAgeException, InvalidAgeException
		{
			if(age>=0 && age<18)
				{
					throw new InsufficientAgeException();
				}
			else if(age<=0 || age>=100)
				{
					throw new InvalidAgeException();
				}
			else
				{
					System.out.println("ur eleigible for voting");
				}
		}
}


