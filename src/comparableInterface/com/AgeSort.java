package comparableInterface.com;

import java.util.ArrayList;
import java.util.Collections;

class AGE implements Comparable<AGE>
{
	private int age;
	private String name;
	public AGE(String name,int age)
	{
		this.age=age;
		this.name=name;
	}
	
	public int compareTo(AGE o) 
	{
		if(this.age == o.age)
		{
			return 0;
		}
		else if(this.age>o.age)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	public String getName() 
	{
		return name;
	}
	public int getAge() 
	{
		return age;
	}
}
public class AgeSort 
{
	
	public static void main(String[] args)
	{
		AGE a1 = new AGE("Sangram", 13);
		AGE a2 = new AGE("Omkar", 21);
		AGE a3 = new AGE("Harshad", 24);
		AGE a4 = new AGE("Aditya", 17);
		ArrayList<AGE> arr = new ArrayList<AGE>();
		arr.add(a1);
		arr.add(a2);
		arr.add(a3);
		arr.add(a4);
		System.out.println("Before sort: ");
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("Student Name\t Student Age");
		System.out.println("--------------------------------------------");
		for(AGE e:arr)
		{
			System.out.println(e.getAge()+"\t\t"+e.getName());
		}
		System.out.println("--------------------------------------------");
		Collections.sort( arr);
		System.out.println("");
		System.out.println("After sort: ");
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("Student Name\tStudent Age");
		System.out.println("--------------------------------------------");
		for(AGE e:arr)
		{
			System.out.println(e.getAge()+"\t\t"+e.getName());
		}
		System.out.println("--------------------------------------------");
	}

}

