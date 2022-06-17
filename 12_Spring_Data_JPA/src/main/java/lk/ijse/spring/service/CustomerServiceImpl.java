package lk.ijse.spring.service;

import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 6/17/2022
 * @month : 06
 * @year : 2022
 * @since : 0.1.0
 **/
public class CustomerServiceImpl {

    @Autowired
    private CustomerRepo customerRepo;

    public void saveCustomer(Customer customer){
        customerRepo.save(customer);
    }

    public void deleteCustomer(String id){
        customerRepo.deleteById(id);
    }

    public void updateCustomer(Customer customer){
        customerRepo.save(customer);
    }

    public Customer searchCustomer(String id){
        return customerRepo.findById(id).get();
    }

    public List<Customer> getAllCustomer(){
        return  customerRepo.findAll();
    }
}
