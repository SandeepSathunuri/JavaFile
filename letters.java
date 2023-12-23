class Letters
{
	public static void main(String[] args)
	{
		char alpha='5';
		int let=(int)alpha;
		char num='#';
		int let1=(int)num;
		if(let>64)
		{
			if(let<91)
			{
				if(alpha=='A'||alpha=='E'||alpha=='I'||alpha=='O'||alpha=='U')
				{
					System.out.println("Capital Vowel:"+let);
				}
				else
				{
					System.out.println("Capital consonent:"+let);
				}
				
			}
			else
		 	  {
				if(let>96)
				{
					if(let<123)
					{
						if(alpha=='A'||alpha=='E'||alpha=='I'||alpha=='O'||alpha=='U')
					
						System.out.println("small Vowel:"+let);
					}
					else
					{
						System.out.println("small consonent:"+let);
					}
					
				}
			  }
		}
		if(let1<58)
		{
			
				if(let1>47)
				{
					System.out.println("numbers:"+let1);
				}
				
		
		}
		else if(let>32)
				{
						if(let<48)
						{
							System.out.println("symblos:"+let1);
						}
				}
					
		else
			{
				System.out.println("out of range");
			}
			
			
		
	}
}