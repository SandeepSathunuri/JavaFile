import java.util.Scanner;
class Armstrong
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value n:");
		int n=scan.nextInt();
		int p=0,r=0,s=0,c=0,temp;
		for(;n>=1;n--)
		{
			temp=n;//1 2
			c=0;
			s=0;
			for(;n>=1;n/=10)
			{
				c++;//1 1
			}
			n=temp;//1 2
			while(n>=1)
			{
				
				r=n%10;//1 2
				p=(int)Math.pow(r,c);//1 2
				s+=p;//s=0+1=1 
				n/=10;//n=0
			}
			n=temp;//n=1
				//System.out.println("Armstrong number:"+temp+" is "+s);
				if(s==n)//s==n(1==1)
					System.out.println(n);
		}	
	}
}