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
@RequestMapping("one")
public class WildCardMappingOptionOne {

    //Wild Card Mapping
    //Matches One or More Characters in a path segment
    //test/*/hello -> test//hello (not matching)
    //test/*/hello -> test/1/hello (matching)
    //test/*/hello -> test/abcde/hello (matching)
    //test/*/hello -> test/abc/de/hello (not matching)


    @GetMapping(path = "test/*/hello")
    public String test() {
        return "Get Mapping Invoked (test)";
    }

    @GetMapping(path = "hello/*/*")
    public String test2() {
        return "Get Mapping Invoked test2()";
    }
}
