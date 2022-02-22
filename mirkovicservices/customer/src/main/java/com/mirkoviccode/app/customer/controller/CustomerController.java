package com.mirkoviccode.app.customer.controller;

import com.mirkoviccode.app.customer.models.Customer;
import com.mirkoviccode.app.customer.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequiredArgsConstructor
public class CustomerController {

    @Autowired
    private final CustomerService customerService;

    @PostMapping("register-customer")
    public Customer registerCustomer(@RequestBody Customer customer){
        log.info("new customer registration {} !", customer);
        return customerService.registerCustomer(customer);
    }
}
