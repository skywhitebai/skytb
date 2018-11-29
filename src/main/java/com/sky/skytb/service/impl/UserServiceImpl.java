package com.sky.skytb.service.impl;

import com.sky.skytb.dao.UUserMapper;
import com.sky.skytb.model.UUser;
import com.sky.skytb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UUserMapper userMapper;

    @Override
    public UUser getUser(Long userId) {
        if(userId==null){
            return null;
        }
        return userMapper.selectByPrimaryKey(userId);
    }
}
