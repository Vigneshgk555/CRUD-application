package com.crudapp.service;

import com.crudapp.entity.User;

import java.util.List;

public interface UserService {
    void saveuser(User user);

    List<User> listusers();

    List<User> deleteuser(Integer id);

    User Updateuser(int id);

    void saveapiuser(User user);
}
