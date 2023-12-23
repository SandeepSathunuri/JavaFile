class SwappingOfNumbers
{
	public static void main(String args[])
	{
		int num1=500,num2=1085,num3=50,temp=0;
		/*if(num1<num2)
		{
			temp=num1;
			num1=num2;
			num2=temp;
		}
		if(num1<num3)
		{
			temp=num1;
			num1=num3;
			num3=temp;
		}
		if(num2<num3)
		{
			temp=num2;
			num2=num3;
			num3=temp;
		}
		System.out.println("num1 "+num1+" "+"num2 "+num2+" "+"num3 "+num3+" ");*/
		
		if(num1<num2)
		{
			num1+=num2;//500+1085=1585
			num2=num1-num2;//1585-500=1085
			num1-=num2;//1585-1085=500
			System.out.println("num1 "+num1+" "+"num2 "+num2+" "+"num3 "+num3+" ");
		}
		if(num2<num3)
		{
			num2+=num3;
			num3=num2-num3;
			num2-=num3;
			System.out.println("num1 "+num1+" "+"num2 "+num2+" "+"num3 "+num3+" ");
		}
		
	}
}