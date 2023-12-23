import java.util.Scanner;
class Strongdowhile
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the input");
		int n=s.nextInt();//1000
		do
		{
			int sum=0,temp=n;//1000 999
			do
			{
				int rem=temp%10;//0 0 0 1	 9
				int start=1;
				int fact=1;
				do
				{
					fact=fact*start;//1 1 1 1 
					start++;	
				}while(rem>=start); 
				sum=sum+fact;//1+1=2+1=3+1=4
				temp/=10;
			}while(temp>0);
			if(sum==n)//4==1000
				System.out.println("Strong number: "+n);
			//System.out.println("temp"+temp);
			//System.out.println("sum"+sum);
			n--;
		}while(n>0);
	}
}