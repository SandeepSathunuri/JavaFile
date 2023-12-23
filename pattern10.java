class Pattern10
{
	public static void main(String args[])
	{
		int rows=5;
		for(int r=1;r<=rows;r++)
		{
			int r1=r; 
			for(int c=1;c<=r;c++)
			{	
				if(c==1)
					System.out.print(r+" ");
				else
				{
					r1=r1+rows-c+1;
					System.out.print(r1+" ");
				}
			}
			System.out.println();
		}
	}
}