/*
Navicat MySQL Data Transfer

Source Server         : localPC
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : abmapweb

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2020-04-02 23:26:28
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for log
-- ----------------------------
DROP TABLE IF EXISTS `log`;
CREATE TABLE `log` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `operateor` varchar(255) DEFAULT NULL,
  `operateType` varchar(255) DEFAULT NULL,
  `operateDate` datetime DEFAULT NULL,
  `operateResult` varchar(255) DEFAULT NULL,
  `ip` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=173 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of log
-- ----------------------------

-- ----------------------------
-- Table structure for menu
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `menuid` varchar(30) NOT NULL DEFAULT '1' COMMENT '编号',
  `menuname` varchar(30) DEFAULT NULL COMMENT '名称',
  `url` varchar(255) DEFAULT NULL COMMENT '对应URL',
  `icon` varchar(100) DEFAULT NULL COMMENT '图标样式',
  `pid` varchar(30) DEFAULT NULL COMMENT '上一级菜单编号',
  `is_parent` tinyint(1) DEFAULT NULL COMMENT '该菜单是否为父菜单，1为true，0为false',
  PRIMARY KEY (`menuid`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('0', '系统菜单', '-', 'icon-sys', '-1', '1');
INSERT INTO `menu` VALUES ('100', '系统管理', '-', 'icon-sys', '0', '1');
INSERT INTO `menu` VALUES ('101', '用户管理', 'user.html', 'icon-log', '100', '0');
INSERT INTO `menu` VALUES ('102', '角色管理', 'role.html', 'icon-log', '100', '0');
INSERT INTO `menu` VALUES ('103', '菜单管理', 'menu.html', 'icon-log', '100', '1');
INSERT INTO `menu` VALUES ('104', '角色权限管理', 'roleMenuSet.html', 'icon-log', '100', '0');
INSERT INTO `menu` VALUES ('105', '用户角色管理', 'userRoleSet.html', 'icon-log', '100', '0');
INSERT INTO `menu` VALUES ('106', '日志管理', 'log.html', 'icon-log', '100', '1');
INSERT INTO `menu` VALUES ('107', '数据库监控', 'druid/index.html', 'icon-log', '100', '0');
INSERT INTO `menu` VALUES ('200', '运维管理', '-', 'icon-sys', '0', '1');
INSERT INTO `menu` VALUES ('201', '日志管理', 'log.html', 'icon-log', '200', '1');
INSERT INTO `menu` VALUES ('202', '数据库监控', 'druid/index.html', 'icon-log', '200', '0');
INSERT INTO `menu` VALUES ('300', '用户管理', '-', 'icon-sys', '0', '1');
INSERT INTO `menu` VALUES ('301', '用户管理', 'user.html', 'icon-log', '300', '0');

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `uuid` int(10) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(30) NOT NULL COMMENT '名称',
  PRIMARY KEY (`uuid`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='角色';

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '系统管理员');
INSERT INTO `role` VALUES ('6', '普通用户');
INSERT INTO `role` VALUES ('7', '注册授权');
INSERT INTO `role` VALUES ('8', '运维人员');
INSERT INTO `role` VALUES ('9', '账号管理人员');

-- ----------------------------
-- Table structure for role_menu
-- ----------------------------
DROP TABLE IF EXISTS `role_menu`;
CREATE TABLE `role_menu` (
  `menuuuid` varchar(20) DEFAULT NULL COMMENT '菜单ID',
  `roleuuid` int(10) DEFAULT NULL COMMENT '菜单ID'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='角色菜单中间表';

-- ----------------------------
-- Records of role_menu
-- ----------------------------
INSERT INTO `role_menu` VALUES ('100', '1');
INSERT INTO `role_menu` VALUES ('101', '1');
INSERT INTO `role_menu` VALUES ('102', '1');
INSERT INTO `role_menu` VALUES ('103', '1');
INSERT INTO `role_menu` VALUES ('104', '1');
INSERT INTO `role_menu` VALUES ('105', '1');
INSERT INTO `role_menu` VALUES ('106', '1');
INSERT INTO `role_menu` VALUES ('107', '1');
INSERT INTO `role_menu` VALUES ('200', '2');
INSERT INTO `role_menu` VALUES ('201', '2');
INSERT INTO `role_menu` VALUES ('100', '7');
INSERT INTO `role_menu` VALUES ('101', '7');
INSERT INTO `role_menu` VALUES ('102', '7');
INSERT INTO `role_menu` VALUES ('103', '7');
INSERT INTO `role_menu` VALUES ('104', '7');
INSERT INTO `role_menu` VALUES ('105', '7');
INSERT INTO `role_menu` VALUES ('106', '7');
INSERT INTO `role_menu` VALUES ('107', '7');
INSERT INTO `role_menu` VALUES ('300', '9');
INSERT INTO `role_menu` VALUES ('301', '9');
INSERT INTO `role_menu` VALUES ('200', '8');
INSERT INTO `role_menu` VALUES ('201', '8');
INSERT INTO `role_menu` VALUES ('202', '8');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `user_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_code` varchar(255) NOT NULL COMMENT '登陆名',
  `user_name` varchar(255) DEFAULT NULL COMMENT '用户名',
  `user_pwd` varchar(255) NOT NULL COMMENT '用户密码',
  `user_birthday` date DEFAULT NULL COMMENT '出生日期',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=282 DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='用户信息表';

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('221', 'admin', '我是系统管理员', '3ef7164d1f6167cb9f2658c07d3c2f0a', '2019-04-04');
INSERT INTO `user` VALUES ('266', 'majie', '马杰', '7cf2ef857c17e2c715b34f38bc131f4f', '1998-07-15');
INSERT INTO `user` VALUES ('269', 'signup', '远程注册授权专用', '478f201fcf0b471eb06ce018cf1f69dc', null);
INSERT INTO `user` VALUES ('280', 'test1', '测试用户', '11a61d5c1dd870a0bc98df723edb8392', '2020-01-07');
INSERT INTO `user` VALUES ('281', 'manager', '账号管理员工', 'bb2ec153e560c6cb94a35b370eb7a07b', '2020-02-03');

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `userid` int(11) DEFAULT NULL COMMENT '员工编号',
  `roleuuid` int(11) DEFAULT NULL COMMENT '角色编号'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 ROW_FORMAT=DYNAMIC COMMENT='用户角色中间表';

-- ----------------------------
-- Records of user_role
-- ----------------------------
INSERT INTO `user_role` VALUES ('221', '1');
INSERT INTO `user_role` VALUES ('221', '5');
INSERT INTO `user_role` VALUES ('269', '7');
INSERT INTO `user_role` VALUES ('266', '8');
INSERT INTO `user_role` VALUES ('280', '6');
INSERT INTO `user_role` VALUES ('281', '9');
