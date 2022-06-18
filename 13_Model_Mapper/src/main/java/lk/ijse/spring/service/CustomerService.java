package lk.ijse.spring.service;

import lk.ijse.spring.entity.Customer;

import java.util.List;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 6/17/2022
 * @month : 06
 * @year : 2022
 * @since : 0.1.0
 **/
public interface CustomerService {

    public void saveCustomer(Customer customer);

    public void deleteCustomer(String id);

    public void updateCustomer(Customer customer);

    public Customer searchCustomer(String id);

    public List<Customer> getAllCustomer();
}
