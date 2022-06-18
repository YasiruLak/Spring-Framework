package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.service.CustomerService;
import lk.ijse.spring.utill.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
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

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil getAllCustomer(){
        List<CustomerDTO> allCustomer = customerService.getAllCustomer();
        return new ResponseUtil(200,"Ok",allCustomer);
    }

    @PostMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil saveCustomer(@ModelAttribute CustomerDTO customer){
        customerService.saveCustomer(customer);
        return new ResponseUtil(200,"Ok",null);
    }

    @DeleteMapping(params = {"id"},produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil deleteCustomer(@RequestParam String id) {
        customerService.deleteCustomer(id);
        return new ResponseUtil(200,"Ok",null);
    }

    @PutMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil updateCustomer(@RequestBody CustomerDTO customer){
        customerService.saveCustomer(customer);
        return new ResponseUtil(200,"Ok",null);
    }

    @GetMapping(path = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseUtil searchCustomer(@PathVariable String id) {
        CustomerDTO customerDTO = customerService.searchCustomer(id);
        return new ResponseUtil(200,"Ok",customerDTO);
    }

}
