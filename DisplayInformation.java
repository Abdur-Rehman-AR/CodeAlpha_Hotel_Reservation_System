package codeAlpha;

public class DisplayInformation {
	
	/*
	 * This function will get the user information from the customer 
	 * class using getters and will display the customer information 
	 * and after this it will display the customer room booking information. 
	 */
	
	public void displayInformation(Customer cus , AvailableRooms room) {
		
		System.out.println("==================== Customer Information ====================");
		System.out.println();
		System.out.println("Name : " +cus.getName());
		System.out.println("Age : " +cus.getAge());
		System.out.println("Gender : " +cus.getGender());
		System.out.println("Id : " +cus.getId());
		System.out.println("Phone Number : " +cus.getPhoneNumber());
		System.out.println("Email Address : " +cus.getEmail());
		System.out.println();
		System.out.println("==================== Customer Room Booking Information ====================");
		System.out.println();
		System.out.println("Number of rooms booked : " +room.n);
		System.out.println("Price of Each Room for 24 hour : " +room.price_per_room);
		System.out.println("Total Bill : " +room.price_of_booked_rooms);
		
		room.price_of_booked_rooms = 0;
	}
}