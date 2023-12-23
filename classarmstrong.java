class ClassArmstrong
{
	int num=10,count;
	public static void main(String args[])
	{
		ClassArmstrong s=new ClassArmstrong();
		s.armstrong();
	}
	void count()
	{	
		 count=0;
		int temp=num;
		for(;temp>0;temp/=10)
			count++;
	}
	void armstrong()
	{	
		count();
		int temp=num,sum=0;
		temp=num;
		for(;temp>0;temp/=10)
		{	
			int rem=temp%10;
			int p=(int)Math.pow(rem,count);
			sum=sum+p;
		}
		if(sum==num)
			System.out.println("Armstrong");
		else
			System.out.println("Not a Armstrong");
	}
	void primenumber()
	{	
		for(start=1;start<=num;start++)
	}
}