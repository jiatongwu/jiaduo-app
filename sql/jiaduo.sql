-- MySQL dump 10.13  Distrib 5.7.21, for macos10.13 (x86_64)
--
-- Host: localhost    Database: jiaduo
-- ------------------------------------------------------
-- Server version	5.7.21

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `malingshu_wanyibingbingqingxitong`
--

DROP TABLE IF EXISTS `malingshu_wanyibingbingqingxitong`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `malingshu_wanyibingbingqingxitong` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `place` varchar(255) DEFAULT NULL COMMENT '调查地点',
  `date_time` timestamp NULL DEFAULT NULL COMMENT '调查日期',
  `pingzhong` varchar(255) DEFAULT NULL COMMENT '品种',
  `tiankuaileixing` varchar(255) DEFAULT NULL COMMENT '田块类型',
  `shengyuqi` varchar(255) DEFAULT NULL COMMENT '生育期',
  `diaochazhushu` varchar(255) DEFAULT NULL COMMENT '调查株数',
  `fabingzhushu` varchar(255) DEFAULT NULL COMMENT '发病株数',
  `bingzhulv` varchar(255) DEFAULT NULL COMMENT '病株率',
  `yangzhongdu0` varchar(255) DEFAULT NULL COMMENT '严重度0',
  `yangzhongdu1` varchar(255) DEFAULT NULL COMMENT '严重度1',
  `yangzhongdu3` varchar(255) DEFAULT NULL COMMENT '严重度3',
  `yangzhongdu5` varchar(255) DEFAULT NULL COMMENT '严重度5',
  `yangzhongdu7` varchar(255) DEFAULT NULL COMMENT '严重度7',
  `yangzhongdu9` varchar(255) DEFAULT NULL COMMENT '严重度9',
  `bingqingzhishu` varchar(255) DEFAULT NULL COMMENT '病情指数',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `user_name` varchar(255) DEFAULT NULL COMMENT '调查人',
  `user_id` int(11) DEFAULT NULL COMMENT '哪个用户创建的这条记录',
  `longitude` varchar(255) DEFAULT NULL COMMENT '经度',
  `latitude` varchar(255) DEFAULT NULL COMMENT '纬度',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='马铃著晚疫病病情系统调查表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `malingshu_wanyibingbingqingxitong`
--

