import java.util.Scanner;
class AutoRange
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the input");
		int n=s.nextInt();
		int rem=0;
		for(;n>0;n--)//1000>0
		{
			int temp=n,count=0;//1000
			for(;n>0;n/=10)//
			{
				count++;//4
			}
			n=temp;//1000
			n=n*n;//1000000
			for(;n>0;n/=10)
			{	
				int div=(int)Math.pow(10,count);//1000
				rem=n%div;//1000000%1000
				break;
			}
		n=temp;//1000
		if(rem==n)
			System.out.println("Automatic Number "+n);
		}
		
	}
}