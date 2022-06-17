package lk.ijse.spring.service;

import lk.ijse.spring.entity.Item;
import lk.ijse.spring.repo.ItemRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 6/17/2022
 * @month : 06
 * @year : 2022
 * @since : 0.1.0
 **/
@Service
@Transactional
public class ItemServiceImpl {

    @Autowired
    private ItemRepo itemRepo;

    public void saveItem(Item item){

        itemRepo.save(item);
    }

    public void updateItem(Item item){

        itemRepo.save(item);
    }

    public List<Item> getAllItems(Item item){

        return itemRepo.findAll();
    }

    public void deleteItem(String id){

        itemRepo.deleteById(id);
    }

    public Item searchItem(String id){

        return itemRepo.findById(id).get();
    }
}
