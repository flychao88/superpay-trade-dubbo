package com.tradecenter.core.constants;

import org.apache.commons.lang3.StringUtils;

/**
 * 项目名称：superpay-trade-dubbo
 * 类 名 称：CurrencyEnum
 * 类 描 述：币种枚举类
 * 创建时间：2019/10/11 10:59
 *
 * @author：wzs
 */
public enum CurrencyEnum {
    /**
     * 人民币
     */
    CNY("CNY", "人民币"),
    /**
     * 支付宝
     */
    USD("ALIPAY", "支付宝"),
    /**
     * 银联云闪付
     */
    UNIONPAY("UNIONPAY","银联云闪付");


    private String key;
    private String value;

    public String getKey() {
        return this.key;
    }

    CurrencyEnum(String key, String value) {
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
        for (CurrencyEnum attrKeyEnum : CurrencyEnum.values()) {
            if (StringUtils.equals(attrKeyEnum.getKey(), key)) {
                return true;
            }
        }
        return false;
    }
}

