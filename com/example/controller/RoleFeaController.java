package com.example.controller;

import com.example.entity.RoleFea;
import com.example.service.RoleFeaService;
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
public class RoleFeaController {
    @Autowired
    private RoleFeaService roleFeaService;

    @GetMapping("/rolefea.html")
    public String userList(Map<String, List> result){
        List<RoleFea> roleFeas = roleFeaService.findAll();
        result.put("roleFeas", roleFeas);
        return "rolefea";
    }

    @PostMapping("/addrolefea")
    public String save(RoleFea roleFea){
        roleFeaService.save(roleFea);
        return "redirect:/rolefea.html";
    }

    @RequestMapping("/delete/rolefea/{id}")
    public String delete(@PathVariable int id, HttpServletResponse servletResponse) throws IOException {
        roleFeaService.delete(id);
        System.out.println("delete successful");
        return "redirect:/rolefea.html";
    }

    @GetMapping("/updatePage/rolefea/{id}")
    public String updatePage(Model model, @PathVariable int id){
        RoleFea roleFeas= roleFeaService.get(id);
        model.addAttribute("roleFeas",roleFeas);
        return "modifierolefea";
    }

    @PutMapping("/updaterolefea")
    public String updateUser(Model model, RoleFea roleFea, HttpServletRequest request){
        String id=request.getParameter("id");
        RoleFea roleFeaById = roleFeaService.get(Integer.parseInt(id));
        roleFeaService.update(roleFea);
        System.out.println(roleFea);
        return "redirect:/rolefea.html";
    }
}
