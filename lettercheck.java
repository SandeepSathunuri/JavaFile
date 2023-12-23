class Character
{
	public static void main(String args[])
	{
		char letter='e';
		if(letter>='A'&&letter<='Z')
			System.out.println("Capital letter");
		else if(letter>='a'&&letter<='z')
			System.out.println("Small letter");
		else if(letter>='0'&&letter<='9')
			System.out.println("Number");
		else if(letter=='@'||letter=='$'||letter=='%'||letter=='&')
			System.out.println("Symbol");
		else
			System.out.println(letter);
	}
}