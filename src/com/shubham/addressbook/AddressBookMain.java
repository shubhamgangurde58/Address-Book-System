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
        System.out.println("FirstName:"+contact.getFirstName());
        System.out.println("LastName:"+contact.getLastName());
        System.out.println("Address:"+contact.getAddress());
        System.out.println("City:"+contact.getCity());
        System.out.println("State:"+contact.getState());
        System.out.println("Zipcode:"+contact.getZipcode());
        System.out.println("PhoneNumber:"+contact.getPhoneNumber());
        System.out.println("Email:"+contact.getEmail());
    }

    public void display(){
        System.out.println(contact.toString());

    }


    public static void main(String[] args) {
        System.out.println("Welcome To Address Book");

        AddressBookMain addressbookmain = new AddressBookMain();
        addressbookmain.inputContact();
        addressbookmain.displayContact();

    }
}
