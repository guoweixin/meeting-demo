package com.qfjy;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.qfjy.mapper"})
@EnableDubbo  //启动Dubbo注解
public class MeetingUserApplication {

    public static void main(String[] args) {
        SpringApplication.run(MeetingUserApplication.class, args);
    }

}
