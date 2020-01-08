package com.bjsxt.springbootjunit;

import com.bjsxt.springbootjunit.service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootjunitApplicationTests
{
    @Autowired
    private UserServiceImpl userService;
    @Test
    void contextLoads()
    {
        userService.addUser();
    }

}
