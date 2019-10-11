package com.tradecenter.core.constants;

import org.apache.commons.lang3.StringUtils;

/**
 * 项目名称：superpay-trade-dubbo
 * 类 名 称：PayMethodEnum
 * 类 描 述：支付类型
 * 创建时间：2019/10/11 10:13
 *
 * @author：wzs
 */
public enum PayMethodEnum {
    /**
     * 微信
     */
    WEIXINPAY("WEIXINPAY", "微信"),
    /**
     * 支付宝
     */
    ALIPAY("ALIPAY", "支付宝"),
    /**
     * 银联云闪付
     */
    UNIONPAY("UNIONPAY","银联云闪付");


    private String key;
    private String value;

    public String getKey() {
        return this.key;
    }

    PayMethodEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * 当前key是否合法
     *
     * @param key
     * @return
     */
    public static boolean containsKey (String key) {
        for (PayMethodEnum attrKeyEnum : PayMethodEnum.values()) {
            if (StringUtils.equals(attrKeyEnum.getKey(), key)) {
                return true;
            }
        }
        return false;
    }
}
