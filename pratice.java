package class_methods;

public class ClassNumbers 
{
	int num=5,count;
	public static void main(String args[])
	{
		ClassNumbers s=new ClassNumbers();
		s.armstrong();
		s.primenumber(5);
		System.out.println("------------------------------------------------------");
		System.out.println("Even");
		s.even(5);
		System.out.println("------------------------------------------------------");
		System.out.println("Prime");
		s.prime(5);
		System.out.println("------------------------------------------------------");
		System.out.println("Palindrome");
		s.pallindrome(5);
		System.out.println("------------------------------------------------------");
		System.out.println("Armstrong");
		s.armstrongnumber(5);
		System.out.println("------------------------------------------------------");
		System.out.println("Consonent");
		s.consonent(5);
		System.out.println("------------------------------------------------------");
		System.out.println("factorial values");
		s.factorial(4);
		System.out.println("------------------------------------------------------");
		System.out.println("fibanocci");
		s.fibanocci(5);
		System.out.println("------------------------------------------------------");
		System.out.println("factors count");
		s.factorscount(5);
		System.out.println("------------------------------------------------------");
		Local_Instance obj=new Local_Instance();
		obj.local();
		System.out.println("------------------------------------------------------");
		s.square(25,1);
		System.out.println("------------------------------------------------------");
		s.strong(200);
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
	void primenumber(int num1)
	{	
		int count=0;
		for(int start=2;start<=num1/2;start++)
		{
			if(num1%start==0)
			{
				count++;
				break;
			}
		}
		if(count==0&&num!=0)
			System.out.println("p");
		else
			System.out.println("not p");
	}
	void even(int rows)
	{
		int var=1;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=r;)
			{
				if(var%2==0)
				{
					System.out.print(var+" ");
					c++;
				}
				
				var++;
			}
			System.out.println();
		}
	}
	void prime(int rows)
	{
		int var=1;
		for(int r=1;r<=rows;r++)
		{
		
			for(int c=1;c<=r;)
			{
				int count=0;
				for(int start=2;start<=var/2;start++)
				{
					if(var%start==0)
					{
						count++;
						break;
					}
				}
				if(count==0&&var!=1)
				{
					System.out.print(var+" ");
					c++;
				}
				var++;
			}
			System.out.println();
		}
	}
	void pallindrome(int rows)
	{
		int var=1;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=r;)
			{
				int pro=0;
				int temp=var;
				for(;var>0;var/=10)
				{
					int rem=var%10;
					pro=pro*10+rem;
				}
				if(temp==pro)
				{
					System.out.print(temp+" ");
					c++;
				}
				var=temp;
				var++;
			}
			System.out.println();
		}
	}
	void armstrongnumber(int rows)
	{
		int var=1;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=r;)
			{
				int temp=var;
				int count=0,sum=0;
				for(;var>0;var/=10)
				{
					count++;
				}
				var=temp;
				for(;var>0;var/=10)
				{
					int rem=var%10;
					sum=sum+(int)Math.pow(rem,count);
				}
				var=temp;
				if(sum==var)
				{
					System.out.print(var+"  ");
					c++;
				}
				var++;
			}
			System.out.println();
		}
	}
	void consonent(int rows)
	{
		char alpha='A';
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=r;)
			{
				if(alpha=='A'||alpha=='E'||alpha=='I'||alpha=='O'||alpha=='U')
				{
					System.out.print("");
				}	
				else
				{
					c++;
					System.out.print(alpha+" ");
				}
				alpha++;
			}
				System.out.println();		
		}
	}
 
	void factorial(int rows)
	{
		int val=1;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=r;c++)
			{
				int pro=1;
				for(int start=2;start<=val;start++)
				{
					pro=pro*start;
				}
				System.out.print(pro+"   ");
				val++;
			}
			System.out.println();
		}
	}
	void fibanocci(int rows)
	{
		int a=0,b=1,x=1;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=r;c++)
			{
				System.out.print(x+" ");
				x=a+b;
				a=b;
				b=x;
			}
			System.out.println();
		}
	}
	void factorscount(int rows)
	{
		int val=1;
		for(int r=1;r<=rows;r++)
		{
			for(int c=1;c<=r;c++)
			{
				count=0;
				for(int start=1;start<=val;start++)
				{
					if(val%start==0)
						count++;
				}
				System.out.print(count+" ");
				val++;
			}	
			System.out.println();
		}
	}
	void square(int a,double b)
	{
		b=Math.sqrt(a);
		if((int)b==b)
		{
			System.out.println("p s");
		}
	}
	void strong(int n)
	{
		for(;n>0;n--)
		{
			int temp=n,sum=0;
			for(;n>0;n/=10)
			{
				int rem=n%10;
				int fact=1;
				for(int start=2;start<=rem;start++)
				{
					fact=fact*start;
				}
				
				sum=sum+fact;
				
			}
			n=temp;
			if(temp==sum)
				System.out.println(n+" Strong Number");
		}
	}
}
	























