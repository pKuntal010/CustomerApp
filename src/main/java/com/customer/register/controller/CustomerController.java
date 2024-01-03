package com.customer.register.controller;

import com.customer.register.customer.Customer;
import com.customer.register.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/home")
    public ResponseEntity<String> welcome(){
        String s = "Welcome!!!";
        return new ResponseEntity<>(s, HttpStatus.OK);
    }

    @PostMapping("/addCustomer")
    public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer){
        Customer customer1 = customerService.addCustomer(customer);
        return new ResponseEntity<>(customer1, HttpStatus.CREATED);
    }

    @PutMapping("/updateCustomer")
    public ResponseEntity<Customer> updateCustomer(@RequestBody Customer customer){
        Customer cust = customerService.updateCustomer(customer);
        return new ResponseEntity<>(cust, HttpStatus.ACCEPTED);
    }

    @GetMapping("/getCustomer/{id}")
    public ResponseEntity<Customer> getCustomer(@PathVariable Integer id){
        Customer customer = customerService.getCustomer(id);
        return new ResponseEntity<>(customer, HttpStatus.FOUND);
    }

    @GetMapping("/getCustomers")
    public ResponseEntity<List<Customer>> getAllCustomers(){
        List<Customer> customerList = customerService.getAllCustomer();
        return new ResponseEntity<>(customerList, HttpStatus.FOUND);
    }

    @DeleteMapping("/deleteCustomer/{id}")
    public ResponseEntity<String> deleteCustomer(@PathVariable Integer id){
        customerService.deleteCustomer(id);
        String msg = "The customer with " +id + " has been deleted.";
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }

}
