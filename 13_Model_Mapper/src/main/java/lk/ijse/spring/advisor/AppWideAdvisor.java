package lk.ijse.spring.advisor;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 6/18/2022
 * @month : 06
 * @year : 2022
 * @since : 0.1.0
 **/
@RestControllerAdvice
@CrossOrigin
public class AppWideAdvisor {

    @ExceptionHandler({Exception.class})
    public String ExceptionHandler(Exception e){
        return e.getMessage();
    }
}
