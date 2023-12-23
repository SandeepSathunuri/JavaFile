class Area
{
	public static void main(String args[])
	{
		int rect=10, bread=20,radi=10;
		int arearectangle=rect*bread;
		double areacircle=Math.PI*radi*radi;
		int perirectangle=2*(rect+bread);
		double pericircle=2*Math.PI*radi;
		System.out.println("area of a rectangle:"+arearectangle);
		System.out.println("area of a circle:"+areacircle);
		System.out.println("perimeter of rectangle:"+perirectangle);
		System.out.println("perimeter of cirlce:"+pericircle);
	}
}