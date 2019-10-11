package com.tradecenter.core.dto.base;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 项目名称：superpay-trade-dubbo
 * 类 名 称：BasePayRequestDto
 * 类 描 述：基础支付请求类
 * 创建时间：2019/10/11 17:08
 *
 * @author：wzs
 */
public class BasePayRequestDto extends BaseRequestDto{

    private static final long serialVersionUID = 3847858151075201428L;

    /**
     * 商户编号(交易参与方，必须不能和请求接口的服务商编号一样)
     */
    private String merchantNo;

    /**
     * 商户请求订单号(和上面的商户号组成唯一)
     */
    private String merchantOrderNo;

    /**
     * 商户请求的时间
     */
    private Date merchantReqTime;

    /**
     * 支付方式
     * {@link com.tradecenter.core.constants.PayMethodEnum}
     */
    private String payMethod;

    /**
     * 支付使用货币类型(CNY)
     * {@link com.tradecenter.core.constants.CurrencyEnum}
     */
    private String currency;

    /**
     * 订单金额(单位:元)
     */
    private BigDecimal orderAmount;

    /**
     * 入账模式
     * {@link com.tradecenter.core.constants.FeePayTypeEnum}
     */
    private String feePayType;

    /**
     * 终端的请求IP
     */
    private String clientIp;

    /**
     * 微信或者支付宝订单展示信息
     */
    private String subject;

    /**
     * 订单有效时间单位为分钟
     */
    private Integer validTime;
    /**
     * 后台通知回调地址
     */
    private String callbackUrl;

    /**
     * 备注
     */
    private String description;

    /**
     * 订单详情
     */
    private String goodsDetail;

    /**
     * 订单的优惠标记
     */
    private String goodsTag;

    /**
     * 限制支付通道
     *
     * {@link com.tradecenter.core.constants.LimitPayEnum}
     */
    private String limitPay;

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getMerchantOrderNo() {
        return merchantOrderNo;
    }

    public void setMerchantOrderNo(String merchantOrderNo) {
        this.merchantOrderNo = merchantOrderNo;
    }

    public Date getMerchantReqTime() {
        return merchantReqTime;
    }

    public void setMerchantReqTime(Date merchantReqTime) {
        this.merchantReqTime = merchantReqTime;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(BigDecimal orderAmount) {
        this.orderAmount = orderAmount;
    }

    public String getFeePayType() {
        return feePayType;
    }

    public void setFeePayType(String feePayType) {
        this.feePayType = feePayType;
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Integer getValidTime() {
        return validTime;
    }

    public void setValidTime(Integer validTime) {
        this.validTime = validTime;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGoodsDetail() {
        return goodsDetail;
    }

    public void setGoodsDetail(String goodsDetail) {
        this.goodsDetail = goodsDetail;
    }

    public String getGoodsTag() {
        return goodsTag;
    }

    public void setGoodsTag(String goodsTag) {
        this.goodsTag = goodsTag;
    }

    public String getLimitPay() {
        return limitPay;
    }

    public void setLimitPay(String limitPay) {
        this.limitPay = limitPay;
    }
}
