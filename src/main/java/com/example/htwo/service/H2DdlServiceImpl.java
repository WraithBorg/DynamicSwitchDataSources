package com.example.htwo.service;

import com.example.htwo.mapper.h2.SprDDLMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class H2DdlServiceImpl implements H2DdlService {
    @Resource
    private SprDDLMapper ddlMapper;

    @Override
    public void initDataBase() {
        List<String> tableNames = ddlMapper.showTables();
        boolean hasBILL_CACHE_H2 = tableNames.stream().allMatch(s -> s.contains("BILL_CACHE_H2"));
        if (!hasBILL_CACHE_H2){
            ddlMapper.createTable_BIllCacheInfo();
        }

    }
}
