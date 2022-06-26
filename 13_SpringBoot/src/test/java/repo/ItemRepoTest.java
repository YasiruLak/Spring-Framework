package repo;

import lk.ijse.spring.entity.Item;
import lk.ijse.spring.repo.ItemRepo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 6/17/2022
 * @month : 06
 * @year : 2022
 * @since : 0.1.0
 **/
@SpringBootTest
class ItemRepoTest {

    @Autowired
    ItemRepo itemRepo;

    @Test
    public void saveItem(){

        Item item = new Item("I001", "Milo", "10", 100.0);
        itemRepo.save(item);
    }

    @Test
    public void getAllItem(){
        List<Item> all = itemRepo.findAll();
        for (Item item :all
             ) {
            System.out.println(item.toString());
        }
    }

    @Test
    public void searchItem(){
        Optional<Item> optional = itemRepo.findById("I001");
        boolean present = optional.isPresent();
        System.out.println(present);

        Item item = optional.get();
        System.out.println(item.toString());
    }

    @Test
    public void deleteItem(){
        itemRepo.deleteById("I001");
    }

    @Test
    public void updateItem(){
        Item item = new Item("I001", "Milo", "20", 100.0);
        itemRepo.save(item);
    }

}