class NestedIfDemo 
{
	public static void main(String[] args) 
	{
		int a = -100 , b = -25, c = -308;
		if (a > b)
		{
			if(a > c)
			{
				System.out.println("a is big: "+a);
			}
			else
			{
				System.out.println("c is big: "+c);
			}
		}
		else
		{
			System.out.println("b is big: "+b);
		}
	}
}
