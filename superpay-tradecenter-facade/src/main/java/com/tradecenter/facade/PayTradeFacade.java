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


    /************************资金类正交易*************************/
    /**
     * 刷卡支付--商家扫用户
     * @param payRequestDto
     * @return PayResponseDto
     */
    PayResponseDto scanCardPay(PayRequestDto payRequestDto);

    /**
     * 扫码支付--用户扫码
     * @param reqDto
     * @return
     */
    PayResponseDto codeScanPay(PayRequestDto reqDto);
}
