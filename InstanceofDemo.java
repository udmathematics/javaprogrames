class InstanceofDemo 
{
	public static void main(String[] args) 
	{
		Thread t = new Thread();
		System.out.println(null instanceof Object);//true
		System.out.println(null instanceof Runnable);//true
		System.out.println(null instanceof Thread);//true
	}
}
