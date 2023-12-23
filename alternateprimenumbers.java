class AlternatePrimeNumbers
{
	public static void main(String args[])
	{	
		int n=10,count=0,altrC=0;
		for(;n>=1;n--)
		{	
			count=0;
			for(int i=2;i<=n/2;i++)
			{	
				if(n%i==0)
				{
					count++;
					break;
				}
			}
			if(count==0&&n!=1)
			{
				altrC++;
				if(altrC%2==1)
				{
					System.out.println(n);
				}
			}	
				
		}
	}
}