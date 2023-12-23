class BusyNumber
{
	public static void main(String args[])
	{
		int n=14,rem=0;
		rem=n%10;
		if(rem==7)
		{	
			System.out.println("Tne number is busy");
		}		
		else if(n%7==0)
			System.out.println("the number is busy");
		else 
			System.out.println("number is not busy");
	}
}