CREATE DATABASE  IF NOT EXISTS `deepspaced6` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `deepspaced6`;
-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: deepspaced6
-- ------------------------------------------------------
-- Server version	8.0.33

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
-- Table structure for table `accionquerealiza`
--

DROP TABLE IF EXISTS `accionquerealiza`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `accionquerealiza` (
  `ID` int NOT NULL AUTO_INCREMENT,
  `Funcion` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `accionquerealiza`
--

LOCK TABLES `accionquerealiza` WRITE;
/*!40000 ALTER TABLE `accionquerealiza` DISABLE KEYS */;
INSERT INTO `accionquerealiza` VALUES (1,'Quita X puntos de vida (primero ataca al escudo)'),(2,'Ignorar escudos (ataca directamente al casco)'),(3,'Destruir escudo'),(4,'Enviar a enfermeria'),(5,'Tirar dado amenaza'),(6,'Amenazas externas recuperan 1 nivel'),(7,'Devolver dado bloqueado'),(8,'No asignar'),(9,'No ocurre nada');
/*!40000 ALTER TABLE `accionquerealiza` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `amenazas`
--

DROP TABLE IF EXISTS `amenazas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `amenazas` (
  `Nombre` varchar(50) DEFAULT NULL,
  `ValorAmenaza` int DEFAULT NULL,
  `DadoActivacion` int DEFAULT NULL,
  `AccionQueRealiza` int DEFAULT NULL,
  `InternaOExterna` tinyint(1) DEFAULT NULL,
  `NumeroCartas` int DEFAULT NULL,
  `DadoDesactivacion` int DEFAULT NULL,
  `ID` int NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`ID`),
  KEY `AccionQueRealiza` (`AccionQueRealiza`),
  CONSTRAINT `amenazas_ibfk_1` FOREIGN KEY (`AccionQueRealiza`) REFERENCES `accionquerealiza` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `amenazas`
--

LOCK TABLES `amenazas` WRITE;
/*!40000 ALTER TABLE `amenazas` DISABLE KEYS */;
INSERT INTO `amenazas` VALUES ('Buque Insignia',4,4,1,1,1,4,1),('Interceptor',3,3,1,1,2,4,2),('Saqueadores',2,4,2,1,3,4,3),('Meteoro',4,1,1,1,1,4,4),('Dron',2,6,1,1,2,4,5),('Nave de recompensa',4,2,3,1,1,4,6),('Bombardero',3,3,4,1,3,4,7),('Piratas espaciales',2,6,1,1,3,4,8),('Interceptor X',4,4,1,1,1,4,9),('Secuestradores',4,5,1,1,1,4,10),('Que no cunda el pánico',0,0,9,0,6,0,11),('Fuego amigo',0,0,4,0,1,0,12),('Amenaza encubierta',0,2,5,0,1,4,13),('Distorsión temporal',0,2,6,0,1,4,14),('Amenaza encubierta',0,0,5,0,1,4,15),('Subida de moral',0,6,7,0,1,0,16),('Explosión del panel',0,0,8,0,1,3,17),('Pandemia',0,0,4,0,1,3,18),('Invasores',0,4,4,0,1,2,19),('Comunicación desactivada',0,0,8,0,1,5,20),('Alzamiento de los robots',0,2,4,0,1,5,21);
/*!40000 ALTER TABLE `amenazas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `email` varchar(50) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `pass` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`email`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('a','a','a'),('dublajes@gmail.com','alvaro','alvaro');
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

-- Dump completed on 2023-05-31 23:08:10
