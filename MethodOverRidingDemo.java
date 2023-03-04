class Addition
{
	public int add(int a, int b)
	{
		return a+b;
	}
}
class AdditionOne extends Addition
{
	public int add(int  a, int b)
	{
		return a+b;
	}
}
class MethodOverRidingDemo
{
	public static void main(String[] args)
	{
		AdditionOne  a1 = new AdditionOne();
		int  resultOne = a1.add(30, 20);
		System.out.println("addition of two numbers= "+resultOne);
	}
}
