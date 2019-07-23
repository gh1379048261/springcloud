package com.gh.eurekaclient.userserver.controller;

import com.gh.eurekaclient.userserver.common.ResponseData;
import com.gh.eurekaclient.userserver.common.ResponseDataUtil;
import com.gh.eurekaclient.userserver.entity.User;
import com.gh.eurekaclient.userserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user")
    public ResponseData<List<User>> getAllUser(){
        return ResponseDataUtil.ok(userService.findAllUser());
    }
}
