import java.util.Scanner;
class Pattern3
{
	public static void main(String args[])
	{	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the input");
		int n=s.nextInt();
		System.out.println("Enter the no.of col");
		int col=s.nextInt();
		int start=0,count=0;
		for(int r=1;r<=n;r++)
		{	
			for(int c=1;c<=col;c++)
			{
				start++;
				if(n%start==0)
				1{
					count++;
					System.out.print(count+" ");
				else
					System.out.print("* ");
			}
			/*if(count==n)
				break;
			System.out.println();*/
		}
	}
}