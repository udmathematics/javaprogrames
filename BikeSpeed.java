class SpeedLimit
{
	int sLimit = 90; 
	void run()
















	{
		System.out.println(" running safely ");
	}  
}
class Honda extends SpeedLimit
{
       	void run()
	{
		System.out.println(" running safely with speed limit ");
	}    
}
class BikeSpeed
{
	public static void main(String[] args)
	{
		SpeedLimit sp = new Honda();
		sp.run();
		System.out.println(sp.sLimit);
	}
}