package ru.matveycock.thymeleaftest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.matveycock.thymeleaftest.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {
    Item findById(long id);
}
