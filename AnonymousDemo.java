import java.util.*;
class AnonymousDemo 
{
	public static void main(String[] args)throws Exception 
	{
		try{ 
			Sum(new int[]{10,20,30,40});
		}
		catch(Exception e)
		{
			System.out.println("Sum is not defined");
		}
	}
	public static void Sum(int[] x)
	{
		int total = 0;
		for(int x1 : x)
		{
			total = total + x1;
		}
		System.out.println("sum of = "+total);
	}
}
