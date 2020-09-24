package com.imooc.ad.serviceribbon.service.impl;

import com.imooc.ad.serviceribbon.service.RibbonService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @author ext.caisong
 * @date 2020-09-24 09:26
 */
@Service
public class RibbonServiceImpl implements RibbonService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "helloError")
    public String hello() {
        return restTemplate.getForObject("http://eureka-client/hello", String.class);
    }

    public String helloError() {
        return "断路器起作用返回固定值！";
    }
}
