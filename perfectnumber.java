/*class PerfectNumber
{
	public static void main(String args[])
	{
		int num=1000,fact=1;
		int sum=0;
		while(num>=fact)//10>=1 
		{ 
			fact=1;
			sum=0;
			while(fact<=num/2)//1<=5 2<=5 3<=5 4<=5 5<=5 
			{
				if(num%fact==0)//10%1==0 10%2==0   10%5==0 
				{
	 				sum=sum+fact;//0+1=1 1+2=3 3+5=8  sum=8+1
				}
				fact++;//2 3 4 5
					
			}
			
			if(sum==num)//8==10
				System.out.println("Perfect Numbers:"+num);//sum=8  fact=5
		    num--;//9 	
		}
	}
}*/
/*class PerfectNumber
{
	public static void main(String args[])
	{
		int n=1000,f=1,s=0;
		for(;n>=1;n--)
		{
			s=0;
			for(f=1;f<=n/2;f++)
			{
				if(n%f==0)
					s=s+f;
			}
			if(s==n)
				System.out.println(n);
		}
	}
}*/
class PerfectNumber
{
	public static void main(String args[])
	{
		int n=100,f=1,s=0;
		for(;n>=1;n--)
		{
			s=0;
			f=1;
			while(f<=n/2)
			{	
				if(n%f==0)
					s+=f;
				f++;
			}
			if(s==n)
				System.out.println(n);
		}
	}
}








