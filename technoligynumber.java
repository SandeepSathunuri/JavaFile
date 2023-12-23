class TechnologyNumber
{
	public static void main(String args[])
	{	
		int num=2025,count=0,sum=0,num1=0,num2=0,square=0,temp=num,n=0,n1=0;
		for(;num>0;num/=10)
		{	
			count++;
		}
		num=temp;
		n=count/2;//2
		if(count%2==0)
		{
			n1=(int)Math.pow(10,n);
			num1=num%n1;//25
			num2=num/n1;//20
			sum=num1+num2;
			square=sum*sum;
			if(square==temp)
				System.out.println("Technology Number");
			else
				System.out.println("Not Technology Number");
		}
		else 
			System.out.println("not valid");	
	}
}


		