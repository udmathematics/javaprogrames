class IfElseIfDemo 
{
	public static void main(String[] args) 
	{
		int a = 100 , b = 205, c = 38;
		if (a > b)
			System.out.println(" A is biggest: "+a);
			
		else
		{
			if (b > c)
			{
				System.out.println("B is Biggest: "+b);
			}
			else
			{
				System.out.println("C is biggest: "+c);
			}
		}
	}
}
