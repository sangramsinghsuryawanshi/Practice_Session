package comparatorInterface.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Event
{
	private double time;
	private String E_Name;
	public Event(double time, String e_Name) 
	{
		super();
		this.time = time;
		E_Name = e_Name;
	}
	public double getTime() 
	{
		return time;
	}
	public String getE_Name() 
	{
		return E_Name;
	}
	
}
class TimeE implements Comparator<Event>
{

	@Override
	public int compare(Event o1, Event o2) 
	{
		if(o1.getTime()==o2.getTime())
		{
			return 0;
		}
		else if(o1.getTime()>o2.getTime())
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}
public class SortEvenDuration 
{
	public static void main(String[] args) 
	{
		ArrayList<Event> a1 = new ArrayList<Event>();
		a1.add(new Event(18.20,"DRT"));
		a1.add(new Event(2.40,"XYZ"));
		a1.add(new Event(2.1,"FGT"));
		a1.add(new Event(25.80,"ASR"));
		System.out.println("Before sort: ");
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("Song Time\tSong Name");
		System.out.println("--------------------------------------------");
		for(Event e:a1)
		{
			System.out.println(e.getTime()+"\t\t"+e.getE_Name());
		}
		System.out.println("--------------------------------------------");
		Collections.sort(a1, new TimeE());
		System.out.println("");
		System.out.println("After sort: ");
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("Song Time\tSong Name");
		System.out.println("--------------------------------------------");
		for(Event e:a1)
		{
			System.out.println(e.getTime()+"\t\t"+e.getE_Name());
		}
		System.out.println("--------------------------------------------");
	}

}
