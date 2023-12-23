class Steel
{
	public static void main(String args[])
	{
		
		/*if(hardness>50&&carbon<0.7&&tensile>5600)
			System.out.println("Grade 10");
		else if(hardness>50&&carbon<0.7)
			System.out.println("Grade 9");
		else if(carbon<0.7&&tensile>5600)
			System.out.println("Grade 8");
		else if(hardness>50&&tensile>5600)
			System.out.println("Grade 7");
		else if(hardness>50||carbon<0.7||tensile>5600)
			System.out.println("Grade 6");
		else
			System.out.println("Grade 5");*/
		int hardness=40,tensile=700;
		double carbon=0.6;
		if(hardness>50)
		{
			if(carbon<0.7)
			{
				if(tensile>5600)
				{
					System.out.println("Grade 10");
				}
				else
				{
					System.out.println("Grade 9");
				}
			}
			else
			{
				System.out.println("Grade 6");
				
			}
		}
		else if(tensile>5600)
			
			{
				if(hardness>50)
				{
					System.out.println("Grade 7");
				}
				else
				{
					System.out.println("Grade 6");
				}
			}
			
		
		else
		{
			if(carbon<0.7)
			{
				if(tensile>5600)
				{
					System.out.println("Grade 8");
				}
				else
				{
					System.out.println("Grade 6");
				}
			}
			else
			{
				System.out.println("Grade 5");
			}
			
		}
	}
}