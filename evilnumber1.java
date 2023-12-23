class Evil1
{
	public static void main(String args[])
	{
		int n=9,sum=0,temp=n;
		n=n*n;
		for(;n>0;n/=10)
		{
			int rem=n%10;
			sum=sum+rem;
		}
		if(sum==temp)
			System.out.println(temp+"Evil Number");
	}
}