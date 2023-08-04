package com.example.schoolcrud.entity;

import jakarta.persistence.*;
@Entity
@Table(name = "laptop")
public class Laptop {
    @Id
    private int laptopId;
    private String brand;
    private String name;
    @OneToOne(mappedBy = "laptop", cascade = CascadeType.ALL)
    @JoinColumn(name = "student_id")
    private Student student;
    public Laptop(int laptopId, String brand, String name) {
        this.laptopId = laptopId;
        this.brand = brand;
        this.name = name;
    }

    public Laptop() {

    }

    public int getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
