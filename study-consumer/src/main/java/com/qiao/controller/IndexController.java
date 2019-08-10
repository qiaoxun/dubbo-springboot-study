package com.qiao.controller;

import com.qiao.domain.InstanceStats;
import com.qiao.service.ConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/index")
public class IndexController {

    @Autowired
    private ConsumerService consumerService;

    @RequestMapping("/listStats")
    public List<InstanceStats> listStats() {
        return consumerService.listAllStats();
    }

}
