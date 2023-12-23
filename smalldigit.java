import java.util.Scanner;
/*class SmallDigit
{
	public static void main(String args[])
	{
		int n=2493,min=9,temp=n;	
		for(;n>0;n/=10)
		{
			int rem=n%10;
			if(min>rem)
				min=rem;
		}
			System.out.println(min);
	}
}*/
class SmallDigit
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n=scan.nextInt();//154514895
		int min=9,min1=9;
		for(;n>0;n/=10)
		{
			int rem=n%10;
			if(min>rem)//9>5 5>9 5>8  5>4 4>1 1>5  1>4 1>5 1>1
			{
				min1=min;//9 5 4  
				min=rem;//5 4  1  
			}
 	 		else if(min1>rem && min!=rem)//9>9 9>8 4>5 4>4 4>5 4>1&&1!=1
			{
				min1=rem;//8 1
			}
		}
		System.out.println("Second smallest:"+min1);
		System.out.println("smallest :"+min);
	}
}