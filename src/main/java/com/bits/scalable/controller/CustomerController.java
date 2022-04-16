package com.bits.scalable.controller;

import com.bits.scalable.domain.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.bits.scalable.service.CustomerService;

@RestController
@RequestMapping("/customers")
@Slf4j
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping("/save_customer")
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @GetMapping("/get_customer")
    public Customer findByCustomerId(@RequestParam("id") Long customerId) {
        return customerService.getByCustomerId(customerId);
    }

    @DeleteMapping("/delete_customer")
    public void deleteByCustomerId(@RequestParam("id") Long customerId) {
        customerService.deleteByCustomerId(customerId);
    }

}

