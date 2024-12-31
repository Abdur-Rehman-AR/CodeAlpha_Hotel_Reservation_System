package codeAlpha;

import java.util.Scanner;

public class CustomerInformation {
	
	static Scanner sc = new Scanner(System.in);
	
	/*
	 * customerInformation method will obtain the information about the 
	 * customer, and will set this in the customer class.
	 */
	
	public void customerInformation(Customer cus) {
		
		System.out.println("Enter your Information Please.");
		System.out.println();
		
		System.out.print("Enter Your Name : ");
		cus.setName(sc.nextLine());
		
		System.out.print("Enter Your Age : ");
		while(true)
		{
			while(true)
			{
				try 
				{
					cus.setAge(sc.nextInt());
					break;
				} 
				catch (Exception e) 
				{
					System.out.println("Please Enter in integer form");
					sc.nextLine();
				}
			}
			
			if(cus.getAge() < 0 || cus.getAge() > 120) 
			{
			    System.out.println("Please enter a valid age.");
			}
			else
			{
				break;
			}
		}
		sc.nextLine();
		
		System.out.print("Enter Your Gender : ");
		cus.setGender(sc.nextLine());
		
		System.out.print("Enter Your Id : ");
		cus.setId(sc.nextLine());
		
		while(true)
		{
			System.out.print("Enter Your Phone Number : ");
			cus.setPhoneNumber(sc.nextLine());
			
			if(cus.getPhoneNumber().matches("[0123456789]+") && cus.getPhoneNumber().length() > 10 && cus.getPhoneNumber().length() < 13)
			{
				break;
			}
			else
			{
				System.out.println("Invalid Phone Number.");
			}
		}
		
		System.out.print("Enter Your Email Address : ");
		cus.setEmail(sc.nextLine());
	}
}