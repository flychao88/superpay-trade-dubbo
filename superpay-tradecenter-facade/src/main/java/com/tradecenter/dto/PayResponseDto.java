package com.tradecenter.dto;

/**
 * Date:2019/6/14
 * Name:cc
 **/
public class PayResponseDto {
    private static final long serialVersionUID = -723763178242138577L;

    //返回码
    private String returnCode;
    //错误描述
    private String errorDesc;

    public String getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
    }

    @Override
    public String toString() {
        return "PayResponseDto{" +
                "returnCode='" + returnCode + '\'' +
                ", errorDesc='" + errorDesc + '\'' +
                '}';
    }
}
