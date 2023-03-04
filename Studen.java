class Address
{
     String city;
     String state;
     String country;
    
 	public Address(String city, Sting state, String country)
	{
		this.city = city;
		this.state = state;
		this.country = country;
	} 
}

class Student
{
	int sId;
	String sName;
	Address address;
	
	public Student(int sId, String sName, Address address)
	{
		this.sId = sId;
		this.sName = sName;
		this.address = address;
	}
	 
	public void display()
	{
		Address add = new Address();
	 	System.out.println(sid+"/t"+sName);
		System.out.println(add.city+"/t"+add.state+"/t"+add.country);	
	}
	
	public static void main(String[] args)
	{
		Address add1 = new Address("khammam","telangana","india");
		Address add2 = new Address("vijaywada","andhrapradesh","india");

		Student s = new Student(1001,"anushka",add1);
		Student s1 = new Student(1002,"parabas",add2);
		
		s.display();
		s1.display();	
	}
}