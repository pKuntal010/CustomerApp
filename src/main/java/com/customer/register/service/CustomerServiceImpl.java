package com.customer.register.service;

import com.customer.register.customer.Customer;
import com.customer.register.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{

    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public Customer addCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    @Override
    public Customer getCustomer(Integer id) {
        return customerRepo.findById(id).get();
    }

    @Override
    public List<Customer> getAllCustomer() {
        return customerRepo.findAll();
    }

    @Override
    public void deleteCustomer(Integer id) {
        customerRepo.deleteById(id);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return customerRepo.save(customer);
    }
}
