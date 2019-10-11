package com.tradecenter.core.constants;

import org.apache.commons.lang3.StringUtils;

/**
 * 项目名称：superpay-trade-dubbo
 * 类 名 称：LimitPayEnum
 * 类 描 述：限制支付方式枚举类
 * 创建时间：2019/10/11 16:52
 *
 * @author：wzs
 */
public enum LimitPayEnum {
    /**
     * 信用卡
     */
    CREDIT_CARD("CREDIT_CARD", "信用卡"),
    /**
     * 支付宝花呗
     */
    ALI_P_CREDIT("ALI_P_CREDIT", "支付宝花呗");


    private String key;
    private String value;

    public String getKey() {
        return this.key;
    }

    LimitPayEnum(String key, String value) {
        this.key = key;
        this.value = value;
    }

    /**
     * 当前key是否合法
     *
     * @param key
     * @return
     */
    public static boolean containsKey(String key) {
        for (LimitPayEnum attrKeyEnum : LimitPayEnum.values()) {
            if (StringUtils.equals(attrKeyEnum.getKey(), key)) {
                return true;
            }
        }
        return false;
    }
}