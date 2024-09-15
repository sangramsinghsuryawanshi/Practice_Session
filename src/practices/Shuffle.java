package practices;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Shuffle {

	public static List<Integer> isMax(List<Integer> li)
	{
		Collections.shuffle(li);
		return li.stream().toList();
	}
	public static void main(String[] args) 
	{
		List<Integer> li = Arrays.asList(55,10,82,41,48,56,30,71);
		System.out.println("Max element is: "+isMax(li));
	}
}
