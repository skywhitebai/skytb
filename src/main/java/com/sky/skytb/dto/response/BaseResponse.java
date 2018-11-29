package com.sky.skytb.dto.response;

import com.sky.skytb.common.enums.IBaseEnum;
import com.sky.skytb.common.enums.ResponseEnum;

import java.io.Serializable;

/**
 * 返回类
 *
 * @author sky
 * @date 2018/11/29
 */
public class BaseResponse<T> implements Serializable {
    private static final long serialVersionUID = 0;
    /**
     * 200表示成功，其他自定义编码
     */
    private String code;

    /**
     * 信息
     */
    private String message;

    /**
     * 响应其他数据
     */
    private T data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static BaseResponse success() {
        return baseEnum(ResponseEnum.SUCCESS);
    }
    public static BaseResponse successData(Object data) {
        return baseEnum(ResponseEnum.SUCCESS,data);
    }
    public static BaseResponse successMessage(String message) {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setCode(ResponseEnum.SUCCESS.getCode());
        baseResponse.setMessage(message);
        return baseResponse;
    }
    public static BaseResponse success(String message, Object data) {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setCode(ResponseEnum.SUCCESS.getCode());
        baseResponse.setMessage(message);
        baseResponse.setData(data);
        return baseResponse;
    }
    public static BaseResponse fail() {
        return baseEnum(ResponseEnum.FAIL);
    }

    public static BaseResponse failMessage(String message) {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setCode(ResponseEnum.FAIL.getCode());
        baseResponse.setMessage(message);
        return baseResponse;
    }

    public static BaseResponse fail(String code, String message) {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setCode(code);
        baseResponse.setMessage(message);
        return baseResponse;
    }
    public static BaseResponse baseEnum(IBaseEnum baseEnum) {

        return baseEnum(ResponseEnum.SUCCESS,null);
    }
    public static BaseResponse baseEnum(IBaseEnum baseEnum,Object data) {
        BaseResponse baseResponse = new BaseResponse();
        baseResponse.setCode(baseEnum.getCode());
        baseResponse.setMessage(baseEnum.getLabel());
        baseResponse.setData(data);
        return baseResponse;
    }
    public Boolean isSucceed(){
        return ResponseEnum.SUCCESS.getCode().equals(this.code);
    }
}
