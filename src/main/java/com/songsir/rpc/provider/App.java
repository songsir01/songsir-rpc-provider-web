package com.songsir.rpc.provider;

import com.alibaba.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * @PackageName com.songsir.rpc.provider
 * @ProjectName songsir-rpc-provider-web
 * @Author: SongYapeng
 * @Date: Create in 18:55 2019/12/18
 * @Description:
 * @Copyright Copyright (c) 2019, songsir01@163.com All Rights Reserved.
 */
@SpringBootApplication
@DubboComponentScan(basePackages = {"com.songsir.rpc.provider.service.impl"})
public class App extends SpringBootServletInitializer implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(App.class);
    }

    @Override
    public void run(String... args) {
        System.out.println("App provider is running!");
    }
}
