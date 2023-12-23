import java.util.Scanner;
class ScanArmstrong
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the n");
		int n=scan.nextInt();
		int temp=n,sum=0,count=0,pow=0;
		for(;n>0;n/=10)
		{
			count++;	
		}
		n=temp;
		for(;n>0;n/=10)
		{	
			int rem=n%10;
			pow=(int)Math.pow(rem,count);
			sum=sum+pow;
		}
		n=temp;
		if(sum==n)
			System.out.println("Armstrong");
	}
}