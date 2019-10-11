package com.tradecenter.core.biz.impl;

import com.tradecenter.core.biz.PayGatewayBiz;
import com.tradecenter.dto.PayRequestDto;
import com.tradecenter.dto.PayResponseDto;
import com.tradecenter.facade.PayTradeFacade;
import org.apache.dubbo.config.annotation.Reference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


/**
 * Date:2019/6/14
 *
 * @author:cc
 **/

@Service("payGatewayBiz")
public class PayGatewayBizImpl implements PayGatewayBiz {
    private static final Logger logger = LoggerFactory.getLogger(PayGatewayBizImpl.class);


    @Reference
    private PayTradeFacade payTradeFacade;

    @Override
    public void payRequest(PayRequestDto payRequestDto) {
        try {
            PayResponseDto payResponseDto = payTradeFacade.payRequest(payRequestDto);
            logger.info("打印Dubbo返回响应编码:" + payResponseDto.getReturnCode());
        } catch (Exception e) {
            logger.error("请求交易出错! payRequestDto:" + payRequestDto, e);
        }


    }
}

