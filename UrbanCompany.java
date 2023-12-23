import java.util.Scanner;
class UrbanCompany
{
	public static void main(String args[])
	{
		System.out.println("Urban Company\nHome Serives at your doorstep");
		Scanner s=new Scanner(System.in);
		System.out.println("What are you looking for?\n1)Account\n2)Women's Salon, Spa & Laser Clinic\n3)Men's Salon & Massage\n4)AC & Appliance Repair\n5)Cleaning & Pest Control\n6)Electrician, Plunber & Carpenter\n7)Painting & Water Proofing\n");
		int total=0,t1=0,t2=0,t3=0,t4=0,t5=0,t6=0,t7=0,t8=0,t9=0,t10=0,t11=0,t12=0,t13=0,price,a=1672,count=0;
		String decision="";
		while(true)
		{
			System.out.println("\nChoose an Section");
			String option=s.next();
			if(option.equals("1"))
			{
				System.out.println("Login(or)Sign Up :");
					String account=s.next();
					for(;;)
					{
						if(account.equals("login"))
						{
							System.out.println("Enter your Name!");
							String name=s.next();
							System.out.println("Enter your phone number");
							String phno=s.next();
							if(name.equals("sandeep")&&phno.equals("7469997777"))
							{
								
								for(;;)
								{
									
									System.out.println("Enter the password");
									String pass=s.next();
									if(pass.equals("sreeram"))
									{
										System.out.println("You Succesfully logged in");
										break;
									}
									else
									{
										count++;
										System.out.println("Incorrect password");
										if(count>=5)
										{
											System.out.println("Forget Password");
											String forget=s.next();
											if(forget.equals("forgetpassword"))
											{
												System.out.println("Enter the email id");
												String mail=s.next();
												for(;;)
												{
													System.out.println("Create a new password");
													System.out.println("Password");
													String pass1=s.next();
													System.out.println("confirm password");
													String confirm=s.next();
													if(pass1.equals(confirm))
													{
														System.out.println("Successfully Logged in");
														break;
													}
													else
													{
														System.out.println("Password or Confirm password are not matched");
													}
													
												}
											}
											break;
										}
									}
								}
								break;
							}
							else if(name.equals(" ")&&name.equals("back"))
							{
								System.out.println(" ");
								break;
							}
							else
								System.out.println("Incorrect UserName or Phone Number");
						}
						if(account.equals("logout"))
						{
							System.out.println("You Succesfully Logeed out");
							break;
						}
						if(account.equals("signup"))
						{
							//System.out.println("Incorrect User ID");
							//System.out.println("Login Error");
							System.out.println("Do you want Create an account");
							String signup=s.next();
							if(signup.equals("yes"))
							{
								System.out.println("Create an Account");
								System.out.println("Enter the Name");
								String name=s.next();
								System.out.println("Enter the Phone Number");
								String phoneno1=s.next();
								System.out.println("OTP Sent to your mobile Number");
								for(;;)
								{
									System.out.println("Enter the OTP");
									String otp=s.next();
									if(otp.equals("1234"))
									{
										System.out.println("Create a Password:");
										break;
									}
									else
										System.out.println("Incorrect OTP");
								}
								for(;;)
								{
									System.out.println("\nPassword:");
									String pass=s.next();
									System.out.println("Confirm Password");
									String pass1=s.next();
									if(pass.equals(pass1))
									{
										System.out.println("Captcha");
										break;
									}
									else
										System.out.println("Password or Confirm password are not matched");
								}
								for(;;)
								{
									System.out.println("Captcha: "+a);
									System.out.println("Enter the captcha");
									int cap1=s.nextInt();
									if(cap1==a)
									{
										System.out.println("You succesfully Created an account");
										break;
									}
									else
									{
										a=a+1374;
										System.out.println("Incorrect Captcha");
									}
								}
									break;
							}
							else
							{
								System.out.println(" ");
								break;
							}
						}
					}	
			}
			else if(option.equals("2"))
			{
				System.out.println("Women's Salon,Spa & Laser Clinic");
				String women=s.next();
				if(women.equals("salon&spa"))
				{
					System.out.println("Women's Salon, Spa");
					String salon=s.next();
					if(salon.equals("salon"))
					{
						System.out.println("Select a service:");
						String service=s.next();
						if(service.equals("detox"))
						{
							System.out.println("Do you Want this service");
							String femaleservice=s.next();
							if(femaleservice.equals("yes"))
							{
								System.out.println("Face Detox");
								price=1159;
								t1=price;
								System.out.println("Time of service: 1hr 15 mins\nFacial:Elysian pinacolda fruit clean up\nBleach/Detan:Face & neck\nFacial Hair Remover:Eyebroe"+"\nPrice: "+t1);
							}
							else
							{
								t1=0;
							}	
						}
						else if(service.equals("fullbody"))
						{
							System.out.println("Do you Want this service");
							String femaleservice1=s.next();
							if(femaleservice1.equals("yes"))
							{
								System.out.println("body Detox");
								price=4009;
								t2=price;
								System.out.println("Time of service: 4 hrs 20 mins\nWaxing-Full arms,Full legs,underarms\nFacial:Elysian Chocolate & Vanila manicure\nPedicure:Elysian Chocolate & Vanila\nFacial Hair remove:Eyebrow"+"\nPrice: "+t2);
							}
							else
							{
								t2=0;
							}
						}
						else if(service.equals("manicure"))
						{
							System.out.println("Do you Want this service");
							String femaleservice1=s.next();
							if(femaleservice1.equals("yes"))
							{
								System.out.println("Face Detox");
								price=149;
								t3=t3+price;
								System.out.println("Time of service: 15 mins\nQuick & basic nailgroomingsession with a wide range of polishes"+"\nPrice: "+t3);
							}
							else
							{
								t3=0;
							}
						}
						else if(service.equals("pedicure"))
						{
							System.out.println("Do you Want this service");
							String femaleservice1=s.nextLine();
							if(femaleservice1.equals("yes"))
							{
								System.out.println("Face Detox");
								price=759;
								t4=price;
								System.out.println("Time of service: 15 mins\nQuick & basic nailgroomingsession with a wide range of polishes"+"\nPrice: "+t4);
							}
							else
							{
								t4=0;
							}
						}
					}
				}
				else if(women.equals("spa_women"))
				{
					System.out.println("Select a service");
					String spawomen=s.next();
					if(spawomen.equals("ayurvedic"))
					{
						System.out.println("Do you Want this service");
						String femaleservice1=s.next();
						if(femaleservice1.equals("yes"))
						{
							price=1000;
							System.out.println("Ayurvedic spa\n time:40 mins"+"\nprice: "+price);
							t5=price;
						}
						else
							t5=0;
					}
					else if(spawomen.equals("prime"))
					{
						System.out.println("Do you Want this service");
						String femaleservice1=s.next();
						if(femaleservice1.equals("yes"))
						{
							price=3000;
							System.out.println("Prime spa\n time:40 mins"+"\nprice:"+price);
							t6=price;
						}
						else
							t6=0;
					}
					else if(spawomen.equals("Luxury"))
					{
						
						System.out.println("Do you Want this service");
						String femaleservice1=s.next();
						if(femaleservice1.equals("yes"))
						{
							price=5000;
							System.out.println("Prime spa\n time:40 mins"+"\nprice:"+price);
							t7=price;
						}
						else
							t7=0;
					}
				
				}
			}
		
			else if(option.equals("3"))
			{
				System.out.println("Men's Salon & spa");
				System.out.println("Choose a service");
				String men=s.next();
				if(men.equals("salon"))
				{
					System.out.println("Do you Want this service");
					String menservice=s.next();
					if(menservice.equals("yes"))
					{
						price=900;
						System.out.println("HairCut for Men"+"\nprice:"+price);
						t8=price;
					}
					else
						t8=0;
				}
				else if(men.equals("spa"))
				{
					System.out.println("Do you Want this service");
					String menservice=s.next();
					if(menservice.equals("yes"))
					{
						price=1000;
						System.out.println("Spa for Men"+"\nprice:"+price);
						t9=price;
					}
					else
						t9=0;
				}
			}
			else if(option.equals("4"))
			{
				System.out.println("AC & Appliance Repair");
				System.out.println("Choose a service");
				String appliance=s.next();
				if(appliance.equals("repair"))
				{
					System.out.println("Do you Want this service");
					String service=s.next();
					if(service.equals("yes"))
					{
						price=1000;
						System.out.println("all kinds of home repairs "+"\nprice:"+price);
						t10=price;
					}
					else
						t10=0;
				}
			}
			else if(option.equals("5"))
			{
				System.out.println("Cleaning & Pest Control");
				System.out.println("Choose a service");
				String clean=s.next();
				if(clean.equals("homecleaning"))
				{
					System.out.println("Do you Want this service");
					String service=s.next();
					if(service.equals("yes"))
					{
						price=2000;
						System.out.println("cleaning"+"\nprice:"+price);
						t11=price;
					}
					else
						t11=0;
				}
			}
			else if(option.equals("6"))
			{
				System.out.println("Electrician, Plunber & Carpenter");
				System.out.println("Choose a service");
				String appliance=s.next();
				if(appliance.equals("electrician"))
				{
					System.out.println("Do you Want this service");
					String service=s.next();
					if(service.equals("yes"))
					{
						price=1000;
						System.out.println("cleaning"+"\nprice:"+price);
						t12=price;
					}
					else
						t12=0;
				}
			}
			else if(option.equals("7"))
			{
				System.out.println("Painting & Water Proofing");
				System.out.println("Choose a service");
				String appliance=s.next();
				if(appliance.equals("painting"))
				{
					System.out.println("Do you Want this service");
					String service=s.next();
					if(service.equals("yes"))
					{
						price=3800;
						System.out.println("cleaning"+"\nprice:"+price);
						t13=price;
					}
					else
						t13=0;
				}
			}
			else if(option.equals("cart"))
			{
				int num=0;
					System.out.println("Your's choosen packages");
					if(t1>0)
					{
						num++;
						System.out.println(num+")face detox:           "+t1);
					}
					if(t2>0)
					{
						num++;
						System.out.println(num+")Full Body indulgence: "+t2);
					}
					if(t3>0)
					{
						num++;
						System.out.println(num+")manicure:              "+t3);
					}
					if(t4>0)
					{
						num++;
						System.out.println(num+")pedicure:				 "+t4);
					}
					if(t5>0)
					{
						num++;
						System.out.println(num+")spa ayurvedic:			 "+t5);
					}
					if(t6>0)
					{
						num++;
						System.out.println(num+")spa prime:				 "+t6);
					}
					if(t7>0)
					{
						num++;
						System.out.println(num+")spa Luxury: 			"+t7);
					}
					if(t8>0)
					{
						num++;
						System.out.println(num+")men salon:				 "+t8);
					}
					if(t9>0)
					{
						num++;
						System.out.println(num+")men spa: 				"+t9);
					}
					if(t10>0)
					{
						num++;
						System.out.println(num+")Appliance repair:		 "+t10);
					}
					if(t11>0)
					{
						num++;
						System.out.println(num+")cleaning:				 "+t11);
					}
					if(t12>0)
					{
						num++;
						System.out.println(num+")pest control: 			  "+t12);
					}
					if(t13>0)
					{
						num++;
						System.out.println(num+")painting&waterproofing: "+t13);
					}
					total=t1+t2+t3+t4+t5+t6+t7+t8+t9+t10+t11+t12+t13;
					System.out.println("-----------------------------------------");	
					System.out.println("your total amount including GST: "+total);	
			}
			if(option.equals("exit"))
			{
				for(;;)
				{
				System.out.println("Coupons\nChristmas offer:30%\nWinter offer:20%");
				String discount=s.next();
					if(discount.equals("christmas"))
					{
						int totalprice=(total*30)/100;
						System.out.println("Discounted Price :"+totalprice);
						break;
					}
					else if(discount.equals("winter"))
					{
						int totalprice=(total*20)/100;
						System.out.println("Price :"+totalprice);
						break;
					}
					else
						System.out.println("Invalid coupan");
				}
				System.out.println("Payment method:\nCredit card->\nDebit card->\nUPI->");
				String pay=s.next();
				if(pay.equals("UPI"))
				{
					System.out.println("Enter your UPI id: ex:******@oksbi");
					String upi=s.next();
					System.out.println("Thank you ");
				}
				System.out.println("Please Schedule your service");
				String time=s.next();
				System.out.println("Your schedule is booked: "+time);
				System.out.println("Enter your current Location");
				String Adress=s.next();
				System.out.println("would you like rate us");
				String feedback=s.next();
				if(feedback.equals("yes"))
				{
					System.out.println("rating:");
					int rating=s.nextInt();
					if(rating>=4)
						System.out.println("We are glad for your experiance "+rating);
					else if(rating>=3)
						System.out.println("Thank you for the Feedback "+rating);
					else if(rating>=1)
						System.out.println("Sorry for your terriable experiance "+rating);
				}
				System.out.println("Please visit again soon");
				break;
			}
		}
		
	}
}




