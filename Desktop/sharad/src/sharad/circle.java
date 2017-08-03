package sharad;
class operation
{
	int square(int r)
	{
	return r*r;
     }
}

public class circle
{
	operation op;
	double area(int r)
	{
		op=new operation();
		return 3.14*op.square(r);
		
	}


public static void main(String [] args)
{
	circle c1=new circle();
	System.out.println("area of circle is r=5 : " + c1.area(5));
}
}