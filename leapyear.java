class Leapyear	
{
	public static void main(String[] args)
	{
		int num1=2000;
		while(num1<=2050)
		{
		if(num1%4==0&&num1%100!=0||num1%400==0)
		{
			
			System.out.println(num1);	
		}
		num1++;
		}
	}
}