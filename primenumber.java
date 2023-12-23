/*import java.util.Scanner;
class PrimeNumber
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt("Enter the num:");
		int start=1,count=0;
		while(num>=start)
		{
			count=0;
			start=1;
			while(start<=num/2)
			{
				if(num%start==0)
				{
					count++;
				}
				start++;
			}
			if(count==1)
				System.out.println("Prime number:"+num);
			
			num--;
		}

	}
}*/
class PrimeNumber
{
	public static void main(String args[])
	{
		int n1=1,start=100,i,c=0,c1=0;
		for(;n1<=start;n1++)//n1=100 99 98 97
		{	
			c=0;
			for(i=2;i<=n1/2;i++)//2<=50 2<=49 3<=49 2<=49 2<=48 3<=48 4<=48
			{
				if(n1%i==0)//100%2==0  99%2!=0 99%3==0 98%2==0 97%2!=0 97%3==0 97%4==0
				{
					//System.out.println(i);
					c++;//c=1
					
					break;
				}
				
			}
			if(c==0&&n1!=1)
			{
				c1++;//1 2 3
				if(c1<=10)//1<=10 2<=10 3<=10 4<=10 5<=10 
					System.out.println(n1);
			}
				
		}
	}
}