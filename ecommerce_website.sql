CREATE DATABASE  IF NOT EXISTS `ecommerce_website` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `ecommerce_website`;
-- MySQL dump 10.13  Distrib 8.0.16, for Win64 (x86_64)
--
-- Host: localhost    Database: ecommerce_website
-- ------------------------------------------------------
-- Server version	8.0.16

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `tbl_category`
--

DROP TABLE IF EXISTS `tbl_category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tbl_category` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `is_delete` bigint(20) DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_category`
--

LOCK TABLES `tbl_category` WRITE;
/*!40000 ALTER TABLE `tbl_category` DISABLE KEYS */;
INSERT INTO `tbl_category` VALUES (2,NULL,NULL,0,NULL,NULL,'máy đo đường huyết'),(3,NULL,NULL,0,NULL,NULL,'test'),(4,NULL,NULL,0,NULL,NULL,NULL),(5,NULL,NULL,NULL,NULL,NULL,'y tế gia đình'),(10,NULL,NULL,0,NULL,NULL,NULL),(11,NULL,NULL,0,NULL,NULL,'máy đo huyết áp');
/*!40000 ALTER TABLE `tbl_category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_category_attribute`
--

DROP TABLE IF EXISTS `tbl_category_attribute`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tbl_category_attribute` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `is_delete` bigint(20) DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_category_attribute`
--

LOCK TABLES `tbl_category_attribute` WRITE;
/*!40000 ALTER TABLE `tbl_category_attribute` DISABLE KEYS */;
INSERT INTO `tbl_category_attribute` VALUES (2,NULL,NULL,0,NULL,NULL,'Thương hiệu');
/*!40000 ALTER TABLE `tbl_category_attribute` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_category_value`
--

DROP TABLE IF EXISTS `tbl_category_value`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tbl_category_value` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `is_delete` bigint(20) DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `value` varchar(255) DEFAULT NULL,
  `tbl_category_attribute_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK2h66fp85592usynbj69cudtkh` (`tbl_category_attribute_id`),
  CONSTRAINT `FK2h66fp85592usynbj69cudtkh` FOREIGN KEY (`tbl_category_attribute_id`) REFERENCES `tbl_category_attribute` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_category_value`
--

LOCK TABLES `tbl_category_value` WRITE;
/*!40000 ALTER TABLE `tbl_category_value` DISABLE KEYS */;
INSERT INTO `tbl_category_value` VALUES (2,NULL,NULL,0,NULL,NULL,'Omron',2),(3,NULL,NULL,0,NULL,NULL,'boso',2),(4,NULL,NULL,0,NULL,NULL,'drkare',2);
/*!40000 ALTER TABLE `tbl_category_value` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_product`
--

DROP TABLE IF EXISTS `tbl_product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tbl_product` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `is_delete` bigint(20) DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `cong_dung` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `nha_san_xuat` varchar(255) DEFAULT NULL,
  `noi_san_xuat` varchar(255) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `status` varchar(255) DEFAULT NULL,
  `thumb_img` varchar(255) DEFAULT NULL,
  `tbl_category_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKbircfhd51i4g4fyjwq7dyswhs` (`tbl_category_id`),
  CONSTRAINT `FKbircfhd51i4g4fyjwq7dyswhs` FOREIGN KEY (`tbl_category_id`) REFERENCES `tbl_category` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_product`
--

LOCK TABLES `tbl_product` WRITE;
/*!40000 ALTER TABLE `tbl_product` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_product` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_product_detail_img`
--

DROP TABLE IF EXISTS `tbl_product_detail_img`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tbl_product_detail_img` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `is_delete` bigint(20) DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `tbl_prodcut_thumb_img` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKi5ac108t813enqggl44v6wf2a` (`tbl_prodcut_thumb_img`),
  CONSTRAINT `FKi5ac108t813enqggl44v6wf2a` FOREIGN KEY (`tbl_prodcut_thumb_img`) REFERENCES `tbl_product` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_product_detail_img`
--

LOCK TABLES `tbl_product_detail_img` WRITE;
/*!40000 ALTER TABLE `tbl_product_detail_img` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_product_detail_img` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tbl_products_attribute`
--

DROP TABLE IF EXISTS `tbl_products_attribute`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tbl_products_attribute` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `created_at` datetime DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `is_delete` bigint(20) DEFAULT NULL,
  `updated_at` datetime DEFAULT NULL,
  `updated_by` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `tbl_category_id` bigint(20) DEFAULT NULL,
  `tbl_category_attribute_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKpa2abx7r6fvxbd4gnnd4f2scc` (`tbl_category_id`),
  KEY `FK9j5axo8j8mg48gmbam7t9aoqd` (`tbl_category_attribute_id`),
  CONSTRAINT `FK9j5axo8j8mg48gmbam7t9aoqd` FOREIGN KEY (`tbl_category_attribute_id`) REFERENCES `tbl_category_attribute` (`id`),
  CONSTRAINT `FKpa2abx7r6fvxbd4gnnd4f2scc` FOREIGN KEY (`tbl_category_id`) REFERENCES `tbl_category` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tbl_products_attribute`
--

LOCK TABLES `tbl_products_attribute` WRITE;
/*!40000 ALTER TABLE `tbl_products_attribute` DISABLE KEYS */;
/*!40000 ALTER TABLE `tbl_products_attribute` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-13  0:52:44
