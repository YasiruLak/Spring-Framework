package lk.ijse.spring.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 6/13/2022
 * @month : 06
 * @year : 2022
 * @since : 0.1.0
 **/
@Entity
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Customer {

    @Id
    private String id;
    private String name;
    private String address;
    private String contact;


}
