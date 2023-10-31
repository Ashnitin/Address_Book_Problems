package com.addressbook;
import java.util.ArrayList;
import java.util.Scanner;
public class Operation {
    ArrayList<Contact> al=new ArrayList<>();
    public void input(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First Name: ");
        String firstName=sc.next();
        System.out.println("Enter Last Name: ");
        String lastName=sc.next();
        System.out.println("Enter Address: ");
        String address=sc.next();
        System.out.println("Enter Your City: ");
        String city=sc.next();
        System.out.println("Enter State: ");
        String state=sc.next();
        System.out.println("Enter Zip: ");
        String zip=sc.next();
        System.out.println("Enter your Phone No: ");
        String phoneNo=sc.next();
        System.out.println("Enter your Email: ");
        String email=sc.next();
        Contact ob=new Contact(firstName,lastName,address,city, state,email,zip,phoneNo);
        System.out.println(ob);
        al.add(ob);
    }
}
