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
@RequestMapping("controllerone")
public class ControllerOne {

    public ControllerOne() {
        System.out.println("Controller One Created");
    }

    @GetMapping
    public void testMethod(){
        System.out.println("Request Received");
    }
}
