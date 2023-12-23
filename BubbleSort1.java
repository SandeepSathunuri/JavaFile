import java.util.Scanner;

class BubbleSort
{
	public static void main(String args[])
	{
		BubbleSort obj=new BubbleSort();
		obj.main1();
	}
	void main1()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=s.nextInt();
		int a[]=new int[size];
		for(int x=0;x<=a.length-1;x++)
		{
			a[x]=s.nextInt();
		}
		for(int x=0;x<=a.length-2;x++)
		{
			for(int y=0;y<=a.length-2-x;y++)
			{
				if(a[y]>a[y+1])
				{
					int t=a[y];
					a[y]=a[y+1];	
					a[y+1]=t;
				}
			}
		
		}
		System.out.println("After the sort");
		for(int var:a)
		{
			System.out.println(var);
		}
	}
}