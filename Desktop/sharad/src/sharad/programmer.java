package sharad;
class employ
{
	float salary =30000;
}

public class programmer extends employ{
	float bonus=1000;
	public static void main(String [] args)
	{
		programmer p=new programmer();
		System.out.println("salary is : "+p.salary);
		System.out.println("bonus is : "+p.bonus);
	}

}
