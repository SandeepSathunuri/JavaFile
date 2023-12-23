class Range9
{
	public static void main(String args[])
	{
		int num1=100,num2=200,div=9,sum=0;
		
			while(num1<=num2)
			{
				if(num1%div==0)
				{
					System.out.println(num1);
					sum=sum+num1;
				}
				num1++;
				
			}
		System.out.println(sum);

		
	}
}