package com.qiao.config;

import com.alibaba.dubbo.config.*;
import com.qiao.service.InstanceStatsService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class MyDubboConfig {

    @Bean
    public ApplicationConfig applicationConfig() {
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName("consumer");
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://127.0.0.1:2181");
        return registryConfig;
    }

    @Bean
    public ProtocolConfig protocolConfig() {
        ProtocolConfig protocolConfig = new ProtocolConfig();
        protocolConfig.setName("dubbo");
        protocolConfig.setPort(20880);
        return protocolConfig;
    }

    @Bean
    public ServiceConfig serviceConfig(InstanceStatsService instanceStatsService) {
        ServiceConfig serviceConfig = new ServiceConfig();
        serviceConfig.setInterface(InstanceStatsService.class);
        serviceConfig.setRef(instanceStatsService);
        MethodConfig methodConfig = new MethodConfig();
        methodConfig.setName("listAllStatus");
        methodConfig.setTimeout(5000);
        serviceConfig.setMethods(Arrays.asList(methodConfig));

        return serviceConfig;
    }

}
