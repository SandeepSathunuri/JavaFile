import java.util.Scanner;
class StrongNumber
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enetr the n value: ");
		int n=scan.nextInt();//145
		for(;n>0;n--)//200 199
		{
			int fact=2,pro=1,sum=0,temp=n;
			for(;n>0;n/=10)//200>0 199>0
			{	
				int rem=n%10;//0 9
				pro=1;
				fact=2;
				for(;rem>=fact;fact++)//0>=2
				{	
					pro=pro*fact;//
				}
				sum=sum+pro;//sum=4
			}
			//System.out.println("Sum of factorial "+temp+" is: "+sum);
			n=temp;
			if(sum==temp)
				System.out.println("Strong number: "+temp);
			/*else
				System.out.println("not Strong number"+temp);*/
		}
	}     
}
