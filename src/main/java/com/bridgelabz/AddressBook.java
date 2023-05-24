package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Contact> personList = new ArrayList<>();
    Contact contact = new Contact();

    public void addContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter FN");
        String firstName = scanner.next();
        System.out.println("Enter LN");
        String lastName = scanner.next();
        System.out.println("Enter Address");
        String address = scanner.next();
        System.out.println("Enter City");
        String city = scanner.next();
        System.out.println("Enter State");
        String state = scanner.next();
        System.out.println("Enter Zip Code");
        Integer zip = scanner.nextInt();
        System.out.println("Enter Phone Number");
        Long phN = scanner.nextLong();
        System.out.println("Enter Email Id");
        String emailId = scanner.next();
        contact.setFirstName(firstName);
        contact.setLastName(lastName);
        contact.setAddress(address);
        contact.setCity(city);
        contact.setState(state);
        contact.setZip(zip);
        contact.setPhN(phN);
        contact.setEmailId(emailId);
        personList.add(contact);
    }

    public int editPerson(int temp1) {
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        switch (temp1) {
            case 1:
                System.out.println("Enter FN");
                String firstName = scanner.next();
                contact.setFirstName(firstName);
                break;
            case 2:
                System.out.println("Enter LN");
                String lastName = scanner.next();
                contact.setLastName(lastName);
                break;
            case 3:
                System.out.println("Enter Address");
                String address = scanner.next();
                contact.setCity(address);
                break;
            case 4:
                System.out.println("Enter City");
                String city = scanner.next();
                contact.setCity(city);
                break;
            case 5:
                System.out.println("Enter State");
                String state = scanner.next();
                contact.setState(state);
                break;
            case 6:
                System.out.println("Enter Zip Code");
                int zip = scanner.nextInt();
                contact.setZip(zip);
                break;
            case 7:
                System.out.println("Enter Phone Number");
                Long phN = scanner.nextLong();
                contact.setPhN(phN);
                break;
            case 8:
                System.out.println("Enter Email Id");
                String emailId = scanner.next();
                contact.setEmailId(emailId);
                break;
            default:
                System.out.println("Wrong Number");
        }
        System.out.println(contact);
        return temp1;
    }

    public void deletePerson() {

        contact.setCity("");
        contact.setLastName("");
        contact.setAddress("");
        contact.setCity("");
        contact.setState("");
        contact.setZip(0);
        contact.setPhN(0);
        contact.setEmailId("");
        System.out.println(contact);
    }

}
