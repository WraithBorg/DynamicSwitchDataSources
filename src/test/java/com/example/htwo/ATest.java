package com.example.htwo;

import com.example.htwo.entity.h2.BillCache4H2;
import com.example.htwo.entity.mysql.User4Mysql;
import com.example.htwo.eum.DbNameEum;
import com.example.htwo.mapper.BillCache4H2Mapper;
import com.example.htwo.mapper.User4MysqlMapper;
import com.example.htwo.service.User4MysqlService;
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
    private BillCache4H2Mapper billCache4H2Mapper;
    @Resource
    private User4MysqlMapper userMapper;
    @Resource
    private User4MysqlService userService;

    @Test
    public void testSelect() {
        SprDbNameThread.set(DbNameEum.MYSQL.name());
        System.out.println(("----- selectAll method test ------"));
        List<User4Mysql> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);

        SprDbNameThread.set(DbNameEum.H2.name());
        BillCache4H2 billCache4H2 = new BillCache4H2("billNo", 1, "message", " errorCode");
        billCache4H2Mapper.insert(billCache4H2);
        List<BillCache4H2> billCache4H2s = billCache4H2Mapper.selectList(null);
        billCache4H2s.forEach(System.out::println);
    }
}
