package com.qiao;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Hello world!
 *
 */
@ImportResource(locations = "classpath:provider.xml")
@SpringBootApplication
public class ProviderApp
{
    public static void main(String[] args) throws Exception {
        SpringApplication.run(ProviderApp.class);
    }

}
