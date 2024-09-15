/*
 * Write a method that takes a list of Student objects as input, 
 * where each Student has a name and a grade. 
 * The method should return a map where the keys are the distinct grades 
 * and the values are lists of students who have that grade. 
 * Use the Stream API to solve this problem.
 */
package practices;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class HardOne 
{
	public static HashMap<Double, String> isRet(HashMap<Double, String> hm)
	{
		TreeMap<Double, String> tr = new TreeMap<Double, String>(hm);
		HashMap<Double, String> hm1 = new HashMap<Double, String>(tr);
		return hm1;
	}
	public static void main(String[] args) 
	{
		HashMap<Double, String> hm = new HashMap<Double, String>();
		hm.put(67.3, "omkar");
		hm.put(64.3, "amar");
		hm.put(66.3, "harshad");
		hm.put(66.3, "harshad");
		for(Entry<Double, String> ent : isRet(hm).entrySet())
		{
			System.out.println(ent.getKey()+" "+ent.getValue());
		}
	}

}
