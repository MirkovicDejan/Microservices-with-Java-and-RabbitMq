package com.mirkoviccode.app.customer.repository;
import com.mirkoviccode.app.customer.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Integer>{
    boolean existsByEmail(String email);

}
