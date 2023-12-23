import java.util.Scanner;
class Prime1
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the input");
		int n=s.nextInt();	
		int count=0,temp=n;
		for(int start=2;start<=n/2;start++)
		{
			if(n%start==0)
			{
				count++;
				break;
			}
		}
		if(count==0&&n!=1)
		{
			System.out.println(temp+" Prime nUmber");
		}
	}
}