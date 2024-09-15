package practices;

import java.util.Arrays;
import java.util.List;

public class MaxStramAPI 
{
	public static int isMax(List<Integer> li)
	{
		return li.stream().mapToInt(Integer::intValue).max().orElse(0);
	}
	public static void main(String[] args) 
	{
		List<Integer> li = Arrays.asList(40,65,38,90,45,23,77,86,52,17);
		System.out.println("Max element is: "+isMax(li));
	}
}
