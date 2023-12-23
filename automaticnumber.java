/*class AutomaticNumber
{
	public static void main(String args[])
	{
		int n=76,temp=n,s=0,s1=0;
		for(;n>0;n/=10)
		{	
			int rem=n%10;
			s=s*10+rem;//67
		}
		n=temp;
		n=n*n;//5776
		for(;n>0;n/=10)
		{
			int rem=n%10;//6 7
			s1=s1*10+rem;//67
			if(s==s1)
			{
				System.out.println("Automatic number is "+temp);
				break;
			}
		}
	}
}*/


class AutomaticNumber
{
	public static void main(String args[])
	{
		int n=6,temp=n,count=0;
		
		for(;n>0;n/=10)
		{
			count++;
		}
		n=temp;
		n=n*n;
		int result=n%(int)Math.pow(10,count);
		n=temp;
		if(n==result)
			System.out.println("Automatic Number");
	}
}




