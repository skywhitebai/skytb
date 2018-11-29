package com.sky.skytb.service.impl;

import com.sky.skytb.common.constants.UserConstant;
import com.sky.skytb.dao.UUserMapper;
import com.sky.skytb.dto.response.BaseResponse;
import com.sky.skytb.model.UUser;
import com.sky.skytb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UUserMapper userMapper;

    @Override
    public BaseResponse<UUser> getUser(Long userId) {
        if(userId==null){
            return BaseResponse.failMessage(UserConstant.USER_ID_EPMTY);
        }
        UUser user=userMapper.selectByPrimaryKey(userId);
        if(user==null){
            return BaseResponse.failMessage(UserConstant.USER_ID_NOT_EXIST);
        }
        return BaseResponse.successData(user);
    }
}
