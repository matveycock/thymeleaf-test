package ru.matveycock.thymeleaftest.repository;


import org.springframework.stereotype.Repository;
import ru.matveycock.thymeleaftest.model.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

@Repository
public class InMemoryItemDAO {

    private final List<Item> ITEMS = new ArrayList<Item>();

    public List<Item> getAllItems() {
        return ITEMS;
    }

    public Item getItemByID(long id) {
        return ITEMS.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public Item updateItemByID(Item item) {
        var itemIndex = IntStream.range(0, ITEMS.size())
                .filter(index -> ITEMS.get(index).getId() == item.getId())
                .findFirst()
                .orElse(-1);
        if(itemIndex > -1){
            ITEMS.set(itemIndex, item);
            return item;
        }
        return null;
    }

    public Item addNewItem(Item item) {
        ITEMS.add(item);
        return item;
    }

    public void deleteItemByID(long id) {
        var item = getItemByID(id);
        if(item != null){
            ITEMS.remove(item);
        }
    }

}
