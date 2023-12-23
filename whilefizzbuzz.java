class WhileFizzBuzz
{
	public static void main(String args[])
	{
		int num=100;
		while(num>=1)
		{
			if(num%3==0&&num%5==0)
				System.out.println("Fizz Buzz:"+num);
			else if(num%3==0)
				System.out.println("Fizz:"+num);
			else if(num%5==0)
				System.out.println("Buzz:"+num);
			num--;
		}
	}	 
}