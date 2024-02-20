package ru.matveycock.thymeleaftest.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import ru.matveycock.thymeleaftest.service.ItemService;

@Controller
@AllArgsConstructor
public class MainController {



    private ItemService service;

    @GetMapping
    //public List<Item> getAllItems(){
    public String getAllItems(Model model){
        model.addAttribute("items", service.getAllItems()); //service.getAllItems()
        //return service.getAllItems();
        return "index";
    }


//    @GetMapping("")
//    String getItems(Model model) {
//        model.addAttribute("items", "this is working");
//        return "index";
//    }
}
