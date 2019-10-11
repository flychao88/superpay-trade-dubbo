package com.tradecenter;

import com.tradecenter.core.biz.PayGatewayBiz;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author cc
 * @createTime 2019-07-06 22:46
 * @description
 **/
@EnableDubboConfig
@DubboComponentScan("com.tradecenter.core.facade.impl")
@SpringBootApplication
public class ApplicationServer {
    public static void main(String[] args) {
        PayGatewayBiz payGatewayBiz = (PayGatewayBiz)SpringApplication.run(ApplicationServer.class, args).getBean("payGatewayBiz");
        payGatewayBiz.payRequest(null);
    }
}
