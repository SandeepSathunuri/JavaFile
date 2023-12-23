import java.util.Scanner;
class Pattern5
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no.of rows");
		int rows=s.nextInt();
		int count=0;
		for(int r=1;r<=rows;r++)
		{	
			for(int c=1;c<=r;c++)
			{
				count++;
				if(count%2==0)
					System.out.print("# ");
				else
					System.out.print("* ");
			}
				System.out.println();
		}
	}
}