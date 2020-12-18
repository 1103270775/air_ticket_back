/*
 Navicat Premium Data Transfer

 Source Server         : libraryDBMS
 Source Server Type    : MySQL
 Source Server Version : 50728
 Source Host           : localhost:3306
 Source Schema         : airticket

 Target Server Type    : MySQL
 Target Server Version : 50728
 File Encoding         : 65001

 Date: 18/12/2020 14:13:19
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for t_company
-- ----------------------------
DROP TABLE IF EXISTS `t_company`;
CREATE TABLE `t_company`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `companyname` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `logourl` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `description` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_company
-- ----------------------------
INSERT INTO `t_company` VALUES (1, '吉祥航空', 'http://simg1.qunarzz.com/site/images/airlines/HO.gif', NULL);
INSERT INTO `t_company` VALUES (2, '深圳航空', 'http://simg1.qunarzz.com/site/images/airlines/HO.gif', NULL);
INSERT INTO `t_company` VALUES (3, '东方航空', 'http://simg1.qunarzz.com/site/images/airlines/HO.gif', NULL);

-- ----------------------------
-- Table structure for t_flight
-- ----------------------------
DROP TABLE IF EXISTS `t_flight`;
CREATE TABLE `t_flight`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `ecPrice` int(11) NOT NULL,
  `ecTicketRemain` int(11) NOT NULL,
  `ecTicketTotal` int(11) NOT NULL,
  `fcPrice` int(11) NOT NULL,
  `fcTicketRemain` int(11) NOT NULL,
  `fcTicketTotal` int(11) NOT NULL,
  `flightType` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `fromCity` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `fromTime` datetime(0) NULL DEFAULT NULL,
  `name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `toCity` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `toTime` datetime(0) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_flight
-- ----------------------------
INSERT INTO `t_flight` VALUES (1, 400, 294, 292, 800, 20, 10, '国内航班', '北京', '2021-01-01 15:30:00', '东方航空MU3748', '鄂尔多斯', '2021-01-01 17:00:00');
INSERT INTO `t_flight` VALUES (2, 398, 291, 120, 700, 10, 8, '国内航班', '北京', '2021-08-10 18:40:32', '东方航空MU5278', '太原', '2021-01-01 17:00:00');
INSERT INTO `t_flight` VALUES (3, 608, 292, 292, 1808, 7, 10, '国内航班', '北京', '2021-08-10 18:40:32', '东方航空MU5170', '合肥', '2021-01-01 15:30:00');
INSERT INTO `t_flight` VALUES (4, 1800, 292, 292, 4000, 10, 10, '国际航班', '上海', '2021-01-01 00:00:00', '东方航空MU542', '东京', '2021-01-01 00:00:00');
INSERT INTO `t_flight` VALUES (5, 1000, 292, 292, 3000, 10, 10, '国际航班', '上海', '2021-01-01 00:00:00', '东方航空MU9827', '首尔', '2021-01-01 00:00:00');
INSERT INTO `t_flight` VALUES (6, 2000, 292, 292, 4000, 10, 10, '国际航班', '上海', '2021-10-10 18:40:32', '东方航空MU9828', '新加坡', '2021-01-01 15:30:00');
INSERT INTO `t_flight` VALUES (7, 400, 292, 292, 800, 10, 10, '国内航班', '上海', '2021-10-10 18:40:32', '东方航空MU9824', '广州', '2021-01-01 00:00:00');
INSERT INTO `t_flight` VALUES (8, 500, 292, 292, 1000, 10, 10, '国内航班', '重庆', '2021-10-10 18:40:32', '东方航空MU9823', '广州', '2021-01-01 15:30:00');
INSERT INTO `t_flight` VALUES (9, 1500, 292, 292, 5000, 10, 10, '国际航班', '上海', '2021-10-10 18:40:32', '东方航空MU9822', '东京', '2021-01-01 15:30:00');
INSERT INTO `t_flight` VALUES (10, 1300, 291, 292, 2900, 10, 10, '国际航班', '上海', '2021-10-10 18:40:32', '东方航空MU9821', '首尔', '2021-01-01 15:30:00');
INSERT INTO `t_flight` VALUES (13, 300, 228, 229, 600, 10, 10, '国际航班', '上海', '2021-04-11 10:53:31', '航班测试', '背景', '2021-04-12 10:54:37');

-- ----------------------------
-- Table structure for t_manager
-- ----------------------------
DROP TABLE IF EXISTS `t_manager`;
CREATE TABLE `t_manager`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `trueName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `userName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_manager
-- ----------------------------
INSERT INTO `t_manager` VALUES (1, '1', '1234566778', '老王', 'admin');
INSERT INTO `t_manager` VALUES (2, '2', '111111111', 'xiao', 'chen');
INSERT INTO `t_manager` VALUES (3, 'chen', '1111111', 'xiao', 'chen');

-- ----------------------------
-- Table structure for t_orderdetail
-- ----------------------------
DROP TABLE IF EXISTS `t_orderdetail`;
CREATE TABLE `t_orderdetail`  (
  `id` int(11) NOT NULL,
  `passname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `idcard` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `flightid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `orderid` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_orderdetail
-- ----------------------------

-- ----------------------------
-- Table structure for t_ticketorder
-- ----------------------------
DROP TABLE IF EXISTS `t_ticketorder`;
CREATE TABLE `t_ticketorder`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `orderNo` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `orderTime` datetime(0) NULL DEFAULT NULL,
  `price` int(11) NOT NULL,
  `spaceType` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `flightId` int(11) NULL DEFAULT NULL,
  `userId` int(11) NULL DEFAULT NULL,
  `num` int(11) NOT NULL,
  `totalPrice` int(11) NOT NULL,
  `contactphone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `contactname` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `paystatus` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `FK_5vujoeb2yrjvt9tjx9bcevvrn`(`flightId`) USING BTREE,
  INDEX `FK_nhv1j8c29cntipsxc91yith8y`(`userId`) USING BTREE,
  CONSTRAINT `FK_5vujoeb2yrjvt9tjx9bcevvrn` FOREIGN KEY (`flightId`) REFERENCES `t_flight` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_nhv1j8c29cntipsxc91yith8y` FOREIGN KEY (`userId`) REFERENCES `t_user` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 21 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_ticketorder
-- ----------------------------
INSERT INTO `t_ticketorder` VALUES (11, 'NO20150405040152', '2021-04-05 16:01:52', 800, '头等舱', 1, 3, 1, 800, '联系人电话', '联系人姓名', '已支付');
INSERT INTO `t_ticketorder` VALUES (13, 'NO20150405040712', '2021-04-05 16:07:12', 400, '经济舱', 1, 3, 1100, 440000, NULL, NULL, NULL);
INSERT INTO `t_ticketorder` VALUES (14, 'NO20150405040849', '2021-04-05 16:08:49', 398, '经济舱', 2, 3, 1000, 398000, NULL, NULL, NULL);
INSERT INTO `t_ticketorder` VALUES (15, 'NO20150405041031', '2021-04-05 16:10:31', 398, '经济舱', 2, 3, 1000, 398000, NULL, NULL, NULL);
INSERT INTO `t_ticketorder` VALUES (16, 'NO20150405041145', '2021-04-05 16:11:45', 1808, '头等舱', 3, 3, 1, 1808, NULL, NULL, NULL);
INSERT INTO `t_ticketorder` VALUES (17, 'NO20150405041207', '2021-04-05 16:12:07', 1808, '头等舱', 3, 3, 2, 3616, NULL, NULL, NULL);
INSERT INTO `t_ticketorder` VALUES (18, 'NO20150408040431', '2021-04-08 16:04:31', 1300, '经济舱', 10, 3, 1, 1300, NULL, NULL, NULL);
INSERT INTO `t_ticketorder` VALUES (19, 'NO20150408040623', '2021-04-08 16:06:23', 398, '经济舱', 2, 3, 1, 398, NULL, NULL, NULL);
INSERT INTO `t_ticketorder` VALUES (20, 'NO20150412014648', '2021-04-12 13:46:48', 300, '经济舱', 13, 4, 1, 300, NULL, NULL, NULL);

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `phone` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sex` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `idcard` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `trueName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `userName` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 20 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1, '234@qq.com', 'chen', '67890', '男', '456789', 'xiao', 'chen');
INSERT INTO `t_user` VALUES (2, '234@qq.com', '123', '2321321', '女', '21321321211', '小红', 'marry');
INSERT INTO `t_user` VALUES (3, '123@qq.com', '123', 'ppp', '男', '6666', '123', 'jack2');
INSERT INTO `t_user` VALUES (4, '123@qq.com', '123', '123', '女', '1231231231233', '123', 'json');
INSERT INTO `t_user` VALUES (7, '11@qq.com', 'li', '18802058888', '男', '1231231231233', 'li', 'li');
INSERT INTO `t_user` VALUES (8, '11@qq.com', 'li', '18802058888', '男', '1231231231233', 'li', 'chen');
INSERT INTO `t_user` VALUES (9, '11@qq.com', 'li', '18802058888', '男', '1231231231233', 'li', 'chen');
INSERT INTO `t_user` VALUES (10, 'ming@qq.com', 'ming', '18802058888', '男', '460005199202123756', 'ming', 'ming');
INSERT INTO `t_user` VALUES (11, 'ming@qq.com', 'ming', '18802058888', '男', '460005199202123756', 'ming', 'ming');
INSERT INTO `t_user` VALUES (12, 'ming@qq.com', 'ming', '18802058888', '男', '460005199202123756', 'ming', 'ming');
INSERT INTO `t_user` VALUES (13, 'ming@qq.com', 'ming', '18802058888', '男', '460005199202123756', 'ming', 'ming');
INSERT INTO `t_user` VALUES (14, 'ming@qq.com', 'ming', '18802058888', '男', '460005199202123756', 'ming', 'ming');
INSERT INTO `t_user` VALUES (15, 'ming@qq.com', 'ming', '18802058888', '男', '460005199202123756', 'ming', 'ming');
INSERT INTO `t_user` VALUES (16, 'zhou@qq.com', 'zhou', '18802058888', '男', '460005199202123750', 'zhou', 'zhou');
INSERT INTO `t_user` VALUES (17, '123@qq.com', '123', '18802058888', '男', '111111111111111111', '123', '123');
INSERT INTO `t_user` VALUES (18, '123@qq.com', '123', '18802057896', '男', '460005199209094571', '666', '666');
INSERT INTO `t_user` VALUES (19, '11@qq.com', '9', '9', '男', '9', '9', '9');

SET FOREIGN_KEY_CHECKS = 1;
