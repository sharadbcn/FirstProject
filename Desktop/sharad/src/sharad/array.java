package sharad;

public class array {
public static void main(String [] args)
{
	int month[]=new int[12];
	month[0]=1;
	month[1]=2;
	System.out.println(month[0] + " " + month[1]);
	int month_days[]={31,28,31,30,31,30,31,31,30,31,30,31};
	System.out.println("april has "  + month_days[3] + " days ");
	
	
	int twoD [][]=new int [4][5];
	int i,j,k=0;
	for(i=0;i<4;i++)
		for(j=0;j<5;j++)
		{
			twoD[i][j]=k;
			k++;
		}
	//printing values of twoD
	for(i=0;i<4;i++){
		for(j=0;j<5;j++)
			System.out.print(twoD[i][j] + "  ");
		System.out.println();
	}
	int a=10;
	System.out.println(~a);
}
}
