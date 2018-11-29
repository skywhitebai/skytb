package com.sky.skytb.common.enums;

/**
 * 返回枚举类型
 *
 * @author sky
 * @date 2018/11/29
 */
public enum ResponseEnum implements IBaseEnum {
    SUCCESS("200", "操作成功"),
    FAIL("99", "操作失败");

    private ResponseEnum(String code, String label) {
        this.code = code;
        this.label = label;
    }

    private String code;

    private String label;

    @Override
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
