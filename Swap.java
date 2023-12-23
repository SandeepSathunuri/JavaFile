public class Swap
{
	public static void main(String args[])
	/*{
		int num1=10,num2=20;
		System.out.println("num1 before="+num1);
		System.out.println("num2 before="+num2);
		 num1=num1+num2;
		 num2=num1-num2;
		 num1=num1-num2;
		System.out.println("num1 after="+num1);
		System.out.println("num2 after="+num2);
	}*/
	{
		int num1=7,num2=19;
		System.out.println("num1 before="+num1);
		System.out.println("num2 before="+num2);
		num1=num1*num2;
		num2=num1/num2;
		num1=num1/num2;
		System.out.println("num1 after="+num1);
		System.out.println("num2 after="+num2);
	}
}