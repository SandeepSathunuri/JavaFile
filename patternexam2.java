class Patternexam2
{
	
	public static void main(String[] args)
	{
		int rows=5,num=1;
		for(int r=1;r<=rows;r++)
		{
			int count=0;
			for(int c=1;c<=rows;c++)
			{
				int r1=r%2;
				
				for(int i=1;i<=num;)
				{
					if(num%i==0)
					{
						count++;
					}
					if(count==2)
					{
						if(r1==1||r1==0&&c==1||r1==0&&c==rows)
						{
							System.out.print(num);
							c++;
						}
					num++;
					}
					else
						System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
}