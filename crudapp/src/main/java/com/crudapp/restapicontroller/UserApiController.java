package com.crudapp.restapicontroller;

import com.crudapp.entity.User;
import com.crudapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserApiController {
    @Autowired
    private UserService usersevice;
    @PostMapping("/saveapi")
    public String method1(User user){
        usersevice.saveapiuser(user);
     return "saved successfully";
    }

   // public List<User>alluser(){
       // List<User>user=usersevice.findusers();
       // return user;
    //}
}
