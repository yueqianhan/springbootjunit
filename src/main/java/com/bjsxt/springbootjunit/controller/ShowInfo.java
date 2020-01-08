package com.bjsxt.springbootjunit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author hanyueqian
 * @date 2020/1/7 0007-下午 21:20
 */
@Controller
public class ShowInfo
{
    @GetMapping("/showInfo")
    public String showInfo()
    {
        String string = null;
        string.length();
        return "ok";
    }

    @GetMapping("/showInfo2")
    public String showInfo2()
    {
        int a=10/0;
        return "ok";
    }


}
