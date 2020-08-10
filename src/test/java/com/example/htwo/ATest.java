package com.example.htwo;

import com.example.htwo.entity.SysUser;
import com.example.htwo.mapper.SysUserMapper;
import com.example.htwo.service.SysUserService;
import com.example.htwo.utils.InstallUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ATest {


    @Resource
    private SysUserMapper userMapper;
    @Resource
    private SysUserService userService;

    @Test
    public void testSelect() {
        InstallUtils.isInstall = false;
        System.out.println(("----- selectAll method test ------"));
        List<SysUser> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);

        InstallUtils.isInstall = true;
        userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
        //
        userService.updateUser("1");

    }
}
