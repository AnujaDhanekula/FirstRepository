package exceptions;

public class InvalidPackageIdException extends Exception
{
	public InvalidPackageIdException ()
	{
		super();
		System.out.println("PackageId is InValid");
	}
}
