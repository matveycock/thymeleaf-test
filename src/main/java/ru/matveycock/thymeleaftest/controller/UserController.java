package ru.matveycock.thymeleaftest.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.matveycock.thymeleaftest.model.User;
import ru.matveycock.thymeleaftest.service.UserService;

import java.util.List;


@RestController
@RequestMapping("/users")
@AllArgsConstructor
public class UserController {

    private UserService service;

    @GetMapping("/{id}")
    public User findUserByID(@PathVariable long id){
        return service.findUserByID(id);
    }

    @GetMapping
    public List<User> findAllUsers(){
        return service.findAllUsers();
    }

    @PostMapping
    public User saveNewUser(@RequestBody User user) {
        return service.saveNewUser(user);
    }

    @PutMapping("/{id}/update")
    public User updateUserByEmail(@RequestBody User user){
        return service.updateUserByEmail(user);
    }

    @DeleteMapping("/{id}/delete")
    public void deleteUserByID(@PathVariable long id){
        service.deleteUserByID(id);
    }


}
