package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
    public static void main(String[] args) {
        int numOfContacts = 0;
        String personName = " ";

        System.out.println("Welcome to Address Book Program");

        AddressBook addressBook1 = new AddressBook();
        System.out.println("Enter Your Options:");
        System.out.println("1.Add Contact");
        System.out.println("2.Edit Contact");
        System.out.println("3.Delete Contact");
        Scanner scanner = new Scanner(System.in);
        int options = scanner.nextInt();
        if (options==1){
            System.out.println("Number of contacts to be added => ");
            numOfContacts = scanner.nextInt();
        }
        if (options==3){
            System.out.println("Enter the name of person you wanna delete");
            personName = scanner.next();
        }

        switch (options) {
            case 1:
                for (int i=1; i<=numOfContacts; i++) {
                    addressBook1.addContact();
                }
                break;
            case 2:
                System.out.println("Enter Your Options:");
                System.out.println("1.First Name");
                System.out.println("2.Last Name");
                System.out.println("3.Address");
                System.out.println("4.City");
                System.out.println("5.State");
                System.out.println("6.Zip");
                System.out.println("7.Phone Number");
                System.out.println("8.Email Id");
                int temp = scanner.nextInt();
                addressBook1.editPerson(temp);
                break;
            case 3:
                addressBook1.deletePerson();
                break;
            default:
                System.out.println("Wrong Option");
        }
    }
}
