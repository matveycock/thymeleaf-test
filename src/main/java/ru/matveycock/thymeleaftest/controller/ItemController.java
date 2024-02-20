package ru.matveycock.thymeleaftest.controller;

import lombok.AllArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import ru.matveycock.thymeleaftest.model.Item;
import ru.matveycock.thymeleaftest.service.ItemService;

@RestController
@RequestMapping("/items")
@AllArgsConstructor
public class ItemController {

    private ItemService service;

    @GetMapping
    //public List<Item> getAllItems(){
    public String getAllItems(Model model){
        model.addAttribute("items", service.getAllItems()); //service.getAllItems()
        //return service.getAllItems();
        return "index";
    }

    @GetMapping("/{id}")
    public Item getItemByID(@PathVariable long id){
        return service.getItemByID(id);
    }

    @PutMapping("/{id}/update")
    public Item updateItemByID(@RequestBody Item item){
        return service.updateItemByID(item);
    }
    @PostMapping
    public Item addNewItem(@RequestBody Item item){
        return service.addNewItem(item);
    }

    @DeleteMapping("/{id}/delete")
    public void deleteItemByID(@PathVariable long id){
        service.deleteItemByID(id);
    }

}
