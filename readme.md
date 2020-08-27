# 根据访问URL切换不同类型的数据源（或数据库）
#### 测试URL
> 默认访问Mysql数据源
`http://127.0.0.1:8889/demo/users/`
> url携带'h2i'时,访问H2数据源
`http://127.0.0.1:8889/demo/h2i/logs`

## 初始化数据,(Msql和H2数据库)
#### 初始化创建mysql数据库
```sql

DROP DATABASE IF EXISTS `dsd_htwo`;
CREATE DATABASE `dsd_htwo`;
USE  dsd_htwo;
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `sys_user_mysql`;
CREATE TABLE `sys_user_mysql`  (
   `id` bigint(0) NOT NULL COMMENT '主键ID',
   `name` varchar(30)  DEFAULT NULL COMMENT '姓名',
   `age` int(0)  DEFAULT NULL COMMENT '年龄',
   `email` varchar(50)  DEFAULT NULL COMMENT '邮箱',
   PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB;

INSERT INTO `sys_user_mysql` VALUES (3, 'Tom two', 28, 'test3@baomidou.com');
INSERT INTO `sys_user_mysql` VALUES (4, 'Sandy two', 21, 'test4@baomidou.com');
INSERT INTO `sys_user_mysql` VALUES (5, 'Billie two', 24, 'test5@baomidou.com');

SET FOREIGN_KEY_CHECKS = 1;

```

#### 初始化创建h2数据库（启动程序会自动创建）

#### H2数据库Web控制台
`http://localhost:8889/demo/h2-console/login.do`
```
jdbc:h2:file:./db/h2-demo;AUTO_SERVER=TRUE;DB_CLOSE_DELAY=-1
org.h2.Driver
root
test
```
