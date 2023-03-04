class Vechile
{
	 void run()
	{
		System.out.println("running..");
	}
}
class Honda extends Vechile
{
	 void run()
	{
		System.out.println("honda running safely...");
	}
}
class StaticPolymorphismDemo
{
	public static void main(String[] args)
	{
		Vechile v = new Honda();
		v.run();
	}
}