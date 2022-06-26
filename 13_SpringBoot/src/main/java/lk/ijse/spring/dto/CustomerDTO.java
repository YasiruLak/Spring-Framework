package lk.ijse.spring.dto;

import lombok.*;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 6/18/2022
 * @month : 06
 * @year : 2022
 * @since : 0.1.0
 **/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CustomerDTO {

    private String id;
    private String name;
    private String address;
    private String contact;

}
