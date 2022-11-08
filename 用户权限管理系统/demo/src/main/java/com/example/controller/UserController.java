package com.example.controller;

import com.example.entity.User;
import com.example.mapper.UserMapper;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/index.html")
    public String userList(Map<String, List> result){
        List<User> Users=userService.findAll();
        result.put("users",Users);
        return "index";
    }

    @PostMapping("/add")
    public String save(User user){
        userService.save(user);
        return "redirect:/index.html";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable Integer id, HttpServletResponse servletResponse) throws IOException {
        userService.delete(id);
        System.out.println("delete successful");
        return "redirect:/index.html";
    }

    @GetMapping("/updatePage/{id}")
    public String updatePage(Model model,@PathVariable int id){
        User users=userService.get(id);
        model.addAttribute("users",users);
        return "modifie";
    }

    @PutMapping("/update")
    public String updateUser(Model model, User user, HttpServletRequest request){
        String id=request.getParameter("id");
        User userById=userService.get(Integer.parseInt(id));
        userService.update(user);
        System.out.println(user);
        return "redirect:/index.html";
    }
}
