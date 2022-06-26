package lk.ijse.spring.repo;

import lk.ijse.spring.entity.Customer;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 6/15/2022
 * @month : 06
 * @year : 2022
 * @since : 0.1.0
 **/
public interface CustomerRepo extends JpaRepository<Customer, String> {

    //query methods
    Customer findCustomerByName(String name);

    Customer findCustomerByAddress(String address);

    Customer findCustomerByNameAndAddress(String name, String address);

    Customer findByName(String name);

    Customer readByName(String name);

    Customer getByName(String name);

    Customer queryByName(String name);

    //Customer searchByName(String name);

    // If there is only one record you can set the return type as follow
    Customer streamByName(String name);


    //If the query has more than one result you have
    //to change the method return type to list
    List<Customer> searchByName(String name);


    //test countBy
    long countByName(String name);


    //test existBy
    boolean existsByNameAndAddress(String name, String address);


    //native sql
    @Query(value = "select * from Customer", nativeQuery = true)
    List<Customer> getAllCustomers();


    //HQL - Hibernate Query Language
    @Query(value = "from Customer c")
    List<Customer> getAllCustomersWithHQL(Pageable p);


    //JPQL -  Java Persistence Query Language
    @Query(value = "select u from Customer u")
    List<Customer> getAllCustomersWithJPQL();

    //Parameters
    //01 Positional Params =?1
    //02 Named Params =:name


    //native sql with params
    //positional params
    @Query(value = "select * from Customer where name=?1 and address=?2", nativeQuery = true)
    Customer searchCustomerFromName(String name, String address);


    //native sql with params
    //named params
    @Query(value = "select * from Customer where name=:name and address=:address", nativeQuery = true)
    Customer searchCustomerFromNameWithNamedPara(@Param("name") String name, @Param("address") String address);


    //JPQL = Java Persistence Query Language
    @Query(value = "select c from Customer c where c.id=?1")
    Customer getAllCustomersWithJPQLWithParams(String id);

}
