package sharad;

public class employee {
	address addr;
	String name;
	int empid;
	public employee(String name,int empid,address addr)
	{
		this.name=name;
		this.empid=empid;
		this.addr=addr;
	}
	
	void display()
	{
		System.out.println(name + "  " + empid);
        System.out.println(addr.city + " " + addr.state +" " + addr.country);
	}
	
	public static void main(String [] a)
	{
		address add1=new address("lucknow","up","india");
		address add2=new address("banglore","karnataka","india");
		employee emp1=new employee("sharad",18817,add1);
		employee emp2=new employee("shivendra",18802,add2);
		emp1.display();
		emp2.display();
		
	}

}

