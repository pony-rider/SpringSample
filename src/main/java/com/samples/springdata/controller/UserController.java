package com.samples.springdata.controller;

import com.samples.springdata.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    @Autowired
    UserService svc;

    @RequestMapping("/")
    @ResponseBody
    public String test() {
        return svc.findUserById(1).getName();
    }
}