class TwinPrime
{
	public static void main(String args[])
	{
		int n1=5,n2=11,start=2,count1=0,count2=0;
		while(n1/2>start)
		{
			if(n1%start==0)
			{
				count1++;
				break;
			}
			start++;
		}
		start=2;
		if(count1==0)
		{
			while(n2/2>start)
			{
				if(n2%start==0)
				{
					count2++;
					break;
				}
				start++;
				
			}
		}
		if(count2==0&&(n1-n2==2||n1-n2==-2))
				{
					System.out.println("Twin Prime");
				}
		else
			System.out.println("Both are prime but not Twin Prime");
		
	}
}