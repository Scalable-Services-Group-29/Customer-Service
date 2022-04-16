package scalable.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import scalable.domain.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer findCustomerByCustomerId(Long customerId);

}
