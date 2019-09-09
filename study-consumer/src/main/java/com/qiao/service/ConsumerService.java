package com.qiao.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.qiao.domain.InstanceStats;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsumerService {

    @Reference(loadbalance="random")
    private InstanceStatsService instanceStatsService;

    public List<InstanceStats> listAllStats() {
        System.out.println("instanceStatsService " + instanceStatsService);
        List<InstanceStats> instanceStatsList = instanceStatsService.listAllStatus("192.168.0.1", "QX_942");
        for (InstanceStats stats : instanceStatsList) {
            System.out.println(stats.getId());
        }
        return instanceStatsList;
    }
}
