package com.bbu.shop.search.web;

import com.bbu.shop.search.service.SearchIndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SearchIndexAction {
      @Autowired
    private SearchIndexService service;
      @RequestMapping(value = "/index",method = RequestMethod.GET)
      public String index(){
          return "index";
      }
      @RequestMapping(value = "/search",method = RequestMethod.GET)
    public String search(String keyword, @RequestParam(defaultValue = "1") Integer pageIndex, Model model){
          System.out.println(keyword);
          //pageIndex当前得页码
          //pageSize当前的
          return "";
      }
}
