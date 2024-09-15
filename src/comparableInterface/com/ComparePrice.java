/*
 * Q.3 Implement Comparable for a 
 * Product class considering their prices.
 */
package comparableInterface.com;

import java.util.ArrayList;
import java.util.Collections;

class Product implements Comparable<Product>
{
	private int Price;
	private String Product;
	public Product(int price, String product) 
	{
		this.Price = price;
		this.Product = product;
	}
	public int getPrice()
	{
		return Price;
	}
	public String getProduct() 
	{
		return Product;
	}
	@Override
	public int compareTo(Product o) 
	{
		if(this.Price==o.Price)
		{
			return 0;
		}
		else if(this.Price>o.Price)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
}
public class ComparePrice 
{
	public static void main(String[] args) 
	{
		Product b = new Product(123,"Apple");
		Product b1 = new Product(198,"Orange");
		Product b2 = new Product(342,"Dragon Fruit");
		Product b3 = new Product(231,"Pinapple");
		ArrayList<Product> a1 = new ArrayList<Product>();
		a1.add(b);
		a1.add(b1);
		a1.add(b2);
		a1.add(b3);
		System.out.println("Before sort: ");
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("Product Price\tProduct");
		System.out.println("--------------------------------------------");
		for(Product e:a1)
		{
			System.out.println(e.getPrice()+"\t\t"+e.getProduct());
		}
		System.out.println("--------------------------------------------");
		Collections.sort(a1);
		System.out.println("");
		System.out.println("After sort: ");
		System.out.println("");
		System.out.println("--------------------------------------------");
		System.out.println("Product Price\tProduct");
		System.out.println("--------------------------------------------");
		for(Product e:a1)
		{
			System.out.println(e.getPrice()+"\t\t"+e.getProduct());
		}
		System.out.println("-----------------------------");
	}
}
