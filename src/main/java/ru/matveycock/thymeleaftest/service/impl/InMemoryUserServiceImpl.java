package ru.matveycock.thymeleaftest.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.matveycock.thymeleaftest.model.User;
import ru.matveycock.thymeleaftest.repository.InMemoryUserDAO;
import ru.matveycock.thymeleaftest.service.UserService;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryUserServiceImpl implements UserService {

    private final InMemoryUserDAO repository;

    @Override
    public User findUserByID(long id) {
        return repository.findUserByID(id);
    }

    @Override
    public List<User> findAllUsers() {
         return repository.findAllUsers();
    }

    @Override
    public User saveNewUser(User user) {
        return repository.saveNewUser(user);
    }

    @Override
    public User updateUserByEmail(User user) {
        return repository.updateUserByEmail(user);
    }

    @Override
    public void deleteUserByID(long id) {
        repository.deleteUserByID(id);
    }
}
