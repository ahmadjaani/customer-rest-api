package com.mycompany.springbootproject.service;

import com.mycompany.springbootproject.model.Customer;
import com.mycompany.springbootproject.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public List<Customer> getAll() {
        System.out.println("CustomerRepository Child Class Created By Spring Boot: " + customerRepository.getClass().getName());
        return customerRepository.findAll();
    }

    @Override
    public Customer addCustomer(Customer customer) {
        customerRepository.save(customer);
        return customer;
    }

    @Override
    public Customer fetchById(int id) {
        Customer customer = null;
        Optional<Customer> optionalCustomer = customerRepository.findById(id);
        if (optionalCustomer.isPresent())
            customer = optionalCustomer.get();

        return customer;
    }

    @Override
    public void udpateCustomer(int id, Customer customer) {
        Customer cust = null;
        Optional<Customer> optionalCustomer = customerRepository.findById(id);
        if (optionalCustomer.isPresent())
            cust = optionalCustomer.get();

        cust.setFirstName(customer.getFirstName());
        cust.setLastName(customer.getLastName());
        cust.setEmail(customer.getEmail());
        cust.setAddress(customer.getAddress());
        cust.setMobile(customer.getMobile());

        customerRepository.save(cust);
    }

    @Override
    public void deleteCustomer(int id) {
        customerRepository.deleteById(id);
    }


}
