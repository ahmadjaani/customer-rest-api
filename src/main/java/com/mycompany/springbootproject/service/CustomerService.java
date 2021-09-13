package com.mycompany.springbootproject.service;

import com.mycompany.springbootproject.model.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    public List<Customer> getAll();

    public Customer addCustomer(Customer customer);

    Customer fetchById(int id);

    void udpateCustomer(int id, Customer customer);

    void deleteCustomer(int id);
}
