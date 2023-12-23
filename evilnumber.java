class EvilNumber
{
	public static void main(String args[])
	{
		int n=9,s=0,temp=n;
		n=n*n;
		for(;n>0;n/=10)
		{
			int rem=n%10;
			s=s+rem;
		}
		if(temp==s)
			System.out.println("EvilNumber: "+s);
	}
}