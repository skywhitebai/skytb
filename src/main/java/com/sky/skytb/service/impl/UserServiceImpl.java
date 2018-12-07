package com.sky.skytb.service.impl;

import com.sky.skytb.common.constants.UserConstant;
import com.sky.skytb.dao.custom.CustomUserMapper;
import com.sky.skytb.dto.response.BaseResponse;
import com.sky.skytb.model.UUser;
import com.sky.skytb.model.UUserExample;
import com.sky.skytb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    CustomUserMapper customUserMapper;

    @Override
    public BaseResponse<UUser> getUser(Long userId) {
        if(userId==null){
            return BaseResponse.failMessage(UserConstant.USER_ID_EPMTY);
        }
        UUser user=customUserMapper.selectByPrimaryKey(userId);
        if(user==null){
            return BaseResponse.failMessage(UserConstant.USER_ID_NOT_EXIST);
        }
        return BaseResponse.successData(user);
    }

    @Override
    public BaseResponse<UUser> getUserByUserName(String userName) {
        if(StringUtils.isEmpty(userName)){
            return BaseResponse.failMessage(UserConstant.USER_NAME_EPMTY);
        }
        UUser user=customUserMapper.selectByUserName(userName);
        if(user==null){
            return BaseResponse.failMessage(UserConstant.USER_NAME_NOT_EXIST);
        }
        return BaseResponse.successData(user);
    }
}
