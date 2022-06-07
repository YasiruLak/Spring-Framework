package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 6/7/2022
 * @month : 06
 * @year : 2022
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("params")
public class ParamsController {

    @GetMapping(params = {"param1","param2"})
    public String test1(){
        return "Hello1";
    }

    @GetMapping
    public String test2(){
        return "Hello2";
    }
}
