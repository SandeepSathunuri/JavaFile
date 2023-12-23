class Application
{
	public static void main(String args[])
	{
		String Name="Laptop", Brand="Dell", Code="123AABB";
		int Price=50000;
		int quantity=2;
		int Product_Total=Price*quantity;
		System.out.println("Product Name:"+Name+"\nProduct Brand:"+Brand+"\nProduct Code:"+Code+"\nProduct Price:"+Price+"\nProduct Quantity:"+quantity+"\nProduct total:"+Product_Total);
		int Discount=0;
		if(Product_Total>80000)
		{
		    Discount=50;
		    /*double amount=((Product_Total*Discount)/100);
			double Final= Product_Total-amount;
			System.out.println("Discount="+Discount);
			System.out.println("Amount to be paid:"+Final);*/
		}
		else if(Product_Total>60000)
		{
			Discount=30;
			/*double amount=((Product_Total*Discount)/100);
			double Final= Product_Total-amount;
			System.out.println("Discount="+Discount);
			System.out.println("Amount to be paid:"+Final);*/
		}
		else if(Product_Total>40000)
		{
			Discount=10;
			/*double amount=((Product_Total*Discount)/100);
			double Final= Product_Total-amount;
			System.out.println("Discount="+Discount);
			System.out.println("Amount to be paid:"+Final);*/
		}
		else
		{
			Discount=3;
			/*double amount=((Product_Total*Discount)/100);
			double Final= Product_Total-amount;
			System.out.println("Discount="+Discount);
			System.out.println("Amount to be paid:"+Final);*/
		}
			double amount=((Product_Total*Discount)/100);
			double Final= Product_Total-amount;
			System.out.println("Discount="+Discount);
			System.out.println("Amount to be paid:"+Final);
	}
}