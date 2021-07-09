/**************************************************************
 * Purpose : Service class for address book problem. 
 * @author Hrishikesh Ugavekar
 * @Version 1.0
 * @since 9-07-2021
 *
 ************************************************************/
package service;

import java.util.ArrayList;

import model.Contact;

public class AddressbookMain {
	
	ArrayList<Contact> addressbook =  new ArrayList<>(); 
	
	/**
	 * Display welcome message.
	 */
	public void displayWelcome() {
		System.out.println("Welcome to address book");
	}
	
	/**
	 * Creates a contact and adds it to list
	 * @param firstName
	 * @param lastName
	 * @param address
	 * @param city
	 * @param state
	 * @param zip
	 * @param phone
	 * @param email
	 * @return
	 */
	public int createContact(String firstName , String lastName , String address , String city ,String state,
			String zip ,String phone , String email) {
		Contact contact = new Contact(firstName,lastName,address,city,state,zip,phone,email);
		addressbook.add(contact);
		return addressbook.size();
	}
}
