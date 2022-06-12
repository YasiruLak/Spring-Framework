package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 6/10/2022
 * @month : 06
 * @year : 2022
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("customer")
public class CustomerController {

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO getAllCustomer(){
        return new CustomerDTO("C001","Yasiru","Galle",100.00);
    }

    @GetMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO searchCustomer(){
        return new CustomerDTO("C002","Yasiru","Galle",100.00);
    }
}
