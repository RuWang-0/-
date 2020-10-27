/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50717
Source Host           : localhost:3306
Source Database       : bbs

Target Server Type    : MYSQL
Target Server Version : 50717
File Encoding         : 65001

Date: 2017-09-07 14:34:10
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for bbs_adminuser
-- ----------------------------
DROP TABLE IF EXISTS `bbs_adminuser`;
CREATE TABLE `bbs_adminuser` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `enable` int(11) NOT NULL,
  `password` varchar(255) NOT NULL,
  `username` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_4erqa44qkwwkl539xouso7v4c` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=100 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bbs_adminuser
-- ----------------------------
--INSERT INTO `bbs_adminuser` VALUES ('3', '1', '1148f69de18a13200acb02f593cb77a3', 'lhr');
--INSERT INTO `bbs_adminuser` VALUES ('11', '0', '29255b3c67b58e0b8d82f74a3530eaf1', '测试7');
--INSERT INTO `bbs_adminuser` VALUES ('12', '0', '6e9b52d2e884a2b059abf2c234433c3e', '测试8');
--INSERT INTO `bbs_adminuser` VALUES ('13', '0', '14e9820a10160875aa7a88a32d1b372b', '测试9');
--INSERT INTO `bbs_adminuser` VALUES ('14', '0', '0f825d19af5d8cc49247b7e8461686e2', '测试10');


-- ----------------------------
-- Table structure for bbs_adminuser_role
-- ----------------------------
DROP TABLE IF EXISTS `bbs_adminuser_role`;
CREATE TABLE `bbs_adminuser_role` (
  `adminuser_id` int(11) NOT NULL,
  `role_id` int(11) NOT NULL,
  PRIMARY KEY (`adminuser_id`,`role_id`),
  KEY `FK26lllx1jn0c1k8f8oj2qt4io1` (`role_id`),
  CONSTRAINT `FK26lllx1jn0c1k8f8oj2qt4io1` FOREIGN KEY (`role_id`) REFERENCES `bbs_role` (`id`),
  CONSTRAINT `FKatv5o94k3fooskwr53rvqfven` FOREIGN KEY (`adminuser_id`) REFERENCES `bbs_adminuser` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bbs_adminuser_role
-- ----------------------------
INSERT INTO `bbs_adminuser_role` VALUES ('3', '1');

-- ----------------------------
-- Table structure for bbs_label
-- ----------------------------
DROP TABLE IF EXISTS `bbs_label`;
CREATE TABLE `bbs_label` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `details` varchar(255) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  `posts_count` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_6vml4ba2itmaor84892v92b1f` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bbs_label
-- ----------------------------
INSERT INTO `bbs_label` VALUES ('1', '各个学科的二手课本', '课本','1');

-- ----------------------------
-- Table structure for bbs_notification
-- ----------------------------
DROP TABLE IF EXISTS `bbs_notification`;
CREATE TABLE `bbs_notification` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `is_read` bit(1) DEFAULT NULL,
  `fromuser_id` int(11) NOT NULL,
  `posts_id` int(11) NOT NULL,
  `touser_id` int(11) NOT NULL,
  `init_time` datetime NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKac4wjs0b3992ohkf61jy4ilmj` (`fromuser_id`),
  KEY `FKilg05a7ki3vkv7lfjnn57pdw2` (`posts_id`),
  KEY `FKquscxmtiqggsch7w833ywubux` (`touser_id`),
  CONSTRAINT `FKac4wjs0b3992ohkf61jy4ilmj` FOREIGN KEY (`fromuser_id`) REFERENCES `bbs_user` (`id`),
  CONSTRAINT `FKilg05a7ki3vkv7lfjnn57pdw2` FOREIGN KEY (`posts_id`) REFERENCES `bbs_posts` (`id`),
  CONSTRAINT `FKquscxmtiqggsch7w833ywubux` FOREIGN KEY (`touser_id`) REFERENCES `bbs_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bbs_notification
-- ----------------------------
--INSERT INTO `bbs_notification` VALUES ('16', '\0', '2', '209', '71', '2017-09-07 10:39:33');
--INSERT INTO `bbs_notification` VALUES ('22', '\0', '71', '4', '2', '2017-09-07 11:22:23');

