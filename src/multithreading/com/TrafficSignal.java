package multithreading.com;
class Red extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Red single\n Wait....!");
			Thread.sleep(10000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class Yellow extends Thread
{
	public void run()
	{
		try
		{
			System.out.println("Yellow single\n Ready To Go....!");
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
class Green extends Thread
{
	public void run()
	{
		System.out.println("Green single\n Now Go....!");
	}
}
public class TrafficSignal 
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		Red t1 = new Red();
		t1.start();
		t1.join();
		
		Yellow t3 = new Yellow();
		t3.start();
		t3.join();
		
		Green t2 = new Green();
		t2.start();
		t2.join();
	}

}
