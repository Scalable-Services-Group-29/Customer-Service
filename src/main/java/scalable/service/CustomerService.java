package scalable.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import scalable.domain.Customer;
import scalable.repository.CustomerRepository;

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
