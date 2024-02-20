package ru.matveycock.thymeleaftest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.matveycock.thymeleaftest.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findById(long id);
}
