package comparatorInterface.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
class StudentA
{
	private int age;
	private String name;
	public StudentA(int age, String name) 
	{
		super();
		this.age = age;
		this.name = name;
	}
	public int getAge() 
	{
		return age;
	}
	public String getName() 
	{
		return name;
	}
}
class Age implements Comparator<StudentA>
{

	@Override
	public int compare(StudentA o1, StudentA o2) 
	{
		if(o1.getAge()==o2.getAge())
		{
			return 0;
		}
		else if(o1.getAge()>o2.getAge())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}
public class SortAge
{

	public static void main(String[] args) 
	{
		ArrayList<StudentA> a1 = new ArrayList<StudentA>();
		a1.add(new StudentA(18,"sangram"));
		a1.add(new StudentA(23,"Harshad"));
		a1.add(new StudentA(20,"omkar"));
		a1.add(new StudentA(25,"aditya"));
		System.out.println("Before sort: ");
		System.out.println("");
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("Student Age\t Student Name");
		System.out.println("--------------------------------------------");
		for(StudentA e:a1)
		{
			System.out.println(e.getAge()+"\t\t"+e.getName());
		}
		System.out.println("--------------------------------------------");
		Collections.sort(a1, new Age());
		System.out.println("");
		System.out.println("After sort: ");
		System.out.println("");
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("Student Age\t Student Name");
		System.out.println("--------------------------------------------");
		for(StudentA e:a1)
		{
			System.out.println(e.getAge()+"\t\t"+e.getName());
		}
		System.out.println("--------------------------------------------");
	}

}
