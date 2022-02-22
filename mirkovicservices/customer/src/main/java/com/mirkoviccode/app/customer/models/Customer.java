package com.mirkoviccode.app.customer.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "Customer")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Customer {
    @Id()
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCustomer",unique = true,nullable = false)
    private Integer idCustomer;
    @Column(name = "firstName",nullable = false)
    private String firstName;
    @Column(name = "lastName",nullable = false)
    private String lastName;
    @Column(name = "email",nullable = false)
    private String email;
}
