package com.example.htwo;

import com.example.htwo.entity.SysInfo_H2;
import com.example.htwo.entity.UserInfo_Mysql;
import com.example.htwo.eum.DbNameEum;
import com.example.htwo.mapper.SysInfoMapper_H2;
import com.example.htwo.mapper.UserInfoMapper_Mysql;
import com.example.htwo.service.UserInfoService_Mysql;
import com.example.htwo.component.SprDbNameThread;
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
    private SysInfoMapper_H2 sysInfoMapper_h2;
    @Resource
    private UserInfoMapper_Mysql userMapper;
    @Resource
    private UserInfoService_Mysql userService;

    @Test
    public void testSelect() {
        SprDbNameThread.set(DbNameEum.MYSQL.name());
        System.out.println(("----- selectAll method test ------"));
        List<UserInfo_Mysql> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);

        SprDbNameThread.set(DbNameEum.H2.name());
        SysInfo_H2 sysInfo_h2 = new SysInfo_H2(System.currentTimeMillis() + "xxx授权成功");
        sysInfoMapper_h2.insert(sysInfo_h2);
        List<SysInfo_H2> sysInfo_h2s = sysInfoMapper_h2.selectList(null);
        sysInfo_h2s.forEach(System.out::println);
    }
}
