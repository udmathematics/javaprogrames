class WildAnimal
{
	public void lion()
	{
		System.out.println(" this is Lion ");
	}
}
class DoAnimal extends WildAnimal
{
	public void dog()
	{
		System.out.println("this is dog");
	}
}
public class Animal extends DoAnimal
{
	public static void main(String[] args)
	{
		Animal a = new Animal();
		a.dog();
		a.lion();
	}
}
    