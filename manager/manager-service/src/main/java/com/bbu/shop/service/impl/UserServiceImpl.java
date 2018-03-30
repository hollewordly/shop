package com.bbu.shop.service.impl;

import com.bbu.shop.dao.UserMapper;
import com.bbu.shop.pojo.po.User;
import com.bbu.shop.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    //查找用户（登陆）
    @Override
    public User findUser(User user) {
        return userMapper.findUser(user);
    }
}
