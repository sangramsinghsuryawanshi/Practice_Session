package practices;
interface A
{
	public static void isW()
	{
		System.out.println("Hello java");
	}
	public static void isV()
	{
		System.out.println("Hello java");
	}
}
public class Message implements A
{
	public static void isGood()
	{
		A.isW();
		A.isV();
		System.out.println("hello");
	}
	public static void main(String[] args) 
	{
		isGood();
	}
}
