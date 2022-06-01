package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.*;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 6/1/2022
 * @month : 06
 * @year : 2022
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("customer")
public class CustomerController {

    @GetMapping
    public String getAllCustomer(){
        return "Get Customer";
    }

    @GetMapping(path = "search")
    public String searchCustomer(){
        return "Search Customer";
    }

    @PostMapping
    public String saveCustomer(){
        return "Customer Saved";
    }

    @PutMapping
    public String updateCustomer(){
        return "Customer Updated";
    }

    @DeleteMapping
    public String deleteCustomer(){
        return "Customer Deleted";
    }
}
