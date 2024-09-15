package array.practice.com;

public class FindMissingEle 
{
    public static int findMissing(int []a)
    {
       int size=a.length+1;
       int first =a[0];
       int last =a[a.length-1];
       int sum = size*(first+last)/2;
       int eleSum=0;
       for(int num:a)
       {
    	   eleSum+=num;
       }
       return sum-eleSum;
    }
    public static void main(String[] args) 
    {
        int a[]= {101,102,104};
        System.out.println("Missing Number: " + findMissing(a));
    }
}
