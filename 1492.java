class Pr1492
{
	public static void main(String args[])
	{
		int n=1492,s=0,s1=0,r1=0;
		for(;n>0;n/=10)
		{
			int r=n%10;//2 9 4 1
			r++;//2+1=3 10
			r=r%10;
			s=s*10+r;//3  3*10=30+//s=3052
			//r1=s%10;//2 5 0 3 
			//s1=s1*10+r1;//0*10+2=2 2*10+5=25 25*10+0=250 250*10+3=2503
		}
		System.out.println(s);
		//System.out.println(s1);
		for(;s>0;s/=10)
		{
			r1=s%10;
			s1=s1*10+r1;
		}
		System.out.println(s1);
	}
}