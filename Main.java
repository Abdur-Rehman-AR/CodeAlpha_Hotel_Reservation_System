/*
 * Task 3 :- Hotel Reservation System: 
 * Build a hotel Reservation system where users can search for available rooms, 
 * make reservations and view booking details include features like 
 * room categorization and payment processing. 
 */

package codeAlpha;

import java.util.Scanner;

public class Main {
	
	/*
	 * Made some of the Classes static, so that all the 
	 * functions in main class can use them.
	 */
	
	static Scanner sc = new Scanner(System.in);
	static Customer cus = new Customer();
	static AvailableRooms room = new AvailableRooms();
	static CustomerInformation cus_info = new CustomerInformation();
	static DisplayInformation display = new DisplayInformation();
	
	public static void main(String[] args) {
		
		int n = 0;
		int option = 0;
		
		System.out.println("==================== Welcome to Hotel Reservation System ====================");
		System.out.println();
		
		while(true)
		{
			System.out.println("Do you want to book a room ?");
			System.out.println();
			System.out.println("  =>  Press 1 for YES.");
			System.out.println("  =>  Press 0 for NO.");
			
			while (true) 
			{
				try 
				{
					n = sc.nextInt();
					break;
				} 
				catch (Exception e) 
				{
					System.out.println("Please Enter only '0' or '1'.");
					sc.nextLine();
				}
			}
			
			sc.nextLine();
			System.out.println();
			System.out.println("==================================================================================");
			System.out.println();
			
				if (n == 0) 
				{
					System.out.println("Thank You for your visit. Exiting.... !");
					System.exit(1);
				}
				else if(n == 1)
				{
					
					room.checkRoom();
					
					System.out.println();
					cus_info.customerInformation(cus);
					System.out.println();
					
					System.out.println("==================================================================================");
					
					System.out.println();
					room.availableRooms();
					room.paymentProcessing();
					System.out.println();
					
					System.out.println();
					while(true)
					{
						System.out.println("Do you want to Display Your Booking Information ?");
						System.out.println();
						System.out.println("  =>  Press 1 for YES.");
						System.out.println("  =>  Press 0 for NO.");
						
						while (true) 
						{						
							try 
							{
								option = sc.nextInt();
								break;
							} 
							catch (Exception e) 
							{
								System.out.println("Please Enter only '0' or '1'.");
								sc.nextLine();
							}
						}
							
							if(option == 0)
							{
								break;
							}
							else if(option == 1)
							{
								display.displayInformation(cus , room);
								break;
							}
							else
							{
								System.out.println("Invalid Option.");
							}
					}
					System.out.println();
					
					System.out.println("==================================================================================");
				}
				else
				{
					System.out.println("Please Press '0' for 'NO' and '1' for 'YES'.");
				}
		}		
	}
}