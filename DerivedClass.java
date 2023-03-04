class BaseClass
{
	int a= 10, b= 20;
	public void addition()
	{
		int c = a+b;
		System.out.println("addtion of two numbers is = "+c);
	}
	public void multiplication()
	{
		int c = a * b;
		System.out.println("multiplication of two numbers is = "+c);
	}
}
class DerivedClass extends BaseClass
{
	public static void main(String[] args)
	{
		DerivedClass d = new DerivedClass();
		d.addition();
		d.multiplication();	
	}
}