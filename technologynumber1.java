class Technology1
{
	public static void main(String args[])
	{	
		int n=2025,temp=n,n1=0,n2=0,sum=0,square=0,count=0;
		for(;n>0;n/=10)
		{
			count++;
		}
		int r1=count/2;
		int div=(int)Math.pow(10,r1);
		n=temp;
		n1=n%div;
		n2=n/div;	
		sum=n1+n2;
		square=sum*sum;
		if(square==temp)
			System.out.println(temp+"Technology Number");
	}	
}