/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 80025
 Source Host           : localhost:3306
 Source Schema         : tuia_self

 Target Server Type    : MySQL
 Target Server Version : 80025
 File Encoding         : 65001

 Date: 20/06/2021 14:55:27
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for tb_account_report_month_pre_pay_progress
-- ----------------------------
DROP TABLE IF EXISTS `tb_account_report_month_pre_pay_progress`;
CREATE TABLE `tb_account_report_month_pre_pay_progress` (
  `id` bigint unsigned NOT NULL AUTO_INCREMENT,
  `report_id` bigint NOT NULL COMMENT '媒体月报表id',
  `settlement_id` varchar(20) DEFAULT NULL COMMENT '结算单id',
  `cur_date` datetime NOT NULL COMMENT '月份',
  `media_id` bigint NOT NULL DEFAULT '0' COMMENT '媒体用户id',
  `app_id` bigint NOT NULL DEFAULT '0' COMMENT '应用id',
  `company_type` tinyint NOT NULL COMMENT '0-杭推,1-霍推,2-兑捷',
  `statement_gain` tinyint NOT NULL DEFAULT '0' COMMENT '0-未获取结算单,1-已获取结算单',
  `statement_receive` tinyint NOT NULL DEFAULT '0' COMMENT '0-未收到结算单,1-已收到结算单',
  `after_adjust_amount` bigint DEFAULT NULL COMMENT '调账后金额',
  `gmt_create` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '记录创建时间',
  `gmt_modified` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '记录修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `uk_report_month_pre_pay` (`report_id`,`company_type`),
  KEY `idx_cur_date` (`cur_date`)
) ENGINE=InnoDB AUTO_INCREMENT=1239 DEFAULT CHARSET=utf8mb3 ROW_FORMAT=COMPRESSED COMMENT='预付款月账单进度跟踪表';

-- ----------------------------
-- Records of tb_account_report_month_pre_pay_progress
-- ----------------------------
BEGIN;
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
