package com.test.renyuan.service;

import com.test.renyuan.entity.User;
import com.test.renyuan.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;


    public List<User> findAll() {
        return userMapper.findAll();
    }


    public List<User> find() {
        return userMapper.find();
    }


    public boolean insert(User user) {
        return userMapper.insert(user);
    }


    public Integer delete(Integer userid) {
        return userMapper.delete(userid);
    }


    public boolean  edit(User user) {
        return userMapper.edit(user);
    }


    public User selectOneUser(User user) {
        return userMapper.selectOneUser(user);
    }
}
