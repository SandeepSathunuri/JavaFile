import java.util.Scanner;
class Pattern6
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no.of rows");
		int rows=s.nextInt();
		char alpha='a';
		for(int r=rows;r>=1;r--)
		{
			for(int c=1;c<=r;c++)
			{	
				if(c==1||c==rows||r==rows||r==c)
				{
				 	System.out.print(alpha+" ");		
					alpha++;
				}
				else
					System.out.print("  ");
				
			}
			
			System.out.println();
		}
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=r;c++)
			{
				if(c==1||r==rows||r==c)
				{
					System.out.print(alpha+" ");		
					alpha++;
				}
				else
					System.out.print("  ");
					
			}
			
			System.out.println();
		}
	}
}