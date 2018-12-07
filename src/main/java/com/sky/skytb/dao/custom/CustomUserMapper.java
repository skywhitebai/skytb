package com.sky.skytb.dao.custom;

import com.sky.skytb.dao.UUserMapper;
import com.sky.skytb.model.UUser;

/**
 * 用户管理
 *
 * @author sky
 * @date 2018/12/03
 */
public interface CustomUserMapper extends UUserMapper {

    UUser selectByUserName(String userName);
}
