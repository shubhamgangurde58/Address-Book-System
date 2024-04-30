package com.shubham.addressbook;

import java.util.Scanner;

public class AddressBookMain {

    Scanner scanner = new Scanner(System.in);
    Contact contact = new Contact();
    public void inputContact() {
        System.out.println("Enter the FirstName:");
        contact.setFirstName(scanner.next());
        System.out.println("Enter the LastName:");
        contact.setLastName(scanner.next());
        System.out.println("Enter the Address:");
        contact.setAddress(scanner.next());
        System.out.println("Enter the City:");
        contact.setCity(scanner.next());
        System.out.println("Enter the State:");
        contact.setState(scanner.next());
        System.out.println("Enter the Zipcode:");
        contact.setZipcode(scanner.next());
        System.out.println("Enter the PhoneNumber:");
        contact.setPhoneNumber(scanner.next());
        System.out.println("Enter the Email:");
        contact.setEmail(scanner.next());
    }

    public void displayContact(){
        if(contact==null)
        {
            System.out.println("contact is not avalible");
        }else {
            System.out.println("FirstName:" + contact.getFirstName());
            System.out.println("LastName:" + contact.getLastName());
            System.out.println("Address:" + contact.getAddress());
            System.out.println("City:" + contact.getCity());
            System.out.println("State:" + contact.getState());
            System.out.println("Zipcode:" + contact.getZipcode());
            System.out.println("PhoneNumber:" + contact.getPhoneNumber());
            System.out.println("Email:" + contact.getEmail());
        }
    }

    public void editContact(){
        System.out.println("Enter the First Name to edit contact");
        String fName = scanner.next();
        if(fName.equals(contact.getFirstName()))
        {
            System.out.println("contact found.");
            System.out.println("Enter the LastName:");
            contact.setLastName(scanner.next());
            System.out.println("Enter the Address:");
            contact.setAddress(scanner.next());
            System.out.println("Enter the City:");
            contact.setCity(scanner.next());
            System.out.println("Enter the State:");
            contact.setState(scanner.next());
            System.out.println("Enter the Zipcode:");
            contact.setZipcode(scanner.next());
            System.out.println("Enter the PhoneNumber:");
            contact.setPhoneNumber(scanner.next());
            System.out.println("Enter the Email:");
            contact.setEmail(scanner.next());

        } else {
            System.out.println("Given Name of contact is Not found:");
        }
    }

    public void deleteContact(){
        System.out.println("Enter The firstName to Delete The Contact:");
        String fName = scanner.next();
        if(fName.equals(contact.getFirstName()))
        {
            contact = null;
            System.out.println("Contact Deleted");
        }else{
            System.out.println("contact not found");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Address Book");
        AddressBookMain addressbookmain = new AddressBookMain();
        addressbookmain.inputContact();
        addressbookmain.displayContact();
        addressbookmain.editContact();
        addressbookmain.displayContact();
        addressbookmain.deleteContact();
        addressbookmain.displayContact();

    }
}
