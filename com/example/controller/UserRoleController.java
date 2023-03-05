package com.example.controller;

import com.example.entity.UserRole;
import com.example.service.UserRoleService;
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
public class UserRoleController {
    @Autowired
    private UserRoleService userRoleService;

    @GetMapping("/userrole.html")
    public String userList(Map<String, List> result){
        List<UserRole> userRoles = userRoleService.findAll();
        result.put("userRoles", userRoles);
        return "userrole";
    }

    @PostMapping("/adduserrole")
    public String save(UserRole userRole){
        userRoleService.save(userRole);
        return "redirect:/userrole.html";
    }

    @RequestMapping("/delete/userrole/{id}")
    public String delete(@PathVariable int id, HttpServletResponse servletResponse) throws IOException {
        userRoleService.delete(id);
        System.out.println("delete successful");
        return "redirect:/userrole.html";
    }

    @GetMapping("/updatePage/userrole/{id}")
    public String updatePage(Model model, @PathVariable int id){
        UserRole userRoles= userRoleService.get(id);
        model.addAttribute("userRoles",userRoles);
        return "modifieuserrole";
    }

    @PutMapping("/updateuserrole")
    public String updateUser(Model model, UserRole userRole, HttpServletRequest request){
        String id=request.getParameter("id");
        UserRole userRoleById = userRoleService.get(Integer.parseInt(id));
        userRoleService.update(userRole);
        System.out.println(userRole);
        return "redirect:/userrole.html";
    }
}
