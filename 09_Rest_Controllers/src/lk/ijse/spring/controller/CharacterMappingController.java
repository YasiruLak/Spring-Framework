package lk.ijse.spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 6/2/2022
 * @month : 06
 * @year : 2022
 * @since : 0.1.0
 **/
@RestController
@RequestMapping("character")
public class CharacterMappingController {


    //Character Mapping -> ?
    // item/I333
    // item/Ivff
    // item/I001
    //Matches single character

    @GetMapping(path = "item/I???")
    public String test() {
        return "Get Mapping Invoked (test)";
    }

    @GetMapping(path = "????/search")
    public String test2() {
        return "Get Mapping Invoked test2()";
    }
}
