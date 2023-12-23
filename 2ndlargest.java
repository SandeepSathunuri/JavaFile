import java.util.Scanner;
/*class SecondLargest
{
	public static void main(String args[])
	{
		int n=81547,max=0;
		for(;n>0;n/=10)
		{
			int rem=n%10;
			if(max<rem)
				max=rem;
		}
		System.out.println(max);	
	}
}*/
class SecondLargest
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the n value:");
		int n=scan.nextInt();//986897589
		int max=0,max1=0,max2=0;
		for(;n>0;n/=10)
		{
			int rem=n%10;
			if(max<rem)//0<9 9<8
			{
				max1=max;//0
				max=rem; //9
				
			}
			else if(max1<rem&&max!=rem)//0<8
			{
				//max2=max1;
				max1=rem;
			}
			else if(max2<rem&&max1!=rem)
			{
				max2=rem;
			}	
		}
		System.out.println("third largest:"+max2);
		System.out.println("second largest:"+max1);
	}
}