package com.mirkoviccode.app.customer.service;

import com.mirkoviccode.app.customer.models.Customer;
import com.mirkoviccode.app.customer.myexception.MyException;
import com.mirkoviccode.app.customer.repository.CustomerRepository;
import com.mirkoviccode.app.customer.util.FraudCheckResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@RequiredArgsConstructor
public class CustomerService {

    @Autowired
    private final CustomerRepository customerRepository;

    private final RestTemplate restTemplate;

    public void registerCustomer(Customer customer) throws MyException {
        customerRepository.saveAndFlush(customer);
            //check if fraudster
       FraudCheckResponse fraudCheckResponse = restTemplate.getForObject(
                    "http://localhost:8082/is-fraudster?idCustomer="+customer.getIdCustomer(), FraudCheckResponse.class,
            customer.getIdCustomer());
       if(fraudCheckResponse.isFraudster()){
           throw new MyException("fraudster");

       }

    }
}
