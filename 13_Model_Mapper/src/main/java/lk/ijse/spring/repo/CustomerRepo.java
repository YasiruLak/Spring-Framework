package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 6/15/2022
 * @month : 06
 * @year : 2022
 * @since : 0.1.0
 **/
public interface CustomerRepo extends JpaRepository<Customer, String> {

    Customer findCustomerByName(String name);
    Customer findCustomerByAddress(String address);
}
