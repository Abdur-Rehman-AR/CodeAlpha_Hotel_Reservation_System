package codeAlpha;

import java.util.Scanner;

public class AvailableRooms {
	
	Scanner sc = new Scanner(System.in);
	
	// ==>> Declaring variables
	
	int n = 0;
	int no_of_rooms = 50;
	int price_per_room = 1500;
	int price_of_booked_rooms = 0;
	
	/*
	 * Created a method named as checkRoom. 
	 * This will check if rooms are available for booking or not.
	 */
	
	public void checkRoom()
	{
		if(no_of_rooms < 1)
		{
			System.out.println("Sorry, All Rooms already have been booked.");
			System.out.println("Thanks, For considering our services.");
			System.out.println("Exiting....");
			System.exit(1);
		}
	}
	
	/*
	 * Created a method named as availableRooms. This method will display 
	 * total number of rooms and also the features of rooms.  
	 */
	
	public void availableRooms()
	{
			System.out.println("Total " +no_of_rooms +" Rooms are available.");
			System.out.println("Features of Each room :- ");
			System.out.println();
			System.out.println("  => Fully Furnished Room.");
			System.out.println("  => 1 Attach bathroom/washroom.");
			System.out.println("  => Comfortable Beds and sofas.");
			System.out.println("  => 2 Windows, open on garden side.");
			System.out.println("  => Beautiful Coloured walls.");
			System.out.println();
			
			System.out.println("Price of 1 room for 24 hours is " +price_per_room +".");
			System.out.println();
	}	
	
	/*
	 * Created a method named as payment processing. 
	 * This method will ask user that how many rooms do 
	 * he/she wants to book on the basis of input. Also, 
	 * It will calculate the total bill. 
	 */
	
	public void paymentProcessing()
	{
		while(true)
		{
			System.out.println("How many rooms do you want to book ?");
			try 
			{
				n = sc.nextInt();
				break;
			} 
			catch (Exception e) 
			{
				System.out.println("Only integer type inputs are allowed.");
				sc.nextLine();
			}
		}
		
		if(n > no_of_rooms || n < 0)
		{
			System.out.println("Invalid Input.");
			n = 0;
		}
		else if(n == 0)
		{
			System.out.println("So, You don't want to book Room.");
		}
		else
		{
			no_of_rooms = no_of_rooms - n;
			price_of_booked_rooms = n * price_per_room;
		}
	}
}