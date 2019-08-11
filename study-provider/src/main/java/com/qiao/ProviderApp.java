package com.qiao;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@EnableDubbo(scanBasePackages = "com.qiao.service")
@SpringBootApplication
public class ProviderApp
{
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ProviderApp.class);
    }

}
