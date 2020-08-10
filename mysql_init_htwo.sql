DROP DATABASE IF EXISTS `htwo`;
CREATE DATABASE `htwo`;
USE  htwo;
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_mysql`;
CREATE TABLE `sys_user_mysql`  (
                                   `id` bigint(0) NOT NULL COMMENT '主键ID',
                                   `name` varchar(30)  DEFAULT NULL COMMENT '姓名',
                                   `age` int(0)  DEFAULT NULL COMMENT '年龄',
                                   `email` varchar(50)  DEFAULT NULL COMMENT '邮箱',
                                   PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user_mysql` VALUES (3, 'Tom two', 28, 'test3@baomidou.com');
INSERT INTO `sys_user_mysql` VALUES (4, 'Sandy two', 21, 'test4@baomidou.com');
INSERT INTO `sys_user_mysql` VALUES (5, 'Billie two', 24, 'test5@baomidou.com');

SET FOREIGN_KEY_CHECKS = 1;
