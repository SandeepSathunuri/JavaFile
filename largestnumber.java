class LargestNumber
{
	public static void main(String args[])
	{
		int num1=10,num2=35,num3=40,temp=0;
		System.out.println("num1:"+num1+"\nnum2:"+num2+"\nnum3:"+num3);
		if(num1>num2&&num1>num3)
		{
			if(num2>num3)
			{
				System.out.println("\nnum1:"+num1+"\nnum2:"+num2+"\nnum3:"+num3);
			}
			else
			{
				//System.out.println("num1:"+num1+"\nnum2:"+num2+"\nnum3:"+num3);
				temp=num3;
				num3=num2;
				num2=temp;
				//System.out.println("\nnum1:"+num1+"\nnum2:"+num2+"\nnum3:"+num3);
			}
		}
		else if(num2>num3&&num2>num1)
		{
			if(num1>num3)
			{
				//System.out.println("num1:"+num1+"\nnum2:"+num2+"\nnum3:"+num3);
				temp=num2;
				num2=num1;
				num1=temp;
				//System.out.println("\nnum1:"+num1+"\nnum2:"+num2+"\nnum3:"+num3);
			}
			else
			{
				//System.out.println("num1:"+num1+"\nnum2:"+num2+"\nnum3:"+num3);
				temp=num2;
				num2=num3;
				num3=num1;
				num1=temp;
				//System.out.println("\nnum1:"+num1+"\nnum2:"+num2+"\nnum3:"+num3);
			}
		}
		else
		{
			if(num1>num2)
			{
				//System.out.println("num1:"+num1+"\nnum2:"+num2+"\nnum3:"+num3);
				temp=num3;
				num3=num2;
				num2=num1;
				num1=temp;
				//System.out.println("\nnum1:"+num1+"\nnum2:"+num2+"\nnum3:"+num3);
			}
			else
			{
				//System.out.println("num1:"+num1+"\nnum2:"+num2+"\nnum3:"+num3);
				temp=num3;
				num3=num1;
				num1=temp;
				//System.out.println("\nnum1:"+num1+"\nnum2:"+num2+"\nnum3:"+num3);
			}
		}
		System.out.println("\nnum1:"+num1+"\nnum2:"+num2+"\nnum3:"+num3);	
	}
}