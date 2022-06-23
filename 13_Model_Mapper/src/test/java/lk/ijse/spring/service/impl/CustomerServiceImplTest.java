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

import java.util.List;

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

    //add One Customer for testing
    public CustomerDTO addOneCustomer() {
        //If it is a new Customer It should added to the database
        return new CustomerDTO("C001", "Ramal", "Galle", "091");
    }

    //Add multiple customers for testing
    public void addCustomers(){
        CustomerDTO c1 = new CustomerDTO("C001","Dasun","Galle","091");
        CustomerDTO c2 = new CustomerDTO("C002","Kamal","Panadura","091");
        CustomerDTO c3 = new CustomerDTO("C003","Ramal","Kaluthara","091");
        CustomerDTO c4 = new CustomerDTO("C004","Oshan","Colombo","091");
        service.saveCustomer(c1);
        service.saveCustomer(c2);
        service.saveCustomer(c3);
        service.saveCustomer(c4);
    }

    @Test
    void saveCustomer() {

        CustomerDTO customerDTO = new CustomerDTO("C009", "Yasiru", "Galle", "091");
        assertThrows(RuntimeException.class,()->{
            service.saveCustomer(customerDTO);
        });

    }

    @Test
    void deleteCustomer() {
        //Add multiple customers
        addCustomers();

        // delete existing customer
        assertDoesNotThrow(()->{
            service.deleteCustomer("C001");
        });

        //delete an non existing customer
        assertThrows(RuntimeException.class,()->{
            service.deleteCustomer("C016");
        });
    }

    @Test
    void updateCustomer() {
        addCustomers();

        //update an existing customer
        assertDoesNotThrow(()->{
            service.updateCustomer(new CustomerDTO("C001", "Ramal", "Galle", "091"));
        });

        //update an non existing customer
        //should throw an exception
        assertThrows(RuntimeException.class,()->{
            service.updateCustomer(new CustomerDTO("C005", "Ramal", "Galle", "078"));
        });
    }

    @Test
    void searchCustomer() {
        assertDoesNotThrow(()->{
            service.searchCustomer("C001");
        });
    }

    @Test
    void getAllCustomer() {
        addCustomers();

        List<CustomerDTO> allCustomers = service.getAllCustomer();
        for (CustomerDTO allCustomer : allCustomers) {
            System.out.println(allCustomer.toString());
        }

        //Test customer availability
        assertNotNull(allCustomers);
    }
}