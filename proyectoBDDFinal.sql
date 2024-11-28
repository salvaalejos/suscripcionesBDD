-- MySQL dump 10.13  Distrib 8.0.40, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: proyectosuscripciones
-- ------------------------------------------------------
-- Server version	8.0.40

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `comition`
--

DROP TABLE IF EXISTS `comition`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `comition` (
  `idComition` int NOT NULL AUTO_INCREMENT,
  `amount` double NOT NULL,
  `comition_date` date NOT NULL,
  `Subscription_idSubscription` int NOT NULL,
  `User_idSeller` int NOT NULL,
  PRIMARY KEY (`idComition`),
  KEY `fk_Comition_Subscription1_idx` (`Subscription_idSubscription`),
  KEY `User_idSeller_idx` (`User_idSeller`),
  CONSTRAINT `fk_Comition_Subscription1` FOREIGN KEY (`Subscription_idSubscription`) REFERENCES `subscription` (`idSubscription`),
  CONSTRAINT `User_idSeller` FOREIGN KEY (`User_idSeller`) REFERENCES `user` (`idUser`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comition`
--

LOCK TABLES `comition` WRITE;
/*!40000 ALTER TABLE `comition` DISABLE KEYS */;
INSERT INTO `comition` VALUES (1,20,'2024-11-27',5,3),(2,20,'2024-11-27',6,3);
/*!40000 ALTER TABLE `comition` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `payment`
--

DROP TABLE IF EXISTS `payment`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `payment` (
  `idPayment` int NOT NULL AUTO_INCREMENT,
  `amount` double NOT NULL,
  `payment_date` date NOT NULL,
  `Subscription_idSubscription` int NOT NULL,
  PRIMARY KEY (`idPayment`),
  KEY `fk_Payment_Subscription1_idx` (`Subscription_idSubscription`),
  CONSTRAINT `fk_Payment_Subscription1` FOREIGN KEY (`Subscription_idSubscription`) REFERENCES `subscription` (`idSubscription`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `payment`
--

LOCK TABLES `payment` WRITE;
/*!40000 ALTER TABLE `payment` DISABLE KEYS */;
INSERT INTO `payment` VALUES (1,200,'2024-11-27',1),(4,200,'2024-11-27',1),(5,200,'2024-11-27',2),(6,200,'2024-11-27',3),(7,200,'2024-11-27',4),(8,200,'2024-11-27',5),(9,200,'2024-11-27',6);
/*!40000 ALTER TABLE `payment` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subscription`
--

DROP TABLE IF EXISTS `subscription`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subscription` (
  `idSubscription` int NOT NULL AUTO_INCREMENT,
  `start_date` date NOT NULL,
  `end_date` date NOT NULL,
  `status` tinyint NOT NULL,
  `User_idUser` int NOT NULL,
  `SubscriptionPlan_idSubscriptionPlan` int NOT NULL,
  PRIMARY KEY (`idSubscription`),
  KEY `fk_Subscription_User1_idx` (`User_idUser`),
  KEY `fk_Subscription_SubscriptionPlan1_idx` (`SubscriptionPlan_idSubscriptionPlan`),
  CONSTRAINT `fk_Subscription_SubscriptionPlan1` FOREIGN KEY (`SubscriptionPlan_idSubscriptionPlan`) REFERENCES `subscriptionplan` (`idSubscriptionPlan`),
  CONSTRAINT `fk_Subscription_User1` FOREIGN KEY (`User_idUser`) REFERENCES `user` (`idUser`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subscription`
--

LOCK TABLES `subscription` WRITE;
/*!40000 ALTER TABLE `subscription` DISABLE KEYS */;
INSERT INTO `subscription` VALUES (1,'2024-11-27','2025-01-27',1,2,1),(2,'2024-11-27','2024-12-27',1,4,1),(3,'2024-11-27','2024-12-27',1,5,1),(4,'2024-11-27','2024-12-27',1,6,1),(5,'2024-11-27','2024-12-27',1,7,1),(6,'2024-11-27','2024-12-27',1,8,1);
/*!40000 ALTER TABLE `subscription` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subscriptionplan`
--

DROP TABLE IF EXISTS `subscriptionplan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subscriptionplan` (
  `idSubscriptionPlan` int NOT NULL AUTO_INCREMENT,
  `price` double NOT NULL,
  `title` varchar(45) NOT NULL,
  `description` varchar(45) NOT NULL,
  `status` tinyint NOT NULL,
  `Sucursal_idSucursal` int NOT NULL,
  PRIMARY KEY (`idSubscriptionPlan`),
  KEY `fk_SubscriptionPlan_Sucursal1_idx` (`Sucursal_idSucursal`),
  CONSTRAINT `fk_SubscriptionPlan_Sucursal1` FOREIGN KEY (`Sucursal_idSucursal`) REFERENCES `sucursal` (`idSucursal`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subscriptionplan`
--

LOCK TABLES `subscriptionplan` WRITE;
/*!40000 ALTER TABLE `subscriptionplan` DISABLE KEYS */;
INSERT INTO `subscriptionplan` VALUES (1,200,'Pro','Canasta básica',1,1);
/*!40000 ALTER TABLE `subscriptionplan` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sucursal`
--

DROP TABLE IF EXISTS `sucursal`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sucursal` (
  `idSucursal` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `direction` varchar(45) NOT NULL,
  `percentageAdmin` double NOT NULL,
  `percentageSucursal` double NOT NULL,
  `phone` varchar(45) NOT NULL,
  `status` tinyint NOT NULL,
  PRIMARY KEY (`idSucursal`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sucursal`
--

LOCK TABLES `sucursal` WRITE;
/*!40000 ALTER TABLE `sucursal` DISABLE KEYS */;
INSERT INTO `sucursal` VALUES (1,'Villa Morelos','Iturbide #5',50,50,'4381032600',1);
/*!40000 ALTER TABLE `sucursal` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `idUser` int NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `phone` varchar(45) NOT NULL,
  `user_type` int NOT NULL,
  `email` varchar(45) NOT NULL,
  `status` tinyint NOT NULL DEFAULT '0',
  `Sucursal_idSucursal` int DEFAULT NULL,
  PRIMARY KEY (`idUser`),
  KEY `fk_User_Sucursal1_idx` (`Sucursal_idSucursal`),
  CONSTRAINT `fk_User_Sucursal1` FOREIGN KEY (`Sucursal_idSucursal`) REFERENCES `sucursal` (`idSucursal`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'Salvador','salvaalejos','d033e22ae348aeb5660fc2140aec35850c4da997','4381126867',1,'alejossalvador@gmail.com',1,NULL),(2,'Valeria','aleriva525','7c222fb2927d828af22f592134e8932480637c0d','4381069760',2,'aleriva525@gmail.com',1,1),(3,'Antonio','toño123','7c222fb2927d828af22f592134e8932480637c0d','1234567890',3,'tonio@gmail.com',1,1),(4,'Joaquin','joaquin','7c222fb2927d828af22f592134e8932480637c0d','1234567890',2,'joaquin@gmail.com',1,1),(5,'Vivivana','viviana','7c222fb2927d828af22f592134e8932480637c0d','4431123322',2,'viviana@gmail.com',1,1),(6,'Yuliana','yuli','7c222fb2927d828af22f592134e8932480637c0d','4381092233',2,'yuli@gmail.com',1,1),(7,'David','david','7c222fb2927d828af22f592134e8932480637c0d','4438123344',2,'david@gmail.com',1,1),(8,'Enrique','quique','7c222fb2927d828af22f592134e8932480637c0d','4738229394',2,'quique@gmail.com',1,1);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-11-27 21:48:14
