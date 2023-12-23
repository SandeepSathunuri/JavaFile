class BankApplication
{
	public static void main(String args[])
	{
		
		String name="Sandeep",number="123456789",pin="500018",name1="withdraw",name3="deposit";
		int balance=100000,balance_amount=0;
		switch(name3)
		{
			case "Sandeep":
			
				System.out.println("Name Change\nName:"+name);
				name="S.Sandeep";
				System.out.println("updated Name:"+name);
				break;
			
			case "123456789":
				
				System.out.println("Number Updation\nNumber"+number);
				number="987654321";
				System.out.println("Updated Number:"+number);
				break;
			
			case "500018":
				
				System.out.println("Pin Updation\nPin"+pin);
				pin="500016";
				System.out.println("Updated Pin"+pin);
				break;
			
			case "withdraw":
			
				int withdraw=10000;
				System.out.println("Withdraw\ Balance amount:"+balance+"\nWithdraw amount:"+withdraw);
				balance_amount=balance-withdraw;
				System.out.println("Balance Amount:"+balance_amount);
				break;
			
			case "deposit":
			
				int deposit=10000;
				System.out.println("Deposit\nBalance amount:"+balance+"\nDeposit amount:"+deposit);
				balance_amount=balance+deposit;
				System.out.println("Balnace amount:"+balance_amount);
				break;
			
			case "balance":
			
				System.out.println("Balance Deposit:"+balance);
				break;
			
			default:
				System.out.println("invalid input");

		}			
	}
}