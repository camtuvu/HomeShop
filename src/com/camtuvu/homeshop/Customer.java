package com.camtuvu.homeshop;

public class Customer {
  String fullName;
  String address;

  public Customer(String fullName, String address) {
    this.fullName = fullName;
    this.address = address;
  }

  public String getFullName() {
    return fullName;
  }

  public String getAddress() {
    return address;
  }

}

