package com.example.controller;

import com.example.common.Result;
import com.example.entity.User;
import com.example.mapper.UserMapper1;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
@RestController
@RequestMapping("/authority")
public class SelectController {
    @Resource
    private UserMapper1 userMapper1;

    @PostMapping("/add")
    public Result<User> add(@RequestBody User user) {
        if (!checkParam(user)) {
            return Result.error("-1", "缺少必要参数");
        }
        User dbUser = userMapper1.selectByAdd(user);
        if (dbUser == null) {
            return Result.error("-1", "账号或密码错误");
        }
        return Result.success(dbUser);
    }
    private boolean checkParam(User user) {
        return user.getName() != null && user.getPassword() != null;
    }
}
