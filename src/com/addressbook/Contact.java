package com.addressbook;

public class Contact {
    String firstName,lastName,address,city,state,email,zip,phoneNo;

    @Override
    public String toString() {
        return "Contact{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", email='" + email + '\'' +
                ", zip='" + zip + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                '}';
    }

    public Contact(String firstName, String lastName, String address, String city, String state, String email, String zip, String phoneNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.email = email;
        this.zip = zip;
        this.phoneNo = phoneNo;


    }
}


