package com.example.htwo.controller;

import com.example.htwo.entity.SysInfo_H2;
import com.example.htwo.mapper.SysInfoMapper_H2;
import com.example.htwo.result.DockResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * H2数据库中存放系统设置信息
 */
@Controller
@RequestMapping("/h2i")
public class SysInfoController_H2 {
    @Resource
    private SysInfoMapper_H2 sysInfoMapper_h2;
    /**
     * 查看日志
     */
    @ResponseBody
    @RequestMapping("/logs")
    public DockResult seeAllLogs() {
        SysInfo_H2 sysInfo_h2 = new SysInfo_H2(System.currentTimeMillis() + "xxx授权成功");
        sysInfoMapper_h2.insert(sysInfo_h2);
        List<SysInfo_H2> sysInfo_h2s = sysInfoMapper_h2.selectList(null);
        return DockResult.success("H2SeeLogController success",sysInfo_h2s);
    }
}
