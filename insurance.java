class Insurance
{
	public static void main(String args[])
	{
		String Health="Excellent",area="city",gender="male";
		int amount=100000,age=30,premium=0,premium_amount=0;
		if(Health=="Excellent")
		{
			if(age>25)//29>25
			{
				if(age<35)//30<35
				{
					if(area=="city")
					{
						if(gender=="male")
						{
							if(amount<=200000)
							{
								premium=4;
								premium_amount=(amount*premium)/(100000*4)/1000;
								System.out.println(premium_amount);//4000
							}
							else
							{
								System.out.println("not eligible");
							}
						}
						else
							{
								if(amount<=100000)
								{
									premium=3;
									premium_amount=(amount*premium)/1000;
									System.out.println(premium_amount);//3000
								}
								else
									System.out.println("not eligble");
								
							}
					}
					else
					    System.out.println("not eligible");
				}
				else
					System.out.println("not eligible");
			}
			else
				System.out.println("not eligible");
		}
		else if(Health=="poor")
		{
			if(age>25)
			{
				if(age<35)
				{
					if(area=="village")
					{
						if(gender=="male")
						{
							if(amount<10000)
							{
								premium=6;
								premium_amount=(amount*premium)/1000;
								System.out.println(premium_amount);
							}
							else
								System.out.println("not eligible");
						}
						else
								System.out.println("not eligible");
					}
						else
								System.out.println("not eligible");
				}
					else
								System.out.println("not eligible");
			}
			else
				System.out.println("not eligible");
				
		}
		else
			System.out.println("Not Eligible");
	}
}