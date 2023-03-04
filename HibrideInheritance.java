class Animal
{
	public void eat()
	{
		System.out.println(" eating....");
	}
}
class Dog extends Animal
{
	public void bark()
	{
		System.out.println("barking.....");
	}
}
class Cat extends Animal
{
	public void mewow()
	{
		System.out.println(" mewoing.....");
	}
}
class HibrideInheritance
{
	public static void main(String[] args)
	{
	  	Cat  c = new Cat();
		c.mewow();
		c.eat();
		
		Dog d = new Dog();
		d.bark();
		d.eat();
	
	}
}
