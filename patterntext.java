class Patterntext
{
	public static void main(String args[])
	{
		int rows=5;
		for(int r=1;r<=rows;r++)
		{
			int n=r;
			for(int c=1;c<=r;c++)
			{	
				System.out.print(n+" ");
				n--;
			}
			System.out.println();
		}
	}
}