import java.util.Scanner;
class Pattern1
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
			for(int c=1;c<=col;c++)
			{	
				if(c==row+1-r&&r==r)//1==5 2==5 3==5 4==5 5==5&&1==1  1==4 2==4 3==4 4==4
					System.out.print("# ");
				else if(r==c)//1==1 1==2 1==3 1==4 1==5 2==1 2==2 2==3 2==4 2==5
					System.out.print("# ");
				else
					System.out.print("@ ");
			}
			System.out.println("");
		}
	}
}