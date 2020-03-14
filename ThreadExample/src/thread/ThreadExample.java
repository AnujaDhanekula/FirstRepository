package thread;

public class ThreadExample 
{

	
	public static void main(String[] args)
	{
		Runnable r=()->{
			for( int i=0;i<=10;i++)
				{
				System.out.println("Thread Started:"+i);
				}
			};

		Thread T =new Thread(r);
		T.start();
	}
	

}
