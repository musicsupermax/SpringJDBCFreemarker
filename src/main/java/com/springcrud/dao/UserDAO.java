package com.springcrud.dao;

import com.springcrud.model.User;

import java.util.List;

public interface UserDAO {

    void save (User user);

    User getById(int id);

    void delete(int id);

    void update(User user);

    List<User> findAll();

}
