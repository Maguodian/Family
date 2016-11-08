package com.family.service;

import com.family.mapper.UserMapper;
import com.family.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by maguodian on 16/10/31.
 */
@Service("userService")
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserById(int userId) {
        return this.userMapper.selectByPrimaryKey(userId);
    }
}
