package com.example.customerservice.model;

public class Customer {
    private String firstName;
    private String secondName;
    private String firstLastName;
    private String secondLastName;
    private String phone;
    private String address;
    private String city;

    public Customer(String firstName, String secondName, String firstLastName, String secondLastName,
                    String phone, String address, String city) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.firstLastName = firstLastName;
        this.secondLastName = secondLastName;
        this.phone = phone;
        this.address = address;
        this.city = city;
    }

    public String getFirstName() { return firstName; }
    public String getSecondName() { return secondName; }
    public String getFirstLastName() { return firstLastName; }
    public String getSecondLastName() { return secondLastName; }
    public String getPhone() { return phone; }
    public String getAddress() { return address; }
    public String getCity() { return city; }
}
