class DigitsOfFactors
{
	public static void main(String args[])
	{
		int n=36,count=0,temp=0,sum=0;
		for(int start=1;start<=36;start++)//1<=36
		{
			count=0;
			if(n%start==0)//36%1==0
			{
				temp=start;
				sum=0;
				for(;start>0;start/=10)//1>0 
				{
					int rem=start%10;
					sum=sum+rem;
					count++;//1
				}
				start=temp;
				System.out.println(start+" No.Of Digits "+count);
				System.out.println(start+" sum of digits "+sum);
			}	
		}
	}
}
