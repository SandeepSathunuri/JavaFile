import java.util.Scanner;
class Pattern15
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the rows");
		int rows=s.nextInt();	
		for(int r=rows;r>=1;r--)
		{
			for(int c=1;c<=r;c++)
				System.out.print("  ");
			for(int c=1;c<=2*(rows-r)+1;c++)
			{
				if(c==1||c==2*(rows-r)+1||r==1||c==(rows-r)+1)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			/*for(int c=1;c<=r;c++)
				System.out.print("  ");*/
			System.out.println();
		}
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=r;c++)
				System.out.print("  ");
			for(int c=1;c<=2*(rows-r)+1;c++)
			{
				//if(c==2*(rows-r)+1||c==1||c==rows-r+1)
					System.out.print("* ");
				//else
					//System.out.print("  ");
			}
			for(int c=1;c<=r;c++)
				System.out.print("  ");
			System.out.println();
		}
	}
}