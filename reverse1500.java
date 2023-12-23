class Reverse1500
{
	public static void main(String args[])
	{
		int n=1500,s=0,c=0,c1=0,s1=0;
		for(;n>0;n/=10)
		{
			int rem=n%10;
			s=s*10+rem;
			c++;
		}
		System.out.println(s);	
		for(;s>0;s/=10)
		{
			int rem=s%10;
			s1=s1*10+rem;
			c1++;
		}
		int r=c-c1;
		s1=(int)(s1*Math.pow(10,r));
		System.out.println(s1);
		
	}
}