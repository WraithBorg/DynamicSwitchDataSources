package com.example.htwo.controller.mysql;

import com.example.htwo.result.DockResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 业务设定，用户档案信息存放在mysql数据库中
 */
@Controller
public class MysqlUserController {
    /**
     * 查看日志
     */
    @ResponseBody
    @RequestMapping("/")
    private DockResult seeAllLogs() {
        return DockResult.success("H2SeeLogController success");
    }
}
