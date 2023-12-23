import java.util.Scanner;
class ScanPrime
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the input n");
		int n=scan.nextInt();
		int fact=2,count=0;
		for(;fact<=n/2;fact++)
		{
			if(n%fact==0)
				count++;
		}
		if(count==0&&n!=1)
			System.out.println("prime Number");
		else
			System.out.println("Not a Prime Number");
	}
}