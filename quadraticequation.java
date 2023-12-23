class QuadraticEquation
{
	public static void main(String args[])
	{
		int a=1,b=5,c=1;
		double root1=(-b+Math.sqrt(b*b-4*a*c))/2*a;
		double root2=(-b-Math.sqrt(b*b-4*a*c))/2*a;
		System.out.println("root1 of the quadratic equation is:"+root1);
		System.out.println("root2 of the quadratic equation is:"+root2);
	}
}