LOCK TABLES `malingshu_wanyibingbingqingxitong` WRITE;
/*!40000 ALTER TABLE `malingshu_wanyibingbingqingxitong` DISABLE KEYS */;
/*!40000 ALTER TABLE `malingshu_wanyibingbingqingxitong` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `malingshu_wanyibingfabingqingkuang`
--

DROP TABLE IF EXISTS `malingshu_wanyibingfabingqingkuang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `malingshu_wanyibingfabingqingkuang` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `place` varchar(255) DEFAULT NULL COMMENT '调查地点',
  `date_time` timestamp NULL DEFAULT NULL COMMENT '调查日期',
  `pingzhong` varchar(255) DEFAULT NULL COMMENT '品种',
  `tiankuaileixing` varchar(255) DEFAULT NULL COMMENT '田块类型',
  `shengyuqi` varchar(255) DEFAULT NULL COMMENT '生育期',
  `diaochatiankuai` varchar(255) DEFAULT NULL COMMENT '调查田块',
  `fabingtiankuai` varchar(255) DEFAULT NULL COMMENT '发病田块',
  `bingtianlv` varchar(255) DEFAULT NULL COMMENT '病田率',
  `diaochazhushu` varchar(255) DEFAULT NULL COMMENT '调查株数',
  `fabingzhushu` varchar(255) DEFAULT NULL COMMENT '发病株数',
  `bingzhulv` varchar(255) DEFAULT NULL COMMENT '病株率',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `user_id` int(11) DEFAULT NULL COMMENT '哪个用户创建的这条记录',
  `user_name` varchar(255) DEFAULT NULL COMMENT '调查人',
  `longitude` varchar(255) DEFAULT NULL COMMENT '经度',
  `latitude` varchar(255) DEFAULT NULL COMMENT '纬度',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='马铃著晚疫病发病情况普查表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `malingshu_wanyibingfabingqingkuang`
--

LOCK TABLES `malingshu_wanyibingfabingqingkuang` WRITE;
/*!40000 ALTER TABLE `malingshu_wanyibingfabingqingkuang` DISABLE KEYS */;
/*!40000 ALTER TABLE `malingshu_wanyibingfabingqingkuang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `malingshu_wanyibingzhongxibingzhuxt`
--

DROP TABLE IF EXISTS `malingshu_wanyibingzhongxibingzhuxt`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `malingshu_wanyibingzhongxibingzhuxt` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `place` varchar(255) DEFAULT NULL COMMENT '调查地点',
  `date_time` timestamp NULL DEFAULT NULL COMMENT '调查日期',
  `pingzhong` varchar(255) DEFAULT NULL COMMENT '品种',
  `shengyuqi` varchar(255) DEFAULT NULL COMMENT '生育期',
  `diaochamianji` varchar(255) DEFAULT NULL COMMENT '调查面积',
  `fabingzhushu` varchar(255) DEFAULT NULL COMMENT '发病株数',
  `zhibeimidu` varchar(255) DEFAULT NULL COMMENT '植被密度',
  `bingzhulv` varchar(255) DEFAULT NULL COMMENT '病株率',
  `yangzhongdu0` varchar(255) DEFAULT NULL COMMENT '严重度0',
  `yangzhongdu1` varchar(255) DEFAULT NULL COMMENT '严重度1',
  `yangzhongdu3` varchar(255) DEFAULT NULL COMMENT '严重度3',
  `yangzhongdu5` varchar(255) DEFAULT NULL COMMENT '严重度5',
  `yangzhongdu7` varchar(255) DEFAULT NULL COMMENT '严重度7',
  `yangzhongdu9` varchar(255) DEFAULT NULL COMMENT '严重度9',
  `bingqingzhishu` varchar(255) DEFAULT NULL COMMENT '病情指数',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `user_id` int(11) DEFAULT NULL COMMENT '哪个用户创建的这条记录',
  `user_name` varchar(255) DEFAULT NULL COMMENT '调查人',
  `longitude` varchar(255) DEFAULT NULL COMMENT '经度',
  `latitude` varchar(255) DEFAULT NULL COMMENT '纬度',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='马铃著晚疫病中心病株系统调查表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `malingshu_wanyibingzhongxibingzhuxt`
--

LOCK TABLES `malingshu_wanyibingzhongxibingzhuxt` WRITE;
/*!40000 ALTER TABLE `malingshu_wanyibingzhongxibingzhuxt` DISABLE KEYS */;
/*!40000 ALTER TABLE `malingshu_wanyibingzhongxibingzhuxt` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_permission`
--

DROP TABLE IF EXISTS `sys_permission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_permission` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(128) NOT NULL COMMENT '资源名称',
  `type` varchar(32) NOT NULL COMMENT '资源类型：menu,button,',
  `url` varchar(128) DEFAULT NULL COMMENT '访问url地址',
  `percode` varchar(128) DEFAULT NULL COMMENT '权限代码字符串',
  `parentid` bigint(20) DEFAULT NULL COMMENT '父结点id',
  `parentids` varchar(128) DEFAULT NULL COMMENT '父结点id列表串',
  `sortstring` varchar(128) DEFAULT NULL COMMENT '排序号',
  `available` char(1) DEFAULT NULL COMMENT '是否可用,1：可用，0不可用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_permission`
--

LOCK TABLES `sys_permission` WRITE;
/*!40000 ALTER TABLE `sys_permission` DISABLE KEYS */;
/*!40000 ALTER TABLE `sys_permission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_role`
--

DROP TABLE IF EXISTS `sys_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_role` (
  `id` int(36) NOT NULL AUTO_INCREMENT,
  `name` varchar(128) NOT NULL,
  `available` char(1) DEFAULT NULL COMMENT '是否可用,1：可用，0不可用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_role`
--

LOCK TABLES `sys_role` WRITE;
/*!40000 ALTER TABLE `sys_role` DISABLE KEYS */;
/*!40000 ALTER TABLE `sys_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_role_permission`
--

DROP TABLE IF EXISTS `sys_role_permission`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_role_permission` (
  `sys_role_id` int(32) NOT NULL COMMENT '角色id',
  `sys_permission_id` int(32) NOT NULL COMMENT '权限id'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_role_permission`
--

LOCK TABLES `sys_role_permission` WRITE;
/*!40000 ALTER TABLE `sys_role_permission` DISABLE KEYS */;
/*!40000 ALTER TABLE `sys_role_permission` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_user`
--

DROP TABLE IF EXISTS `sys_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_user` (
  `id` int(36) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `username` varchar(32) NOT NULL COMMENT '账号',
  `name` varchar(64) NOT NULL COMMENT '姓名',
  `password` varchar(32) NOT NULL COMMENT '密码',
  `locked` char(1) DEFAULT NULL COMMENT '账号是否锁定，1：锁定，0未锁定',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_user`
--

LOCK TABLES `sys_user` WRITE;
/*!40000 ALTER TABLE `sys_user` DISABLE KEYS */;
/*!40000 ALTER TABLE `sys_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sys_user_role`
--

DROP TABLE IF EXISTS `sys_user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `sys_user_role` (
  `sys_user_id` int(12) NOT NULL,
  `sys_role_id` int(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sys_user_role`
--

LOCK TABLES `sys_user_role` WRITE;
/*!40000 ALTER TABLE `sys_user_role` DISABLE KEYS */;
/*!40000 ALTER TABLE `sys_user_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiaomai_baifenbing`
--

DROP TABLE IF EXISTS `xiaomai_baifenbing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xiaomai_baifenbing` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date_time` timestamp NULL DEFAULT NULL COMMENT '调查日期',
  `place` varchar(255) DEFAULT NULL COMMENT '调查地点',
  `variety_name` varchar(255) DEFAULT NULL COMMENT '品种名称',
  `sowing_date` varchar(255) DEFAULT NULL COMMENT '播种期',
  `growth_period` varchar(255) DEFAULT NULL COMMENT '生育期',
  `field_area` varchar(255) DEFAULT NULL COMMENT '田地面积',
  `check_area` varchar(255) DEFAULT NULL COMMENT '实查面积',
  `numberofinvestigations` varchar(255) DEFAULT NULL COMMENT '调查株数',
  `numberofdiseasedplants` varchar(255) DEFAULT NULL COMMENT '发病株数',
  `disease_rate` varchar(255) DEFAULT NULL COMMENT '病株率',
  `survey_bladenum` varchar(255) DEFAULT NULL COMMENT '调查叶片数',
  `onset_bladenum` varchar(255) DEFAULT NULL COMMENT '发病叶片数',
  `diseased_leafrate` varchar(255) DEFAULT NULL COMMENT '病叶率',
  `severity` varchar(255) DEFAULT NULL COMMENT '严重度',
  `disease_index` varchar(255) DEFAULT NULL COMMENT '病情指数',
  `diseasepoint_rate` varchar(255) DEFAULT NULL COMMENT '病点率',
  `user_id` int(11) DEFAULT NULL COMMENT '哪个用户创建的这条记录',
  `user_name` varchar(255) DEFAULT NULL COMMENT '调查人',
  `longitude` varchar(255) DEFAULT NULL COMMENT '经度',
  `latitude` varchar(255) DEFAULT NULL COMMENT '纬度',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='小麦白粉病普查表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiaomai_baifenbing`
--

LOCK TABLES `xiaomai_baifenbing` WRITE;
/*!40000 ALTER TABLE `xiaomai_baifenbing` DISABLE KEYS */;
/*!40000 ALTER TABLE `xiaomai_baifenbing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiaomai_chimeibing`
--

DROP TABLE IF EXISTS `xiaomai_chimeibing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xiaomai_chimeibing` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date_time` timestamp NULL DEFAULT NULL COMMENT '调查日期',
  `place` varchar(255) DEFAULT NULL COMMENT '调查地点',
  `pinzhong` varchar(255) DEFAULT NULL COMMENT '品种',
  `leixingtian` varchar(255) DEFAULT NULL COMMENT '类型田',
  `diaochasuishu` varchar(255) DEFAULT NULL COMMENT '调查穂数',
  `bingsuishu` varchar(255) DEFAULT NULL COMMENT '病穂数',
  `bingsuilv` varchar(255) DEFAULT NULL COMMENT '病穂率',
  `bingqing0` varchar(255) DEFAULT NULL COMMENT '病情0',
  `bingqing1` varchar(255) DEFAULT NULL COMMENT '病情1',
  `bingqing2` varchar(255) DEFAULT NULL COMMENT '病情2',
  `bingqing3` varchar(255) DEFAULT NULL COMMENT '病情3',
  `bingqing4` varchar(255) DEFAULT NULL COMMENT '病情4',
  `bingqing5` varchar(255) DEFAULT NULL COMMENT '病情5',
  `bingqingzhishu` varchar(255) DEFAULT NULL COMMENT '病情指数',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `user_id` int(11) DEFAULT NULL COMMENT '哪个用户创建的这条记录',
  `user_name` varchar(255) DEFAULT NULL COMMENT '调查人',
  `longitude` varchar(255) DEFAULT NULL COMMENT '经度',
  `latitude` varchar(255) DEFAULT NULL COMMENT '纬度',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='小麦麦类赤霉病病情普查记载表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiaomai_chimeibing`
--

LOCK TABLES `xiaomai_chimeibing` WRITE;
/*!40000 ALTER TABLE `xiaomai_chimeibing` DISABLE KEYS */;
/*!40000 ALTER TABLE `xiaomai_chimeibing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiaomai_congaibing_bingqingpucha`
--

DROP TABLE IF EXISTS `xiaomai_congaibing_bingqingpucha`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xiaomai_congaibing_bingqingpucha` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date_time` timestamp NULL DEFAULT NULL COMMENT '调查日期',
  `place` varchar(255) DEFAULT NULL COMMENT '调查地点',
  `zhongzhifangshi` varchar(255) DEFAULT NULL COMMENT '种植方式',
  `diaochamianji` varchar(255) DEFAULT NULL COMMENT '调查面积',
  `fabingmianji` varchar(255) DEFAULT NULL COMMENT '发病面积',
  `bingzhulv1` varchar(255) DEFAULT NULL COMMENT '病株率1',
  `bingzhulv1zhi3` varchar(255) DEFAULT NULL COMMENT '病株率1-3',
  `bingzhulv3zhi10` varchar(255) DEFAULT NULL COMMENT '病株率3-10',
  `bingzhulv10zhi20` varchar(255) DEFAULT NULL COMMENT '病株率10-20',
  `bingzhulv20zhi50` varchar(255) DEFAULT NULL COMMENT '病株率20-50',
  `bingzhulv50` varchar(255) DEFAULT NULL COMMENT '病株率50',
  `huizhongmianji` varchar(255) DEFAULT NULL COMMENT '毁种面积',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `user_id` int(11) DEFAULT NULL COMMENT '哪个用户创建的这条记录',
  `user_name` varchar(255) DEFAULT NULL COMMENT '调查人',
  `longitude` varchar(255) DEFAULT NULL COMMENT '经度',
  `latitude` varchar(255) DEFAULT NULL COMMENT '纬度',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='小麦丛矮病病情普查表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiaomai_congaibing_bingqingpucha`
--

LOCK TABLES `xiaomai_congaibing_bingqingpucha` WRITE;
/*!40000 ALTER TABLE `xiaomai_congaibing_bingqingpucha` DISABLE KEYS */;
/*!40000 ALTER TABLE `xiaomai_congaibing_bingqingpucha` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiaomai_congaibing_huifeishichongkoumidu`
--

DROP TABLE IF EXISTS `xiaomai_congaibing_huifeishichongkoumidu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xiaomai_congaibing_huifeishichongkoumidu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date_time` timestamp NULL DEFAULT NULL COMMENT '调查日期',
  `place` varchar(255) DEFAULT NULL COMMENT '调查地点',
  `pinzhong` varchar(255) DEFAULT NULL COMMENT '品种',
  `leixingtian` varchar(255) DEFAULT NULL COMMENT '类型田',
  `shengyuqi` varchar(255) DEFAULT NULL COMMENT '生育期',
  `diaochamianji` varchar(255) DEFAULT NULL COMMENT '调查面积',
  `chengchong` varchar(255) DEFAULT NULL COMMENT '成虫',
  `chongkoumidu` varchar(255) DEFAULT NULL COMMENT '虫口密度',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `user_id` int(11) DEFAULT NULL COMMENT '哪个用户创建的这条记录',
  `user_name` varchar(255) DEFAULT NULL COMMENT '调查人',
  `longitude` varchar(255) DEFAULT NULL COMMENT '经度',
  `latitude` varchar(255) DEFAULT NULL COMMENT '纬度',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='小麦丛矮病灰飞虱虫口密度调查表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiaomai_congaibing_huifeishichongkoumidu`
--

LOCK TABLES `xiaomai_congaibing_huifeishichongkoumidu` WRITE;
/*!40000 ALTER TABLE `xiaomai_congaibing_huifeishichongkoumidu` DISABLE KEYS */;
/*!40000 ALTER TABLE `xiaomai_congaibing_huifeishichongkoumidu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiaomai_congaibing_huifeishizirandaidulv`
--

DROP TABLE IF EXISTS `xiaomai_congaibing_huifeishizirandaidulv`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xiaomai_congaibing_huifeishizirandaidulv` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date_time` timestamp NULL DEFAULT NULL COMMENT '调查日期',
  `place` varchar(255) DEFAULT NULL COMMENT '调查地点',
  `caichongdikuai` varchar(255) DEFAULT NULL COMMENT '采虫地块',
  `xiaomaipinzhong` varchar(255) DEFAULT NULL COMMENT '小麦品种',
  `chongtai` varchar(255) DEFAULT NULL COMMENT '虫态',
  `jiechongmiaoshu` varchar(255) DEFAULT NULL COMMENT '接虫苗数',
  `fabingmiaoshu` varchar(255) DEFAULT NULL COMMENT '发病苗数',
  `daidulv` varchar(255) DEFAULT NULL COMMENT '带毒率',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `user_id` int(11) DEFAULT NULL COMMENT '哪个用户创建的这条记录',
  `user_name` varchar(255) DEFAULT NULL COMMENT '调查人',
  `longitude` varchar(255) DEFAULT NULL COMMENT '经度',
  `latitude` varchar(255) DEFAULT NULL COMMENT '纬度',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='小麦丛矮病-灰飞虱自然带毒率测定记载表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiaomai_congaibing_huifeishizirandaidulv`
--

LOCK TABLES `xiaomai_congaibing_huifeishizirandaidulv` WRITE;
/*!40000 ALTER TABLE `xiaomai_congaibing_huifeishizirandaidulv` DISABLE KEYS */;
/*!40000 ALTER TABLE `xiaomai_congaibing_huifeishizirandaidulv` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiaomai_congaibing_tianjianzishengmaimiao`
--

DROP TABLE IF EXISTS `xiaomai_congaibing_tianjianzishengmaimiao`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xiaomai_congaibing_tianjianzishengmaimiao` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date_time` timestamp NULL DEFAULT NULL COMMENT '调查日期',
  `place` varchar(255) DEFAULT NULL COMMENT '调查地点',
  `pinzhong` varchar(255) DEFAULT NULL COMMENT '品种',
  `diaochazhushu` varchar(255) DEFAULT NULL COMMENT '调查株数',
  `fabingzhushu` varchar(255) DEFAULT NULL COMMENT '发病株数',
  `bingzhulv` varchar(255) DEFAULT NULL COMMENT '病株率',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `user_id` int(11) DEFAULT NULL COMMENT '哪个用户创建的这条记录',
  `user_name` varchar(255) DEFAULT NULL COMMENT '调查人',
  `longitude` varchar(255) DEFAULT NULL COMMENT '经度',
  `latitude` varchar(255) DEFAULT NULL COMMENT '纬度',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='小麦丛矮病田间自生麦苗发病率调查表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiaomai_congaibing_tianjianzishengmaimiao`
--

LOCK TABLES `xiaomai_congaibing_tianjianzishengmaimiao` WRITE;
/*!40000 ALTER TABLE `xiaomai_congaibing_tianjianzishengmaimiao` DISABLE KEYS */;
/*!40000 ALTER TABLE `xiaomai_congaibing_tianjianzishengmaimiao` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiaomai_congaibing_youcepufabinglv`
--

DROP TABLE IF EXISTS `xiaomai_congaibing_youcepufabinglv`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xiaomai_congaibing_youcepufabinglv` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date_time` timestamp NULL DEFAULT NULL COMMENT '调查日期',
  `place` varchar(255) DEFAULT NULL COMMENT '调查地点',
  `qianchazuowu` varchar(255) DEFAULT NULL COMMENT '前茬作物',
  `xiaomaipinzhong` varchar(255) DEFAULT NULL COMMENT '小麦品种',
  `buzhongriqi` varchar(255) DEFAULT NULL COMMENT '播种日期',
  `diaochamiaoshu` varchar(255) DEFAULT NULL COMMENT '调查苗数',
  `fabingmiaoshu` varchar(255) DEFAULT NULL COMMENT '发病苗数',
  `bingzhulv` varchar(255) DEFAULT NULL COMMENT '病株率',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `user_id` int(11) DEFAULT NULL COMMENT '哪个用户创建的这条记录',
  `user_name` varchar(255) DEFAULT NULL COMMENT '调查人',
  `longitude` varchar(255) DEFAULT NULL COMMENT '经度',
  `latitude` varchar(255) DEFAULT NULL COMMENT '纬度',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='小麦丛矮病诱测圃发病率调查表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiaomai_congaibing_youcepufabinglv`
--

LOCK TABLES `xiaomai_congaibing_youcepufabinglv` WRITE;
/*!40000 ALTER TABLE `xiaomai_congaibing_youcepufabinglv` DISABLE KEYS */;
/*!40000 ALTER TABLE `xiaomai_congaibing_youcepufabinglv` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiaomai_maizhizhudatian`
--

DROP TABLE IF EXISTS `xiaomai_maizhizhudatian`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xiaomai_maizhizhudatian` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date_time` timestamp NULL DEFAULT NULL COMMENT '调查日期',
  `place` varchar(255) DEFAULT NULL COMMENT '调查地点',
  `daibiaomianji` varchar(255) DEFAULT NULL COMMENT '代表面积',
  `pinzhong` varchar(255) DEFAULT NULL COMMENT '品种',
  `shengyuqi` varchar(255) DEFAULT NULL COMMENT '生育期',
  `danxingchongliang` varchar(255) DEFAULT NULL COMMENT '单行虫量',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `user_id` int(11) DEFAULT NULL COMMENT '哪个用户创建的这条记录',
  `user_name` varchar(255) DEFAULT NULL COMMENT '调查人',
  `longitude` varchar(255) DEFAULT NULL COMMENT '经度',
  `latitude` varchar(255) DEFAULT NULL COMMENT '纬度',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='小麦麦蜘蛛大田普查表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiaomai_maizhizhudatian`
--

LOCK TABLES `xiaomai_maizhizhudatian` WRITE;
/*!40000 ALTER TABLE `xiaomai_maizhizhudatian` DISABLE KEYS */;
/*!40000 ALTER TABLE `xiaomai_maizhizhudatian` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiaomai_sanheisuibing`
--

DROP TABLE IF EXISTS `xiaomai_sanheisuibing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xiaomai_sanheisuibing` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date_time` timestamp NULL DEFAULT NULL COMMENT '调查日期',
  `place` varchar(255) DEFAULT NULL COMMENT '调查地点',
  `variety_name` varchar(255) DEFAULT NULL COMMENT '品种名称',
  `representative_area` varchar(255) DEFAULT NULL COMMENT '代表面积',
  `survey_pointnum` varchar(255) DEFAULT NULL COMMENT '调查点数',
  `disease_pointnum` varchar(255) DEFAULT NULL COMMENT '发病点数',
  `diseasepoint_rate` varchar(255) DEFAULT NULL COMMENT '病点率',
  `survey_maiyenum` varchar(255) DEFAULT NULL COMMENT '调查穂数',
  `disease_maiyenum` varchar(255) DEFAULT NULL COMMENT '发病穂数',
  `diseasemaiye_rate` varchar(255) DEFAULT NULL COMMENT '病穂率',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `user_id` int(11) DEFAULT NULL COMMENT '哪个用户创建的这条记录',
  `user_name` varchar(255) DEFAULT NULL COMMENT '调查人',
  `longitude` varchar(255) DEFAULT NULL COMMENT '经度',
  `latitude` varchar(255) DEFAULT NULL COMMENT '纬度',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='小麦散黑穂病病情普查表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiaomai_sanheisuibing`
--

LOCK TABLES `xiaomai_sanheisuibing` WRITE;
/*!40000 ALTER TABLE `xiaomai_sanheisuibing` DISABLE KEYS */;
/*!40000 ALTER TABLE `xiaomai_sanheisuibing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiaomai_tiaoxiubing_houqi`
--

DROP TABLE IF EXISTS `xiaomai_tiaoxiubing_houqi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xiaomai_tiaoxiubing_houqi` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `place` varchar(255) DEFAULT NULL COMMENT '调查地点',
  `date_time` timestamp NULL DEFAULT NULL COMMENT '调查日期',
  `variety` varchar(255) DEFAULT NULL COMMENT '品种',
  `field_num` varchar(255) DEFAULT NULL COMMENT '田块数',
  `growth_period` varchar(255) DEFAULT NULL COMMENT '生育期',
  `type_field1_rate` varchar(255) DEFAULT NULL COMMENT '类型田1病叶率',
  `type_field1_severity` varchar(255) DEFAULT NULL COMMENT '类型田1严重度',
  `type_field2_rate` varchar(255) DEFAULT NULL COMMENT '类型田2病叶率',
  `type_field2_severity` varchar(255) DEFAULT NULL COMMENT '类型田2严重度',
  `type_field3_rate` varchar(255) DEFAULT NULL COMMENT '类型田3病叶率',
  `type_field3_severity` varchar(255) DEFAULT NULL COMMENT '类型田3严重度',
  `type_field4_rate` varchar(255) DEFAULT NULL COMMENT '类型田4病叶率',
  `type_field4_severity` varchar(255) DEFAULT NULL COMMENT '类型田4严重度',
  `type_field5_rate` varchar(255) DEFAULT NULL COMMENT '类型田5病叶率',
  `type_field5_severity` varchar(255) DEFAULT NULL COMMENT '类型田5严重度',
  `type_average_rate` varchar(255) DEFAULT NULL COMMENT '品种总平均病叶率',
  `type_average_severity` varchar(255) DEFAULT NULL COMMENT '品种总平均严重度',
  `user_id` int(11) DEFAULT NULL COMMENT '哪个用户创建的这条记录',
  `user_name` varchar(255) DEFAULT NULL COMMENT '调查人',
  `longitude` varchar(255) DEFAULT NULL COMMENT '经度',
  `latitude` varchar(255) DEFAULT NULL COMMENT '纬度',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='小麦条锈病后期普查表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiaomai_tiaoxiubing_houqi`
--

LOCK TABLES `xiaomai_tiaoxiubing_houqi` WRITE;
/*!40000 ALTER TABLE `xiaomai_tiaoxiubing_houqi` DISABLE KEYS */;
/*!40000 ALTER TABLE `xiaomai_tiaoxiubing_houqi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiaomai_tiaoxiubing_yuexia`
--

DROP TABLE IF EXISTS `xiaomai_tiaoxiubing_yuexia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xiaomai_tiaoxiubing_yuexia` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date_time` timestamp NULL DEFAULT NULL COMMENT '调查日期',
  `place` varchar(255) DEFAULT NULL COMMENT '调查地点',
  `serial_number` varchar(255) DEFAULT NULL COMMENT '田地编号',
  `lateripening_area` varchar(255) DEFAULT NULL COMMENT '晚熟小麦面积',
  `type` varchar(255) DEFAULT NULL COMMENT '品种',
  `sowing` varchar(255) DEFAULT NULL COMMENT '播期',
  `prevalence_rate` varchar(255) DEFAULT NULL COMMENT '普遍率',
  `severity1` varchar(255) DEFAULT NULL COMMENT '严重度1',
  `spontaneous_area` varchar(255) DEFAULT NULL COMMENT '自生小麦面积',
  `previous_type` varchar(255) DEFAULT NULL COMMENT '前茬小麦品种',
  `current_type` varchar(255) DEFAULT NULL COMMENT '当茬作物',
  `spontaneous_density` varchar(255) DEFAULT NULL COMMENT '自生麦苗密度',
  `disease_rate` varchar(255) DEFAULT NULL COMMENT '病株率',
  `severity2` varchar(255) DEFAULT NULL COMMENT '严重度2',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `user_id` int(11) DEFAULT NULL COMMENT '哪个用户创建的这条记录',
  `user_name` varchar(255) DEFAULT NULL COMMENT '调查人',
  `longitude` varchar(255) DEFAULT NULL COMMENT '经度',
  `latitude` varchar(255) DEFAULT NULL COMMENT '纬度',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='小麦条锈病越夏普查表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiaomai_tiaoxiubing_yuexia`
--

LOCK TABLES `xiaomai_tiaoxiubing_yuexia` WRITE;
/*!40000 ALTER TABLE `xiaomai_tiaoxiubing_yuexia` DISABLE KEYS */;
/*!40000 ALTER TABLE `xiaomai_tiaoxiubing_yuexia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiaomai_tiaoxiubing_zaoqi`
--

DROP TABLE IF EXISTS `xiaomai_tiaoxiubing_zaoqi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xiaomai_tiaoxiubing_zaoqi` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date_time` timestamp NULL DEFAULT NULL COMMENT '调查日期',
  `place` varchar(255) DEFAULT NULL COMMENT '调查地点',
  `serial_number` varchar(255) DEFAULT NULL COMMENT '田地编号',
  `variety_name` varchar(255) DEFAULT NULL COMMENT '品种名称',
  `sowing_date` varchar(255) DEFAULT NULL COMMENT '播种期',
  `field_area` varchar(255) DEFAULT NULL COMMENT '田地面积',
  `check_area` varchar(255) DEFAULT NULL COMMENT '实查面积',
  `blade_density` varchar(255) DEFAULT NULL COMMENT '叶片密度',
  `disease_density` varchar(255) DEFAULT NULL COMMENT '传病中心密度',
  `disease_averagearea` varchar(255) DEFAULT NULL COMMENT '传病中心平均面积',
  `disease_number_leave` varchar(255) DEFAULT NULL COMMENT '传病中心平均病叶数',
  `monolithic_leaf_density` varchar(255) DEFAULT NULL COMMENT '单片病叶密度',
  `survey_bladenum` varchar(255) DEFAULT NULL COMMENT '调查叶片数',
  `onset_bladenum` varchar(255) DEFAULT NULL COMMENT '发病叶片数',
  `diseased_leafrate` varchar(255) DEFAULT NULL COMMENT '病叶率',
  `severity` varchar(255) DEFAULT NULL COMMENT '严重度',
  `field_rate` varchar(255) DEFAULT NULL COMMENT '病田率',
  `user_id` int(11) DEFAULT NULL COMMENT '哪个用户创建的这条记录',
  `user_name` varchar(255) DEFAULT NULL COMMENT '调查人',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `longitude` varchar(255) DEFAULT NULL COMMENT '经度',
  `latitude` varchar(255) DEFAULT NULL COMMENT '纬度',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8 COMMENT='小麦条锈病早期普查表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiaomai_tiaoxiubing_zaoqi`
--

LOCK TABLES `xiaomai_tiaoxiubing_zaoqi` WRITE;
/*!40000 ALTER TABLE `xiaomai_tiaoxiubing_zaoqi` DISABLE KEYS */;
INSERT INTO `xiaomai_tiaoxiubing_zaoqi` VALUES (11,'2018-03-02 10:22:33','place12',NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `xiaomai_tiaoxiubing_zaoqi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiaomai_wenkubing`
--

DROP TABLE IF EXISTS `xiaomai_wenkubing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xiaomai_wenkubing` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date_time` timestamp NULL DEFAULT NULL COMMENT '调查日期',
  `person` varchar(255) DEFAULT NULL COMMENT '调查人',
  `place` varchar(255) DEFAULT NULL COMMENT '调查地点',
  `sowing` varchar(255) DEFAULT NULL COMMENT '播期',
  `sakaguchi` varchar(255) DEFAULT NULL COMMENT '茬口',
  `growth_period` varchar(255) DEFAULT NULL COMMENT '生育期',
  `disease_surveynumofplants` varchar(255) DEFAULT NULL COMMENT '株发病调查株数',
  `disease_numofplants` varchar(255) DEFAULT NULL COMMENT '株发病病株数',
  `disease_rate` varchar(255) DEFAULT NULL COMMENT '株发病病株率',
  `stems_surveynumofplants` varchar(255) DEFAULT NULL COMMENT '侵茎调查株数',
  `numofstems` varchar(255) DEFAULT NULL COMMENT '侵茎数',
  `numofstems_rate` varchar(255) DEFAULT NULL COMMENT '侵茎率',
  `severity0` varchar(255) DEFAULT NULL COMMENT '严重度株数0级',
  `severity1` varchar(255) DEFAULT NULL COMMENT '严重度株数1级',
  `severity2` varchar(255) DEFAULT NULL COMMENT '严重度株数2级',
  `severity3` varchar(255) DEFAULT NULL COMMENT '严重度株数3级',
  `severity4` varchar(255) DEFAULT NULL COMMENT '严重度株数4级',
  `severity5` varchar(255) DEFAULT NULL COMMENT '严重度株数5级',
  `disease_index` varchar(255) DEFAULT NULL COMMENT '病情指数',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `user_id` int(11) DEFAULT NULL COMMENT '哪个用户创建的这条记录',
  `user_name` varchar(255) DEFAULT NULL COMMENT '调查人',
  `longitude` varchar(255) DEFAULT NULL COMMENT '经度',
  `latitude` varchar(255) DEFAULT NULL COMMENT '纬度',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='小麦纹枯病病情普查表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiaomai_wenkubing`
--

LOCK TABLES `xiaomai_wenkubing` WRITE;
/*!40000 ALTER TABLE `xiaomai_wenkubing` DISABLE KEYS */;
/*!40000 ALTER TABLE `xiaomai_wenkubing` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiaomai_xijiangchongbosui`
--

DROP TABLE IF EXISTS `xiaomai_xijiangchongbosui`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xiaomai_xijiangchongbosui` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date_time` timestamp NULL DEFAULT NULL COMMENT '调查日期',
  `person` varchar(255) DEFAULT NULL COMMENT '调查人',
  `place` varchar(255) DEFAULT NULL COMMENT '调查地点',
  `xiaomaipingzhong` varchar(255) DEFAULT NULL COMMENT '小麦品种',
  `tuzhi` varchar(255) DEFAULT NULL COMMENT '土质',
  `jianchasuishu` varchar(255) DEFAULT NULL COMMENT '检查穂数',
  `beihaisuishu` varchar(255) DEFAULT NULL COMMENT '被害穂数',
  `beihaisuilv` varchar(255) DEFAULT NULL COMMENT '被害穂率',
  `jianchalishu` varchar(255) DEFAULT NULL COMMENT '检查粒数',
  `beihailishu` varchar(255) DEFAULT NULL COMMENT '被害粒数',
  `beihaililv` varchar(255) DEFAULT NULL COMMENT '被害粒率',
  `youchongzongchongshu` varchar(255) DEFAULT NULL COMMENT '幼虫总虫数',
  `pingjundansui` varchar(255) DEFAULT NULL COMMENT '平均单穂',
  `zuiduodansui` varchar(255) DEFAULT NULL COMMENT '最多单穂',
  `pingjunmeili` varchar(255) DEFAULT NULL COMMENT '平均每粒',
  `sunshilv` varchar(255) DEFAULT NULL COMMENT '损失率',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `user_id` int(11) DEFAULT NULL COMMENT '哪个用户创建的这条记录',
  `user_name` varchar(255) DEFAULT NULL COMMENT '调查人',
  `longitude` varchar(255) DEFAULT NULL COMMENT '经度',
  `latitude` varchar(255) DEFAULT NULL COMMENT '纬度',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='小麦吸浆虫剥穂普查表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiaomai_xijiangchongbosui`
--

LOCK TABLES `xiaomai_xijiangchongbosui` WRITE;
/*!40000 ALTER TABLE `xiaomai_xijiangchongbosui` DISABLE KEYS */;
/*!40000 ALTER TABLE `xiaomai_xijiangchongbosui` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiaomai_xijiangchongtaotu`
--

DROP TABLE IF EXISTS `xiaomai_xijiangchongtaotu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xiaomai_xijiangchongtaotu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date_time` timestamp NULL DEFAULT NULL COMMENT '调查日期',
  `person` varchar(255) DEFAULT NULL COMMENT '调查人',
  `place` varchar(255) DEFAULT NULL COMMENT '调查地点',
  `dishi` varchar(255) DEFAULT NULL COMMENT '地势',
  `tuzhi` varchar(255) DEFAULT NULL COMMENT '土质',
  `qiancha` varchar(255) DEFAULT NULL COMMENT '前茬',
  `qutuyangfangshu` varchar(255) DEFAULT NULL COMMENT '取土样方数',
  `youchongyangfangshu` varchar(255) DEFAULT NULL COMMENT '有虫样方数',
  `yangfang5` varchar(255) DEFAULT NULL COMMENT '5头样方以上样方数',
  `huodongyouchongshu` varchar(255) DEFAULT NULL COMMENT '活动幼虫数',
  `yuanjianshu` varchar(255) DEFAULT NULL COMMENT '园茧数',
  `heji` varchar(255) DEFAULT NULL COMMENT '合计',
  `pingjunmidu` varchar(255) DEFAULT NULL COMMENT '平均密度',
  `zuigaomidu` varchar(255) DEFAULT NULL COMMENT '最高密度',
  `user_id` int(11) DEFAULT NULL COMMENT '哪个用户创建的这条记录',
  `user_name` varchar(255) DEFAULT NULL COMMENT '调查人',
  `longitude` varchar(255) DEFAULT NULL COMMENT '经度',
  `latitude` varchar(255) DEFAULT NULL COMMENT '纬度',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='小麦吸浆虫淘土普查表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiaomai_xijiangchongtaotu`
--

LOCK TABLES `xiaomai_xijiangchongtaotu` WRITE;
/*!40000 ALTER TABLE `xiaomai_xijiangchongtaotu` DISABLE KEYS */;
/*!40000 ALTER TABLE `xiaomai_xijiangchongtaotu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiaomai_yachong_datian`
--

DROP TABLE IF EXISTS `xiaomai_yachong_datian`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xiaomai_yachong_datian` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `date_time` timestamp NULL DEFAULT NULL COMMENT '调查日期',
  `person` varchar(255) DEFAULT NULL COMMENT '调查人',
  `place` varchar(255) DEFAULT NULL COMMENT '调查地点',
  `daibiaomianji` varchar(255) DEFAULT NULL COMMENT '代表面积',
  `pinzhong` varchar(255) DEFAULT NULL COMMENT '品种',
  `shengyuqi` varchar(255) DEFAULT NULL COMMENT '生育期',
  `diaochazhushu` varchar(255) DEFAULT NULL COMMENT '调查株数',
  `youyazhushu` varchar(255) DEFAULT NULL COMMENT '有蚜株数',
  `youyazhulv` varchar(255) DEFAULT NULL COMMENT '有蚜株率',
  `youchiyachongshuliang` varchar(255) DEFAULT NULL COMMENT '有翅蚜虫数量',
  `wuchiyachongshuliang` varchar(255) DEFAULT NULL COMMENT '无翅蚜虫数量',
  `hejishuliang` varchar(255) DEFAULT NULL COMMENT '合计数量',
  `baizhuyaliang` varchar(255) DEFAULT NULL COMMENT '百株蚜量',
  `remark` varchar(255) DEFAULT NULL COMMENT '备注',
  `user_id` int(11) DEFAULT NULL COMMENT '哪个用户创建的这条记录',
  `user_name` varchar(255) DEFAULT NULL COMMENT '调查人',
  `longitude` varchar(255) DEFAULT NULL COMMENT '经度',
  `latitude` varchar(255) DEFAULT NULL COMMENT '纬度',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='小麦蚜虫大田普查表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiaomai_yachong_datian`
--

LOCK TABLES `xiaomai_yachong_datian` WRITE;
/*!40000 ALTER TABLE `xiaomai_yachong_datian` DISABLE KEYS */;
/*!40000 ALTER TABLE `xiaomai_yachong_datian` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xiaomai_yexiubing`
--

DROP TABLE IF EXISTS `xiaomai_yexiubing`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `xiaomai_yexiubing` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `place` varchar(255) DEFAULT NULL COMMENT '调查地点',
  `person` varchar(255) DEFAULT NULL COMMENT '调查人',
  `date_time` timestamp NULL DEFAULT NULL COMMENT '调查日期',
  `serial_number` varchar(255) DEFAULT NULL COMMENT '田地编号',
  `variety` varchar(255) DEFAULT NULL COMMENT '品种',
  `sowing_date` varchar(255) DEFAULT NULL COMMENT '播种期',
  `growth_period` varchar(255) DEFAULT NULL COMMENT '生育期',
  `field_area` varchar(255) DEFAULT NULL COMMENT '田地面积',
  `allfield_conditions` varchar(255) DEFAULT NULL COMMENT '全田发病情况',
  `check_area` varchar(255) DEFAULT NULL COMMENT '实查面积',
  `blade_density` varchar(255) DEFAULT NULL COMMENT '叶片密度',
  `monolithic_leaf_density` varchar(255) DEFAULT NULL COMMENT '单片病叶密度',
  `survey_bladenum` varchar(255) DEFAULT NULL COMMENT '调查叶片数',
  `onset_bladenum` varchar(255) DEFAULT NULL COMMENT '发病叶片数',
  `diseased_leafrate` varchar(255) DEFAULT NULL COMMENT '病叶率',
  `severity` varchar(255) DEFAULT NULL COMMENT '严重度',
  `disease_index` varchar(255) DEFAULT NULL COMMENT '病情指数',
  `reactive` varchar(255) DEFAULT NULL COMMENT '反应型',
  `user_id` int(11) DEFAULT NULL COMMENT '哪个用户创建的这条记录',
  `user_name` varchar(255) DEFAULT NULL COMMENT '调查人',
  `longitude` varchar(255) DEFAULT NULL COMMENT '经度',
  `latitude` varchar(255) DEFAULT NULL COMMENT '纬度',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='小麦叶锈病病情普查表';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xiaomai_yexiubing`
--

LOCK TABLES `xiaomai_yexiubing` WRITE;
/*!40000 ALTER TABLE `xiaomai_yexiubing` DISABLE KEYS */;
/*!40000 ALTER TABLE `xiaomai_yexiubing` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-04-02 15:22:16
