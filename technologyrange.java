import java.util.Scanner;
class TechnologyRange
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Input");
		int n=s.nextInt();
		for(;n>0;n--)
		{	
			int temp=n,count=0,n1=0,n2=0;
			for(;n>0;n/=10)
			{	
				count++;
			}
			n=temp;
			if(count%2==0)
			{	
					int div=(int)Math.pow(10,count/2);
					n1=n%div;
					n2=n/div;
				
			}
			
			int sum=n1+n2;
			int square=sum*sum;
			if(square==n)
				System.out.println("Tecbhnology NUmber "+n);
		}
	}
}