package com.samples.springdata.controller;

import com.samples.springdata.entity.User;
import com.samples.springdata.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Stream;

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

    @RequestMapping(method = RequestMethod.POST, value = "/post", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String postWithBody(@RequestBody String requestBody) {
        return requestBody;
    }
}
