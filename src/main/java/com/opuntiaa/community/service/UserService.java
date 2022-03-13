package com.opuntiaa.community.service;

import com.opuntiaa.community.dao.UserMapper;
import com.opuntiaa.community.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;
    public User findUserById(int id){
        return userMapper.selectById(id);
    }
}
