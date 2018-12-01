CREATE DATABASE  IF NOT EXISTS `complejo` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `complejo`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: complejo
-- ------------------------------------------------------
-- Server version	5.7.14-log

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
-- Table structure for table `administrador`
--

DROP TABLE IF EXISTS `administrador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `administrador` (
  `idadministrador` int(11) NOT NULL,
  `cuenta` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `apellido_paterno` varchar(45) NOT NULL,
  `apellido_materno` varchar(45) NOT NULL,
  `puesto` varchar(45) NOT NULL,
  PRIMARY KEY (`idadministrador`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `administrador`
--

LOCK TABLES `administrador` WRITE;
/*!40000 ALTER TABLE `administrador` DISABLE KEYS */;
INSERT INTO `administrador` VALUES (2,'ok','Pepito','Ortiz','Puerko','nadador');
/*!40000 ALTER TABLE `administrador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `corte_turno`
--

DROP TABLE IF EXISTS `corte_turno`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `corte_turno` (
  `idcorte_turno` int(11) NOT NULL,
  `idvisita` int(11) NOT NULL,
  `fecha` date NOT NULL,
  `id_administrador` int(11) NOT NULL,
  PRIMARY KEY (`idcorte_turno`),
  KEY `id_administrador_idx` (`id_administrador`),
  KEY `id_visita_idx` (`idvisita`),
  CONSTRAINT `id_administrador` FOREIGN KEY (`id_administrador`) REFERENCES `administrador` (`idadministrador`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `id_visita` FOREIGN KEY (`idvisita`) REFERENCES `visitas` (`idvisitas`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `corte_turno`
--

LOCK TABLES `corte_turno` WRITE;
/*!40000 ALTER TABLE `corte_turno` DISABLE KEYS */;
/*!40000 ALTER TABLE `corte_turno` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `crendencial`
--

DROP TABLE IF EXISTS `crendencial`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `crendencial` (
  `idcrendencial` int(11) NOT NULL AUTO_INCREMENT,
  `nombre_usuario` varchar(45) NOT NULL,
  `apellido_paterno` varchar(45) NOT NULL,
  `apellido_materno` varchar(45) NOT NULL,
  `correo` varchar(45) NOT NULL,
  `numero_emergencia` varchar(45) NOT NULL,
  `nombre_emergencia` varchar(45) NOT NULL,
  `fecha_expiracion` varchar(45) NOT NULL,
  `tipo_credencial` varchar(45) NOT NULL,
  `idseguro` int(11) NOT NULL,
  `horas_disponibles` int(11) NOT NULL,
  PRIMARY KEY (`idcrendencial`),
  KEY `id_seguro_idx` (`idseguro`),
  CONSTRAINT `id_seguro` FOREIGN KEY (`idseguro`) REFERENCES `seguro` (`idseguro`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `crendencial`
--

LOCK TABLES `crendencial` WRITE;
/*!40000 ALTER TABLE `crendencial` DISABLE KEYS */;
/*!40000 ALTER TABLE `crendencial` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `curso`
--

DROP TABLE IF EXISTS `curso`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `curso` (
  `idcurso` int(11) NOT NULL,
  `nombre_curso` varchar(45) NOT NULL,
  `instructor` varchar(45) NOT NULL,
  `dias_impartido` varchar(45) NOT NULL,
  `hora_curso` varchar(45) NOT NULL,
  PRIMARY KEY (`idcurso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `curso`
--

LOCK TABLES `curso` WRITE;
/*!40000 ALTER TABLE `curso` DISABLE KEYS */;
/*!40000 ALTER TABLE `curso` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `seguro`
--

DROP TABLE IF EXISTS `seguro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `seguro` (
  `idseguro` int(11) NOT NULL,
  `seguro` varchar(45) NOT NULL,
  `estado` varchar(45) NOT NULL,
  PRIMARY KEY (`idseguro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seguro`
--

LOCK TABLES `seguro` WRITE;
/*!40000 ALTER TABLE `seguro` DISABLE KEYS */;
/*!40000 ALTER TABLE `seguro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `visitas`
--

DROP TABLE IF EXISTS `visitas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `visitas` (
  `idvisitas` int(11) NOT NULL,
  `hora_entrada` int(11) NOT NULL,
  `hora_salida` int(11) NOT NULL,
  `tipo_pago` varchar(45) NOT NULL,
  `idcredencial` int(11) NOT NULL,
  PRIMARY KEY (`idvisitas`),
  KEY `id_credencial_idx` (`idcredencial`),
  CONSTRAINT `id_credencial` FOREIGN KEY (`idcredencial`) REFERENCES `crendencial` (`idcrendencial`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `visitas`
--

LOCK TABLES `visitas` WRITE;
/*!40000 ALTER TABLE `visitas` DISABLE KEYS */;
/*!40000 ALTER TABLE `visitas` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-28 21:46:34
