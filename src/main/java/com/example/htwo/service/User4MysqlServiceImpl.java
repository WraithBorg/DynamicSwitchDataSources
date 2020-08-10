package com.example.htwo.service;

import com.example.htwo.mapper.mysql.User4MysqlMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class User4MysqlServiceImpl implements User4MysqlService {

    @Resource
    private User4MysqlMapper userMapper;

    @Override
    public void updateUser(String id) {
        userMapper.deleteById(3);
        throw new RuntimeException("111");
    }
}
