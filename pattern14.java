class Pattern14
{
	public static void main(String args[])
	{
		int rows=5,col=9;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=col;c++)
			{				
				if(r+c==col/2+1||c-r==(col/2))		
					System.out.print("$ ");
				else 
					System.out.print("  ");// 
			}
			System.out.println();
		}
		for(int r=rows;r>=1;r--)
		{
			for(int c=1;c<=col;c++)
			{				
				if(r+c==col/2+1||c-r==(col/2))		
					System.out.print("$ ");
				else 
					System.out.print("  ");// 
			}
			System.out.println();
		}
	}
}