package com.qiao;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */

@EnableDubbo
@SpringBootApplication
public class ConsumerApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(ConsumerApp.class);
    }
}
