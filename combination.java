import java.util.Scanner;
/*class Combination//Forward Itaration
 {
	    public static void main(String args[]) 
	{
		int n=5, r=3, a=n-r, fact=1,fact1=1, fact2=1,start=1,c=0,temp=start;
		while(start<=n)//1<=7
		{
			fact=fact*start;//1*1 1*2 2*3 6*4 24*5 120*6 720*7=5040
			start++;//1 2 3 4 5 6 
		}
		System.out.println(fact);
		start=temp;
		while(start<=r)//1<=5
		{
			fact1=fact1*start;//1*1 1*2 2*3 6*4 24*5=120
			start++;
		}
		System.out.println(fact1);
		start=temp;
		while(start<=a)//1<=2 2<=2 
		{
			fact2=fact2*start;//1*1 1*2=2
			start++;
		}
		System.out.println(fact2);
		c=fact/(fact1*fact2);//7*6/2
		System.out.println("ncr : "+c);
      }
}*/
/*class Combination//Backward Iteration
{
	public static void main(String args[])
	{
		int n=5,r=3,a=n-r,fact=1,fact1=1,fact2=1,c=0;
		while(n>=2)
		{
			fact=fact*n;
			n--;
		}
		while(r>=2)
		{
			fact1=fact1*r;
			r--;
		}
		while(a>=2)
		{
			fact2=fact2*a;
			a--;
		}
		c=fact/(fact1*fact2);
		System.out.println(c);
	}
}*/
class Combination
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the value n:");
		int n=scan.nextInt();
		System.out.println("Enter the value r:");
		int r=scan.nextInt();
		int a=n-r,f1=1,f2=1,f3=1,c=0;
		for(;n>=2;n--)
		{
			f1=f1*n;//1*5=5 5*4=20 20*3=60 60*2=120
		}
		for(;r>=2;r--)
		{
			f2=f2*r;//1*3=3  3*2=6
		}
		for(;a>=2;a--)
		{
			f3=f3*a;//1*2=2
		}
		c=f1/(f2*f3);//120/6*2
		System.out.println("the value of combination:"+c);
	}
}
