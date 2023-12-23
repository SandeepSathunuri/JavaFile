class PalindromDivThree
{
	public static void main(String args[])
	{
		int n=100;
		for(;n>0;n--)
		{
			int s=0;
			int temp=n;	
			for(;n>0;n/=10)
			{
				int rem=n%10;
				s=s*10+rem;
			}
			n=temp;
			if(s==n)
			{
				if(s%3==0)
					System.out.println(s);
			}
		}
	}
}