import java.util.Scanner;
class Pattern
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);	
		System.out.println("Enter the rows");
		int row=s.nextInt();
		System.out.println("Enter the cols");
		int col=s.nextInt();
	
		for(int r=1;r<=row;r++)//1<=5
		{
			for(int c=1;c<=col;c++)//1<=5
			{
				if(r>=2&&c>=2)//4<=4
				{
					if(r<=row-1&&c<=col-1)
						System.out.print("@ ");
					else
						System.out.print("# ");
				}
				else
					System.out.print("# ");
			}
			System.out.println("");
		}
	}
}
/*class Pattern
{
	public static void main(String args[])
	{
		
		Scanner s=new Scanner(System.in);	
		System.out.println("Enter the rows");
		int row=s.nextInt();
		System.out.println("Enter the cols");
		int col=s.nextInt();
		for(int r=1;r<=row;r++)//1<=5
		{
			for(int c=1;c<=col;c++)//1<=5
			{
				if(r==1||r==5||c==1||c==5)
					System.out.print("# ");
				else 
					System.out.print("@ ");
			}
			System.out.println("");
		}
	}
}*/