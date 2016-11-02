package com.family.service.impl;

import com.family.mapper.UserMapper;
import com.family.model.User;
import com.family.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * Created by maguodian on 16/10/31.
 */
@Service("userService")
public class IUserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;


    public User getUserById(int userId) {
        return this.userMapper.selectByPrimaryKey(userId);
    }
}
