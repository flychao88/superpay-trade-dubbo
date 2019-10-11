package com.tradecenter.core.dto;

import com.tradecenter.core.dto.base.BasePayRequestDto;

/**
 * 项目名称：superpay-trade-dubbo
 * 类 名 称：PayScanCardRequestDto
 * 类 描 述：扫码支付--用户扫码请求类
 * 创建时间：2019/10/11 09:34
 *
 * @author：wzs
 */
public class PayScanCardRequestDto extends BasePayRequestDto {
    private static final long serialVersionUID = 6591858749523484347L;

    /**
     * 公账号ID(微信支付时使用)
     */
    private String subAppId;

    /**
     * 授权码(设备读取用户微信中的条码或者二维码)
     */
    private String authCode;

    public String getSubAppId() {
        return subAppId;
    }

    public void setSubAppId(String subAppId) {
        this.subAppId = subAppId;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }
}
