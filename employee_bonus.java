class EmployeeBonus
{
	public static void main(String args[])
	{
		String employeeName="Sandeep",id="248",branch="Hyderabad",role="developer";
		int dayWiseSalary=500,companyWorkingDays=30,actualSalary=dayWiseSalary*companyWorkingDays,empWorkingDays=20,creditedSalary=empWorkingDays*dayWiseSalary;
		int empAbsentDays=companyWorkingDays-empWorkingDays,deductedSalary=actualSalary-creditedSalary,empExperiance=5;
		System.out.println("Employee Aplication\nEmployee Name:"+employeeName+"\nEmployee ID:"+id+"\nComapny Branch:"+branch+"Employee Role:"+role+"\nEmployee Day Wise Salary"+dayWiseSalary);
		System.out.println("Company Working Days:"+companyWorkingDays+"\nEmployee Absent Days"+empAbsentDays+"\nActual Salary:"+actualSalary+"\nCredited Salary:"+creditedSalary+"\nDeducted Salary:"+deductedSalary+"\nEMployee Experiance:"+empExperiance);
		if(empExperiance<=2)
			System.out.println("Employee Bonus is:5000");
		else if(empExperiance>=3&&empExperiance<=10)
			System.out.println("Employee Bonus is:15000");
		else if(empExperiance<=11&&empExperiance>=20)
			System.out.println("Employee Bonus is:2500");
		else
			System.out.println("No Bonus");
									
	}
}