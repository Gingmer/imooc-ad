package com.imooc.ad.feign.hystirx;

import com.imooc.ad.feign.service.FeginService;
import org.springframework.stereotype.Component;

@Component
public class FeginHystirx implements FeginService {
    @Override
    public String hello() {
        return "feginHystirx 断路器起作用了！";
    }
}
