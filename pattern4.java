import java.util.Scanner;
class Pattern4
{
	public static void main(String args[])
	{	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the rows");
		int row=s.nextInt();
		for(int r=row;r>=1;r--)	
		{
			for(int c=1;c<=row;c++)
			{
				if(c==1||r==row||r==c)
					System.out.print("# ");
				else	
					System.out.print("  ");
			}
			System.out.println();
		}
	}
}