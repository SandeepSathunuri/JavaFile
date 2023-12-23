import java.util.Scanner;

class Duplicates
{
	public static void main(String args[])
	{	
		Duplicates obj=new Duplicates();
		obj.main1();
	}
	void main1()
	{	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the size");
		int size=s.nextInt();
		int a[]=new int[size];
		int count=1;
		System.out.println("enter the elements");
		for(int x=0;x<=a.length-1;x++)
		{
			a[x]=s.nextInt();
		}
		boolean b[]=new boolean[a.length];
		for(int x=0;x<=a.length-1;x++)
		{	
			count=1;
			if(b[x]==true)
				continue;
			for(int y=x+1; y<=a.length-1;y++)
			{	
				if(a[x]==a[y])
				{
					b[y]=true;
					count++;
				}
			}
			//System.out.print("Frequency of all array elements\n");
			//System.out.println(a[x]+" "+count);
			//System.out.println("Duplicates elements");
			if(count>1)
				System.out.println(a[x]);
			/*//System.out.println("Uniques elements");
			if(count==1)
				System.out.println(a[x]);*/
		}
	}
}