class Automatic1
{
	public static void main(String args[])
	{
		int n=76,temp=n,count=0;
		for(;n>0;n/=10)
		{
			count++;
		}
		n=temp;
		n=n*n;
		int n1=(int)Math.pow(10,count);
		int rem=n%n1;
		if(temp==rem)
			System.out.println("Automatic number"+temp);
		
	}
}