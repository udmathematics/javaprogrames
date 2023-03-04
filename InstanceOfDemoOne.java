class Parent
{
     	public void parentMethod()
	{
		System.out.println("parent method");
	}
}
class InstanceOfDemoOne extends Parent
{
	public static void main(String[] args)
	{
		InstanceOfDemoOne id = new InstanceOfDemoOne();
		System.out.println(id instanceof Parent);
		id.parentMethod();		
	}
}