class EvenOddLoop
{
	public static void main(String args[])
	{
		
		int num=1, sum=0,count=0,count1=0;
		
		long product=1;
		while(num<=100)//1<=100  2<=100 3<=100  4<=100 5<=100 6<=100
		{
			if(num%2==0)//1%2==0 2%2==0 3%2==0 4%2==0 5%2==0 6%2==0
			{
				//System.out.println(num+"Even");//num=2 4  6
				sum+=num;//sum=0+2 sum=2+4=6  sum=6+6=12
				count++;
				
			}
			else
			{
				//System.out.println(num+"Odd");//1 3  5
				product=product*num;//pro=1*1  pro=1*3=3 pro=3*5=15
				count1++;
			}
		
		num++;	
		
		}
		System.out.println("even Sum:"+sum);
		System.out.println("odd product:"+product);
		System.out.println("even numbers are:"+count);
		System.out.println("odd numbers are:"+count1);
	}
}