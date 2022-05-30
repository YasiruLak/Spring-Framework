package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 5/30/2022
 * @month : 05
 * @year : 2022
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("two")//Handle Method
public class ControllerTwo {

    public ControllerTwo() {
        System.out.println("Created Two");
    }

    //Mapping Method //Handle Method
    @GetMapping
    public String testTwo(){
        return "Hello Spring";
    }
}
