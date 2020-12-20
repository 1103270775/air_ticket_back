/*
 Navicat Premium Data Transfer

 Source Server         : airticket
 Source Server Type    : MySQL
 Source Server Version : 80017
 Source Host           : localhost:3306
 Source Schema         : airticket

 Target Server Type    : MySQL
 Target Server Version : 80017
 File Encoding         : 65001

 Date: 20/12/2020 22:06:33
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_company
-- ----------------------------
DROP TABLE IF EXISTS `t_company`;
CREATE TABLE `t_company`  (
  `cid` int(11) NOT NULL AUTO_INCREMENT,
  `cName` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `logoUrl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`cid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_company
-- ----------------------------
INSERT INTO `t_company` VALUES (1, '吉祥航空', 'http://simg1.qunarzz.com/site/images/airlines/HO.gif', '1111');
INSERT INTO `t_company` VALUES (2, '深圳航空', 'http://simg1.qunarzz.com/site/images/airlines/HO.gif', NULL);
INSERT INTO `t_company` VALUES (3, '东方航空', 'http://simg1.qunarzz.com/site/images/airlines/HO.gif', NULL);

-- ----------------------------
-- Table structure for t_flight
-- ----------------------------
DROP TABLE IF EXISTS `t_flight`;
CREATE TABLE `t_flight`  (
  `fid` int(11) NOT NULL AUTO_INCREMENT,
  `airCraftNo` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `airCraftType` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `fromCity` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `toCity` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `fromTime` datetime(0) DEFAULT NULL,
  `toTime` datetime(0) DEFAULT NULL,
  `ecPrice` int(11) NOT NULL,
  `flyTime` varchar(10) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `ecTicketRemain` int(11) NOT NULL,
  `ecTicketTotal` int(11) NOT NULL,
  `fcPrice` int(11) NOT NULL,
  `fcTicketRemain` int(11) NOT NULL,
  `fcTicketTotal` int(11) NOT NULL,
  `flightType` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `cName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`fid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 15 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_flight
-- ----------------------------
INSERT INTO `t_flight` VALUES (1, NULL, NULL, '北京', '鄂尔多斯', '2021-01-01 15:30:00', '2021-01-01 17:00:00', 400, NULL, 294, 292, 800, 20, 10, '国内航班', '东方航空MU3748');
INSERT INTO `t_flight` VALUES (2, NULL, NULL, '北京', '太原', '2021-08-10 18:40:32', '2021-01-01 17:00:00', 398, NULL, 291, 120, 700, 10, 8, '国内航班', '东方航空MU5278');
INSERT INTO `t_flight` VALUES (3, NULL, NULL, '北京', '合肥', '2021-08-10 18:40:32', '2021-01-01 15:30:00', 608, NULL, 292, 292, 1808, 7, 10, '国内航班', '东方航空MU5170');
INSERT INTO `t_flight` VALUES (4, NULL, NULL, '上海', '东京', '2021-01-01 00:00:00', '2021-01-01 00:00:00', 1800, NULL, 292, 292, 4000, 10, 10, '国际航班', '东方航空MU542');
INSERT INTO `t_flight` VALUES (5, NULL, NULL, '上海', '首尔', '2021-01-01 00:00:00', '2021-01-01 00:00:00', 1000, NULL, 292, 292, 3000, 10, 10, '国际航班', '东方航空MU9827');
INSERT INTO `t_flight` VALUES (6, NULL, NULL, '上海', '新加坡', '2021-10-10 18:40:32', '2021-01-01 15:30:00', 2000, NULL, 292, 292, 4000, 10, 10, '国际航班', '东方航空MU9828');
INSERT INTO `t_flight` VALUES (7, NULL, NULL, '上海', '广州', '2021-10-10 18:40:32', '2021-01-01 00:00:00', 400, NULL, 292, 292, 800, 10, 10, '国内航班', '东方航空MU9824');
INSERT INTO `t_flight` VALUES (8, NULL, NULL, '重庆', '广州', '2021-10-10 18:40:32', '2021-01-01 15:30:00', 500, NULL, 292, 292, 1000, 10, 10, '国内航班', '东方航空MU9823');
INSERT INTO `t_flight` VALUES (9, NULL, NULL, '上海', '东京', '2021-10-10 18:40:32', '2021-01-01 15:30:00', 1500, NULL, 292, 292, 5000, 10, 10, '国际航班', '东方航空MU9822');
INSERT INTO `t_flight` VALUES (10, NULL, NULL, '上海', '首尔', '2021-10-10 18:40:32', '2021-01-01 15:30:00', 1300, NULL, 291, 292, 2900, 10, 10, '国际航班', '东方航空MU9821');
INSERT INTO `t_flight` VALUES (13, NULL, NULL, '上海', '背景', '2021-04-11 10:53:31', '2021-04-12 10:54:37', 300, NULL, 228, 229, 600, 10, 10, '国际航班', '航班测试');
INSERT INTO `t_flight` VALUES (14, 'ssss', '11', '宜昌市', '宜昌市', '2020-12-11 00:04:04', '2020-12-17 04:00:00', 111, NULL, 11, 11, 11, 11, 11, '11', '111');

-- ----------------------------
-- Table structure for t_manager
-- ----------------------------
DROP TABLE IF EXISTS `t_manager`;
CREATE TABLE `t_manager`  (
  `mid` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `passWord` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `trueName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`mid`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_manager
-- ----------------------------
INSERT INTO `t_manager` VALUES (1, 'admin', 'admin', '老王', '1234566778');
INSERT INTO `t_manager` VALUES (2, 'chen', '2', 'xiao', '111111111');
INSERT INTO `t_manager` VALUES (3, 'chen', 'chen', 'xiao', '1111111');

-- ----------------------------
-- Table structure for t_orderdetail
-- ----------------------------
DROP TABLE IF EXISTS `t_orderdetail`;
CREATE TABLE `t_orderdetail`  (
  `detailid` int(11) NOT NULL,
  `passName` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `idCard` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `fid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `orderid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`detailid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_orderdetail
-- ----------------------------
INSERT INTO `t_orderdetail` VALUES (1, '1', '1', '1', '1');

-- ----------------------------
-- Table structure for t_ticketorder
-- ----------------------------
DROP TABLE IF EXISTS `t_ticketorder`;
CREATE TABLE `t_ticketorder`  (
  `orderid` int(11) NOT NULL AUTO_INCREMENT,
  `orderNo` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `orderTime` datetime(0) DEFAULT NULL,
  `price` int(11) NOT NULL,
  `spaceType` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `fid` int(11) DEFAULT NULL,
  `uid` int(11) DEFAULT NULL,
  `num` int(11) NOT NULL,
  `totalPrice` int(11) NOT NULL,
  `contactName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `contactPhone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `idCard` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `payStatus` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`orderid`) USING BTREE,
  INDEX `FK_5vujoeb2yrjvt9tjx9bcevvrn`(`fid`) USING BTREE,
  INDEX `FK_nhv1j8c29cntipsxc91yith8y`(`uid`) USING BTREE,
  CONSTRAINT `FK_5vujoeb2yrjvt9tjx9bcevvrn` FOREIGN KEY (`fid`) REFERENCES `t_flight` (`fid`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_nhv1j8c29cntipsxc91yith8y` FOREIGN KEY (`uid`) REFERENCES `t_user` (`userId`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 24 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_ticketorder
-- ----------------------------
INSERT INTO `t_ticketorder` VALUES (11, 'NO20150405040152', '2021-04-05 16:01:52', 800, '头等舱', 1, 3, 1, 800, '联系人姓名', '联系人电话', NULL, '已支付');
INSERT INTO `t_ticketorder` VALUES (13, 'NO20150405040712', '2021-04-05 16:07:12', 400, '经济舱', 1, 3, 1100, 440000, NULL, NULL, NULL, NULL);
INSERT INTO `t_ticketorder` VALUES (14, 'NO20150405040849', '2021-04-05 16:08:49', 398, '经济舱', 2, 3, 1000, 398000, NULL, NULL, NULL, NULL);
INSERT INTO `t_ticketorder` VALUES (15, 'NO20150405041031', '2021-04-05 16:10:31', 398, '经济舱', 2, 3, 1000, 398000, NULL, NULL, NULL, NULL);
INSERT INTO `t_ticketorder` VALUES (16, 'NO20150405041145', '2021-04-05 16:11:45', 1808, '头等舱', 3, 3, 1, 1808, NULL, NULL, NULL, NULL);
INSERT INTO `t_ticketorder` VALUES (17, 'NO20150405041207', '2021-04-05 16:12:07', 1808, '头等舱', 3, 3, 2, 3616, NULL, NULL, NULL, NULL);
INSERT INTO `t_ticketorder` VALUES (18, 'NO20150408040431', '2021-04-08 16:04:31', 1300, '经济舱', 10, 3, 1, 1300, NULL, NULL, NULL, NULL);
INSERT INTO `t_ticketorder` VALUES (19, 'NO20150408040623', '2021-04-08 16:06:23', 398, '经济舱', 2, 3, 1, 398, NULL, NULL, NULL, NULL);
INSERT INTO `t_ticketorder` VALUES (20, 'NO20150412014648', '2021-04-12 13:46:48', 300, '经济舱', 13, 4, 1, 300, NULL, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `userId` int(11) NOT NULL AUTO_INCREMENT,
  `userName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `passWord` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `nickName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `sex` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `email` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `trueName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `idCard` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  PRIMARY KEY (`userId`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 29 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1, 'chenjie', 'chen', NULL, '男', NULL, NULL, NULL, NULL);
INSERT INTO `t_user` VALUES (2, 'marry', '123', NULL, '女', '2321321', '234@qq.com', '小红', '21321321211');
INSERT INTO `t_user` VALUES (3, 'jack2', '123', NULL, '男', 'ppp', '123@qq.com', '123', '6666');
INSERT INTO `t_user` VALUES (4, 'json', '123', NULL, '女', '123', '123@qq.com', '123', '1231231231233');
INSERT INTO `t_user` VALUES (7, 'li', 'li', NULL, '男', '18802058888', '11@qq.com', 'li', '1231231231233');
INSERT INTO `t_user` VALUES (8, 'chen', 'li', NULL, '男', '18802058888', '11@qq.com', 'li', '1231231231233');
INSERT INTO `t_user` VALUES (9, 'chen', 'li', NULL, '男', '18802058888', '11@qq.com', 'li', '1231231231233');
INSERT INTO `t_user` VALUES (10, 'ming', 'ming', NULL, '男', '18802058888', 'ming@qq.com', 'ming', '460005199202123756');
INSERT INTO `t_user` VALUES (11, 'ming', 'ming', NULL, '男', '18802058888', 'ming@qq.com', 'ming', '460005199202123756');
INSERT INTO `t_user` VALUES (12, 'ming', 'ming', NULL, '男', '18802058888', 'ming@qq.com', 'ming', '460005199202123756');
INSERT INTO `t_user` VALUES (13, 'ming', 'ming', NULL, '男', '18802058888', 'ming@qq.com', 'ming', '460005199202123756');
INSERT INTO `t_user` VALUES (14, 'ming', 'ming', NULL, '男', '18802058888', 'ming@qq.com', 'ming', '460005199202123756');
INSERT INTO `t_user` VALUES (15, 'ming', 'ming', NULL, '男', '18802058888', 'ming@qq.com', 'ming', '460005199202123756');
INSERT INTO `t_user` VALUES (16, 'zhou', 'zhou', NULL, '男', '18802058888', 'zhou@qq.com', 'zhou', '460005199202123750');
INSERT INTO `t_user` VALUES (17, '123', '123', NULL, '男', '18802058888', '123@qq.com', '123', '111111111111111111');
INSERT INTO `t_user` VALUES (20, 'admin', 'admin', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_user` VALUES (21, 'chenjie', 'chen', NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_user` VALUES (22, 'qwerty', 'ssssssss', 'ssssssss', '女', 'sss', 'sssss', 'sssssssssss', 'sssssssss');
INSERT INTO `t_user` VALUES (23, 'qwerty', 'ssssssss', 'ssssssss', '女', 'sss', 'sssss', 'sssssssssss', 'sssssssss');
INSERT INTO `t_user` VALUES (27, 'ssss', 'ssssssssss', 'sssssssssssssssss', '女', 'sssssssssssss', 'sssssssssssss', 'ssssssssssssss', 'sssssssss');
INSERT INTO `t_user` VALUES (28, 'aaaaa', 'aaaaaaaaaaaaaaa', 'aaaaaaa11111111', '女', 'aaaaaaaaaaaa', 'aaaaaaaaaaaa', 'aaaaaaaaaaa', 'aaaaaaaaaaaaaaa');

SET FOREIGN_KEY_CHECKS = 1;
