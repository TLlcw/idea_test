package com.mh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

@Controller
public class hello {
    @RequestMapping("hello")
    @ResponseBody
    public Map<String,Object> hello(){
        System.out.println("出错误了1");
        Map<String,Object> map=new HashMap<>();
        map.put("hello","hello");
        System.out.println("出错误了2");
        return map;
    }
    @RequestMapping("hello1")
    public String hello1(Model model){
        model.addAttribute("msg","hello1");
        return "hello1";

    }
}
