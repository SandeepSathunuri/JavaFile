import java.util.Scanner;
class FactorsLoop
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enetr the n value:");
		int n=scan.nextInt();
		int start=2,fact=1;
		for(;n>=1;n--)
		{
			start=1;
			fact=1;
			for(;start<=n;start++)
			{
				fact*=start;
			}
			System.out.println("factorial of "+n+" is "+fact);
		}
	}
}