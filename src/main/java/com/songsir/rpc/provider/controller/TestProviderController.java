package com.songsir.rpc.provider.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.songsir.rpc.provider.service.TestProviderService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @PackageName com.songsir.rpc.provider.controller
 * @ProjectName songsir-rpc-provider-web
 * @Author: SongYapeng
 * @Date: Create in 20:31 2019/12/14
 * @Description:
 * @Copyright Copyright (c) 2019, songsir01@163.com All Rights Reserved.
 */
@RestController
public class TestProviderController {

    @Reference(version = "1.0.0", check = false)
    private TestProviderService testProviderService;

    @RequestMapping("/testProvider")
    public String testProvider() {

        return "Hello World!";
    }

    @RequestMapping("/test2")
    public String test2() {
        return testProviderService.getHelloWorld("");
    }
}
