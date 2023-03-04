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
class Shine extends Vechile
{
	void run()
	{
		System.out.println("shine running safely with speed limit 50");
	}
}

class DynamicPolymorphismDemo
{
	public static void main(String[] args)
	{
		Vechile h = new Honda();
		h.run();
			
		Vechile s = new Shine();
		s.run();
	}
}