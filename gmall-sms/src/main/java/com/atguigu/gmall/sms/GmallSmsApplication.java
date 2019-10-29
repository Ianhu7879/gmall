package com.atguigu.gmall.sms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication //springboot启动
@EnableSwagger2  //开启swagger的功能
@MapperScan(basePackages = "com.atguigu.gmall.sms.dao") //扫描所有的mapper/dao接口
@RefreshScope //加载nacos配置中心
public class GmallSmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallSmsApplication.class, args);
    }

}
