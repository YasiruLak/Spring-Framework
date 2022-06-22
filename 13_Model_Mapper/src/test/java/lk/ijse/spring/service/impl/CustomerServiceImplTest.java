package lk.ijse.spring.service.impl;

import lk.ijse.spring.config.WebAppConfig;
import lk.ijse.spring.dto.CustomerDTO;
import lk.ijse.spring.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 6/22/2022
 * @month : 06
 * @year : 2022
 * @since : 0.1.0
 **/
@WebAppConfiguration
@ContextConfiguration(classes = {WebAppConfig.class})
@ExtendWith(SpringExtension.class)
@Transactional
class CustomerServiceImplTest {

    @Autowired
    CustomerService service;

    @Test
    void saveCustomer() {

        CustomerDTO customerDTO = new CustomerDTO("C009", "Yasiru", "Galle", "091");
        assertThrows(RuntimeException.class,()->{
            service.saveCustomer(customerDTO);
        });

    }

    @Test
    void deleteCustomer() {
    }

    @Test
    void updateCustomer() {
    }

    @Test
    void searchCustomer() {
    }

    @Test
    void getAllCustomer() {
    }
}