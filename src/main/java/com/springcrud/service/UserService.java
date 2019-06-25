package com.springcrud.service;

import com.springcrud.model.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    void save (User user) throws Exception;

    User getById(int id);

    void delete(int id);

    void update(User user);

}
