//package com.example.schoolcrud.entity;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "Address")
//public class Address {
//
//    @Id
//    private int addressId;
//    private String street;
//    private String city;
//@ManyToOne
//@JoinColumn(name = "student_id")
//private Student student;
//
//    public Address(int addressId, String street, String city) {
//        this.addressId = addressId;
//        this.street = street;
//        this.city = city;
//    }
//
//    public Address() {
//
//    }
//
//    @Override
//    public String toString() {
//        return "Address{" +
//                "addressId=" + addressId +
//                ", street='" + street + '\'' +
//                ", city='" + city + '\'' +
//                '}';
//    }
//}
