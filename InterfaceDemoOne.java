interface  Rectangle 
{
	public void draw();
	
}
interface Circle 
{
	public void draw1();
	
}
public class InterfaceDemoOne implements Rectangle, Circle
{
	public void draw()
	{
		System.out.println("rectangle draw");
	}
	public void draw1()
	{
		System.out.println("circle draw");
	}
	public static void main(String[] args)
	{
		InterfaceDemoOne d = new InterfaceDemoOne();
		d.draw();
		d.draw1();
		
	}
}