public class InvalidAgeException extends Exception{

	public InvalidAgeException()
	{
		super("Age cannot be -ve or more than 100");
	}

}



