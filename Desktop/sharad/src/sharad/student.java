package sharad;

public class student {
	int id;
	String name;
	student(){
		System.out.println("student created");
	}
	student(int i,String s)
	{
		id=i;
		name=s;
	}
	
	public static void main(String args[])
	{
		student s1=new student(1,"sharad");
		student s2=new student();
        System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + " " + s2.name);
	}

}
