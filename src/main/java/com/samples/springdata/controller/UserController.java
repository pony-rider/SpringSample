package com.samples.springdata.controller;

import com.samples.springdata.entity.User;
import com.samples.springdata.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;


    @ResponseBody
    @RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<User> getUsers() {
        return userService.getAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/update", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String testPost(@RequestParam("name") String name) {
        return name;
    }
}
