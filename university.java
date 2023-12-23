class University
{
	public static void main(String args[])
	{
		int a=60,b=60;
		if(a>=55&&b>=45)
			System.out.println("All cleared");
		else if(a<55&&a>=45&&b>=55)
			System.out.println("All cleared ");
		else if(a>=65&&b<45)
			System.out.println("Supply exam of b");
		else if(a<45&&b<45)
			System.out.println("Supply exam of both a&b");
		else
			System.out.println("Supply of A");
	}
}