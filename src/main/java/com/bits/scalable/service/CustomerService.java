package com.bits.scalable.service;

import com.bits.scalable.domain.Customer;
import com.bits.scalable.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class CustomerService {

    final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    public Customer getByCustomerId(Long customerId) {
        return customerRepository.findCustomerByCustomerId(customerId);
    }

    public void deleteByCustomerId(Long customerId) {
        customerRepository.deleteById(customerId);
    }

}
