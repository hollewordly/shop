package com.bbu.shop.service;

import com.bbu.shop.pojo.po.User;

public interface IUserService {
    //查找用户（登陆）
    User findUser(User user);
}
