package com.bits.scalable.repository;

import com.bits.scalable.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findCustomerByCustomerId(Long customerId);

}
