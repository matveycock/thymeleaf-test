package ru.matveycock.thymeleaftest.service;

import ru.matveycock.thymeleaftest.model.User;

import java.util.List;


public interface UserService {

    User findUserByID(long id);

    List<User> findAllUsers();

    User saveNewUser(User user);

    User updateUserByEmail(User user);

    void deleteUserByID(long id);
}
