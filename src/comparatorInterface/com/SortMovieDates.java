package comparatorInterface.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Movies
{
	private String date;
	private String name;
	public Movies(String date, String name)
	{
		this.date = date;
		this.name = name;
	}
	public String getDate() 
	{
		return date;
	}
	public String getName() 
	{
		return name;
	}
}
class M_Date implements Comparator<Movies>
{

	@Override
	public int compare(Movies o1, Movies o2) 
	{
		if(o1.getDate().compareTo(o2.getDate())==0)
		{
			return 0;
		}
		else if(o1.getDate().compareTo(o2.getDate())>0)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}
public class SortMovieDates 
{
	public static void main(String[] args)
	{
		ArrayList<Movies> arr = new ArrayList<Movies>();
		arr.add(new Movies("1-3-24", "3 idiots"));
		arr.add(new Movies("1-5-24", "Bahubali"));
		System.out.println("Before sort: ");
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("Movies Date\tMovies Name");
		System.out.println("--------------------------------------------");
		for(Movies e:arr)
		{
			System.out.println(e.getDate()+"\t\t"+e.getName());
		}
		System.out.println("--------------------------------------------");
		Collections.sort(arr, new M_Date());
		System.out.println("");
		System.out.println("After sort: ");
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("Movies Date\tMovies Name");
		System.out.println("--------------------------------------------");
		for(Movies e:arr)
		{
			System.out.println(e.getDate()+"\t\t"+e.getName());
		}
		System.out.println("--------------------------------------------");
	}

}

