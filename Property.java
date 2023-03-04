public class Property
{
  private int a= 10;  
  public  void msg()
    {
	System.out.println("this is property class m1 method");
     }
}
class PropertyOne extends Property
{
	public static void main(String[] args)
	{
		PropertyOne po = new PropertyOne();
		System.out.println(po.a); // Compile time error
		po.msg();	// output: this is property class m1 method	
	} 
}
