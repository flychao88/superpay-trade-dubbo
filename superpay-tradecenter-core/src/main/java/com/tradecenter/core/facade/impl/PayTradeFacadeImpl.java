package com.tradecenter.core.facade.impl;

import com.tradecenter.dto.PayRequestDto;
import com.tradecenter.dto.PayResponseDto;
import com.tradecenter.facade.PayTradeFacade;
import org.apache.dubbo.config.annotation.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Date:2019/6/14
 * Name:cc
 **/
@Service
public class PayTradeFacadeImpl implements PayTradeFacade {
    private static final Logger logger = LoggerFactory.getLogger(PayTradeFacadeImpl.class);


    @Override
    public PayResponseDto payRequest(PayRequestDto payRequestDto) {
        //处理负责的业务

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }

        PayResponseDto payResponseDto = new PayResponseDto();
        payResponseDto.setReturnCode("200");
        return payResponseDto;
    }

    @Override
    public PayResponseDto scanCardPay(PayRequestDto payRequestDto) {
        return null;
    }

    @Override
    public PayResponseDto codeScanPay(PayRequestDto reqDto) {
        return null;
    }
}
