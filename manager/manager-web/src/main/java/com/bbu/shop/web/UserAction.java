package com.bbu.shop.web;

import com.bbu.shop.pojo.po.User;
import com.bbu.shop.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class UserAction {
    @Autowired
    private IUserService userService;

    @RequestMapping(value="/tologin",produces="plain/text;charset=UTF-8",method = RequestMethod.POST)
    @ResponseBody
    public String login(User user, HttpSession session){
        System.out.print(user);
       User findUser = userService.findUser(user);
       if(findUser!=null){
           session.setAttribute("findUser", findUser);
          return "1";
       }else{
           return "0";
       }
    }


}
