package com.atguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @auther zzyy
 * @create 2020-02-20 22:02
 */
@SpringBootApplication
@EnableHystrixDashboard//服务启动后访问http://localhost:9001/hystrix
public class HystrixDashboardMain9001
{
    public static void main(String[] args) {
            SpringApplication.run(HystrixDashboardMain9001.class, args);
    }
}
