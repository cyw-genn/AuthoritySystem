package com.example.controller;

import com.example.entity.Function;
import com.example.service.FunctionService;
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
public class FunctionController {
    @Autowired
    private FunctionService functionService;

    @GetMapping("/function.html")
    public String userList(Map<String, List> result){
        List<Function> Functions = functionService.findAll();
        result.put("functions", Functions);
        return "function";
    }

    @PostMapping("/addfunc")
    public String save(Function function){
        functionService.save(function);
        return "redirect:/function.html";
    }

    @RequestMapping("/delete/function/{id}")
    public String delete(@PathVariable Integer id, HttpServletResponse servletResponse) throws IOException {
        functionService.delete(id);
        System.out.println("delete successful");
        return "redirect:/function.html";
    }

    @GetMapping("/updatePage/function/{id}")
    public String updatePage(Model model, @PathVariable int id){
        Function functions= functionService.get(id);
        model.addAttribute("functions",functions);
        return "modifiefunc";
    }

    @PutMapping("/updatefunc")
    public String updateUser(Model model, Function function, HttpServletRequest request){
        String id=request.getParameter("id");
        Function funcById = functionService.get(Integer.parseInt(id));
        functionService.update(function);
        System.out.println(function);
        return "redirect:/function.html";
    }
}
