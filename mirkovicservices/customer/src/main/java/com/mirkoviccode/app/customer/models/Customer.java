package com.mirkoviccode.app.customer.models;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Customer {

    private Integer idCustomer;
    private String firstName;
    private String lastName;
    private String email;

}
