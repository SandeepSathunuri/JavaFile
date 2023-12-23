import java.util.Scanner;
/*class Palindrome
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int r=0,s=0,temp=n;
		for(;n>0;n/=10)
		{
			r=n%10;	
			s=s*10+r;//0*10+1=1  1*10+2=12  12*10+3=123	
		}
			
		if(s==temp)
			System.out.println("palindrome");
		else
			System.out.println("Not palindrome");
	}
}*/
class Palindrome
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the n value:");
		int n=scan.nextInt();//100
		int s=0;
		for(;n>0;n--)//100>0 99>0 98>0
		{
			int temp=n;//100 99
			 s=0;
			for(;n>0;n/=10)//100>0 99>0
			{
				int rem=n%10;//1 9
				s=s*10+rem;//1 99
			}
			n=temp;
			if(s==temp)//99==99
				System.out.println(temp+" is a palindrome");
			/*else
				System.out.println(temp+" is not a palindrome");*/
			
		}
	}
}