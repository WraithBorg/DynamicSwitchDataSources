package com.example.htwo.service;

import com.example.htwo.entity.SysUser;
import com.example.htwo.mapper.SysUserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class SysUserServiceImpl implements SysUserService {

    @Resource
    private SysUserMapper userMapper;

    @Override
    public void updateUser(String id) {
        userMapper.deleteById(3);
        throw new RuntimeException("111");
    }
}
