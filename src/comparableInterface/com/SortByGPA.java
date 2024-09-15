package comparableInterface.com;

import java.util.ArrayList;
import java.util.Collections;

class Student implements Comparable<Student>
{
	private double gpa;
	private String s_Name;
	public Student(double gpa, String s_Name) 
	{
		this.gpa = gpa;
		this.s_Name = s_Name;
	}
	
	public double getGpa() 
	{
		return gpa;
	}
	public String getS_Name() 
	{
		return s_Name;
	}

	@Override
	public int compareTo(Student o) 
	{
		if(this.gpa==o.gpa)
		{
			return 0;
		}
		else if(this.gpa>o.gpa)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
public class SortByGPA 
{
	public static void main(String[] args) 
	{
		Student b = new Student(89.45,"ABC");
		Student b1 = new Student(78.90,"XYZ");
		Student b2 = new Student(56.78,"LMN");
		Student b3 = new Student(23.45,"PQR");
		ArrayList<Student> a1 = new ArrayList<Student>();
		a1.add(b);
		a1.add(b1);
		a1.add(b2);
		a1.add(b3);
		System.out.println("Before sort: ");
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("Student GPA\tStudent Name");
		System.out.println("--------------------------------------------");
		for(Student e:a1)
		{
			System.out.println(e.getGpa()+"\t\t"+e.getS_Name());
		}
		System.out.println("--------------------------------------------");
		Collections.sort(a1);
		System.out.println("");
		System.out.println("After sort: ");
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("Student GPA\tStudent Name");
		System.out.println("--------------------------------------------");
		for(Student e:a1)
		{
			System.out.println(e.getGpa()+"\t\t"+e.getS_Name());
		}
		System.out.println("-----------------------------");
	}
}
