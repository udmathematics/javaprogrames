class Bank
{
  	double getRateOfIntrest()
	{
		return 0;
	}
}
class SBI extends Bank
{
	double getRateOfIntrest()
	{
		return 7.5;
	}
}
class ICICI extends Bank
{
	double getRateOfIntrest()
	{
		return 8.5;
	}
}
class AxiesBank extends Bank
{
	double getRateOfIntrest()
	{
		return 9.5;
	}
}

class BankLoanIntrest
{
	public static void main(String[] args)
	{
		Bank b;
		b = new SBI();
		System.out.println("Rate of intrest SBI = "+b.getRateOfIntrest());

		b = new ICICI();
		System.out.println("Rate of Intrest ICICI = " +b.getRateOfIntrest());

		AxiesBank a = new Bank();
		System.out.println("Rate of Intrest AxiesBankd = "+a.getRateOfIntrest());
	}
}
