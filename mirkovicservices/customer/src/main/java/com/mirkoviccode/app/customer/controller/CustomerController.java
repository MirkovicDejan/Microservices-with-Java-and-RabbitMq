package com.mirkoviccode.app.customer.controller;

import com.mirkoviccode.app.customer.models.Customer;
import com.mirkoviccode.app.customer.myexception.MyException;
import com.mirkoviccode.app.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequiredArgsConstructor
public class CustomerController {

    @Autowired
    private final CustomerService customerService;

    @PostMapping("/register-customer")
    public void registerCustomer(@RequestBody Customer customer) throws MyException {
         customerService.registerCustomer(customer);
    }
}
