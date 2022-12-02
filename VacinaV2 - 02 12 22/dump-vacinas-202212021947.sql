-- MySQL dump 10.13  Distrib 8.0.19, for Win64 (x86_64)
--
-- Host: localhost    Database: vacinas
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.24-MariaDB

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
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuarios` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `Nome` varchar(30) NOT NULL,
  `Senha` varchar(30) NOT NULL,
  `CPF` varchar(11) NOT NULL,
  `CNS` varchar(15) NOT NULL,
  `Nome_Social` varchar(50) DEFAULT NULL,
  `Ident_genero` varchar(50) NOT NULL,
  `Nacionalidade` varchar(50) NOT NULL,
  `D_Nascimento` varchar(30) NOT NULL,
  `RC` varchar(30) NOT NULL,
  `Alergia` varchar(30) DEFAULT NULL,
  `Email` varchar(100) NOT NULL,
  `admin` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `CPF` (`CPF`),
  UNIQUE KEY `CNS` (`CNS`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES (2,'Thomas','jao','12938124','04944714505',NULL,'Genero 1','Nacionalidade 1','3/Janeiro/2000','Cor 1','Nenhuma','123',NULL),(3,'Me da','sd','asd','dsad',NULL,'Genero 1','Nacionalidade 1','1/Janeiro/2000','Cor 1','asd','asd',NULL),(5,'Nota maxima','amarelo','123','vermelho',NULL,'Genero 1','Nacionalidade 1','3/Janeiro/2000','Cor 1','123','awsd',NULL),(6,'sirleide','02','123123','123123',NULL,'Genero 2','Nacionalidade 2','9/Outubro/2000','Cor2','Piolho','fghdr',NULL);
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vacina`
--

DROP TABLE IF EXISTS `vacina`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vacina` (
  `Imunobiologico` varchar(50) DEFAULT NULL,
  `Estrategia` varchar(50) DEFAULT NULL,
  `Dose` varchar(50) DEFAULT NULL,
  `Aprazamento` varchar(50) DEFAULT NULL,
  `Localaplicacao` varchar(50) DEFAULT NULL,
  `lotefab` varchar(50) NOT NULL,
  `UnidadeSaude` varchar(50) DEFAULT NULL,
  `VAdministracao` varchar(50) DEFAULT NULL,
  `Observacao` varchar(50) DEFAULT NULL,
  UNIQUE KEY `lotefab` (`lotefab`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vacina`
--

LOCK TABLES `vacina` WRITE;
/*!40000 ALTER TABLE `vacina` DISABLE KEYS */;
INSERT INTO `vacina` VALUES ('Stamaril','pep','1','10d','Oral','1','posto','intramuscular','Nada a declarar'),('Contra Febre Amarela (FA)','Porta em porta','1ª Dose','10 dias','Deltoide esquerda','d','d','Oral (VO)','dd');
/*!40000 ALTER TABLE `vacina` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping routines for database 'vacinas'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-02 19:47:29
