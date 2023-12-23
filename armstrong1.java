import java.util.Scanner;
class Armstrong1
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the input");
		int n=s.nextInt();
		int temp=n,count=0,a=0,p=0;
		for(;n>0;n/=10)
		{
			count++;
		}
		n=temp;
		for(;n>0;n/=10)
		{
			int rem=n%10;
			a=(int)Math.pow(rem,count);
			p=p+a;
		}
		n=temp;
		if(p==n)
			System.out.println(s+" Armstrong");
	}
}