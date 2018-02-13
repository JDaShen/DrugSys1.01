/*
Navicat MySQL Data Transfer

Source Server         : JAVA139
Source Server Version : 50614
Source Host           : 192.168.3.126:3306
Source Database       : DrugSys

Target Server Type    : MYSQL
Target Server Version : 50614
File Encoding         : 65001

Date: 2017-11-28 11:15:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `check`
-- ----------------------------
DROP TABLE IF EXISTS `check`;
CREATE TABLE `check` (
  `cid` varchar(255) NOT NULL,
  `date` date NOT NULL,
  `wid` varchar(50) NOT NULL,
  `sfid` varchar(50) NOT NULL,
  `goodsentry` int(11) NOT NULL,
  `amount` int(11) NOT NULL,
  `comment` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of check
-- ----------------------------
INSERT INTO `check` VALUES ('PD20171122084922', '2017-11-22', '1', '1', '2', '23', null);
INSERT INTO `check` VALUES ('PD20171122092333', '2017-11-22', '1', '1', '2', '23', null);
INSERT INTO `check` VALUES ('PD20171122123705', '2017-11-22', '1', '1', '2', '23', null);
INSERT INTO `check` VALUES ('PD20171122160605', '2017-11-23', '2', '2', '2', '23', null);
INSERT INTO `check` VALUES ('PD20171123133136', '2017-11-23', '2', '2', '2', '23', null);
INSERT INTO `check` VALUES ('PD20171123150045', '2017-11-23', '1', '2', '2', '23', null);
INSERT INTO `check` VALUES ('PD20171124155414', '2017-11-24', '1', '2', '1', '23', null);

-- ----------------------------
-- Table structure for `checkItems`
-- ----------------------------
DROP TABLE IF EXISTS `checkItems`;
CREATE TABLE `checkItems` (
  `itemId` varchar(50) NOT NULL,
  `cid` varchar(50) NOT NULL,
  `diId` varchar(20) NOT NULL,
  `diName` varchar(50) NOT NULL,
  `wqty` int(11) NOT NULL,
  `rqty` int(11) NOT NULL,
  PRIMARY KEY (`itemId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of checkItems
-- ----------------------------
INSERT INTO `checkItems` VALUES ('PD20171121121', 'PD20171123150045', '1', '人工牛黄甲硝唑胶囊(牙痛安)', '505', '23');
INSERT INTO `checkItems` VALUES ('PD20171122331', 'PD20171122123705', '1', '人工牛黄甲硝唑胶囊(牙痛安)', '22', '12');
INSERT INTO `checkItems` VALUES ('PD20171123000', 'PD20171122092333', '2', '糠甾醇片(牙周宁)', '211', '56');
INSERT INTO `checkItems` VALUES ('PD20171123231', 'PD20171122084922', '2', '糠甾醇片(牙周宁)', '211', '123');
INSERT INTO `checkItems` VALUES ('PD20171123401', 'PD20171122084922', '1', '人工牛黄甲硝唑胶囊(牙痛安)', '22', '20');
INSERT INTO `checkItems` VALUES ('PD20171123888', 'PD20171124155414', '2', '糠甾醇片(牙周宁)', '1118', '200');
INSERT INTO `checkItems` VALUES ('PD20171124156', 'PD20171122160605', '2', '糠甾醇片(牙周宁)', '211', '200');
INSERT INTO `checkItems` VALUES ('PD20171127286', 'PD20171123150045', '2', '糠甾醇片(牙周宁)', '1204', '12');
INSERT INTO `checkItems` VALUES ('PD20171127345', 'PD20171123133136', '1', '人工牛黄甲硝唑胶囊(牙痛安)', '25', '20');
INSERT INTO `checkItems` VALUES ('PD20171127400', 'PD20171122092333', '1', '人工牛黄甲硝唑胶囊(牙痛安)', '22', '23');
INSERT INTO `checkItems` VALUES ('PD20171127446', 'PD20171123133136', '2', '糠甾醇片(牙周宁)', '159', '120');
INSERT INTO `checkItems` VALUES ('PD20171128181', 'PD20171122123705', '2', '糠甾醇片(牙周宁)', '211', '23');
INSERT INTO `checkItems` VALUES ('PD20171128385', 'PD20171122160605', '1', '人工牛黄甲硝唑胶囊(牙痛安)', '22', '23');

-- ----------------------------
-- Table structure for `customer`
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `ctId` varchar(10) NOT NULL,
  `ctName` varchar(10) NOT NULL,
  `levelId` int(11) NOT NULL,
  `integral` int(11) DEFAULT '0',
  `consume` decimal(12,2) DEFAULT '0.00',
  `times` int(11) DEFAULT '0',
  `balance` decimal(12,2) DEFAULT '0.00',
  `ctState` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`ctId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('9001', '客户1', '5003', '630', '6300.00', '100', '520.00', '1');
INSERT INTO `customer` VALUES ('90011', '客户11', '5002', '600', '6000.00', '500', '12.00', '1');
INSERT INTO `customer` VALUES ('9002', '客户2', '5001', '0', '0.00', '0', '0.00', '1');
INSERT INTO `customer` VALUES ('9003', '客户3', '5002', '10', '100.00', '2', '0.00', '1');
INSERT INTO `customer` VALUES ('9004', '客户4', '5001', '0', '0.00', '0', '0.00', '0');
INSERT INTO `customer` VALUES ('9005', '客户5', '5001', '0', '230.00', '4', '0.00', '2');
INSERT INTO `customer` VALUES ('9006', '客户6', '5001', '0', '0.00', '0', '0.00', '1');
INSERT INTO `customer` VALUES ('9009', '客户9', '5002', '230', '2300.00', '16', '512.00', '1');
INSERT INTO `customer` VALUES ('9010', '客户10', '5002', '10', '100.00', '1', '100.00', '1');
INSERT INTO `customer` VALUES ('9011', '客户11', '5002', '500', '5000.00', '300', '0.00', '1');

-- ----------------------------
-- Table structure for `dispatch`
-- ----------------------------
DROP TABLE IF EXISTS `dispatch`;
CREATE TABLE `dispatch` (
  `dispId` varchar(50) NOT NULL,
  `from` varchar(50) NOT NULL,
  `to` varchar(50) NOT NULL,
  `date` date DEFAULT NULL,
  `sfid` varchar(10) NOT NULL,
  `mark` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`dispId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dispatch
-- ----------------------------
INSERT INTO `dispatch` VALUES ('DB20171121131731', '1', '2', '2017-11-21', '1', '..');
INSERT INTO `dispatch` VALUES ('DB20171121132043', '1', '2', '2017-11-21', '1', '..');
INSERT INTO `dispatch` VALUES ('DB20171121132416', '3', '1', '2017-11-21', '1', '..');
INSERT INTO `dispatch` VALUES ('DB20171121132535', '2', '3', '2017-11-21', '1', '..');
INSERT INTO `dispatch` VALUES ('DB20171121152527', '3', '2', '2017-11-21', '1', '..');
INSERT INTO `dispatch` VALUES ('DB20171121152615', '1', '2', '2017-11-21', '1', '..');
INSERT INTO `dispatch` VALUES ('DB20171121171217', '1', '2', '2017-11-22', '1', '..');
INSERT INTO `dispatch` VALUES ('DB20171121192547', '1', '1', '2017-11-22', '1', '..');
INSERT INTO `dispatch` VALUES ('DB20171122092725', '1', '2', '2017-11-22', '1', '..');
INSERT INTO `dispatch` VALUES ('DB20171122092812', '2', '1', '2017-11-22', '1', '..');
INSERT INTO `dispatch` VALUES ('DB20171122092906', '2', '1', '2017-11-22', '1', '..');
INSERT INTO `dispatch` VALUES ('DB20171122092919', '2', '1', '2017-11-22', '1', '..');
INSERT INTO `dispatch` VALUES ('DB20171122123505', '2', '3', '2017-11-22', '1', '..');
INSERT INTO `dispatch` VALUES ('DB20171122161006', '1', '3', '2017-11-23', '4', '..');
INSERT INTO `dispatch` VALUES ('DB20171122161033', '3', '1', '2017-11-23', '2', '..');
INSERT INTO `dispatch` VALUES ('DB20171122170025', '1', '1', '2017-11-23', '4', '..');
INSERT INTO `dispatch` VALUES ('DB20171122172053', '1', '2', '2017-11-23', '3', '..');
INSERT INTO `dispatch` VALUES ('DB20171122184307', '1', '2', '2017-11-23', '3', '..');
INSERT INTO `dispatch` VALUES ('DB20171123085501', '1', '2', '2017-11-23', '2', '..');
INSERT INTO `dispatch` VALUES ('DB20171123094342', '1', '2', '2017-11-23', '2', '..');
INSERT INTO `dispatch` VALUES ('DB20171123105238', '1', '3', '2017-11-23', '4', '..');
INSERT INTO `dispatch` VALUES ('DB20171123130929', '2', '1', '2017-11-23', '2', '..');
INSERT INTO `dispatch` VALUES ('DB20171123131804', '2', '1', '2017-11-23', '4', '..');
INSERT INTO `dispatch` VALUES ('DB20171123132025', '2', '1', '2017-11-23', '4', '..');
INSERT INTO `dispatch` VALUES ('DB20171123140228', '1', '2', '2017-11-23', '4', '..');
INSERT INTO `dispatch` VALUES ('DB20171123140518', '1', '2', '2017-11-23', '1', '..');
INSERT INTO `dispatch` VALUES ('DB20171123140916', '1', '2', '2017-11-23', '1', '..');
INSERT INTO `dispatch` VALUES ('DB20171123142516', '1', '2', '2017-11-23', '2', '..');
INSERT INTO `dispatch` VALUES ('DB20171123142638', '1', '2', '2017-11-23', '2', '..');
INSERT INTO `dispatch` VALUES ('DB20171123145616', '1', '2', '2017-11-23', '2', '..');
INSERT INTO `dispatch` VALUES ('DB20171123175010', '1', '3', '2017-11-24', '2', '..');
INSERT INTO `dispatch` VALUES ('DB20171123184014', '3', '1', '2017-11-24', '2', '..');
INSERT INTO `dispatch` VALUES ('DB20171123185534', '1', '3', '2017-11-24', '2', '..');
INSERT INTO `dispatch` VALUES ('DB20171123185819', '1', '3', '2017-11-24', '2', '..');
INSERT INTO `dispatch` VALUES ('DB20171124102910', '1', '2', '2017-11-24', '4', '..');
INSERT INTO `dispatch` VALUES ('DB20171124155012', '1', '2', '2017-11-24', '4', '..');

-- ----------------------------
-- Table structure for `dispItems`
-- ----------------------------
DROP TABLE IF EXISTS `dispItems`;
CREATE TABLE `dispItems` (
  `ditemID` varchar(50) NOT NULL,
  `diId` varchar(50) NOT NULL,
  `amount` int(11) NOT NULL,
  `dispId` varchar(50) NOT NULL,
  PRIMARY KEY (`ditemID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dispItems
-- ----------------------------
INSERT INTO `dispItems` VALUES ('171121131731751', '2', '1', 'DB20171121131731');
INSERT INTO `dispItems` VALUES ('171121131731754', '1', '2', 'DB20171121131731');
INSERT INTO `dispItems` VALUES ('1711211320431937', '1', '2', 'DB20171121132043');
INSERT INTO `dispItems` VALUES ('171121132043623', '2', '1', 'DB20171121132043');
INSERT INTO `dispItems` VALUES ('1711211324161359', '1', '2', 'DB20171121132416');
INSERT INTO `dispItems` VALUES ('171121132416748', '2', '1', 'DB20171121132416');
INSERT INTO `dispItems` VALUES ('1711211325351551', '1', '2', 'DB20171121132535');
INSERT INTO `dispItems` VALUES ('1711211325351651', '2', '1', 'DB20171121132535');
INSERT INTO `dispItems` VALUES ('171121152527403', '2', '53', 'DB20171121152527');
INSERT INTO `dispItems` VALUES ('171121152527880', '1', '25', 'DB20171121152527');
INSERT INTO `dispItems` VALUES ('1711211526151531', '1', '25', 'DB20171121152615');
INSERT INTO `dispItems` VALUES ('1711211526151788', '2', '53', 'DB20171121152615');
INSERT INTO `dispItems` VALUES ('1711211712171173', '2', '53', 'DB20171121171217');
INSERT INTO `dispItems` VALUES ('171121171217665', '1', '25', 'DB20171121171217');
INSERT INTO `dispItems` VALUES ('1711211925471394', '1', '0', 'DB20171121192547');
INSERT INTO `dispItems` VALUES ('1711211925471674', '2', '0', 'DB20171121192547');
INSERT INTO `dispItems` VALUES ('1711220927251402', '1', '10', 'DB20171122092725');
INSERT INTO `dispItems` VALUES ('17112209272570', '2', '23', 'DB20171122092725');
INSERT INTO `dispItems` VALUES ('1711220928121713', '1', '21', 'DB20171122092812');
INSERT INTO `dispItems` VALUES ('171122092812885', '2', '56', 'DB20171122092812');
INSERT INTO `dispItems` VALUES ('1711220929061493', '2', '2', 'DB20171122092906');
INSERT INTO `dispItems` VALUES ('171122092906788', '1', '1', 'DB20171122092906');
INSERT INTO `dispItems` VALUES ('1711220929191960', '2', '3', 'DB20171122092919');
INSERT INTO `dispItems` VALUES ('171122092919481', '1', '2', 'DB20171122092919');
INSERT INTO `dispItems` VALUES ('171122123505772', '2', '211', 'DB20171122123505');
INSERT INTO `dispItems` VALUES ('171122123505773', '1', '22', 'DB20171122123505');
INSERT INTO `dispItems` VALUES ('171122161006438', '1', '22', 'DB20171122161006');
INSERT INTO `dispItems` VALUES ('171122161006610', '2', '211', 'DB20171122161006');
INSERT INTO `dispItems` VALUES ('1711221610331362', '1', '22', 'DB20171122161033');
INSERT INTO `dispItems` VALUES ('1711221610331437', '2', '211', 'DB20171122161033');
INSERT INTO `dispItems` VALUES ('171122170025191', '2', '5', 'DB20171122170025');
INSERT INTO `dispItems` VALUES ('171122170025248', '1', '3', 'DB20171122170025');
INSERT INTO `dispItems` VALUES ('1711221720531101', '1', '5', 'DB20171122172053');
INSERT INTO `dispItems` VALUES ('1711221843071084', '1', '5', 'DB20171122184307');
INSERT INTO `dispItems` VALUES ('1711221843071168', '2', '6', 'DB20171122184307');
INSERT INTO `dispItems` VALUES ('1711230855011103', '1', '20', 'DB20171123085501');
INSERT INTO `dispItems` VALUES ('171123085501901', '2', '206', 'DB20171123085501');
INSERT INTO `dispItems` VALUES ('1711230943421052', '1', '2', 'DB20171123094342');
INSERT INTO `dispItems` VALUES ('171123094342322', '2', '10', 'DB20171123094342');
INSERT INTO `dispItems` VALUES ('1711231052381764', '1', '5', 'DB20171123105238');
INSERT INTO `dispItems` VALUES ('1711231052381909', '2', '25', 'DB20171123105238');
INSERT INTO `dispItems` VALUES ('1711231309291468', '2', '159', 'DB20171123130929');
INSERT INTO `dispItems` VALUES ('171123130929348', '1', '25', 'DB20171123130929');
INSERT INTO `dispItems` VALUES ('1711231318041715', '1', '20', 'DB20171123131804');
INSERT INTO `dispItems` VALUES ('1711231318043', '2', '159', 'DB20171123131804');
INSERT INTO `dispItems` VALUES ('1711231320251977', '2', '159', 'DB20171123132025');
INSERT INTO `dispItems` VALUES ('171123132025604', '1', '23', 'DB20171123132025');
INSERT INTO `dispItems` VALUES ('1711231402281264', '1', '4', 'DB20171123140228');
INSERT INTO `dispItems` VALUES ('1711231402281982', '2', '24', 'DB20171123140228');
INSERT INTO `dispItems` VALUES ('171123140518111', '1', '4', 'DB20171123140518');
INSERT INTO `dispItems` VALUES ('171123140518621', '2', '5', 'DB20171123140518');
INSERT INTO `dispItems` VALUES ('1711231409161734', '2', '-5', 'DB20171123140916');
INSERT INTO `dispItems` VALUES ('171123140916774', '1', '-28', 'DB20171123140916');
INSERT INTO `dispItems` VALUES ('171123142516394', '2', '45', 'DB20171123142516');
INSERT INTO `dispItems` VALUES ('171123142516959', '1', '12', 'DB20171123142516');
INSERT INTO `dispItems` VALUES ('171123142638107', '2', '35', 'DB20171123142638');
INSERT INTO `dispItems` VALUES ('171123142638309', '1', '12', 'DB20171123142638');
INSERT INTO `dispItems` VALUES ('1711231456161231', '2', '28', 'DB20171123145616');
INSERT INTO `dispItems` VALUES ('1711231750101694', '302001', '45', 'DB20171123175010');
INSERT INTO `dispItems` VALUES ('1711231750101778', '1', '45', 'DB20171123175010');
INSERT INTO `dispItems` VALUES ('171123175010214', '2', '45', 'DB20171123175010');
INSERT INTO `dispItems` VALUES ('171123184014557', '302001', '20', 'DB20171123184014');
INSERT INTO `dispItems` VALUES ('1711231855341406', '302001', '10', 'DB20171123185534');
INSERT INTO `dispItems` VALUES ('171123185534254', '1', '23', 'DB20171123185534');
INSERT INTO `dispItems` VALUES ('171123185534980', '2', '12', 'DB20171123185534');
INSERT INTO `dispItems` VALUES ('1711231858191083', '302001', '1', 'DB20171123185819');
INSERT INTO `dispItems` VALUES ('1711231858191098', '2', '2', 'DB20171123185819');
INSERT INTO `dispItems` VALUES ('171123185819574', '1', '1', 'DB20171123185819');
INSERT INTO `dispItems` VALUES ('1711241029101943', '2', '10', 'DB20171124102910');
INSERT INTO `dispItems` VALUES ('171124102910862', '302001', '9', 'DB20171124102910');
INSERT INTO `dispItems` VALUES ('1711241550121090', '2', '5', 'DB20171124155012');
INSERT INTO `dispItems` VALUES ('171124155012765', '1', '5', 'DB20171124155012');

-- ----------------------------
-- Table structure for `drugDetailed`
-- ----------------------------
DROP TABLE IF EXISTS `drugDetailed`;
CREATE TABLE `drugDetailed` (
  `ddId` varchar(10) NOT NULL,
  `ddName` varchar(25) NOT NULL,
  `dtId` varchar(10) NOT NULL,
  PRIMARY KEY (`ddId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of drugDetailed
-- ----------------------------
INSERT INTO `drugDetailed` VALUES ('1', '抗微生物药', '1x');
INSERT INTO `drugDetailed` VALUES ('10', '根和根茎类', '2');
INSERT INTO `drugDetailed` VALUES ('11', '全草类', '3');
INSERT INTO `drugDetailed` VALUES ('12', '矿石类和动物类', '3');
INSERT INTO `drugDetailed` VALUES ('123', '纯纯粹粹', '1x');
INSERT INTO `drugDetailed` VALUES ('13', '花类', '3');
INSERT INTO `drugDetailed` VALUES ('14', '果实和种子类', '3');
INSERT INTO `drugDetailed` VALUES ('15', '贵细类', '3');
INSERT INTO `drugDetailed` VALUES ('16', '中药', '4');
INSERT INTO `drugDetailed` VALUES ('17', '医用敷料', '5');
INSERT INTO `drugDetailed` VALUES ('18', '计划用品', '5');
INSERT INTO `drugDetailed` VALUES ('19', '玻璃器具及一次性用品', '5');
INSERT INTO `drugDetailed` VALUES ('2', '解热镇痛药', '1x');
INSERT INTO `drugDetailed` VALUES ('20', '诊断仪器及化学试剂', '5');
INSERT INTO `drugDetailed` VALUES ('21', '搪瓷制品及设备类', '5');
INSERT INTO `drugDetailed` VALUES ('21323', '呵呵呵呵', '5');
INSERT INTO `drugDetailed` VALUES ('22', '保健内服', '6');
INSERT INTO `drugDetailed` VALUES ('23', '保健外服', '6');
INSERT INTO `drugDetailed` VALUES ('231', '士大夫', '2');
INSERT INTO `drugDetailed` VALUES ('232132', '是防守打法', '6');
INSERT INTO `drugDetailed` VALUES ('24', '消化系统用药', '2');
INSERT INTO `drugDetailed` VALUES ('3', '血液系统用药', '1x');
INSERT INTO `drugDetailed` VALUES ('333', '啊大大', '6');
INSERT INTO `drugDetailed` VALUES ('4', '呼吸系统用药', '1x');
INSERT INTO `drugDetailed` VALUES ('5', '清热解毒药', '2');
INSERT INTO `drugDetailed` VALUES ('6', '抗菌消炎药', '2');
INSERT INTO `drugDetailed` VALUES ('66', '阿萨大大阿斯顿', '2');
INSERT INTO `drugDetailed` VALUES ('7', '妇科用药', '2');
INSERT INTO `drugDetailed` VALUES ('8', '呼吸系统用药', '2');
INSERT INTO `drugDetailed` VALUES ('9', '抗过敏药', '2');

-- ----------------------------
-- Table structure for `drugInfo`
-- ----------------------------
DROP TABLE IF EXISTS `drugInfo`;
CREATE TABLE `drugInfo` (
  `diId` varchar(10) NOT NULL,
  `ddId` varchar(10) NOT NULL,
  `diName` varchar(255) NOT NULL,
  `commonName` varchar(64) DEFAULT NULL,
  `barCode` varchar(255) NOT NULL,
  `drugUnit` varchar(10) NOT NULL,
  `specification` varchar(10) NOT NULL,
  `drugType` varchar(10) NOT NULL,
  `registered` varchar(255) NOT NULL,
  `approval` varchar(255) NOT NULL,
  `miniStock` int(11) NOT NULL,
  `singelPrice` decimal(12,2) NOT NULL,
  `price` decimal(12,2) NOT NULL,
  `bargainPrice` decimal(12,2) DEFAULT NULL,
  `manufacturer` varchar(64) NOT NULL,
  `drugRemarks` varchar(255) DEFAULT NULL,
  `isEphedrine` tinyint(4) DEFAULT '0',
  `supervision` tinyint(4) DEFAULT '0',
  `disable` tinyint(4) DEFAULT '0',
  PRIMARY KEY (`diId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of drugInfo
-- ----------------------------
INSERT INTO `drugInfo` VALUES ('1', '1', '人工牛黄甲硝唑胶囊(牙痛安)', 'EGNHJLCJN', 'EGNH170618', '盒', '10mg*9', '西药', '国药准字', '国药准字', '30', '16.00', '12.00', '14.00', '石家庄制药', '一般药品', '0', '0', '0');
INSERT INTO `drugInfo` VALUES ('14', '4', '镇咳糖浆', 'ZKTJ', '6916082513687', '瓶', 'TS16949', '浆液型', '194627', '国药准字', '90', '40.00', '25.00', '32.00', '江西广力药业', '镇咳糖浆', '0', '0', '0');
INSERT INTO `drugInfo` VALUES ('2', '1', '糠甾醇片(牙周宁)', 'KBCP', 'KBCP170806', '盒', '40mg*60s', '西药', '国药准字', '国药准字', '40', '26.00', '18.00', '23.00', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '一般药品', '0', '0', '0');
INSERT INTO `drugInfo` VALUES ('20301', '24', '江中健胃消食片', 'JZJWXSP', 'JZJWXSP171023', '盒', '10mg*12', '西药', '国药准字', 'GB/T 2003', '60', '22.00', '17.00', '20.00', '江中集团', '儿童健胃消食片', '1', '0', '0');
INSERT INTO `drugInfo` VALUES ('21323', '2', '且', '13', '123', '板', '123', '31', '13', '13', '13', '13.00', '13.00', '13.00', '123', '13', '0', '0', '0');
INSERT INTO `drugInfo` VALUES ('3', '1', '阿昔洛韦片', 'ASLW', 'ASLW160707', '盒', '8mg*12', '西药', '108975', '国药准字', '80', '42.00', '34.00', '38.00', '四川珍珠制药', '阿昔洛韦片', '0', '0', '0');
INSERT INTO `drugInfo` VALUES ('302001', '11', '鱼腥草', 'YXC', 'YXC170925', '公斤', '饮片', '草药', '国药准字', 'GB/T 2006', '30', '70.00', '50.00', '65.00', '华康中草药公司', '鱼腥草，晒干', '1', '1', '1');
INSERT INTO `drugInfo` VALUES ('4', '2', '小儿解表颗粒　', 'XEJB', 'XEJB12673', '盒', '12mg*10', '西药', '2012356', 'GB/T 2006', '70', '50.00', '20.00', '30.00', '昆明金殿制药', '小儿解表颗粒', '0', '0', '0');

-- ----------------------------
-- Table structure for `drugTotal`
-- ----------------------------
DROP TABLE IF EXISTS `drugTotal`;
CREATE TABLE `drugTotal` (
  `dtId` varchar(10) NOT NULL,
  `dtName` varchar(25) NOT NULL,
  PRIMARY KEY (`dtId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of drugTotal
-- ----------------------------
INSERT INTO `drugTotal` VALUES ('1x', '处方药');
INSERT INTO `drugTotal` VALUES ('2', '非处方药');
INSERT INTO `drugTotal` VALUES ('3', '中药饮片');
INSERT INTO `drugTotal` VALUES ('4', '中药材');
INSERT INTO `drugTotal` VALUES ('5', '医疗器械');
INSERT INTO `drugTotal` VALUES ('6', '非药品(保健品)');

-- ----------------------------
-- Table structure for `job`
-- ----------------------------
DROP TABLE IF EXISTS `job`;
CREATE TABLE `job` (
  `jobId` varchar(10) NOT NULL,
  `jobName` varchar(20) NOT NULL,
  `commission` double(3,2) NOT NULL,
  PRIMARY KEY (`jobId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of job
-- ----------------------------
INSERT INTO `job` VALUES ('1001', '采购员', '0.00');
INSERT INTO `job` VALUES ('1002', '销售', '0.05');
INSERT INTO `job` VALUES ('1003', '仓库管理员', '0.00');
INSERT INTO `job` VALUES ('1010', '测试员1', '0.34');

-- ----------------------------
-- Table structure for `logDetail`
-- ----------------------------
DROP TABLE IF EXISTS `logDetail`;
CREATE TABLE `logDetail` (
  `logId` varchar(50) NOT NULL,
  `tradeId` varchar(50) NOT NULL,
  `tradeTime` date NOT NULL,
  `diId` varchar(50) NOT NULL,
  `inQty` int(11) NOT NULL,
  `outQty` int(11) NOT NULL,
  `wid` varchar(10) NOT NULL,
  `batch` varchar(20) NOT NULL,
  `expire` date NOT NULL,
  `supplier` varchar(50) NOT NULL,
  `sfId` varchar(20) NOT NULL,
  `info` varchar(50) DEFAULT NULL,
  `state` int(11) DEFAULT '0',
  PRIMARY KEY (`logId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of logDetail
-- ----------------------------
INSERT INTO `logDetail` VALUES ('0857d8c878eb45a5817998aab84025d8', 'B94220171123090204', '2017-11-23', '1', '0', '10', '1', '2316468', '2017-11-22', '石家庄制药', '2', '报损出库', '1');
INSERT INTO `logDetail` VALUES ('0865a7c64a45474abad31e774bd3969a', 'DB20171121152615', '2017-11-21', '1', '25', '0', '2', '2316468', '2017-11-21', '石家庄制药', '1', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('0c85e14fc91d47c2a758a17e4b5c93a8', 'R43420171122163557', '2017-11-23', '2', '0', '5', '1', '2316468', '2017-11-22', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '2', '报损出库', '1');
INSERT INTO `logDetail` VALUES ('0ca9bacebc3b4013820f342ace50b1ed', 'DB20171122092906', '2017-11-22', '2', '2', '0', '1', '2316468', '2017-11-22', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '1', '副仓库调度到主仓库', '1');
INSERT INTO `logDetail` VALUES ('0d92243f843643409dfd60f6039774de', 'DB20171124155012', '2017-11-24', '1', '5', '0', '2', '2316468', '2017-11-24', '石家庄制药', '4', '主仓库调度到副仓库', '0');
INSERT INTO `logDetail` VALUES ('0e7aaa9e257c486d871003ec067fa84c', 'DB20171122092812', '2017-11-22', '1', '21', '0', '1', '2316468', '2017-11-22', '石家庄制药', '1', '副仓库调度到主仓库', '1');
INSERT INTO `logDetail` VALUES ('1362faf08fdb41f189a9c17dc98eae7c', 'DB20171122161006', '2017-11-23', '2', '211', '0', '3', '2316468', '2017-11-23', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '4', '主仓库调度到酒库', '1');
INSERT INTO `logDetail` VALUES ('14e00efcccd641deb254f5bf5b592576', 'DB20171123142638', '2017-11-23', '1', '0', '12', '1', '2316468', '2017-11-23', '石家庄制药', '2', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('15854ea429e24fe6aff768ebd970066b', 'DB20171123105238', '2017-11-23', '1', '5', '8', '3', '2316468', '2017-11-23', '石家庄制药', '4', '主仓库调度到酒库', '1');
INSERT INTO `logDetail` VALUES ('168d00ca5c654235b279932d64009b16', 'R72520171121181027', '2017-11-22', '1', '0', '3', '1', '2316468', '2017-11-21', '石家庄制药', '1', '报损出库', '1');
INSERT INTO `logDetail` VALUES ('19967ed14fa84cbca340d8536c1b498c', 'DB20171124155012', '2017-11-24', '2', '0', '5', '1', '2316468', '2017-11-24', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '4', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('1a4ddd35780b4ee4815776832bd218b8', 'DB20171122092919', '2017-11-22', '2', '3', '0', '1', '2316468', '2017-11-22', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '1', '副仓库调度到主仓库', '1');
INSERT INTO `logDetail` VALUES ('1b20e659b3e5474892bf9dc0cd2b834c', 'DB20171124102910', '2017-11-24', '2', '10', '0', '2', '2316468', '2017-11-24', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '4', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('1ce1acca06be430086c65ff78a96b455', 'DB20171122184307', '2017-11-23', '1', '5', '0', '2', '2316468', '2017-11-23', '石家庄制药', '3', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('232f3d62059040059b1223fd16e58c00', 'DB20171124102910', '2017-11-24', '302001', '9', '0', '2', '2316468', '2017-11-24', '华康中草药公司', '4', '主仓库调度到副仓库', '0');
INSERT INTO `logDetail` VALUES ('28ff1099d5fe44019d47614d68374d24', 'R51720171121171657', '2017-11-22', '1', '0', '45', '1', '2316468', '2017-11-21', '石家庄制药', '1', '所在仓库主仓库', '1');
INSERT INTO `logDetail` VALUES ('2eae76c23c6647d4a49e2a4fa52d050b', 'DB20171121171217', '2017-11-22', '2', '53', '0', '2', '2316468', '2017-11-22', '浙江昂利康制药有限公司\r\n浙江昂利康制药有限公司', '1', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('2fe29076bcbb451e9c9538aeca64811b', 'DB20171123185534', '2017-11-24', '302001', '0', '10', '1', '2316468', '2017-11-24', '华康中草药公司', '2', '主仓库调度到酒库', '0');
INSERT INTO `logDetail` VALUES ('320dd952dcd14e8d8500812ef9359017', 'DB20171123085501', '2017-11-23', '2', '206', '0', '2', '2316468', '2017-11-23', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '2', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('33929c6b321b43a48f18c7981d1eb517', 'DB20171121132416', '2017-11-21', '1', '2', '0', '1', '2316468', '2017-11-21', '石家庄制药', '1', '酒库调度到主仓库', '1');
INSERT INTO `logDetail` VALUES ('33bafe143dfb4dec8bac7baaf40e3ef2', 'DB20171122161006', '2017-11-23', '1', '22', '0', '3', '2316468', '2017-11-23', '石家庄制药', '4', '主仓库调度到酒库', '1');
INSERT INTO `logDetail` VALUES ('3527c45e5510484bbb593ee50d8f29f0', 'DB20171123140916', '2017-11-23', '1', '23', '0', '2', '2316468', '2017-11-23', '石家庄制药', '1', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('386128d85316457a94bc202908d575c9', 'DB20171123130929', '2017-11-23', '2', '159', '0', '1', '2316468', '2017-11-23', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '2', '副仓库调度到主仓库', '1');
INSERT INTO `logDetail` VALUES ('400cda71c272466ab6cda6c308a1eda2', 'DB20171123185819', '2017-11-24', '2', '2', '0', '3', '2316468', '2017-11-24', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '2', '主仓库调度到酒库', '1');
INSERT INTO `logDetail` VALUES ('4120c74cbe1d4843a476aadb50ed6664', 'DB20171124102910', '2017-11-24', '2', '0', '10', '1', '2316468', '2017-11-24', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '4', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('44bb4ed9b2e14ef091946467ed6af41b', 'DB20171123140228', '2017-11-23', '1', '4', '0', '2', '2316468', '2017-11-23', '石家庄制药', '4', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('45b78d99765040fd9f61264825237010', 'DB20171123175010', '2017-11-24', '302001', '45', '0', '3', '2316468', '2017-11-24', '华康中草药公司', '2', '主仓库调度到酒库', '0');
INSERT INTO `logDetail` VALUES ('45jkjkgkgjh', 'PC123165451313', '2017-11-17', '302001', '45', '0', '1', '26613', '2017-11-15', '成都制药', '3', '采购进货', '0');
INSERT INTO `logDetail` VALUES ('4619b97adcc942a6ad5c3833aef82801', 'DB20171123140518', '2017-11-23', '2', '5', '0', '2', '2316468', '2017-11-23', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '1', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('49eb041831524938a4288d07a6f3d579', 'DB20171123131804', '2017-11-23', '1', '20', '0', '1', '2316468', '2017-11-23', '石家庄制药', '4', '副仓库调度到主仓库', '1');
INSERT INTO `logDetail` VALUES ('4a8c7d884c404497b443f3d9e08d7b4b', 'DB20171122092725', '2017-11-22', '2', '23', '0', '2', '2316468', '2017-11-22', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '1', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('4b0066692c644af8924eca3d5a28b38f', 'DB20171122184307', '2017-11-23', '2', '6', '8', '2', '2316468', '2017-11-23', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '3', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('4c1636be05ba4af48b05be3b38c56ccb', 'DB20171123094342', '2017-11-23', '2', '10', '0', '2', '2316468', '2017-11-23', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '2', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('4dad15d7967542f5bd74bef3a90e451c', 'DB20171123142516', '2017-11-23', '1', '12', '0', '2', '2316468', '2017-11-23', '石家庄制药', '2', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('51226208464640ca8f7f5162b5902b7d', 'DB20171123145616', '2017-11-23', '2', '28', '0', '2', '2316468', '2017-11-23', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '2', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('513a576d32c64166bed2da0bca57a0b4', 'DB20171123185819', '2017-11-24', '302001', '0', '1', '1', '2316468', '2017-11-24', '华康中草药公司', '2', '主仓库调度到酒库', '0');
INSERT INTO `logDetail` VALUES ('526b321ae4054a0583d1cc1f26fc8169', 'DB20171123185534', '2017-11-24', '302001', '10', '0', '3', '2316468', '2017-11-24', '华康中草药公司', '2', '主仓库调度到酒库', '0');
INSERT INTO `logDetail` VALUES ('57a5f5f972ef44caa2ca7a118a06ba23', 'DB20171123185819', '2017-11-24', '1', '0', '1', '1', '2316468', '2017-11-24', '石家庄制药', '2', '主仓库调度到酒库', '0');
INSERT INTO `logDetail` VALUES ('57aa556fda2048329d7f1dd1d7d92037', 'R43420171122163557', '2017-11-23', '1', '0', '2', '1', '2316468', '2017-11-22', '石家庄制药', '2', '报损出库', '1');
INSERT INTO `logDetail` VALUES ('58d08ab4de8a4aab994526ddc4d750c7', 'DB20171121192547', '2017-11-22', '2', '0', '85', '1', '2316468', '2017-11-22', '浙江昂利康制药有限公司\r\n浙江昂利康制药有限公司', '1', '主仓库调度到主仓库', '1');
INSERT INTO `logDetail` VALUES ('58ddb756ddb846e7a79fbb855c116c70', 'DB20171122092906', '2017-11-22', '1', '1', '0', '1', '2316468', '2017-11-22', '石家庄制药', '1', '副仓库调度到主仓库', '1');
INSERT INTO `logDetail` VALUES ('5d53a584647c4d69ba8271298ae6ad9c', 'DB20171123175010', '2017-11-24', '1', '45', '0', '3', '2316468', '2017-11-24', '石家庄制药', '2', '主仓库调度到酒库', '0');
INSERT INTO `logDetail` VALUES ('5e98d577e39e4f35a0b1198ff5739d13', 'DB20171124155012', '2017-11-24', '1', '0', '5', '1', '2316468', '2017-11-24', '石家庄制药', '4', '主仓库调度到副仓库', '0');
INSERT INTO `logDetail` VALUES ('66a99b74b3b34edab3b102a1b8ee4d1b', 'DB20171123140228', '2017-11-23', '1', '0', '4', '1', '2316468', '2017-11-23', '石家庄制药', '4', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('681d9f500f424962b86bb98fc1e1c334', 'DB20171121132535', '2017-11-21', '2', '1', '4', '3', '2316468', '2017-11-21', '浙江昂利康制药有限公司\r\n浙江昂利康制药有限公司', '1', '副仓库调度到酒库', '1');
INSERT INTO `logDetail` VALUES ('682f6f06ab1d43daad94178772d86758', 'DB20171123175010', '2017-11-24', '1', '0', '45', '1', '2316468', '2017-11-24', '石家庄制药', '2', '主仓库调度到酒库', '0');
INSERT INTO `logDetail` VALUES ('683a616207c64c31a8d176237b23984c', 'DB20171123142638', '2017-11-23', '2', '0', '35', '1', '2316468', '2017-11-23', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '2', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('69dd3ebe93b74f859c7afc4036ddf8e5', 'DB20171123142638', '2017-11-23', '2', '35', '0', '2', '2316468', '2017-11-23', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '2', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('69f1cca7c5a14e4e951ddfd3d8b33fce', 'DB20171123184014', '2017-11-24', '302001', '0', '20', '3', '2316468', '2017-11-24', '华康中草药公司', '2', '酒库调度到主仓库', '0');
INSERT INTO `logDetail` VALUES ('6a502b8dab6d4219b879db947c396353', 'DB20171123132025', '2017-11-23', '1', '23', '0', '1', '2316468', '2017-11-23', '石家庄制药', '4', '副仓库调度到主仓库', '1');
INSERT INTO `logDetail` VALUES ('6a7df7381e074aa8b38ca97e0f3c01bc', 'DB20171121152527', '2017-11-21', '2', '53', '0', '2', '2316468', '2017-11-21', '浙江昂利康制药有限公司\r\n浙江昂利康制药有限公司', '1', '酒库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('6abd3b0c435341d68ac689dba66720bb', 'DB20171123185534', '2017-11-24', '2', '12', '0', '3', '2316468', '2017-11-24', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '2', '主仓库调度到酒库', '1');
INSERT INTO `logDetail` VALUES ('6d6ac9930249484da3052f6d425e17fc', 'DB20171123085501', '2017-11-23', '1', '20', '0', '2', '2316468', '2017-11-23', '石家庄制药', '2', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('7591ad79328147f8a2bce9880c52b27a', 'DB20171124102910', '2017-11-24', '302001', '0', '9', '1', '2316468', '2017-11-24', '华康中草药公司', '4', '主仓库调度到副仓库', '0');
INSERT INTO `logDetail` VALUES ('775fa03e373d41dbbc0b1925bebe337f', 'DB20171122161033', '2017-11-23', '1', '0', '22', '1', '2316468', '2017-11-23', '石家庄制药', '2', '酒库调度到主仓库', '1');
INSERT INTO `logDetail` VALUES ('78d515cd59d4471fa1f7aa4b3ba4b9c9', 'DB20171123140518', '2017-11-23', '1', '0', '4', '1', '2316468', '2017-11-23', '石家庄制药', '1', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('7ae6240d9dbe42f4b0bf336521e5ce08', 'DB20171122172053', '2017-11-23', '1', '5', '0', '2', '2316468', '2017-11-23', '石家庄制药', '3', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('7bde71be71c5409d9ef039c977d8018d', 'DB20171123140916', '2017-11-23', '1', '530', '0', '1', '2316468', '2017-11-23', '石家庄制药', '1', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('7cbc2a3255fb4dfa8ac1c023ff151c85', 'DB20171121152615', '2017-11-21', '2', '53', '0', '2', '2316468', '2017-11-21', '浙江昂利康制药有限公司\r\n浙江昂利康制药有限公司', '1', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('816061f92bee4069bda6cc51d2f821b1', 'DB20171123175010', '2017-11-24', '302001', '0', '45', '1', '2316468', '2017-11-24', '华康中草药公司', '2', '主仓库调度到酒库', '0');
INSERT INTO `logDetail` VALUES ('84d6a4a125ba436ba424389c974c0bda', 'DB20171123145616', '2017-11-23', '2', '0', '28', '1', '2316468', '2017-11-23', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '2', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('8ba5c9cfa0bd451e8d4c52fdba1ffb25', 'B54420171123145914', '2017-11-23', '2', '0', '23', '1', '2316468', '2017-11-22', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '2', '报损出库', '1');
INSERT INTO `logDetail` VALUES ('8c1f4809769c4d05b2dd393666117f53', 'DB20171123132025', '2017-11-23', '2', '159', '0', '1', '2316468', '2017-11-23', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '4', '副仓库调度到主仓库', '1');
INSERT INTO `logDetail` VALUES ('8c7c28fc68804841bfa1ccb806f17899', 'DB20171123131804', '2017-11-23', '2', '159', '0', '1', '2316468', '2017-11-23', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '4', '副仓库调度到主仓库', '1');
INSERT INTO `logDetail` VALUES ('8c82de17b98648cc8b1fedcc63587d0b', 'DB20171123175010', '2017-11-24', '2', '0', '45', '1', '2316468', '2017-11-24', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '2', '主仓库调度到酒库', '1');
INSERT INTO `logDetail` VALUES ('8fd83f04a1434fd08f042d34d3c37bd', 'PC2017235641', '2017-11-06', '20301', '25', '0', '2', '222545', '2017-11-22', '大茗制药', '2', '采购进货', '0');
INSERT INTO `logDetail` VALUES ('8fd83f04a1434fd08f042d34d3c37bda', 'DB20171121132535', '2017-11-21', '1', '2', '6', '3', '2316468', '2017-11-21', '石家庄制药', '1', '副仓库调度到酒库', '1');
INSERT INTO `logDetail` VALUES ('933fdcea3c51409aa92a25c526945f06', 'R72520171121181027', '2017-11-22', '2', '0', '8', '1', '2316468', '2017-11-21', '浙江昂利康制药有限公司\r\n浙江昂利康制药有限公司', '1', '报损出库', '1');
INSERT INTO `logDetail` VALUES ('9584f81fdecb408ca29c522a8bdd7569', 'DB20171123185534', '2017-11-24', '2', '0', '12', '1', '2316468', '2017-11-24', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '2', '主仓库调度到酒库', '1');
INSERT INTO `logDetail` VALUES ('970e8731e1be4c76a25fdbef6810e186', 'DB20171123140228', '2017-11-23', '2', '0', '24', '1', '2316468', '2017-11-23', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '4', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('9b69e1037349411d93214add06841e72', 'DB20171121171217', '2017-11-22', '1', '25', '5', '2', '2316468', '2017-11-22', '石家庄制药', '1', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('a56b944fcf114506a994b4a656c49d37', 'DB20171123142638', '2017-11-23', '1', '12', '0', '2', '2316468', '2017-11-23', '石家庄制药', '2', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('b02f34b7612345b5936b8085b39068d3', 'DB20171123185819', '2017-11-24', '302001', '1', '0', '3', '2316468', '2017-11-24', '华康中草药公司', '2', '主仓库调度到酒库', '0');
INSERT INTO `logDetail` VALUES ('b1a8e6e3c3814c1e9c2ddb3a76fcb450', 'DB20171122123505', '2017-11-22', '2', '211', '0', '3', '2316468', '2017-11-22', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '1', '副仓库调度到酒库', '1');
INSERT INTO `logDetail` VALUES ('b59a0213965c4b10aea3e6d9474c7573', 'DB20171121132416', '2017-11-21', '2', '1', '0', '1', '2316468', '2017-11-21', '浙江昂利康制药有限公司\r\n浙江昂利康制药有限公司', '1', '酒库调度到主仓库', '1');
INSERT INTO `logDetail` VALUES ('b59a7494213745858802d9d89d2db5df', 'DB20171122123505', '2017-11-22', '1', '852', '0', '3', '2316468', '2017-11-22', '石家庄制药', '1', '副仓库调度到酒库', '1');
INSERT INTO `logDetail` VALUES ('b6635223b4e14bf3bf13b6443fa74233', 'DB20171122170025', '2017-11-23', '2', '5', '0', '1', '2316468', '2017-11-23', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '4', '主仓库调度到主仓库', '1');
INSERT INTO `logDetail` VALUES ('b97c204ebaad4394a100659433302030', 'DB20171123105238', '2017-11-23', '2', '25', '0', '3', '2316468', '2017-11-23', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '4', '主仓库调度到酒库', '1');
INSERT INTO `logDetail` VALUES ('ba81252fbda842a79834700753634d0b', 'DB20171124155012', '2017-11-24', '2', '5', '0', '2', '2316468', '2017-11-24', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '4', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('bd21386b83a145f7bf8afcb584007322', 'DB20171122092919', '2017-11-22', '1', '2', '0', '1', '2316468', '2017-11-22', '石家庄制药', '1', '副仓库调度到主仓库', '1');
INSERT INTO `logDetail` VALUES ('bee9ad575ab949659b49e0d73bcbb946', 'DB20171121132043', '2017-11-21', '1', '2', '0', '2', '2316468', '2017-11-21', '石家庄制药', '1', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('c0a2e130505a4db9b215a1241342a64c', 'B54420171123145914', '2017-11-23', '1', '0', '15', '1', '2316468', '2017-11-22', '石家庄制药', '2', '报损出库', '1');
INSERT INTO `logDetail` VALUES ('c2db648be91f421d98744d0a063fa461', 'DB20171123185819', '2017-11-24', '2', '0', '2', '1', '2316468', '2017-11-24', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '2', '主仓库调度到酒库', '1');
INSERT INTO `logDetail` VALUES ('c511f37e225c42daad400514c7b3ac0e', 'DB20171122170025', '2017-11-23', '1', '3', '0', '1', '2316468', '2017-11-23', '石家庄制药', '4', '主仓库调度到主仓库', '1');
INSERT INTO `logDetail` VALUES ('c73401c1e5d6416d9bfd471a9e6c46fb', 'DB20171121132043', '2017-11-21', '2', '1', '0', '2', '2316468', '2017-11-21', '浙江昂利康制药有限公司\r\n浙江昂利康制药有限公司', '1', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('d2f98f39797742eab8743e069ffc34bd', 'DB20171123094342', '2017-11-23', '1', '520', '0', '2', '2316468', '2017-11-23', '石家庄制药', '2', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('d8757a52174d454e87691f9c5ef23151', 'DB20171123130929', '2017-11-23', '1', '25', '0', '1', '2316468', '2017-11-23', '石家庄制药', '2', '副仓库调度到主仓库', '1');
INSERT INTO `logDetail` VALUES ('d9d08d6b77994e90baedc11f956c3151', 'DB20171122161033', '2017-11-23', '2', '211', '0', '1', '2316468', '2017-11-23', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '2', '酒库调度到主仓库', '1');
INSERT INTO `logDetail` VALUES ('dc14b0e3dd254197abfa60339074d2ae', 'B86520171124155253', '2017-11-24', '2', '0', '12', '1', '2316468', '2017-11-22', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '2', '报损出库', '1');
INSERT INTO `logDetail` VALUES ('dd31d6caae85459885bb29e5af90482e', 'DB20171123185819', '2017-11-24', '1', '1', '0', '3', '2316468', '2017-11-24', '石家庄制药', '2', '主仓库调度到酒库', '0');
INSERT INTO `logDetail` VALUES ('dd42ff159889409c8f572978ae48847b', 'B38720171124155314', '2017-11-24', '1', '0', '20', '1', '2316468', '2017-11-22', '石家庄制药', '4', '报损出库', '0');
INSERT INTO `logDetail` VALUES ('dd73e649884d4c94917c949f6c3abaf4', 'B13020171123133049', '2017-11-23', '1', '0', '5', '1', '2316468', '2017-11-23', '石家庄制药', '3', '报损出库', '1');
INSERT INTO `logDetail` VALUES ('e28da25a52174809a5c2a924e1996350', 'DB20171122092725', '2017-11-22', '1', '10', '0', '2', '2316468', '2017-11-22', '石家庄制药', '1', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('e2c078a9d2ee44b3aed669647d290306', 'R51720171121171657', '2017-11-22', '2', '52', '0', '1', '2316468', '2017-12-22', '浙江昂利康制药有限公司\r\n浙江昂利康制药有限公司', '1', '报损出库', '1');
INSERT INTO `logDetail` VALUES ('e311e287fc8b4e049133f41c811f4274', 'DB20171122092812', '2017-11-22', '2', '0', '56', '1', '2316468', '2017-11-22', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '1', '副仓库调度到主仓库', '1');
INSERT INTO `logDetail` VALUES ('e8b1ece0442143bca0888f21da7bce01', 'DB20171123184014', '2017-11-24', '302001', '20', '0', '1', '2316468', '2017-11-24', '华康中草药公司', '2', '酒库调度到主仓库', '0');
INSERT INTO `logDetail` VALUES ('e9eed2aff5124b2997866951e619e81c', 'DB20171123142516', '2017-11-23', '1', '0', '12', '1', '2316468', '2017-11-23', '石家庄制药', '2', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('ea37ce39221340d983574210463244f3', 'DB20171123084531', '2017-11-23', '1', '20', '0', '1', '2316468', '2017-11-23', '石家庄制药', '2', '副仓库调度到主仓库', '1');
INSERT INTO `logDetail` VALUES ('ea44ff7f82b5418281f65a1fc68a82b8', 'DB20171123175010', '2017-11-24', '2', '45', '0', '3', '2316468', '2017-11-24', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '2', '主仓库调度到酒库', '1');
INSERT INTO `logDetail` VALUES ('ed73fe8f846248209c8972ad1a84a188', 'DB20171123185534', '2017-11-24', '1', '23', '0', '3', '2316468', '2017-11-24', '石家庄制药', '2', '主仓库调度到酒库', '0');
INSERT INTO `logDetail` VALUES ('ee75a992383848afb5fa6c3e6fe36b16', 'DB20171123140518', '2017-11-23', '2', '0', '5', '1', '2316468', '2017-11-23', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '1', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('ef3e312d96b047d3812454cf9f3e38a5', 'DB20171123142516', '2017-11-23', '2', '45', '0', '2', '2316468', '2017-11-23', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '2', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('efa71a2ef30e46e0860837c7910b9f86', 'DB20171123185534', '2017-11-24', '1', '0', '23', '1', '2316468', '2017-11-24', '石家庄制药', '2', '主仓库调度到酒库', '0');
INSERT INTO `logDetail` VALUES ('f49f152c8ab9463abdef738ce812d79c', 'DB20171121192547', '2017-11-22', '1', '0', '8', '1', '2316468', '2017-11-22', '石家庄制药', '1', '主仓库调度到主仓库', '1');
INSERT INTO `logDetail` VALUES ('f69461e907384824becd76d78e20dcae', 'DB20171123140916', '2017-11-23', '2', '0', '8', '1', '2316468', '2017-11-23', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '1', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('fbaa0ffd6fa4401f9714eac47ced2344', 'DB20171123140916', '2017-11-23', '2', '800', '0', '2', '2316468', '2017-11-23', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '1', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('fbbb2a7237184041852e839e9877cc87', 'DB20171123084531', '2017-11-23', '2', '206', '0', '1', '2316468', '2017-11-23', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '2', '副仓库调度到主仓库', '1');
INSERT INTO `logDetail` VALUES ('fccaa13d103b4935a82814de6f78075a', 'DB20171123142516', '2017-11-23', '2', '0', '45', '1', '2316468', '2017-11-23', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '2', '主仓库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('fd963d1c9afa42cb887cd06ee08ddd8c', 'DB20171121152527', '2017-11-21', '1', '25', '1', '2', '2316468', '2017-11-21', '石家庄制药', '1', '酒库调度到副仓库', '1');
INSERT INTO `logDetail` VALUES ('ff00440306b74d9584239e76c6acffbf', 'B94220171123090204', '2017-11-23', '2', '569', '0', '1', '2316468', '2017-11-22', '浙江昂利康制药有限公司浙江昂利康制药有限公司', '2', '报损出库', '1');

-- ----------------------------
-- Table structure for `pgrItem`
-- ----------------------------
DROP TABLE IF EXISTS `pgrItem`;
CREATE TABLE `pgrItem` (
  ` pgrItemId` varchar(10) NOT NULL,
  `tradeId` varchar(10) NOT NULL,
  `diId` varchar(10) NOT NULL,
  `amount` int(11) NOT NULL,
  `batch` varchar(50) NOT NULL,
  `expire` date NOT NULL,
  `mark` varchar(50) NOT NULL,
  PRIMARY KEY (` pgrItemId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of pgrItem
-- ----------------------------
INSERT INTO `pgrItem` VALUES ('1111', '112233', '1111', '4', '2222', '2017-11-24', '111');
INSERT INTO `pgrItem` VALUES ('11111', '1', '1111', '11', '11111', '2017-11-23', '1111');
INSERT INTO `pgrItem` VALUES ('1q1q1q', '999', '11111', '3', '123123', '2017-11-23', 'qsads');
INSERT INTO `pgrItem` VALUES ('551', '20171215', '20171215', '1', '545', '2017-11-30', '1');
INSERT INTO `pgrItem` VALUES ('iiiiiiiiii', 'xxxx', 'iii', '5', '123123123', '2017-11-23', 'iiiii');
INSERT INTO `pgrItem` VALUES ('lllllll', 'last', 'llll', '12', '123123', '2017-11-23', 'llll');
INSERT INTO `pgrItem` VALUES ('qqqqq', 'qqqqqqq', 'qqqqqq', '5', '11111', '2017-11-23', 'qqqqq');

-- ----------------------------
-- Table structure for `purchaseAndGoodsReject`
-- ----------------------------
DROP TABLE IF EXISTS `purchaseAndGoodsReject`;
CREATE TABLE `purchaseAndGoodsReject` (
  `tradeId` varchar(10) NOT NULL,
  `tradeTime` date NOT NULL,
  `sfId` varchar(10) NOT NULL,
  `totalPrice` decimal(12,2) NOT NULL,
  `tradeType` tinyint(4) NOT NULL,
  `wId` varchar(10) NOT NULL,
  `splId` varchar(10) NOT NULL,
  `state` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`tradeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of purchaseAndGoodsReject
-- ----------------------------
INSERT INTO `purchaseAndGoodsReject` VALUES ('112233', '2017-11-24', '2', '40.00', '1', '1', '1', '1');
INSERT INTO `purchaseAndGoodsReject` VALUES ('20170509', '2017-11-22', '2', '5000.00', '1', '1', '1049', '1');
INSERT INTO `purchaseAndGoodsReject` VALUES ('20171010', '2017-11-23', '2', '110.00', '1', '1', '1', '1');
INSERT INTO `purchaseAndGoodsReject` VALUES ('2017101001', '2017-11-01', '1', '2222.00', '1', '1', '1', '1');
INSERT INTO `purchaseAndGoodsReject` VALUES ('2017101002', '2017-11-30', '1', '44.00', '1', '3', '0', '1');
INSERT INTO `purchaseAndGoodsReject` VALUES ('2017101003', '2017-11-16', '1', '1000.00', '1', '2', '0', '1');
INSERT INTO `purchaseAndGoodsReject` VALUES ('2017101004', '2017-11-20', '2', '1234.00', '1', '1', '1', '1');
INSERT INTO `purchaseAndGoodsReject` VALUES ('2017101005', '2017-11-01', '2', '2121.00', '1', '2', '1', '0');
INSERT INTO `purchaseAndGoodsReject` VALUES ('2017101006', '2017-11-07', '2', '2142.00', '1', '1', '1', '0');
INSERT INTO `purchaseAndGoodsReject` VALUES ('2017101007', '2017-11-04', '2', '1234.00', '1', '4', '1', '2');
INSERT INTO `purchaseAndGoodsReject` VALUES ('2017101008', '2017-11-04', '2', '4422.00', '1', '3', '0', '2');
INSERT INTO `purchaseAndGoodsReject` VALUES ('2017101009', '2017-11-07', '1', '1111.00', '1', '1', '1', '1');
INSERT INTO `purchaseAndGoodsReject` VALUES ('2017101010', '2017-11-03', '1', '145.00', '1', '1', '1', '1');
INSERT INTO `purchaseAndGoodsReject` VALUES ('2017101011', '2017-11-25', '2', '123.00', '1', '1', '1', '1');
INSERT INTO `purchaseAndGoodsReject` VALUES ('2017101012', '2017-10-29', '1', '23.00', '1', '1', '1', '1');
INSERT INTO `purchaseAndGoodsReject` VALUES ('2017101013', '2017-11-21', '2', '120.00', '1', '1', '1', '1');
INSERT INTO `purchaseAndGoodsReject` VALUES ('20171215', '2017-11-23', '2', '10.00', '1', '1', '1024', '1');
INSERT INTO `purchaseAndGoodsReject` VALUES ('999', '2017-11-23', '3', '30.00', '1', '1', '1', '1');
INSERT INTO `purchaseAndGoodsReject` VALUES ('last', '2017-11-23', '3', '120.00', '1', '1', '1', '1');
INSERT INTO `purchaseAndGoodsReject` VALUES ('qqqqqqq', '2017-11-23', '3', '50.00', '0', '1', '1', '1');
INSERT INTO `purchaseAndGoodsReject` VALUES ('xxxx', '2017-11-23', '2', '50.00', '1', '1', '1', '2');

-- ----------------------------
-- Table structure for `report`
-- ----------------------------
DROP TABLE IF EXISTS `report`;
CREATE TABLE `report` (
  `rId` varchar(50) NOT NULL,
  `rType` int(11) DEFAULT NULL,
  `date` date NOT NULL,
  `wid` varchar(50) NOT NULL,
  `sfid` varchar(50) NOT NULL,
  `mark` varchar(50) NOT NULL,
  PRIMARY KEY (`rId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of report
-- ----------------------------
INSERT INTO `report` VALUES ('B13020171123133049', '0', '2017-11-23', '1', '3', '..');
INSERT INTO `report` VALUES ('B38720171124155314', '0', '2017-11-24', '1', '4', '..');
INSERT INTO `report` VALUES ('B54420171123145914', '0', '2017-11-23', '1', '2', '..');
INSERT INTO `report` VALUES ('B86520171124155253', '0', '2017-11-24', '1', '2', '..');
INSERT INTO `report` VALUES ('B94220171123090204', '0', '2017-11-23', '1', '2', '..');
INSERT INTO `report` VALUES ('R43420171122163557', '0', '2017-11-23', '1', '2', '..');
INSERT INTO `report` VALUES ('R51720171121171657', '0', '2017-11-22', '1', '1', '..');
INSERT INTO `report` VALUES ('R72520171121181027', '0', '2017-11-22', '1', '1', '..');

-- ----------------------------
-- Table structure for `rpItems`
-- ----------------------------
DROP TABLE IF EXISTS `rpItems`;
CREATE TABLE `rpItems` (
  `rpItemId` varchar(50) NOT NULL,
  `diID` varchar(50) NOT NULL,
  `amount` int(11) NOT NULL,
  `rid` varchar(50) NOT NULL,
  PRIMARY KEY (`rpItemId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rpItems
-- ----------------------------
INSERT INTO `rpItems` VALUES ('B130201719155', '1', '5', 'B13020171123133049');
INSERT INTO `rpItems` VALUES ('B38720171987', '1', '20', 'B38720171124155314');
INSERT INTO `rpItems` VALUES ('B544201714788', '2', '23', 'B54420171123145914');
INSERT INTO `rpItems` VALUES ('B544201715275', '1', '15', 'B54420171123145914');
INSERT INTO `rpItems` VALUES ('B865201719718', '2', '12', 'B86520171124155253');
INSERT INTO `rpItems` VALUES ('B942201711099', '1', '10', 'B94220171123090204');
INSERT INTO `rpItems` VALUES ('B942201715837', '2', '23', 'B94220171123090204');
INSERT INTO `rpItems` VALUES ('R43420171373', '1', '2', 'R43420171122163557');
INSERT INTO `rpItems` VALUES ('R434201715475', '2', '5', 'R43420171122163557');
INSERT INTO `rpItems` VALUES ('R517201712431', '1', '25', 'R51720171121171657');
INSERT INTO `rpItems` VALUES ('R517201714736', '2', '53', 'R51720171121171657');
INSERT INTO `rpItems` VALUES ('R725201712647', '1', '-25', 'R72520171121181027');
INSERT INTO `rpItems` VALUES ('R725201714341', '2', '-53', 'R72520171121181027');

-- ----------------------------
-- Table structure for `saleItem`
-- ----------------------------
DROP TABLE IF EXISTS `saleItem`;
CREATE TABLE `saleItem` (
  `soItemId` varchar(10) NOT NULL,
  `tradeId` varchar(10) NOT NULL,
  `diId` varchar(10) NOT NULL,
  `amount` int(11) NOT NULL,
  `singelPrice` decimal(12,2) NOT NULL,
  `discount` double(3,2) DEFAULT NULL,
  PRIMARY KEY (`soItemId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of saleItem
-- ----------------------------
INSERT INTO `saleItem` VALUES ('1111ss', '1111', '111', '6', '11.00', '0.10');
INSERT INTO `saleItem` VALUES ('sss', 'ssssssss', 'ssss', '5', '12.00', '0.10');

-- ----------------------------
-- Table structure for `saleOrder`
-- ----------------------------
DROP TABLE IF EXISTS `saleOrder`;
CREATE TABLE `saleOrder` (
  `tradeId` varchar(10) NOT NULL,
  `tradeTime` date NOT NULL,
  `sfId` varchar(10) NOT NULL,
  `total` decimal(12,2) DEFAULT NULL,
  `tradeType` int(11) NOT NULL,
  `wId` varchar(10) NOT NULL,
  `ctId` varchar(10) DEFAULT NULL,
  `integral` int(11) DEFAULT '0',
  PRIMARY KEY (`tradeId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of saleOrder
-- ----------------------------
INSERT INTO `saleOrder` VALUES ('000001', '2017-11-01', '1', '100.20', '1', '3', 'vip', '3');
INSERT INTO `saleOrder` VALUES ('000002', '2017-11-02', '3', '56.00', '1', '2', 'nobody', '40');
INSERT INTO `saleOrder` VALUES ('000003', '2018-06-09', '2', '144.00', '1', '1', '1', '115');
INSERT INTO `saleOrder` VALUES ('000004', '2017-11-23', '1', '144.00', '1', '1', '2', '14');
INSERT INTO `saleOrder` VALUES ('000005', '2017-11-23', '3', '66.00', '1', '1', '1', '6');
INSERT INTO `saleOrder` VALUES ('ssssssss', '2017-11-23', '3', '60.00', '2', '1', '1', '6');

-- ----------------------------
-- Table structure for `staff`
-- ----------------------------
DROP TABLE IF EXISTS `staff`;
CREATE TABLE `staff` (
  `sfId` varchar(10) NOT NULL,
  `jobId` varchar(10) NOT NULL,
  `sfName` varchar(10) NOT NULL,
  `salary` decimal(12,2) NOT NULL,
  `birthday` date DEFAULT NULL,
  `sfPhoneNo` varchar(20) NOT NULL,
  `sfAddress` varchar(50) DEFAULT NULL,
  `sfState` int(11) NOT NULL DEFAULT '0',
  `sfRemarks` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`sfId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of staff
-- ----------------------------
INSERT INTO `staff` VALUES ('1', '1003', '张超', '256.00', '1988-08-13', '18583943781', '兰州', '0', '傻');
INSERT INTO `staff` VALUES ('10', '1002', '蓝妹妹', '500.00', '2017-11-06', '123465', '海的这边', '1', '');
INSERT INTO `staff` VALUES ('2', '1001', '小明', '150.00', '2017-11-08', '132456', '123456', '1', '123456');
INSERT INTO `staff` VALUES ('3', '1001', '小李', '23.00', '2017-11-07', '1515165311165', '北京', '0', '猪头');
INSERT INTO `staff` VALUES ('4', '1003', '老王', '2352.00', '1994-11-22', '15616', '隔壁', '0', '色');

-- ----------------------------
-- Table structure for `supplier`
-- ----------------------------
DROP TABLE IF EXISTS `supplier`;
CREATE TABLE `supplier` (
  `splId` varchar(10) NOT NULL,
  `splName` varchar(40) NOT NULL,
  `contact` varchar(10) NOT NULL,
  `splPhoneNo` varchar(20) NOT NULL,
  `splAddress` varchar(50) NOT NULL,
  `spltype` varchar(20) NOT NULL,
  `region` varchar(20) DEFAULT NULL,
  `isDefault` tinyint(4) DEFAULT '1',
  PRIMARY KEY (`splId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of supplier
-- ----------------------------
INSERT INTO `supplier` VALUES ('1024', '测试三', '测试联系人', '151515151', '测试联系地址', '测试', '成都', '0');
INSERT INTO `supplier` VALUES ('1049', '测试2', '测试联系人2', '123456', '测试地址2', '测试类型2', '大喜大', null);
INSERT INTO `supplier` VALUES ('1055', '供应商3', '蓝精灵', '566954', '山的那边', '中药材', '未知', '0');
INSERT INTO `supplier` VALUES ('1066', '供应商4', '格格巫', '66685', '谁知道呢', '麻醉药剂', '未知', '0');

-- ----------------------------
-- Table structure for `vipLevel`
-- ----------------------------
DROP TABLE IF EXISTS `vipLevel`;
CREATE TABLE `vipLevel` (
  `levelId` varchar(10) NOT NULL,
  `vipName` varchar(20) NOT NULL,
  `discount` double(3,2) NOT NULL,
  PRIMARY KEY (`levelId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of vipLevel
-- ----------------------------
INSERT INTO `vipLevel` VALUES ('5001', '初级客户', '0.95');
INSERT INTO `vipLevel` VALUES ('5002', '中级客户', '0.80');
INSERT INTO `vipLevel` VALUES ('5003', '高级客户', '0.65');

-- ----------------------------
-- Table structure for `warehouse`
-- ----------------------------
DROP TABLE IF EXISTS `warehouse`;
CREATE TABLE `warehouse` (
  `wId` varchar(10) NOT NULL,
  `wName` varchar(25) NOT NULL,
  `location` varchar(50) NOT NULL,
  PRIMARY KEY (`wId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of warehouse
-- ----------------------------
INSERT INTO `warehouse` VALUES ('1', '主仓库', '武侯区');
INSERT INTO `warehouse` VALUES ('2', '副仓库', '双流区');
INSERT INTO `warehouse` VALUES ('3', '酒库', '高新区');
