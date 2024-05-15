package com.shubham.addressbook;

import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.exit;

public class AddressBook {

    Scanner scanner = new Scanner(System.in);

    ArrayList<Contact> contactAList = new ArrayList<>();

    public void addContact() {
        Contact contact = new Contact();
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
        System.out.println("contact is successfully Added");

        contactAList.add(contact);
    }

    public void displayContact() {

        if (contactAList.isEmpty()) {
            System.out.println("Contact list is Empty");
        } else {
            for (int i = 0; i < contactAList.size(); i++) {
                Contact contact = contactAList.get(i);
                System.out.println(contact.toString());
            }
        }
    }
    public void editContact() {

        Contact contact = checkContactExists();
        if(contact != null)
        {
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
                   System.out.println("contact is successfully Edit");
        }
    }
    public void deleteContact() {

         Contact contact = checkContactExists();

         if(contact != null)
         {
             contactAList.remove(contact);
             System.out.println("contact is deleted successfully");
         }
    }
public Contact checkContactExists() {
    if (contactAList.isEmpty()) {

        System.out.println("contact List is Empty");
        return null;
    } else {
        System.out.println("Enter The firstName of The Contact:");
        String fName = scanner.next();
        boolean found = false;

        for (int i = 0; i < contactAList.size(); i++) {
            Contact contact = contactAList.get(i);
            if (fName.equals(contact.getFirstName())) {
                found = true;

                System.out.println("Contact Found");
                return contact;
            }
        }
        if (!found) {
            System.out.println("Given FirstName of contact is not found");
        }
    }
    return null;
}

        public static void main (String args[]){
            System.out.println("Welcome To Address Book");
            AddressBook addressbook = new AddressBook();
            int choice = 0;
            do {

                System.out.println("\n1.AddContact\n2.EditContact\n3.DeleteContact\n4.DisplayContact\n5. Exit \nEnter your choice no:");
                choice = addressbook.scanner.nextInt();
                switch (choice) {
                    case 1:
                        addressbook.addContact();
                        break;
                    case 2:
                        addressbook.editContact();
                        break;
                    case 3:
                        addressbook.deleteContact();
                        break;
                    case 4:
                        addressbook.displayContact();
                        break;
                    case 5:
                        exit(0);
                        break;

                }
            } while (choice <= 4);
        }
    }

