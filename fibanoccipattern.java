class FibanocciPattern
{
	public static void main(String args[])
	{
		int rows=5,r1=1,a=0,b=1;
		for(int r=1;r<=rows;r++)
		{
			for(int c=2;c<=r;c++)
			{	 
				System.out.print(r1+" ");//1 1 2 3
				r1=a+b;//0+1=1 1+1=2 1+2=3 2+3=5
				a=b;//1 1 2   3
				b=r1;//1 2 3  5	
			}
			System.out.println();
		}
	}
}