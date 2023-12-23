class Pattern13
{
	public static void main(String args[])
	{
		int rows=4;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=rows;c++)
			{
				 if(r+c<=rows)
					System.out.print("  ");
				else
					System.out.print("$ ");
			}
			System.out.println();
		}
	}
}