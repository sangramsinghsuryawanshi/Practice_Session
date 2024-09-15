/*
 * Q.2 Create a class Book that implements Comparable and 
 * compares books based on their titles.
 */
package comparableInterface.com;

import java.util.ArrayList;
import java.util.Collections;

class Book implements Comparable<Book>
{
	private String B_Name;
	private int B_Id;
	private String B_Author;
	public Book(String b_Name, int b_Id, String b_Author) 
	{
		this.B_Name = b_Name;
		this.B_Id = b_Id;
		this.B_Author = b_Author;
	}
	public String getB_Name() 
	{
		return B_Name;
	}
	public int getB_Id() 
	{
		return B_Id;
	}
	public String getB_Author() 
	{
		return B_Author;
	}
	@Override
	public int compareTo(Book o) 
	{
		if(this.B_Name.compareTo(o.B_Name)==0)
		{
			return 0;
		}
		else if(this.B_Name.compareTo(o.B_Name)>0)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
public class CompareBook 
{
	public static void main(String[] args)
	{
		Book b = new Book("To Kill a Mockingbird",1,"       by Harper Lee");
		Book b1 = new Book("1984                ",2,"       by George Orwell");
		Book b2 = new Book("Pride and Prejudice", 3,"       by Jane Austen");
		Book b3 = new Book("The Great Gatsby",    4,"       by F. Scott Fitzgerald");
		ArrayList<Book> ab = new ArrayList<Book>();
		ab.add(b);
		ab.add(b1);
		ab.add(b2);
		ab.add(b3);
		System.out.println("Before sort: ");
		System.out.println("");
		System.out.println("------------------------------------------------------------------");
		System.out.println("Book Title\t\tBook Id\t\tBook Author");
		System.out.println("------------------------------------------------------------------");
		for(Book bo : ab)
		{
			System.out.println(bo.getB_Name()+"\t"+bo.getB_Id()+"\t"+bo.getB_Author());
		}
		
		System.out.println("------------------------------------------------------------------");
		Collections.sort(ab);
		System.out.println("After sort: ");
		System.out.println("");
		System.out.println("------------------------------------------------------------------");
		System.out.println("Book Title\t\tBook Id\t\tBook Author");
		System.out.println("------------------------------------------------------------------");
		for(Book bo : ab)
		{
			System.out.println(bo.getB_Name()+"\t"+bo.getB_Id()+"\t"+bo.getB_Author());
		}
		System.out.println("------------------------------------------------------------------");
		
	}
}
