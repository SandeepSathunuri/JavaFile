import java.util.Scanner;
class ScanLeap
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the input");
		int year=scan.nextInt();
		if((year%4==0&&year%100!=0)||year%400==0)
			System.out.println("leap year "+year);
		else 
			System.out.println("not a leap year "+year);
	}
}