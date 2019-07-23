package com.gh.eurekaclient.userserver.service.impl;

import com.gh.eurekaclient.userserver.dao.UserRepository;
import com.gh.eurekaclient.userserver.entity.User;
import com.gh.eurekaclient.userserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public List<User> findAllUser() {
        List<User> all = userRepository.findAll();
        System.out.println(all.size());
        return all;
    }
}
