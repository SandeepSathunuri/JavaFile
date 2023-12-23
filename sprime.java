class Sprime
{
	public static void main(String args[])
	{
		int rows=5,num=1;
		for(int r=1;r<=rows;r++)
		{	
			for(int c=1;c<=rows;)
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
					if(r==1||c==1&&r==2||r==(rows/2)+1||c==rows&&r==rows-1||r==rows)
						System.out.print(num+" ");
					else
						System.out.print("   ");
					c++;
				}
				num++;
			}
			System.out.println();
		}
	}
}