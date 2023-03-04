class A
{
     final  void  marry()
     {
	System.out.println("i can marry with pullamma");
      }
}
class B extends A 
{
            	public void marry()
	{
		System.out.println("i can maryy with anushka");
	}
            public static void main(String[] args)
	{
	    	B b = new B();
		b.marry();			
	}			
}
// CE:  cannot inherit from finalmethod
