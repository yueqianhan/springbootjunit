package com.bjsxt.springbootjunit.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author hanyueqian
 * @date 2020/1/7 0007-下午 22:16
 */
//@ControllerAdvice
public class GlobalException
{
    /*@ExceptionHandler(value = {java.lang.NullPointerException.class})
    public ModelAndView nullPointerExceptionHandler(Exception e)
    {
        ModelAndView modelAndView =new ModelAndView();
        modelAndView.addObject("err", e.toString());
        modelAndView.setViewName("error1");
        return modelAndView;
    }

    @ExceptionHandler(value = {java.lang.ArithmeticException.class})
    public ModelAndView arithmeticExceptionHandler(Exception e)
    {
        ModelAndView modelAndView =new ModelAndView();
        modelAndView.addObject("err", e.toString());
        modelAndView.setViewName("error2");
        return modelAndView;
    }*/
}
