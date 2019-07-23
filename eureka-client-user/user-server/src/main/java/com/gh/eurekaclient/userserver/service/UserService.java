package com.gh.eurekaclient.userserver.service;

import com.gh.eurekaclient.userserver.entity.User;

import java.util.List;

public interface UserService {

    /**
     * 获取所有用户
     */
    List<User> findAllUser();
}
