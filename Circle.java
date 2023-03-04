// area of a circle
class Calculate
{
 	int square(int r)
	{
		return r * r;
	}
}
class Circle 
{
 	 Calculate cal;  // aggregation
	double  pi = 3.14;
	
	double  area(int radius)
	{
		 cal = new Calculate();
		int  resultS = cal.square(radius);
		return pi*resultS;
	}
	public static void main(String[] args)
	{
		Circle c = new Circle();
		double result = c.area(5);
		System.out.println("area of a circle = "+result);
	}
}


