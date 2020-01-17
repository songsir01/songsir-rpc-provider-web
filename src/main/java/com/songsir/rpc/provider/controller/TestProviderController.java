package com.songsir.rpc.provider.controller;

import com.songsir.rpc.provider.service.TestProviderService;
import org.springframework.beans.factory.annotation.Autowired;
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


    @Autowired
    private TestProviderService testProviderService;

    @RequestMapping("/testProvider")
    public String testProvider() {

        return "Hello World!";
    }

    /**
     * @MethodName useHttpLinkTest
     * @Description 测试一下使用http调用接口（提供方）
     * @Author SongYapeng
     * @Date 2020/1/17 10:18
     * @param
     * @Since JDK 1.8
     */
    @RequestMapping("useHttpLinkTest")
    public String useHttpLinkTest() {
        String str = testProviderService.testUseHttpOrRpc();
        return str;
    }
}
