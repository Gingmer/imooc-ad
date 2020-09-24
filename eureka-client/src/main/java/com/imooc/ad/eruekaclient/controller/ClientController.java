package com.imooc.ad.eruekaclient.controller;

import com.imooc.ad.eruekaclient.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    ClientService clientService;

    @RequestMapping("/hello")
    public String hello(){
        return clientService.hello();
    }
}
