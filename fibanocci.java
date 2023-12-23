class Fibanocci
{
	public static void main(String atrgs[])
	{
		int n=10,j=1,i=0,s;
		System.out.println(i);
		System.out.println(j);
		//System.out.println(j);
		for(n=10;n>2;n--)
		{
			s=i+j;//0+1
			System.out.println(s);
			i=j;
			j=s;
			
		}
	}
}
