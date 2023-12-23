import java.util.Scanner;
class Pattern7
{
	public static void main(String args[])
	{
	 	Scanner s=new Scanner(System.in);
		System.out.println("Enter the no.of rows");
		int rows=s.nextInt();
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=3;c++)
			{
				if(c==1)
					System.out.print(r+" ");
				else
					System.out.print(rows*(c-1)+r+" ");
			}
			System.out.println();
		}	
	}
}	