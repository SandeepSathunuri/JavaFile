import java.util.Scanner;
class Pattern9
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no.of rows");
		int rows=s.nextInt();
		int num=1;
		for(int r=1;r<=rows;r++)//5 5<=1
		{
			for(int c=1;c<=r;)
			{
				int temp=num,sum=0;
				for(;temp>0;temp/=10)
				{
					int rem=temp%10;
					sum=sum*10+rem;
				}	
				if(sum==num)
				{
					System.out.print(num+" ");	
					c++;
				}
					num++;
			}
			System.out.println();
		}
	}
}