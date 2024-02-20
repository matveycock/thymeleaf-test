package ru.matveycock.thymeleaftest.repository;

import org.springframework.stereotype.Repository;
import ru.matveycock.thymeleaftest.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;


@Repository
public class InMemoryUserDAO {

    private final List<User> USERS = new ArrayList<User>();


    public User findUserByID(long id) {
        return USERS.stream()
                .filter(user -> user.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<User> findAllUsers() {
        return USERS;
    }

    public User saveNewUser(User user) {
        USERS.add(user);
        return user;
    }

    public User updateUserByEmail(User user) {
        var userIndex = IntStream.range(0, USERS.size())
                .filter(index -> USERS.get(index).getEmail().equals(user.getEmail()))
                .findFirst()
                .orElse(-1);
        if(userIndex > -1){
            USERS.set(userIndex, user);
            return user;
        }
        return null;
    }

    public void deleteUserByID(long id) {
        var user = findUserByID(id);
        if(user != null){
            USERS.remove(user);
        }
    }

}