-- ----------------------------
-- Table structure for bbs_permission
-- ----------------------------
DROP TABLE IF EXISTS `bbs_permission`;
CREATE TABLE `bbs_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `perurl` varchar(255) DEFAULT NULL,
  `sort` int(11) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `parentid` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bbs_permission
-- ----------------------------
INSERT INTO `bbs_permission` VALUES ('1', '系统设置', '/system', '1', '0', '0');
INSERT INTO `bbs_permission` VALUES ('2', '管理员管理', '/adminsPage', '2', '1', '1');
INSERT INTO `bbs_permission` VALUES ('3', '角色管理', '/rolesPage', '3', '1', '1');
INSERT INTO `bbs_permission` VALUES ('4', '权限管理', '/permissionsPage', '4', '1', '1');
INSERT INTO `bbs_permission` VALUES ('5', '添加管理员', '/admins/add', '21', '2', '2');
INSERT INTO `bbs_permission` VALUES ('6', '删除管理员', '/admins/delete', '22', '2', '2');
INSERT INTO `bbs_permission` VALUES ('7', '添加角色', '/roles/add', '23', '2', '3');
INSERT INTO `bbs_permission` VALUES ('8', '删除角色', '/roles/delete', '24', '2', '3');
INSERT INTO `bbs_permission` VALUES ('9', '添加权限', '/permissions/add', '25', '2', '4');
INSERT INTO `bbs_permission` VALUES ('10', '删除权限', '/permissions/delete', '26', '2', '4');
INSERT INTO `bbs_permission` VALUES ('11', '分配角色', '/admins/saveAdminRole', '27', '2', '2');
INSERT INTO `bbs_permission` VALUES ('12', '分配权限', '/roles/saveRolePermission', '28', '2', '3');
INSERT INTO `bbs_permission` VALUES ('13', '启用/禁用管理员', '/admins/saveAdminEnable', '29', '2', '2');
INSERT INTO `bbs_permission` VALUES ('16', '用户管理', '/usersPage', '5', '1', '1');
INSERT INTO `bbs_permission` VALUES ('17', '启用/禁用用户', '/users/saveUserEnable', '31', '2', '16');
INSERT INTO `bbs_permission` VALUES ('18', '帖子管理', '/postsPage', '6', '1', '1');
INSERT INTO `bbs_permission` VALUES ('19', '帖子置顶', '/posts/saveTop', '32', '2', '18');
INSERT INTO `bbs_permission` VALUES ('20', '帖子加精', '/posts/saveGood', '33', '2', '18');
INSERT INTO `bbs_permission` VALUES ('21', '帖子删除', '/posts/delete', '34', '2', '18');
INSERT INTO `bbs_permission` VALUES ('22', '回复管理', '/replysPage', '7', '1', '1');
INSERT INTO `bbs_permission` VALUES ('24', '删除回复', '/replys/delete', '35', '2', '22');
INSERT INTO `bbs_permission` VALUES ('25', '标签管理', '/labelsPage', '8', '1', '1');
INSERT INTO `bbs_permission` VALUES ('26', '添加标签', '/labels/add', '36', '2', '25');
INSERT INTO `bbs_permission` VALUES ('27', '删除标签', '/labels/delete', '37', '2', '25');
INSERT INTO `bbs_permission` VALUES ('28', '修改标签', '/labels/update', '37', '2', '25');

-- ----------------------------
-- Table structure for bbs_posts
-- ----------------------------
DROP TABLE IF EXISTS `bbs_posts`;
CREATE TABLE `bbs_posts` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` text,
  `good` bit(1) NOT NULL,
  `init_time` datetime NOT NULL,
  `label_id` int(11) DEFAULT NULL,
  `reply_count` int(11) DEFAULT NULL,
  `title` varchar(255) NOT NULL,
  `top` bit(1) NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_46eh0lt2x9ftqcv9tjs8meqj8` (`title`),
  KEY `FK41ebsa5jpn18egdtjo6uiaugn` (`user_id`),
  KEY `FKnxd3qh1m3c0o6tc3ojfa8fm6o` (`label_id`),
  CONSTRAINT `FK41ebsa5jpn18egdtjo6uiaugn` FOREIGN KEY (`user_id`) REFERENCES `bbs_user` (`id`),
  CONSTRAINT `FKnxd3qh1m3c0o6tc3ojfa8fm6o` FOREIGN KEY (`label_id`) REFERENCES `bbs_label` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bbs_posts
-- ----------------------------
INSERT INTO `bbs_posts` VALUES ('1', '出大一数学分析（上）课本，九成新，可刀，有意私', '\0', '2020-01-09 16:36:36', '1', '1', '出数学分析上', '\0', '1');

-- ----------------------------
-- Table structure for bbs_reply
-- ----------------------------
DROP TABLE IF EXISTS `bbs_reply`;
CREATE TABLE `bbs_reply` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `content` text NOT NULL,
  `init_time` datetime DEFAULT NULL,
  `up` int(11) NOT NULL,
  `posts_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKnr6a7xtk9rm31ptn6gchi9113` (`posts_id`),
  KEY `FKnt12hb9oqfm5eamjpg27bkpvv` (`user_id`),
  CONSTRAINT `FKnr6a7xtk9rm31ptn6gchi9113` FOREIGN KEY (`posts_id`) REFERENCES `bbs_posts` (`id`),
  CONSTRAINT `FKnt12hb9oqfm5eamjpg27bkpvv` FOREIGN KEY (`user_id`) REFERENCES `bbs_user` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bbs_reply
-- ----------------------------
INSERT INTO `bbs_reply` VALUES ('1', '已私', '2020-01-10 10:17:39', '100', '1', '2');

-- ----------------------------
-- Table structure for bbs_role
-- ----------------------------
DROP TABLE IF EXISTS `bbs_role`;
CREATE TABLE `bbs_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `name` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_ff572j64wr6y4taed1c27vfo6` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bbs_role
-- ----------------------------
INSERT INTO `bbs_role` VALUES ('1', '超级权限', '超级管理');
INSERT INTO `bbs_role` VALUES ('6', '管理用户', '用户管理');

-- ----------------------------
-- Table structure for bbs_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `bbs_role_permission`;
CREATE TABLE `bbs_role_permission` (
  `role_id` int(11) NOT NULL,
  `permissions_id` int(11) NOT NULL,
  PRIMARY KEY (`role_id`,`permissions_id`),
  KEY `FKlsdkf5vtsq5qvepw45r0y89jw` (`permissions_id`),
  CONSTRAINT `FK763ep4ix05naeoliv21sm6m81` FOREIGN KEY (`role_id`) REFERENCES `bbs_role` (`id`),
  CONSTRAINT `FKlsdkf5vtsq5qvepw45r0y89jw` FOREIGN KEY (`permissions_id`) REFERENCES `bbs_permission` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bbs_role_permission
-- ----------------------------
INSERT INTO `bbs_role_permission` VALUES ('1', '1');
INSERT INTO `bbs_role_permission` VALUES ('6', '1');
INSERT INTO `bbs_role_permission` VALUES ('1', '2');
INSERT INTO `bbs_role_permission` VALUES ('1', '3');
INSERT INTO `bbs_role_permission` VALUES ('1', '4');
INSERT INTO `bbs_role_permission` VALUES ('1', '5');
INSERT INTO `bbs_role_permission` VALUES ('1', '6');
INSERT INTO `bbs_role_permission` VALUES ('1', '7');
INSERT INTO `bbs_role_permission` VALUES ('1', '8');
INSERT INTO `bbs_role_permission` VALUES ('1', '9');
INSERT INTO `bbs_role_permission` VALUES ('1', '10');
INSERT INTO `bbs_role_permission` VALUES ('1', '11');
INSERT INTO `bbs_role_permission` VALUES ('1', '12');
INSERT INTO `bbs_role_permission` VALUES ('1', '13');
INSERT INTO `bbs_role_permission` VALUES ('1', '16');
INSERT INTO `bbs_role_permission` VALUES ('6', '16');
INSERT INTO `bbs_role_permission` VALUES ('1', '17');
INSERT INTO `bbs_role_permission` VALUES ('6', '17');
INSERT INTO `bbs_role_permission` VALUES ('1', '18');
INSERT INTO `bbs_role_permission` VALUES ('1', '19');
INSERT INTO `bbs_role_permission` VALUES ('1', '20');
INSERT INTO `bbs_role_permission` VALUES ('1', '21');
INSERT INTO `bbs_role_permission` VALUES ('1', '22');
INSERT INTO `bbs_role_permission` VALUES ('1', '24');
INSERT INTO `bbs_role_permission` VALUES ('1', '25');
INSERT INTO `bbs_role_permission` VALUES ('1', '26');
INSERT INTO `bbs_role_permission` VALUES ('1', '27');
INSERT INTO `bbs_role_permission` VALUES ('1', '28');

-- ----------------------------
-- Table structure for bbs_user
-- ----------------------------
DROP TABLE IF EXISTS `bbs_user`;
CREATE TABLE `bbs_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `icon` varchar(255) NOT NULL,
  `enable` int(11) NOT NULL,
  `init_time` datetime NOT NULL,
  `password` varchar(255) NOT NULL,
  `sex` int(11) DEFAULT NULL,
  `signature` varchar(255) DEFAULT NULL,
  `username` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_2uqfoo05i1p5qm4ntysj2ivbs` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=73 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of bbs_user
-- ----------------------------
INSERT INTO `bbs_user` VALUES ('1', 'http://127.0.0.1/images/upload/default.png', '1', '2020-01-01 00:00:00', '25d55ad283aa400af464c76d713c07ad', '0', '打工人，打工魂', 'fd1', 'fd@qq.com');
INSERT INTO `bbs_user` VALUES ('2', 'http://127.0.0.1/images/upload/default.png', '1', '2020-01-01 00:00:01', 'e10adc3949ba59abbe56e057f20f883e', '0', '我爱996', 'fd2', 'fd@163.com');
