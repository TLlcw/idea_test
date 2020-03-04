package com.mh.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;


@ControllerAdvice
public class MyException {
    @ResponseBody
    @ExceptionHandler(value = java.lang.Exception.class)
    public Map<String,Object> myException(Exception e){
        Map<String,Object> map=new HashMap<String, Object>();
        map.put("出错误",e.getMessage());
        return map;
    }
}
