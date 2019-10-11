package com.tradecenter.core.constants;

import org.apache.commons.lang3.StringUtils;

/**
 * 项目名称：superpay-trade-dubbo
 * 类 名 称：FeePayTypeEnum
 * 类 描 述：手续费计算类型
 * 创建时间：2019/10/11 13:58
 *
 * @author：wzs
 */
public enum FeePayTypeEnum {

    /**
     * 服务商入账
     */
    AGENT_ACCOUNT("AGENT_ACCOUNT","服务商入账"),

    /**
     * 无需入账
     */
    NO_ACCOUNT("NO_ACCOUNT","无需入账"),

    /**
     * 平台入账
     */
    NORMAL_ACCOUNT("NORMAL_ACCOUNT","平台入账");

    private String key;
    private String value;

    public String getKey() {
        return this.key;
    }

    FeePayTypeEnum(String key, String value) {
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
        for (FeePayTypeEnum attrKeyEnum : FeePayTypeEnum.values()) {
            if (StringUtils.equals(attrKeyEnum.getKey(), key)) {
                return true;
            }
        }
        return false;
    }
}
