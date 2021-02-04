package com.rick.bootdemo.dao.user;

import com.rick.bootdemo.domain.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    void insertUser(User user);
    List<User> queryAll();
}
