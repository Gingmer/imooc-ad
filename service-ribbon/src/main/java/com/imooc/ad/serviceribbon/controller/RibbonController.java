package com.imooc.ad.serviceribbon.controller;

import com.imooc.ad.serviceribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ext.caisong
 * @date 2020-09-24 09:26
 */
@RestController
public class RibbonController {

    @Autowired
    RibbonService ribbonService;

    @RequestMapping("/hello")
    public String hello(){
        return ribbonService.hello();
    }
}
