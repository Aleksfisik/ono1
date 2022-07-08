package ru.org.spring.dao;

import ru.org.spring.model.User;

import java.util.List;

public interface UserDao {
    List<User> index1();

    User show1(Long id);

    void save1(User person);

    void update1(Long id, User updatedPerson);

    void delete1(Long id);
}
