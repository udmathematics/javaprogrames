class Address
{
     String city;
     String state;
     String country;
    
 	public Address(String city, String state, String country)
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
	Address add;
	
	public Student(int sId, String sName, Address add)
	{
		this.sId = sId;
		this.sName = sName;
		this.add = add;
	}
	 
	public void display()
	{
	 	System.out.println(sId+"\t"+sName);
		System.out.println(add.city+"\t"+add.state+"\t"+add.country);	
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