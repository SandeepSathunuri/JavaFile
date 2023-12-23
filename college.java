class College
{
	public static void main(String args[])
	{
		String college="college4",degree="B.tech",branch="EEE";
		int year=0,fee=0,scholorship=0,rank=4000;
		if(degree=="B.tech")
			{
				if(rank>=1&&rank<=1000)
					{
						if(branch=="CSE")
							{
								year=4;
								fee=0;
								scholorship=0;
								college="college 1";
								System.out.println("Years of studing:"+year+"\nFees"+fee+"\nScholorship"+scholorship+"\ncollege"+college);
							}
						else if(branch=="IT")
							{
								
								year=4;
								fee=0;
								college="college 1";
								scholorship=0;
								System.out.println("Years of studing:"+year+"\nFees"+fee+"\nScholorship"+scholorship+"\ncollege"+college);	
							}
						else if(branch=="EEE")
							{
								year=4;
								fee=0;
								scholorship=0;
								college="college 1";
								System.out.println("Years of studing:"+year+"\nFees"+fee+"\nScholorship"+scholorship+"\ncollege"+college);
	
							}
						else if(branch=="ECE")
							{
								year=4;
								fee=0;
								scholorship=0;
								college="college 2";
								System.out.println("Years of studing:"+year+"\nFees"+fee+"\nScholorship"+scholorship+"\ncollege"+college);
							}
						
					}
				else if(rank>=1001&&rank<=5000)
					{
						if(branch=="CSE")
							{
								year=4;
								fee=50000;
								scholorship=25000;
								college="college 2";
								System.out.println("Years of studing:"+year+"\nFees:"+fee+"\nScholorship:"+scholorship+"\ncollege:"+college);
							}
						else if(branch=="IT")
							{
								
								year=4;
								fee=50000;
								college="college 2";
								scholorship=25000;
								System.out.println("Years of studing:"+year+"\nFees:"+fee+"\nScholorship:"+scholorship+"\ncollege:"+college);	
							}
						else if(branch=="EEE")
							{
								year=4;
								fee=50000;
								scholorship=25000;
								college="college 2";
								System.out.println("Years of studing:"+year+"\nFees:"+fee+"\nScholorship:"+scholorship+"\ncollege:"+college);
							}
						else if(branch=="ECE")
							{
								year=4;
								fee=50000;
								scholorship=25000;
								college="college 2";
								System.out.println("Years of studing:"+year+"\nFees:"+fee+"\nScholorship:"+scholorship+"\ncollege:"+college);
							}
						}
					
				else if(rank>=5001&&rank<=10000)
					{
						if(branch=="CSE")
							{
								year=4;
								fee=100000;
								scholorship=50000;
								college="college 3";
								System.out.println("Years of studing:"+year+"\nFees:"+fee+"\nScholorship:"+scholorship+"\ncollege:"+college);
							}
						else if(branch=="IT")
							{
								
								year=4;
								fee=100000;
								college="college 3";
								scholorship=50000;
								System.out.println("Years of studing:"+year+"\nFees:"+fee+"\nScholorship:"+scholorship+"\ncollege:"+college);	
							}
						else if(branch=="EEE")
							{
								year=4;
								fee=100000;
								scholorship=50000;
								college="college 3";
								System.out.println("Years of studing:"+year+"\nFees:"+fee+"\nScholorship:"+scholorship+"\ncollege:"+college);
							}
						else if(branch=="ECE")
							{
								year=4;
								fee=100000;
								scholorship=50000;
								college="college 3";
								System.out.println("Years of studing:"+year+"\nFees:"+fee+"\nScholorship:"+scholorship+"\ncollege:"+college);
							}
						}
				
			}
			else
			{
				if(degree=="Degree")
				{
					if(rank>=1&&rank<=1000)
					{
						if(branch=="B.com")
						{
							year=3;
							fee=0;
							college="college A";
							scholorship=0;
							System.out.println("Years of studing:"+year+"\nFees:"+fee+"\nScholorship:"+scholorship+"\ncollege:"+college);
						}
						else if(branch=="B.sc")
						{
							year=3;
							fee=0;
							college="college A";
							scholorship=0;
							System.out.println("Years of studing:"+year+"\nFees:"+fee+"\nScholorship:"+scholorship+"\ncollege:"+college);
						}
						else if(branch=="B.A")
						{
							year=3;
							fee=0;
							college="college A";
							scholorship=0;
							System.out.println("Years of studing:"+year+"\nFees:"+fee+"\nScholorship:"+scholorship+"\ncollege:"+college);
						}
						
					}
					else if(rank>=1001&&rank<=5000)
					{
						if(branch=="B.com")
						{
							year=3;
							fee=20000;
							college="college B";
							scholorship=10000;
							System.out.println("Years of studing:"+year+"\nFees:"+fee+"\nScholorship:"+scholorship+"\ncollege:"+college);
						}
						else if(branch=="B.sc")
						{
							year=3;
							fee=20000;
							college="college B";
							scholorship=10000;
							System.out.println("Years of studing:"+year+"\nFees:"+fee+"\nScholorship:"+scholorship+"\ncollege:"+college);
						}
						else if(branch=="B.A")
						{
							year=3;
							fee=20000;
							college="college B";
							scholorship=10000;
							System.out.println("Years of studing:"+year+"\nFees:"+fee+"\nScholorship:"+scholorship+"\ncollege:"+college);
						}
						
					}
					else if(rank>=5001&&rank<=10000)
					{
						if(branch=="B.com")
						{
							year=3;
							fee=50000;
							college="college C";
							scholorship=25000;
							System.out.println("Years of studing:"+year+"\nFees:"+fee+"\nScholorship:"+scholorship+"\ncollege:"+college);
						}
						else if(branch=="B.sc")
						{
							year=3;
							fee=50000;
							college="college C";
							scholorship=25000;
							System.out.println("Years of studing:"+year+"\nFees:"+fee+"\nScholorship:"+scholorship+"\ncollege:"+college);
						}
						else if(branch=="B.A")
						{
							year=3;
							fee=50000;
							college="college C";
							scholorship=25000;
							System.out.println("Years of studing:"+year+"\nFees:"+fee+"\nScholorship:"+scholorship+"\ncollege:"+college);
						}
						
					}
				}
			
				else
				{
					System.out.println("not eligible");
				}
			}
		
	}
}