import java.util.Scanner;
class Pattern2
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter no.of rows");
		int rows=s.nextInt();
		System.out.println("Enter no.of col");
		int col=s.nextInt();
		for(int r=1;r<=rows;r++)
		{	
			for(int c=1;c<=col;c++)
			{	
				if(c%2==0&&r%2==1)
					System.out.print(" ");
				else if(r%2==0&&c%2==1)
					System.out.print(" ");
				else
					System.out.print("* ");
			}
				System.out.println(" ");
		}
	}
}