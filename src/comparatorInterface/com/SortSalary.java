package comparatorInterface.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class ESalary 
{
	private int salary;
	private String name;
	public ESalary(int salary, String name) 
	{
		this.salary = salary;
		this.name = name;
	}
	public int getSalary() 
	{
		return salary;
	}
	public String getName() 
	{
		return name;
	}
}
class Emp_Salary implements Comparator<ESalary> 
{

	@Override
	public int compare(ESalary o1, ESalary o2) 
	{
		if(o1.getSalary()==o2.getSalary())
		{
			return 0;
		}
		else if(o1.getSalary()>o2.getSalary())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}
public class SortSalary 
{
	public static void main(String[] args)
	{
		ArrayList<ESalary> arr = new ArrayList<ESalary>();
		arr.add(new ESalary(90000, "Sangram"));
		arr.add(new ESalary(50000, "Harshad"));
		arr.add(new ESalary(80000, "Omkar"));
		arr.add(new ESalary(70000, "Aditya"));
		System.out.println("Before sort: ");
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("Employee Salary\tEmployee Name");
		System.out.println("--------------------------------------------");
		for(ESalary e:arr)
		{
			System.out.println(e.getSalary()+"\t\t"+e.getName());
		}
		System.out.println("--------------------------------------------");
		Collections.sort(arr, new Emp_Salary());
		System.out.println("");
		System.out.println("After sort: ");
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("Employee Salary\tEmployee Name");
		System.out.println("--------------------------------------------");
		for(ESalary e:arr)
		{
			System.out.println(e.getSalary()+"\t\t"+e.getName());
		}
		System.out.println("--------------------------------------------");
	}

}

