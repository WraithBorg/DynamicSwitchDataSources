package com.example.htwo.controller;

import com.example.htwo.entity.UserInfo_Mysql;
import com.example.htwo.mapper.UserInfoMapper_Mysql;
import com.example.htwo.result.DockResult;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Mysql数据库存放业务数据，如用户信息
 */
@Controller
public class UserInfoController_Mysql {
    @Resource
    private UserInfoMapper_Mysql userMapper;

    /**
     * 查看用户
     */
    @ResponseBody
    @RequestMapping("/users")
    public DockResult selectAllUser() {
        List<UserInfo_Mysql> userList = userMapper.selectList(null);
        return DockResult.success("UserController_Mysql success",userList);
    }
}
