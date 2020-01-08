package com.bjsxt.springbootjunit.dao;

import org.springframework.stereotype.Repository;

/**
 * @author hanyueqian
 * @date 2020/1/8 0008-下午 22:07
 */
@Repository
public class UserDaoImpl
{
    public void insert(){
        System.out.println("insert into user values .........");
    }
}
