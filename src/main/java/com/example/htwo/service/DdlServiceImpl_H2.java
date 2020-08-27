package com.example.htwo.service;

import com.example.htwo.mapper.DdlMapper_H2;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@Service
@Transactional
public class DdlServiceImpl_H2 implements DdlService_H2 {
    @Resource
    private DdlMapper_H2 ddlMapper;

    @Override
    public void initDataBase() {
        ddlMapper.dropTable_SysInfo();
        ddlMapper.createTable_SysInfo();

    }
}
