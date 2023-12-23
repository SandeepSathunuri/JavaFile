import java.util.Scanner;
class UrbanClap
{

	public static void main(String[] args)
	{
		System.out.println("Urban Company\nHome Serives at your doorstep");
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your current Location");
		String Adress=s.nextLine();
		System.out.println("What are you looking for?\nLogin\tWomen's Salon, Spa & Laser Clinic\tMen's Salon & Massage\tAC & Appliance Repair\tCleaning & Pest Control\t Electrician, Plunber & Carpenter\tPainting & Water Proofing");
		int total=0,t1=0,t2=0,t3=0,t4=0,t5=0,t6=0,t7=0,t8=0,t9=0,t10=0,price;
		String decision="";
		while(true)
		{
			System.out.println("Choose an Option :)");
			String option=s.next();
			switch(option)
			{
				case "login":
					System.out.println("Login/Sign Up :)");
					System.out.println("Enter the Phone Number!");
					String phoneno=s.next();
					switch(phoneno)
					{
						case "7469997777":
							System.out.println("You Succesfully Logged in");
							break;
						default:
							System.out.println("Login Error");
							System.out.println("Do you want Sing Up");
							String signup=s.next();
							switch(signup)
							{
							case "yes":
								System.out.println("Create an Account");
								System.out.println("Enter the Name");
								String name=s.next();
								System.out.println("Enter the Phone Number");
								String phoneno1=s.next();
								System.out.println("OTP Sent to your mobile Number");
								System.out.println("Enter the OTP");
								String otp=s.next();
								System.out.println("You Successfully created an account");
								break;
							default:
								System.out.println("Do you want to continue");
								//decision=s.next();	
								break;
								/*if(decision.equals("no"))
								{
									System.out.println("Come back Again :)");
									break;
								}*/
							}
							break;
					}	
				break;
				default 
					System.out.println("Skip");
					break;	
				case "Women's":
					System.out.println("Women's Salon,Spa & Laser Clinic");
					String women=s.next();
					switch(women)
					{
					case "salon&Spa":
						System.out.println("Women's Salon, Spa");
						String salon=s.nextLine();
						switch(salon)
						{
						case "salon for women":
							System.out.println("Select a service:");
							String service=s.nextLine();
							switch(service)
							{
							case "Best Seller Package":
								System.out.println("Please select the Package");
								String packages=s.next();
								switch(packages)
								{
								case "face detox":
									price=1159;
									t1=t1+price;
									System.out.println("Time of service: 1hr 15 mins\nFacial:Elysian pinacolda fruit clean up\nBleach/Detan:Face & neck\nFacial Hair Remover:Eyebroe");
									break;
								
								case "Full Body indulgence":
									price=4009;
									t2=t2+price;
									System.out.println("Time of service: 4 hrs 20 mins\nWaxing-Full arms,Full legs,underarms\nFacial:Elysian Chocolate & Vanila manicure\nPedicure:Elysian Chocolate & Vanila\nFacial Hair remove:Eyebrow");
									break;
								}
								break;
							case "manicure":
								price=149;
								t3=t3+price;
								System.out.println("Time of service: 15 mins\nQuick & basic nailgroomingsession with a wide range of polishes");
								break;
							case "Pedicure":
								price=759;
								t4=t4+price;
								System.out.println("Time of service :1 hr 5 mins\n Rose saltsoak,scrub,cream massage,mask for soft & norished feet");
								break;
							}
							break;
						}
					}
					break;
				case "Men's":
					
			}
			if(decision.equals("no"))
			{
				System.out.println("Come back Again :)");
				break;
			}
		}
	}

}
