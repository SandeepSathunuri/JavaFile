import java.util.Scanner;
/*class CheckerPattern
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enetr the size: ");
		int size=scan.nextInt();//10				//size=5  o/p
		for(int col=1;col<=size;col++) 				//*****
		{							//*****
			for(int row=1;row<=size;row++)			//*****
			{						//*****
				System.out.print("*");			//*****
						    
			}
			System.out.println("");
		}
	}
}*/
/*class CheckerPattern
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enetr the size: ");			//size=5 o/p
		int size=scan.nextInt();//5				//*
		for(int col=1;col<=size;col++)//1<=5			//**
		{							//***
			for(int row=1;row<=col;row++)//1<=1			//****
			{						//*****
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}*/
/*class CheckerPattern
{
	public static void main(String args[])					//size=5 o/p
	{									//*****
		Scanner scan=new Scanner(System.in);				//****
		System.out.println("Enetr the size: ");				//***
		int size=scan.nextInt();//5					//**
		for(int col=1;col<=size;col++)//col=1<=5 col=2<=5		//*
		{	
			for(int row=size;row>=col;row--)//row=5>=1 row=5>=2
			{
				System.out.print(" * ");
			}
			System.out.println("");
		}
	}
}*/
class CheckerPattern
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);					
		System.out.println("Enetr the size: ");			
		int size=scan.nextInt();//5				
		for(int col=5;col>=1;col++)	//1<=5	2<=5 3<=5 4<=5 5<=5 		
		{							
			for(int row=size;row>=col;row--)//5>=1 4>=1 3>=1 2>=1 1>=1 //			
			{
				System.out.print("*");
				
			}
			System.out.println(" *");
		} 
	
	}
}