package repo;

import lk.ijse.spring.WebAppInitializer;
import lk.ijse.spring.entity.Customer;
import lk.ijse.spring.repo.CustomerRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;
import java.util.Optional;


/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 6/15/2022
 * @month : 06
 * @year : 2022
 * @since : 0.1.0
 **/
@SpringBootTest(classes = WebAppInitializer.class, webEnvironment = SpringBootTest.WebEnvironment.NONE)
class CustomerRepoTest {

    @Autowired
    CustomerRepo customerRepo; // Inject the dependency of Customer Repo

    @Test // Test method
    public void saveCustomer() {
        //Ok let's save a customer using Customer Repo
        Customer customer1 = new Customer("C001", "Dasun", "Panadura", "078");
        Customer customer2 = new Customer("C002", "Kasun", "Kaluthara", "567");
        Customer customer3 = new Customer("C003", "Damith", "Galle", "078");
        customerRepo.save(customer1);
        customerRepo.save(customer2);
        customerRepo.save(customer3);
    }

    @Test
    public void getAllCustomer(){
        List<Customer> all = customerRepo.findAll();
        for (Customer customer: all
             ) {
            System.out.println(customer.toString());

        }
    }

    @Test
    public void searchCustomer(){
        Optional<Customer> optional = customerRepo.findById("C001");
        boolean present = optional.isPresent();
        System.out.println(present);

        Customer customer = optional.get();
        System.out.println(customer.toString());
    }

    @Test
    public void deleteCustomer(){

        customerRepo.deleteById("C001");

    }

    @Test
    public void updateCustomer(){
        Customer customer1 = new Customer("C001", "Dammika", "Panadura", "078");
        customerRepo.save(customer1);
    }

    @Test
    public void findCustomerByName(){
        Customer yasiru = customerRepo.findCustomerByName("Yasiru");
        System.out.println(yasiru.toString());
    }

    @Test
    public void findCustomerByAddress(){
        Customer galle = customerRepo.findCustomerByAddress("Galle");
        System.out.println(galle.toString());
    }

    @Test
    public void searchCustomerByNameAndAddress(){
        Customer c1 = customerRepo.findCustomerByNameAndAddress("Kasun","Kaluthara");
        System.out.println(c1.toString());
    }

    @Test
    public void v1(){
        Customer c1 = customerRepo.findByName("Dasun");
        System.out.println(c1.toString());

        Customer c2 = customerRepo.readByName("Dasun");
        System.out.println(c2.toString());

        Customer c3 = customerRepo.getByName("Dasun");
        System.out.println(c3.toString());

        Customer c4 = customerRepo.queryByName("Dasun");
        System.out.println(c4.toString());

//        Customer c5 = customerRepo.searchByName("Kasun");
//        System.out.println(c5.toString());

        Customer c6 = customerRepo.streamByName("Kasun");
        System.out.println(c6.toString());
    }

    @Test
    public void testCountBy(){
        long dasun = customerRepo.countByName("Dasun");
        System.out.println(dasun);
    }

    @Test
    public void testExistsBy(){
        boolean b = customerRepo.existsByNameAndAddress("Dasun", "Galle");
        System.out.println(b);
    }

    @Test
    public void textQueryOne(){
        List<Customer> allCustomers = customerRepo.getAllCustomers();
        allCustomers.forEach(v->{
            System.out.println(v.toString());
        });
    }

    @Test
    public void textQueryTwo(){
        List<Customer> allCustomers = customerRepo.getAllCustomersWithJPQL();
        allCustomers.forEach(v->{
            System.out.println(v.toString());
        });
    }

    @Test
    public void textQueryThree(){
        PageRequest pr = PageRequest.of(0, 4, Sort.by("id").descending());
        List<Customer> allCustomers = customerRepo.getAllCustomersWithHQL(pr);
        allCustomers.forEach(v->{
            System.out.println(v.toString());
        });
    }

    @Test
    public void textQueryFour(){
        Customer customer = customerRepo.searchCustomerFromName("Damith","Galle");
        System.out.println(customer.toString());
    }

    @Test
    public void textQueryFive(){
        Customer customer = customerRepo.searchCustomerFromNameWithNamedPara("Damith","Galle");
        System.out.println(customer.toString());
    }

    @Test
    public void textQuerySix(){
        Customer customer = customerRepo.getAllCustomersWithJPQLWithParams("C001");
        System.out.println(customer.toString());
    }

    @Test
    public void checkPaging(){
        PageRequest pr = PageRequest.of(0, 4, Sort.by("id").descending());

        Page<Customer> all = customerRepo.findAll(pr);
        all.forEach(v ->{
            System.out.println(v.toString());
        });
    }

}