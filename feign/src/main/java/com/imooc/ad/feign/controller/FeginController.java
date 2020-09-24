package com.imooc.ad.feign.controller;

import com.imooc.ad.feign.service.FeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeginController {

    @Autowired
    FeginService feginService;

    @RequestMapping("hello")
    public String hello() {
        return feginService.hello();
    }
}
