package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 6/1/2022
 * @month : 06
 * @year : 2022
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("item")
public class ItemController {

    @GetMapping
    public String getItem(){
        return "Get All Item";
    }
}
