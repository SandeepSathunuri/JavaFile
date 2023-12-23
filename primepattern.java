class PrimePattern
{
	public static void main(String args[])
	{
		int rows=5,num=1;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=rows;c++)
			{
				int count=0;
				for(int start=2;start<=num/2;start++)
				{
					if(num%start==0)
					{
						count++;
						break;
					}
				}
				if(count==0&&num!=1)
				{
					
					if(r==1||c==1&&r==2||r==3||c==5&&r==4||r==rows)
						System.out.print(num+" ");
					else
						System.out.print("  ");
				}
				num++;
				
			}
				System.out.println();
		}
	}
}