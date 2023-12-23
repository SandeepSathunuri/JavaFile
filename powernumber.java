class PowerNumber
{
	public static void main(String args[])
	{
		int n=132,s=0,p=1,temp=n;
		for(;n>0;n/=10)
		{
			int rem=n%10;
			s=s+rem;
			p=p*rem;
		}
		if(s==p)
			System.out.println("Power Number: "+temp+" is "+s+" = "+p);
	}
}