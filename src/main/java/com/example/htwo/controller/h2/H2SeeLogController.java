package com.example.htwo.controller.h2;

import com.example.htwo.entity.h2.BillCache4H2;
import com.example.htwo.mapper.h2.BillCache4H2Mapper;
import com.example.htwo.result.DockResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * 业务设定，单据信息缓存在H2数据库中
 */
@Controller
@RequestMapping("/h2i")
public class H2SeeLogController {
    @Resource
    private BillCache4H2Mapper billCache4H2Mapper;
    /**
     * 查看日志
     */
    @ResponseBody
    @RequestMapping("/logs")
    public DockResult seeAllLogs() {
        List<BillCache4H2> billCache4H2s = billCache4H2Mapper.selectList(null);
        return DockResult.success("H2SeeLogController success",billCache4H2s);
    }
}
