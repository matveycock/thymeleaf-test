package ru.matveycock.thymeleaftest.service.impl;

import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import ru.matveycock.thymeleaftest.model.User;
import ru.matveycock.thymeleaftest.repository.UserRepository;
import ru.matveycock.thymeleaftest.service.UserService;

import java.util.List;

@Service
@Primary
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    @Override
    public User findUserByID(long id) {
        return repository.findById(id);
    }

    @Override
    public List<User> findAllUsers() {
        return repository.findAll();
    }

    @Override
    public User saveNewUser(User user) {
        return repository.save(user);
    }

    @Override
    public User updateUserByEmail(User user) {
        return repository.save(user);
    }

    @Override
    public void deleteUserByID(long id) {
        repository.deleteById(id);
    }
}
