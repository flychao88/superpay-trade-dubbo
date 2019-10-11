package com.tradecenter.core.biz;

import com.tradecenter.dto.PayRequestDto;

/**
 * Date:2019/6/14
 *
 * @author:cc
 **/
public interface PayGatewayBiz {

    public void payRequest(PayRequestDto payRequestDto) ;
}
