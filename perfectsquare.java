/*class PerfectSquare
{
	public static void main(String args[])
	{
		int num=1;
		while(num<=100)//1<=100
		{                                    // 1  2   3   4   5   6
			double num1=Math.sqrt(num); //1 1.3 1.8 2.0 2.3 
			int result=(int)num1;//1 1 1 2 2
			if(result==num1)//1=1 1=1.3 1=1.8 2=2.0 
			{
				System.out.println(num);
							
			}
			num++;
		}
	}
}*/
class PerfectSquare
{
	public static void main(String args[])
	{
		int num=100,num1=1,i=1;//num= 1      2      3     4         5       6      7      8       9       10
		while(num1*num1<=num)//1<=100 4<=100 9<=100 16<=100 25<=100 36<=100 49<=100 64<=100 81<=100 100<=100
		{
			//i=num1*num1;
			System.out.println(num1*num1);
			num1++;
				
		}
	}
}