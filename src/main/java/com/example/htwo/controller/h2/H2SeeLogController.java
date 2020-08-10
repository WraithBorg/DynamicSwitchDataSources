package com.example.htwo.controller.h2;

import com.example.htwo.result.DockResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 业务设定，单据信息缓存在H2数据库中
 */
@Controller
@RequestMapping("/h2i")
public class H2SeeLogController {
    /**
     * 查看日志
     */
    @RequestMapping("/seeLogs")
    private DockResult seeAllLogs() {
        return DockResult.success("H2SeeLogController success");
    }
}
