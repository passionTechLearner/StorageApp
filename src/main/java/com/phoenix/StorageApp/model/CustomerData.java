package com.phoenix.StorageApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CustomerData")
public class CustomerData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String company;
    @Column
    private String address;
    @Column
    private String city;
    @Column
    private String county;
    @Column
    private String state;
    @Column
    private String zip;
    @Column
    private String phone1;
    @Column
    private String phone2;
    @Column
    private String email;

}
