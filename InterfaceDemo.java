interface Shape
{	
	 void draw();
}
 class Rectangle implements Shape
{
	public void draw()
	{
		System.out.println("Rectangle shape");
	}
}
class Circle implements Shape
{
	public void draw()
	{
		System.out.println("circle shape");
	}
}
public class InterfaceDemo
{
	public static void main(String[] args)
	{
		Shape s = new Rectangle();
		s.draw();	
		
		System.out.println("\n");
		Shape s1 = new Circle();
		s1.draw();
		
	}
}