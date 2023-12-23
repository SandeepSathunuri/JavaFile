class CharPattern
{
	public static void main(String args[])
	{
		char alpha='A';
		int rows=4;
		for(int r=1;r<=rows;r++)
		{	
			for(int c=1;c<=r;c++)
			{
				System.out.print(alpha+" ");
				alpha++;
			}
			System.out.println();
		}
	}
}