package com.bbu.shop.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class ManagerIndexAction {
@RequestMapping(value = "/{page}",method = RequestMethod.GET)
    public String forwordOne(@PathVariable String page){
        return page;
    }


    @RequestMapping(value = "/pages/{pageName}",method = RequestMethod.GET)
    public String forwordTwo(@PathVariable String pageName){
        return "pages/"+pageName;
    }

    @RequestMapping(value = "/pages/{pageName1}/{pageName2}",method = RequestMethod.GET)
    public String forwordThree(@PathVariable String pageName1,@PathVariable String pageName2)
    {
        return "pages/"+pageName1+"/"+pageName2;
    }
}
