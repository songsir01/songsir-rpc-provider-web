package com.songsir.rpc.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.songsir.rpc.bean.User;
import com.songsir.rpc.provider.dao.TestMapper;
import com.songsir.rpc.provider.service.TestProviderService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @PackageName com.songsir.rpc.provider.service.impl
 * @ProjectName songsir-rpc-provider-web
 * @Author: SongYapeng
 * @Date: Create in 20:32 2019/12/14
 * @Description:
 * @Copyright Copyright (c) 2019, songsir01@163.com All Rights Reserved.
 */
@Service(version = "1.0.0")
public class TestProviderServiceImpl implements TestProviderService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public String getHelloWorld(String msg) {
        return "Hello World!";
    }

    @Override
    public List<User> getUserByUid(User user) {
        return testMapper.getUserListByUid(user);
    }
}
