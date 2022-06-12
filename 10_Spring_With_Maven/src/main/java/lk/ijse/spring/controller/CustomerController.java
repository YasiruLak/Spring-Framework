package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 6/10/2022
 * @month : 06
 * @year : 2022
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("api/v1/customer")
@CrossOrigin
public class CustomerController {

    @GetMapping
    public ArrayList<CustomerDTO> getAllCustomer(){
        ArrayList<CustomerDTO> arrayList = new ArrayList<>();
        arrayList.add(new CustomerDTO("C001","Yasiru","Galle","076"));
        arrayList.add(new CustomerDTO("C002","Yasiru","Galle","076"));
        arrayList.add(new CustomerDTO("C003","Yasiru","Galle","076"));
        arrayList.add(new CustomerDTO("C004","Yasiru","Galle","076"));
        return arrayList;
    }

    @PostMapping(consumes = {"application/x-www-form-urlencoded"})
    public CustomerDTO saveCustomer(@ModelAttribute CustomerDTO dto){
        return dto;
    }

    @GetMapping(path = "/{id}")
    public CustomerDTO searchCustomer(@PathVariable String id){
        return new CustomerDTO("C004","Yasiru","Galle","076");
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO updateCustomer(@RequestBody CustomerDTO dto){
        return dto;
    }

    @DeleteMapping(params = {"id"})
    public CustomerDTO deleteCustomer(String id){
        return new CustomerDTO(id, "Dasun", "Galle", "089");
    }
}
