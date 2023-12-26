package com.crudapp.controller;

import com.crudapp.entity.User;
import com.crudapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userv;

@RequestMapping("/updatelist")
    public String method4(User user,Model model){
        userv.saveuser(user);
        List<User>users=userv.listusers();
        model.addAttribute("users",users);
        return "list";
    }

    @RequestMapping("/save")
    public String method1(User user){
        userv.saveuser(user);
        return "login";
    }
    @RequestMapping("/listall")
    public String method2(Model model){
        List<User>users=userv.listusers();
        model.addAttribute("users",users);
        return "list";
    }

    @RequestMapping("/delete/{id}")
    public String method3(@PathVariable Integer id,Model model){
    List<User>users=userv.deleteuser(id);
    model.addAttribute("users",users);
        return "list";
    }
    @RequestMapping("/update/{id}")
    public String method3(@PathVariable("id") int id,Model model){
    User user=userv.Updateuser(id);
    model.addAttribute("user",user);
    return "update";

    }

}
