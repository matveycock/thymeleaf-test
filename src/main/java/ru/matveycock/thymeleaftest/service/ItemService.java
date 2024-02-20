package ru.matveycock.thymeleaftest.service;

import ru.matveycock.thymeleaftest.model.Item;

import java.util.List;

public interface ItemService {

    public List<Item> getAllItems();

    public Item getItemByID(long id);

    public Item updateItemByID(Item item);

    public Item addNewItem(Item item);

    public void deleteItemByID(long id);

}
