class Proapplication
{
	public static void main(String[] args)
	{
		/*(String name="Sandeep";
		char initial='S';
		byte rollno=48;
		short day=16;
		int month=9;
		long year=2000;
		float weight=55;
		double height=6.2;
		System.out.println("Student name:"+initial+"."+name+"\nrollno:"+rollno+"\nDate of birth:"+day+"/"+month+"/"+year+"\nWeight:"+weight+"Height:"+height);*/
		String product="laptop";
		char logo='L';
		byte quantity=2;
		short discount=30;
		int price=50000;
		long total_amount=quantity*price;
		double discounted_price=(price*30)/100;
		float total=(float)(total_amount-discounted_price);
		System.out.println("Product:"+product+"\nLogo:"+logo+"\nDiscount:"+discount+"\namount:"+total_amount+"\nDiscounted Price:"+discounted_price+"\nFinal amount:"+total);
			
	}
}
