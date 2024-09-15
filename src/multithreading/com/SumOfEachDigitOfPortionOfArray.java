package multithreading.com;
class AddArayyDig
{
	public static synchronized void isPortion(int f,int e)
	{
		int sum=0;
		for(int i=f;i<e;i++)
		{
			sum=sum+SumOfEachDigitOfPortionOfArray.a[i];
		}
		System.out.println("Half portion-->"+sum);
		SumOfEachDigitOfPortionOfArray.sum+=sum;
	}
}
public class SumOfEachDigitOfPortionOfArray extends Thread
{
	static int a[]= {1,2,3,4,5,6,7,8,9,10};
	static int sum=0;
	int f,e;
	SumOfEachDigitOfPortionOfArray(int f,int e)
	{
		this.f=f;
		this.e=e;
	}
	public void run()
	{
		AddArayyDig.isPortion(f, e);
	}
	public static void main(String[] args) throws InterruptedException
	{
		SumOfEachDigitOfPortionOfArray t1 = new SumOfEachDigitOfPortionOfArray(0,a.length/2);
		SumOfEachDigitOfPortionOfArray t2 = new SumOfEachDigitOfPortionOfArray(a.length/2,a.length-1);
		
		t1.start();
		t1.join();
		
		t2.start();
		t2.join();
		System.out.println("Array is: ");
		for(int i=0;i<SumOfEachDigitOfPortionOfArray.a.length;i++)
		{
			System.out.println(SumOfEachDigitOfPortionOfArray.a[i]);
		}
		System.out.println("Main All sum: "+SumOfEachDigitOfPortionOfArray.sum);
	}

}
