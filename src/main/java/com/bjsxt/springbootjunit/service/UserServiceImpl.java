package com.bjsxt.springbootjunit.service;

import com.bjsxt.springbootjunit.dao.UserDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author hanyueqian
 * @date 2020/1/8 0008-下午 22:09
 */
@Service
public class UserServiceImpl
{
    @Autowired
    private UserDaoImpl userDao;

    public void addUser()
    {
        userDao.insert();
    }
}
