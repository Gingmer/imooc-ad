package com.imooc.ad.feign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eureka-client")
public interface FeginService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello();
}
