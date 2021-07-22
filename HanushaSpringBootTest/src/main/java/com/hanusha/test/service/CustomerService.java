package com.hanusha.test.service;

import com.hanusha.test.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final List<Customer> customers;

    @Autowired
    public CustomerService(List<Customer> customers) {
        this.customers = customers;
    }

    public List<Customer> getAll(){
        return customers;
    }

    public Customer create(Customer customer){
        customers.add(customer);
        return customer;
    }
    public void remove(Customer customer){
        customers.remove(customer);
    }
}
