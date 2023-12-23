class Powernumber1
{
	public static void main(String args[])
	{	
		int n=132,sum=0,pro=1,temp=n;
		for(;n>0;n/=10)
		{
			int rem=n%10;
			sum=sum+rem;
			pro=pro*rem;
		}
		if(sum==pro)
			System.out.println(temp+"Power Number");
	}
}