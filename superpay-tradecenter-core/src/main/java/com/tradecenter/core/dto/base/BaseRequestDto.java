package com.tradecenter.core.dto.base;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

/**
 * 项目名称：superpay-trade-dubbo
 * 类 名 称：BaseRequestDto
 * 类 描 述：基础底层请求类
 * 创建时间：2019/10/11 09:38
 *
 * @author：wzs
 */
public class BaseRequestDto implements Serializable {
    private static final long serialVersionUID = 3633927782998408564L;
    /**
     * 流程ID
     */
    private String traceId;

    /**
     * 服务商编号(请求发起方系统里分配的唯一编号)
     */
    private String spMerchantNo;

    /**
     * 版本号
     */
    private String version;

    public String getTraceId() {
        return traceId;
    }

    public void setTraceId(String traceId) {
        this.traceId = traceId;
    }

    public String getSpMerchantNo() {
        return spMerchantNo;
    }

    public void setSpMerchantNo(String spMerchantNo) {
        this.spMerchantNo = spMerchantNo;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }

}
