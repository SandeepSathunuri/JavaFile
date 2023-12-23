class PatternExam3
{
	public static void main(String args[])
	{
		int rows=5;
		for(int r=1;r<=rows;r++)
		{	
			for(int c=1;c<=rows;c++)
			{
				if(r==1||c==1&&r==2||r==3||c==5&&r==4||r==rows)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}
