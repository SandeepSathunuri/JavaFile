import java.util.Scanner;
/*class NumberWords
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter input n");
		int n=scan.nextInt();	
		int s=0,c=0,c1=0;
		for(;n>0;n/=10)
		{
			int rem=n%10;
			s=s*10+rem;//51
			c++;
		}
		//System.out.println(s);
		for(;s>0;s/=10)
		{
			int rem1=s%10;
			//System.out.println(rem1);
			c1++;
			switch(rem1)
			{
				case 1:
					System.out.print("one ");
					break;
				case 2:
					System.out.print("Two ");
					break;
				case 3:
					System.out.print("Three ");
					break;
				case 4:
					System.out.print("Four ");
					break;
				case 5:
					System.out.print("Five ");
					break;
				case 6:
					System.out.print("Six ");
					break;
				case 7:
					System.out.print("Seven ");
					break;
				case 8:
					System.out.print("Eight ");
					break;
				case 9:
					System.out.print("Nine ");
					break;		
				default:
					System.out.println("Invalid");

			}
		}
		int result=c-c1;
		for(;result>=1;result--)
		{	
			System.out.print("Zero ");
		}
		
	}
}*/
class NumberWords
{
	public static void main(String args[])
	{	
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter input n");
		int n=scan.nextInt();//1500
		int s=0,s1=0;
		n=n*10+1;
		int temp=n;//15001	
		for(;n>0;n/=10)
		{
			
			int rem=n%10;
			s=s*10+rem;//10051
		}
		//System.out.println(s);
		for(;s>0;s/=10)
		{
			int rem1=s%10;
			s1=s1*10+rem1;//15001
			//System.out.println(rem1);
			if(s1!=temp)//
			{
				switch(rem1)
				{
					case 0:
						System.out.println("Zero");
						break;
					case 1:
						System.out.println("one");
						break;
					case 2:
						System.out.println("Two");
						break;
					case 3:
						System.out.println("Three");
						break;
					case 4:
						System.out.println("Four");
						break;
					case 5:
						System.out.println("Five");
						break;
					case 6:
						System.out.println("Six");
						break;
					case 7:
						System.out.println("Seven");
						break;
					case 8:
						System.out.println("Eight");
						break;
					case 9:
						System.out.println("Nine");
						break;		
					default:
						System.out.println("Invalid");
				}
			}	
		}
	}
}