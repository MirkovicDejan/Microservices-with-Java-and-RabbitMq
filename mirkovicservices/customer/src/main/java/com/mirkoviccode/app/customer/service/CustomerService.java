package com.mirkoviccode.app.customer.service;

import com.mirkoviccode.app.customer.models.Customer;
import com.mirkoviccode.app.customer.myexception.exception.MyException;
import com.mirkoviccode.app.customer.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CustomerService {

    @Autowired
    private final CustomerRepository customerRepository;

    public Customer registerCustomer(Customer customer) throws MyException {
        if(!customerRepository.existsByEmail(customer.getEmail())){
           return customerRepository.save(customer);
        } throw new MyException("E mail : "+customer.getEmail()+" is already use for another Customer ! Please insert another !");

    }
}
