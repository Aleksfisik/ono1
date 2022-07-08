package ru.org.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.org.spring.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByName(String name);
}
