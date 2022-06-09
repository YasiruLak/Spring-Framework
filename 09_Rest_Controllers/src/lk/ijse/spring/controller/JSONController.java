package lk.ijse.spring.controller;

import lk.ijse.spring.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 6/8/2022
 * @month : 06
 * @year : 2022
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("json")
public class JSONController {

    @PostMapping// if you want to get json request content you have to use @RequestBody
    public String getJsonRequest(@RequestBody CustomerDTO dto) {
        return "Hello JSON " + dto.toString();
    }

    // to return json response you need json converter in the classpath
    @GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})//content-type=application/json
    public CustomerDTO sendBackJSON() {
        return new CustomerDTO("C001", "Dasun", "Galle", 100.00);
    }
}
