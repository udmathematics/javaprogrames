abstract class Bank
{
	public abstract void loan();
}

class HomeLoan extends Bank
{
	public void loan(){
	
		System.out.println("this is home loan");	
	}	
}
class PersonalLoan extends HomeLoan
{
	public void loan()
	{
		System.out.println("this is personla loan");
	}
}
 class  Account extends PersonalLoan
{
	public static void main(String[] args)
	{	
		Account ac = new Account();
		ac.loan();
	}
}