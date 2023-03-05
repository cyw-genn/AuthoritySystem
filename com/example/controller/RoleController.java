package com.example.controller;

import com.example.entity.Role;
import com.example.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@Controller
public class RoleController {

    @Autowired
    private RoleService roleService;

    @GetMapping("/index.html")
    public String userList(Map<String, List> result){
        List<Role> Roles = roleService.findAll();
        result.put("roles", Roles);
        return "index";
    }

    @PostMapping("/add")
    public String save(Role role){
        roleService.save(role);
        return "redirect:/index.html";
    }

    @RequestMapping("/delete/{id}")
    public String delete(@PathVariable Integer id, HttpServletResponse servletResponse) throws IOException {
        roleService.delete(id);
        System.out.println("delete successful");
        return "redirect:/index.html";
    }

    @GetMapping("/updatePage/{id}")
    public String updatePage(Model model,@PathVariable int id){
        Role roles= roleService.get(id);
        model.addAttribute("roles",roles);
        return "modifie";
    }

    @PutMapping("/update")
    public String updateUser(Model model, Role role, HttpServletRequest request){
        String id=request.getParameter("id");
        Role roleById = roleService.get(Integer.parseInt(id));
        roleService.update(role);
        System.out.println(role);
        return "redirect:/index.html";
    }
}
