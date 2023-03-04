class GrandFather
{
	public void showG()
	{
		System.out.println("this is a grand father");
	}
}
class Father extends GrandFather
{
	public void showF()
	{
		System.out.println("this is father");
	}
}
class Son extends Father
{
	public void showS()
	{
		System.out.println("this is son");
	}
}
class Daughter extends Father
{
	public void showD()
	{
		System.out.println("this is daughter");
	}	
}
class Family
{
	public static void main(String[] args)
	{
		Son s = new Son();
		s.showS();
		s.showF();
		s.showG();

		Daughter d = new Daughter();
		d.showD();
		d.showF();
		d.showG();
	}
}