package comparableInterface.com;

import java.util.ArrayList;
import java.util.Collections;

class Person implements Comparable<Person>
{
	private int height;
	private String name;
	public Person(String name,int height)
	{
		this.height=height;
		this.name=name;
	}
	
	public int compareTo(Person o) 
	{
		if(this.height == o.height)
		{
			return 0;
		}
		else if(this.height>o.height)
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
	public int getheight() 
	{
		return height;
	}
}
public class PersonHeight 
{
	public static void main(String[] args)
	{
		Person a1 = new Person("Sangram", 131);
		Person a2 = new Person("Omkar", 211);
		Person a3 = new Person("Harshad", 241);
		Person a4 = new Person("Aditya", 171);
		ArrayList<Person> arr = new ArrayList<Person>();
		arr.add(a1);
		arr.add(a2);
		arr.add(a3);
		arr.add(a4);
		System.out.println("Before sort: ");
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("Person Name\t Person Height");
		System.out.println("--------------------------------------------");
		for(Person e:arr)
		{
			System.out.println(e.getName()+"\t\t"+e.getheight());
		}
		System.out.println("--------------------------------------------");
		Collections.sort( arr);
		System.out.println("");
		System.out.println("After sort: ");
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("Person Name\t Person Height");
		System.out.println("--------------------------------------------");
		for(Person e:arr)
		{
			System.out.println(e.getName()+"\t\t"+e.getheight());
		}
		System.out.println("--------------------------------------------");
	}

}

