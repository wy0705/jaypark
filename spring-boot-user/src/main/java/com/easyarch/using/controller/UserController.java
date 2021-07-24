package com.easyarch.using.controller;

import com.easyarch.using.entity.User1;
import com.easyarch.using.service.User1ServiceImpl;
import com.easyarch.using.support.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

    @Autowired
    private User1ServiceImpl user1Service;

    @RequestMapping(value="logon",method = RequestMethod.POST)
    @ResponseBody
    public String logon(@RequestBody User1 user){
        int count = user1Service.insertUser1(user);
        if (count != 0) {
            return "添加成功";
        }
        return "不能添加该用户";

    }

    @RequestMapping(value = "login",method = RequestMethod.POST)
    @ResponseBody
    public String login(String phone,String password){
        User1 user1=user1Service.findByphoneAndpassword(phone,password);
        if (user1==null||user1.getPhone()==null){
            return "用户不存在或用户名、密码错误";
        }
        String sign = JWTUtil.sign(user1, 60L * 1000L * 30L);
        return "hello" + user1.getPhone() + "token:" + sign;
    }

    @RequestMapping(value = "find_add", method = RequestMethod.GET)
    @ResponseBody
    public String registry(@RequestParam String phone) {
        /*User userByName = userService.findUserByName(username);
        if (userByName != null) {
            return userByName.getName();
        }
        return "未找到该用户";*/
        User1 user1=user1Service.findByPhone(phone);
        if (phone!=null){
            return user1.getPhone();
        }
        return "未找到该用户";
    }

}
