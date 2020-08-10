package com.example.htwo.controller.mysql;

import com.example.htwo.entity.mysql.User4Mysql;
import com.example.htwo.mapper.mysql.User4MysqlMapper;
import com.example.htwo.result.DockResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * 业务设定，用户档案信息存放在mysql数据库中
 */
@Controller
public class MysqlUserController {
    @Resource
    private  User4MysqlMapper userMapper;

    /**
     * 查看日志
     */
    @ResponseBody
    @RequestMapping("/users")
    public DockResult seeAllLogs() {
        List<User4Mysql> userList = userMapper.selectList(null);
        return DockResult.success("H2SeeLogController success",userList);
    }
}
