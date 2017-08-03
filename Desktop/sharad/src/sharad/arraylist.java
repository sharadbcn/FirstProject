package sharad;
import java.util.*;
public class arraylist {
public static void main(String args[])
{
	ArrayList<String> al=new ArrayList<String>();
	System.out.println("size of al :: " + al.size());
	al.add("A");
	al.add("B");
	al.add("C");
	System.out.println("size of al :: "+al.size());
	al.add(1,"D");
	System.out.println("size of al :: "+al.size());
	System.out.println("contents of al :: "+al);
	
	
	al.remove(1);
	al.remove("C");
	System.out.println("size of al :: "+al.size());
	System.out.println("contents of al :: "+al);
	
}
}
