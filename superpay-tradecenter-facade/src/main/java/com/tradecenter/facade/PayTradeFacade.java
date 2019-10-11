package com.tradecenter.facade;

import com.tradecenter.dto.PayRequestDto;
import com.tradecenter.dto.PayResponseDto;

/**
 * Date:2019/6/14
 *
 * @author:cc
 **/
public interface PayTradeFacade {

    /**
     * 支付请求
     * @param payRequestDto
     * @return
     */
    public PayResponseDto payRequest(PayRequestDto payRequestDto);


}
