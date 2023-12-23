import java.util.Scanner;
class ScanFibonacci
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the n");
		int n=scan.nextInt();
		int i=0,j=1,z=0;
		System.out.println(i);
		System.out.println(j);
		for(;n>2;n--)
		{
			z=i+j;
			System.out.println(z);
			i=j;
			j=z;
		}
	}
}