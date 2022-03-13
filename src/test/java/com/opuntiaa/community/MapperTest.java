package com.opuntiaa.community;

import com.opuntiaa.community.dao.UserMapper;
import com.opuntiaa.community.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ContextConfiguration(classes =  OpuntiaaApplication.class)
public class MapperTest {
    @Autowired
    private UserMapper userMapper;

    @Test
    public void testSelectUser(){
        User user = userMapper.selectById(10);
        System.out.println(user);
    }
}
