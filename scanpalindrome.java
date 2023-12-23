import java.util.Scanner;
class ScanPalindrome
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the min");
		int n1=scan.nextInt();
		System.out.println("Enter the max");
		int n2=scan.nextInt();
		for(;n1<=n2;n1++)
		{	
			int s=0;
			int temp=n1;
			for(;n1>0;n1/=10)
			{
				int rem=n1%10;
				s=s*10+rem;
			}
			n1=temp;
			if(s==n1)
				System.out.println("palindrome is: "+n1);
		}
	}
}