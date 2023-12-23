class Library
{
	public static void main(String args[])
	{
		int days=10;
		if(days<=5)
			System.out.println("fine is:50paisa");
		else if(days>6&&days<=10)
			System.out.println("fine is:1rupee");
		else if(days>10)
			System.out.println("fine is:10rupees");
		else if(days>30)
			System.out.println("Membership is cancelled");
		else
			System.out.println("No fine");
	}
}