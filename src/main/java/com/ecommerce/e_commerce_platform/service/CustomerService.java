package com.ecommerce.e_commerce_platform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.e_commerce_platform.entity.Customer;
import com.ecommerce.e_commerce_platform.repository.CustomerRepository;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long customerId) {
        return customerRepository.findById(customerId).get();
    }

    public Customer updateCustomer(Customer customer) {
        Customer newCustomer = customerRepository.findById(customer.getCustomerId()).get();
        newCustomer.setName(customer.getName());
        newCustomer.setEmail(customer.getEmail());
        newCustomer.setAddress(customer.getAddress());
        return newCustomer;
    }

    public void deleteCustomer(Long customerId) {
        customerRepository.deleteById(customerId);
    }
}
