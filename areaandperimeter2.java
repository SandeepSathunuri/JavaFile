class AreaandPerimeter
{
	public static void main(String args[])
	{
		int l=5,b=4;
		int area=l*b;
		int perimeter=2*(l+b);
		if(area>perimeter)
			System.out.println("Area is greater than perimeter");
		else
			System.out.println("Perimeter is greater than area");
	}
}