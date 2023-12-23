class PatternExam1
{
	public static void main(String args[])
	{
		int rows=5;
		int temp=1;
		for(int r=1;r<=rows;r++)
		{
			for(int c=rows;c>=r;c--)
			{	
				System.out.print("  ");
			}
			for(int c=2;c<=(2*r);c++)
			{
				if(c==2||c==2*r)
					System.out.print(temp+"  ");
				else if(r==5&&c==6)
					System.out.print(0+" ");
				else
					System.out.print("  ");
			}
			temp++;
			System.out.println();
		}
		for(int r=rows-1;r>=1;r--)
		{
			for(int c=rows;c>=r;c--)
			{	
				System.out.print("  ");
			}
			for(int c=2;c<=(2*r);c++)
			{
				if(c==2||c==2*r)
					System.out.print(temp+"  ");
				else
					System.out.print("  ");
			}
			System.out.println();
			temp++;
		}
	}
}