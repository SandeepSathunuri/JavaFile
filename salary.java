class Salary
{
	public static void main(String[] args)
	{
		int salary=100000;
		double dearness_allowance=(salary*40)/100;
		double rent_allowance=(salary*20)/100;//gross_salary=hra+allowance
		int gross_salary=(int)(salary+dearness_allowance+rent_allowance);
		System.out.println(gross_salary);
	}
}