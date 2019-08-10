package com.qiao.service;

import com.qiao.domain.InstanceStats;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@com.alibaba.dubbo.config.annotation.Service
@Component
public class InstanceStatsServiceImpl implements InstanceStatsService {
    @Override
    public List<InstanceStats> listAllStatus() {
        System.out.println("listAllStatus");
        InstanceStats stats0 = new InstanceStats(1, "QX_954", "http://localhost:8080", "Stopped", "Accessible", "127.0.0.1");
        InstanceStats stats1 = new InstanceStats(2, "QX_955", "http://localhost:8082", "Stopped", "Accessible", "127.0.0.1");
        InstanceStats stats2 = new InstanceStats(3, "QX_956", "http://localhost:8085", "Running", "Accessible", "127.0.0.1");
        List<InstanceStats> instanceStatsList = new ArrayList<>();
        instanceStatsList.add(stats0);
        instanceStatsList.add(stats1);
        instanceStatsList.add(stats2);
        System.out.println(instanceStatsList);
        return instanceStatsList;
    }
}
