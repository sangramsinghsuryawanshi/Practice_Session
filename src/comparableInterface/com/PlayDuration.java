package comparableInterface.com;

import java.util.ArrayList;
import java.util.Collections;

class Song implements Comparable<Song>
{
	private double Play_Time;
	private String s_Name;
	
	public Song(double play_Time, String s_Name) 
	{
		this.Play_Time = play_Time;
		this.s_Name = s_Name;
	}

	public double getPlay_Time() 
	{
		return Play_Time;
	}

	public String getS_Name() 
	{
		return s_Name;
	}

	@Override
	public int compareTo(Song o) 
	{
		if(this.Play_Time==o.Play_Time)
		{
			return 0;
		}
		else if(this.Play_Time>o.Play_Time)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
public class PlayDuration 
{
	public static void main(String[] args) 
	{
		Song b = new Song(89.45,"ABC");
		Song b1 = new Song(78.90,"XYZ");
		Song b2 = new Song(56.78,"LMN");
		Song b3 = new Song(23.45,"PQR");
		ArrayList<Song> a1 = new ArrayList<Song>();
		a1.add(b);
		a1.add(b1);
		a1.add(b2);
		a1.add(b3);
		System.out.println("Before sort: ");
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("Song PlayTime\tSong Name");
		System.out.println("--------------------------------------------");
		for(Song e:a1)
		{
			System.out.println(e.getPlay_Time()+"\t\t"+e.getS_Name());
		}
		System.out.println("--------------------------------------------");
		Collections.sort(a1);
		System.out.println("");
		System.out.println("After sort: ");
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("Song PlayTime\tSong Name");
		System.out.println("--------------------------------------------");
		for(Song e:a1)
		{
			System.out.println(e.getPlay_Time()+"\t\t"+e.getS_Name());
		}
		System.out.println("-----------------------------------------------");
	}
}
