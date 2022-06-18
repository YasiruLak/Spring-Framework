package lk.ijse.spring.service;

import lk.ijse.spring.entity.Item;

import java.util.List;

/**
 * @author : Yasiru Dahanayaka
 * @name : Spring Testing
 * @date : 6/17/2022
 * @month : 06
 * @year : 2022
 * @since : 0.1.0
 **/
public interface ItemService {

    public void saveItem(Item item);

    public void updateItem(Item item);

    public List<Item> getAllItems(Item item);

    public void deleteItem(String id);

    public Item searchItem(String id);
}
