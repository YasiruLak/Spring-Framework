package lk.ijse.spring.controller;

import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 6/12/2022
 * @month : 06
 * @year : 2022
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping
    public List<Customer> getAllCustomer(){
        return customerService.getAllCustomer();
    }

    @PostMapping
    public void saveCustomer(@ModelAttribute Customer customer){
        customerService.saveCustomer(customer);
    }

    @DeleteMapping(params = {"id"})
    public void deleteCustomer(@RequestParam String id) {
        customerService.deleteCustomer(id);
    }

    @PutMapping
    public void updateCustomer(@RequestBody Customer customer){
        customerService.saveCustomer(customer);
    }

    @GetMapping(path = "/{id}")
    public Customer searchCustomer(@PathVariable String id) {
        return customerService.searchCustomer(id);
    }

}
