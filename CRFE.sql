-- MySQL dump 10.13  Distrib 8.0.43, for Win64 (x86_64)
--
-- Host: localhost    Database: cfre
-- ------------------------------------------------------
-- Server version	8.0.43

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `autenticacion`
--

DROP TABLE IF EXISTS `autenticacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `autenticacion` (
  `ID_Autenticacion` int NOT NULL,
  `ID_Usuario` int DEFAULT NULL,
  `fecha_expiracion` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`ID_Autenticacion`),
  KEY `ID_Usuario` (`ID_Usuario`),
  CONSTRAINT `autenticacion_ibfk_1` FOREIGN KEY (`ID_Usuario`) REFERENCES `usuario` (`ID_Usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `autenticacion`
--

LOCK TABLES `autenticacion` WRITE;
/*!40000 ALTER TABLE `autenticacion` DISABLE KEYS */;
/*!40000 ALTER TABLE `autenticacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `datos_climaticos`
--

DROP TABLE IF EXISTS `datos_climaticos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `datos_climaticos` (
  `ID_Dato` int NOT NULL,
  `fechaHora` int DEFAULT NULL,
  `temperatura` double DEFAULT NULL,
  `humedad` double DEFAULT NULL,
  `precipitacion` double DEFAULT NULL,
  `viento` double DEFAULT NULL,
  `radiacion` double DEFAULT NULL,
  PRIMARY KEY (`ID_Dato`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `datos_climaticos`
--

LOCK TABLES `datos_climaticos` WRITE;
/*!40000 ALTER TABLE `datos_climaticos` DISABLE KEYS */;
INSERT INTO `datos_climaticos` VALUES (1,2025,24,0.4,0,13,7),(2,2025,13,0.43,0.03,10,7);
/*!40000 ALTER TABLE `datos_climaticos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `estacion_climatica`
--

DROP TABLE IF EXISTS `estacion_climatica`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `estacion_climatica` (
  `ID_estacion` int NOT NULL,
  `nombre_estacion` varchar(255) DEFAULT NULL,
  `ubicacion` varchar(255) DEFAULT NULL,
  `latitud` double DEFAULT NULL,
  `longitud` double DEFAULT NULL,
  `fecha_instalacion` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`ID_estacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `estacion_climatica`
--

LOCK TABLES `estacion_climatica` WRITE;
/*!40000 ALTER TABLE `estacion_climatica` DISABLE KEYS */;
/*!40000 ALTER TABLE `estacion_climatica` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `ID_Usuario` int NOT NULL,
  `nombre_usuario` varchar(255) DEFAULT NULL,
  `contrasenia` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `fecha_registro` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`ID_Usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2025-10-02  0:45:59