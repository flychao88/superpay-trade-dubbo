package com.tradecenter.core.dto.base;

import java.io.Serializable;

/**
 * 项目名称：superpay-trade-dubbo
 * 类 名 称：BaseResponseDto
 * 类 描 述：基础响应对象
 * 创建时间：2019/10/11 17:30
 *
 * @author：wzs
 */
public class BaseResponseDto implements Serializable {
    private static final long serialVersionUID = -2366298166224257930L;

    /**
     * 响应码
     */
    public String returnCode;

    /**
     * 响应信息
     */
    public String returnMsg;
}
