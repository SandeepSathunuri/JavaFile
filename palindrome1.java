package Abc;
class Palindrome
{
	public void pal()
	{
		int n=200;
		for(;n>=100;n--)
		{
			int temp=n,pal=0;
			for(;n>0;n/=10)
			{
				int rem=n%10;
				pal=pal*10+rem;
			}
			n=temp;
			if(pal==temp)
				System.out.println("Palindrome "+temp);
		}
	}
}