package com.imooc.ad.feign.service;

import com.imooc.ad.feign.hystirx.FeginHystirx;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "eureka-client",fallback = FeginHystirx.class)
public interface FeginService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello();
}
