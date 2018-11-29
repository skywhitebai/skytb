package com.sky.skytb.service;

import com.sky.skytb.dto.response.BaseResponse;
import com.sky.skytb.model.UUser;

public interface UserService {
    BaseResponse<UUser> getUser(Long userId);
}
