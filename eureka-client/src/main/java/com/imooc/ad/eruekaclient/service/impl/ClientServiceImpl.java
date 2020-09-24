package com.imooc.ad.eruekaclient.service.impl;

import com.imooc.ad.eruekaclient.service.ClientService;
import org.springframework.stereotype.Service;

@Service
public class ClientServiceImpl implements ClientService {

    @Override
    public String hello() {
        return "调用client success";
    }
}
