class SPandCP
{
	public static void main(String args[])
	{
		int sp=100,cp=120;
		int profit=sp-cp;
		int loss=cp-sp;
		
		if(sp>cp)
		{
			System.out.println("Profit");
			System.out.println("Profit incurred:"+profit);
		}
		else
		{
			System.out.println("loss");
			System.out.println("loss incurred:"+loss);
		}
		
		
	}
}