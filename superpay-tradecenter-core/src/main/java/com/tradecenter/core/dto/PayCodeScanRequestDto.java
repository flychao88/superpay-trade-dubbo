package com.tradecenter.core.dto;

import com.tradecenter.core.dto.base.BasePayRequestDto;

/**
 * 项目名称：superpay-trade-dubbo
 * 类 名 称：PayCodeScanRequestDto
 * 类 描 述：刷卡支付--商家扫用户请求类
 * 创建时间：2019/10/11 09:35
 *
 * @author：wzs
 */
public class PayCodeScanRequestDto extends BasePayRequestDto {
    private static final long serialVersionUID = 3925844537121849588L;

    /**
     * 公账号ID(微信支付时使用)
     */
    private String subAppId;


    public String getSubAppId() {
        return subAppId;
    }

    public void setSubAppId(String subAppId) {
        this.subAppId = subAppId;
    }

}
