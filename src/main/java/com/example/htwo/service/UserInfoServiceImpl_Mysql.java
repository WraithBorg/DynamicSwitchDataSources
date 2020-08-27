package com.example.htwo.service;

import com.example.htwo.mapper.UserInfoMapper_Mysql;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class UserInfoServiceImpl_Mysql implements UserInfoService_Mysql {

    @Resource
    private UserInfoMapper_Mysql userMapper;

    @Override
    public void updateUser(String id) {
        userMapper.deleteById(3);
        throw new RuntimeException("111");
    }
}
