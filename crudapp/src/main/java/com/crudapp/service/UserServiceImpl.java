package com.crudapp.service;

import com.crudapp.entity.User;
import com.crudapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository urepo;

    @Override
    public void saveuser(User user) {
        urepo.save(user);
    }

    @Override
    public List<User> listusers() {
        List<User>users=urepo.findAll();
        return users;
    }

    @Override
    public List<User> deleteuser(Integer id) {
        urepo.deleteById(id);
        List<User>users=urepo.findAll();
        return users;

    }
    @Override
    public User Updateuser(int id) {
        Optional<User>findbyid=urepo.findById(id);
        User us=findbyid.get();
        return us;
    }

    @Override
    public void saveapiuser(User user) {
        urepo.save(user);
    }
}
