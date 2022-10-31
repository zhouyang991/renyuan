package com.test.renyuan.mapper;

import com.test.renyuan.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> findAll();//查询全部
    List<User>find();
    public boolean insert(User user);
    public Integer delete(Integer userid);
    public boolean edit(User user);

    //@Select(value = "select * from user where name=#{name} and password = #{password}")

    User selectOneUser (User user);






}
