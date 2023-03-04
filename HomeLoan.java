abstract class Bank
{
	public abstract void loan();
}

class HomeLoan extends Bank
{
	public void loan(){
	
		System.out.println("this is home loan");	
	}
	public static void main(String[] args)
	{
		HomeLoan hm = new HomeLoan();
		hm.loan();
	}
}