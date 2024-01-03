package com.customer.register.service;

import com.customer.register.customer.Customer;

import java.util.List;

public interface CustomerService {
    public Customer addCustomer(Customer customer);
    public Customer getCustomer(Integer id);
    public List<Customer> getAllCustomer();
    public void deleteCustomer(Integer id);
    public Customer updateCustomer(Customer customer);
}
