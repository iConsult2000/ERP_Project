-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.1.53-log


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema PRODIC2K
--

CREATE DATABASE IF NOT EXISTS PRODIC2K;
USE PRODIC2K;

--
-- Definition of table `PRODIC2K`.`Absence`
--

DROP TABLE IF EXISTS `PRODIC2K`.`Absence`;
CREATE TABLE  `PRODIC2K`.`Absence` (
  `idAbsence` int(11) NOT NULL,
  `idEvent` int(11) NOT NULL,
  `idPersonne` int(11) NOT NULL,
  `justifier` bit(1) DEFAULT NULL,
  PRIMARY KEY (`idAbsence`),
  KEY `FK1C341A1D5F75869F` (`idEvent`),
  KEY `FK1C341A1D8EEE00CD` (`idPersonne`),
  CONSTRAINT `FK1C341A1D5F75869F` FOREIGN KEY (`idEvent`) REFERENCES `Evenement` (`idEvent`),
  CONSTRAINT `FK1C341A1D8EEE00CD` FOREIGN KEY (`idPersonne`) REFERENCES `Etudiant` (`idPersonne`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `PRODIC2K`.`Absence`
--

/*!40000 ALTER TABLE `Absence` DISABLE KEYS */;
LOCK TABLES `Absence` WRITE;
INSERT INTO `PRODIC2K`.`Absence` VALUES  (0,1,6,NULL);
UNLOCK TABLES;
/*!40000 ALTER TABLE `Absence` ENABLE KEYS */;


--
-- Definition of table `PRODIC2K`.`ChargePlacement`
--

DROP TABLE IF EXISTS `PRODIC2K`.`ChargePlacement`;
CREATE TABLE  `PRODIC2K`.`ChargePlacement` (
  `idPersonne` int(11) NOT NULL AUTO_INCREMENT,
  `codePostal` int(11) NOT NULL,
  `pays` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `rue` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ville` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `emailPers` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nomPers` varchar(55) COLLATE utf8_unicode_ci DEFAULT NULL,
  `prenomPers` varchar(55) COLLATE utf8_unicode_ci DEFAULT NULL,
  `telephone` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idPersonne`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `PRODIC2K`.`ChargePlacement`
--

/*!40000 ALTER TABLE `ChargePlacement` DISABLE KEYS */;
LOCK TABLES `ChargePlacement` WRITE;
INSERT INTO `PRODIC2K`.`ChargePlacement` VALUES  (1,75000,'France','Avenue ','ville','a.petrose@ingesup.com','Petrose','Audrey',NULL),
 (2,0,NULL,NULL,NULL,NULL,NULL,NULL,NULL),
 (3,75000,'France','rue forestier','Paris','h.peller@ingesup.com','Peller','Hugo',NULL);
UNLOCK TABLES;
/*!40000 ALTER TABLE `ChargePlacement` ENABLE KEYS */;


--
-- Definition of table `PRODIC2K`.`ChargePlacement_Entreprise`
--

DROP TABLE IF EXISTS `PRODIC2K`.`ChargePlacement_Entreprise`;
CREATE TABLE  `PRODIC2K`.`ChargePlacement_Entreprise` (
  `chargePlacements_idPersonne` int(11) NOT NULL,
  `entreprises_siren` varchar(14) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`chargePlacements_idPersonne`,`entreprises_siren`),
  KEY `FK195E944914C27A63` (`entreprises_siren`),
  KEY `FK195E9449ACD082B` (`chargePlacements_idPersonne`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `PRODIC2K`.`ChargePlacement_Entreprise`
--

/*!40000 ALTER TABLE `ChargePlacement_Entreprise` DISABLE KEYS */;
LOCK TABLES `ChargePlacement_Entreprise` WRITE;
INSERT INTO `PRODIC2K`.`ChargePlacement_Entreprise` VALUES  (2,'24U5LK239874B'),
 (3,'639URST'),
 (3,'J4U5LK2POB'),
 (3,'OPZDSPOB');
UNLOCK TABLES;
/*!40000 ALTER TABLE `ChargePlacement_Entreprise` ENABLE KEYS */;


--
-- Definition of table `PRODIC2K`.`Classe`
--

DROP TABLE IF EXISTS `PRODIC2K`.`Classe`;
CREATE TABLE  `PRODIC2K`.`Classe` (
  `idClasse` int(11) NOT NULL AUTO_INCREMENT,
  `anneeCycle` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `no_agenda` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nomClasse` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `specialite` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idClasse`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `PRODIC2K`.`Classe`
--

/*!40000 ALTER TABLE `Classe` DISABLE KEYS */;
LOCK TABLES `Classe` WRITE;
INSERT INTO `PRODIC2K`.`Classe` VALUES  (1,'2','86taa44vlr4d8u5enlgbc0p210%40group.calendar.google.com','SIGL','SIGL'),
 (2,'1','88j5baht9lgvgrhpgv4olu6a88%40group.calendar.google.com','SIGL','SIGL'),
 (3,'3','el1h231sa5834mfdk6pmsa9l4g%40group.calendar.google.com','SIGL','SIGL'),
 (4,'1','88j5baht9lgvgrhpgv4olu6a88%40group.calendar.google.com','TRSE','TRSE'),
 (5,'2','86taa44vlr4d8u5enlgbc0p210%40group.calendar.google.com','TRSE','TRSE'),
 (6,'3','el1h231sa5834mfdk6pmsa9l4g%40group.calendar.google.com','TRSE','TRSE'),
 (7,'2','86taa44vlr4d8u5enlgbc0p210%40group.calendar.google.com','EM','EM'),
 (8,'2','86taa44vlr4d8u5enlgbc0p210%40group.calendar.google.com','EM','EM'),
 (9,'3','el1h231sa5834mfdk6pmsa9l4g%40group.calendar.google.com','EM','EM');
UNLOCK TABLES;
/*!40000 ALTER TABLE `Classe` ENABLE KEYS */;


--
-- Definition of table `PRODIC2K`.`Classe_Evenement`
--

DROP TABLE IF EXISTS `PRODIC2K`.`Classe_Evenement`;
CREATE TABLE  `PRODIC2K`.`Classe_Evenement` (
  `classes_idClasse` int(11) NOT NULL,
  `evenements_idEvent` int(11) NOT NULL,
  PRIMARY KEY (`classes_idClasse`,`evenements_idEvent`),
  KEY `FKFE756A975E595CB8` (`classes_idClasse`),
  KEY `FKFE756A976F781469` (`evenements_idEvent`),
  CONSTRAINT `FKFE756A975E595CB8` FOREIGN KEY (`classes_idClasse`) REFERENCES `Classe` (`idClasse`),
  CONSTRAINT `FKFE756A976F781469` FOREIGN KEY (`evenements_idEvent`) REFERENCES `Evenement` (`idEvent`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `PRODIC2K`.`Classe_Evenement`
--

/*!40000 ALTER TABLE `Classe_Evenement` DISABLE KEYS */;
LOCK TABLES `Classe_Evenement` WRITE;
INSERT INTO `PRODIC2K`.`Classe_Evenement` VALUES  (2,1),
 (3,1),
 (5,2),
 (7,1),
 (7,2),
 (9,2);
UNLOCK TABLES;
/*!40000 ALTER TABLE `Classe_Evenement` ENABLE KEYS */;


--
-- Definition of table `PRODIC2K`.`Classe_Matiere`
--

DROP TABLE IF EXISTS `PRODIC2K`.`Classe_Matiere`;
CREATE TABLE  `PRODIC2K`.`Classe_Matiere` (
  `classes_idClasse` int(11) NOT NULL,
  `matieres_idMatiere` int(11) NOT NULL,
  PRIMARY KEY (`classes_idClasse`,`matieres_idMatiere`),
  KEY `FKE7458D5DEE1FD3E` (`matieres_idMatiere`),
  KEY `FKE7458D5D5E595CB8` (`classes_idClasse`),
  CONSTRAINT `FKE7458D5D5E595CB8` FOREIGN KEY (`classes_idClasse`) REFERENCES `Classe` (`idClasse`),
  CONSTRAINT `FKE7458D5DEE1FD3E` FOREIGN KEY (`matieres_idMatiere`) REFERENCES `Matiere` (`idMatiere`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `PRODIC2K`.`Classe_Matiere`
--

/*!40000 ALTER TABLE `Classe_Matiere` DISABLE KEYS */;
LOCK TABLES `Classe_Matiere` WRITE;
INSERT INTO `PRODIC2K`.`Classe_Matiere` VALUES  (4,4),
 (9,7),
 (9,10),
 (8,11),
 (9,11),
 (7,12),
 (8,12),
 (4,14),
 (6,14),
 (2,15);
UNLOCK TABLES;
/*!40000 ALTER TABLE `Classe_Matiere` ENABLE KEYS */;


--
-- Definition of table `PRODIC2K`.`Contact`
--

DROP TABLE IF EXISTS `PRODIC2K`.`Contact`;
CREATE TABLE  `PRODIC2K`.`Contact` (
  `idContact` int(11) NOT NULL AUTO_INCREMENT,
  `emailContact` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nomContact` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `posteContact` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `prenomContact` varchar(55) COLLATE utf8_unicode_ci DEFAULT NULL,
  `siren` varchar(14) COLLATE utf8_unicode_ci DEFAULT NULL,
  `telContact` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idContact`),
  KEY `FK9BEFBC001562232A` (`siren`),
  CONSTRAINT `FK9BEFBC001562232A` FOREIGN KEY (`siren`) REFERENCES `Entreprise` (`siren`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `PRODIC2K`.`Contact`
--

/*!40000 ALTER TABLE `Contact` DISABLE KEYS */;
LOCK TABLES `Contact` WRITE;
UNLOCK TABLES;
/*!40000 ALTER TABLE `Contact` ENABLE KEYS */;


--
-- Definition of table `PRODIC2K`.`Contrat`
--

DROP TABLE IF EXISTS `PRODIC2K`.`Contrat`;
CREATE TABLE  `PRODIC2K`.`Contrat` (
  `idContrat` int(11) NOT NULL AUTO_INCREMENT,
  `dateDebutCont` datetime DEFAULT NULL,
  `dateFinCont` datetime DEFAULT NULL,
  `dureeCont` int(11) NOT NULL,
  `idPersonne` int(11) NOT NULL,
  `libelleContrat` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `siren` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `idTypContr` int(11) DEFAULT NULL,
  PRIMARY KEY (`idContrat`),
  KEY `FK9BEFFB931562232A` (`siren`),
  KEY `FK9BEFFB938EEE00CD` (`idPersonne`),
  KEY `FK9BEFFB9359B4433F` (`idTypContr`),
  CONSTRAINT `FK9BEFFB9359B4433F` FOREIGN KEY (`idTypContr`) REFERENCES `TypeContrat` (`idTypContr`),
  CONSTRAINT `FK9BEFFB931562232A` FOREIGN KEY (`siren`) REFERENCES `Entreprise` (`siren`),
  CONSTRAINT `FK9BEFFB938EEE00CD` FOREIGN KEY (`idPersonne`) REFERENCES `Etudiant` (`idPersonne`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `PRODIC2K`.`Contrat`
--

/*!40000 ALTER TABLE `Contrat` DISABLE KEYS */;
LOCK TABLES `Contrat` WRITE;
INSERT INTO `PRODIC2K`.`Contrat` VALUES  (1,'2012-05-06 12:40:01','2013-05-24 12:40:07',12,2,'Apprentit SI','PI9974YZEEA',1),
 (2,'2012-05-31 12:43:02','2013-05-06 12:42:56',12,3,'Apprentit dével','J4U5LK2POB',1),
 (3,'2012-05-31 12:43:02','2013-05-06 12:42:56',12,4,'Stagiaire admin','PI9974EEA',1),
 (4,'2012-05-06 12:45:02','2013-05-06 12:42:56',12,5,'Apprentit ingén','639URST',2),
 (5,'2012-05-06 12:45:02','2013-05-06 12:45:02',12,6,'Stagiaire Assis','PI9974YZEEA',2);
UNLOCK TABLES;
/*!40000 ALTER TABLE `Contrat` ENABLE KEYS */;


--
-- Definition of table `PRODIC2K`.`Document`
--

DROP TABLE IF EXISTS `PRODIC2K`.`Document`;
CREATE TABLE  `PRODIC2K`.`Document` (
  `DTYPE` varchar(31) COLLATE utf8_unicode_ci NOT NULL,
  `idDoc` int(11) NOT NULL AUTO_INCREMENT,
  `idEvent` int(11) NOT NULL,
  `idPersonne` int(11) NOT NULL,
  `commentaire` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `file` tinyblob,
  `nomDoc` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `size` int(11) DEFAULT NULL,
  `typeDoc` varchar(3) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idDoc`),
  KEY `FK3737353B5F75869F` (`idEvent`),
  KEY `FK3737353B9454A7A7` (`idPersonne`),
  CONSTRAINT `FK3737353B5F75869F` FOREIGN KEY (`idEvent`) REFERENCES `Evenement` (`idEvent`),
  CONSTRAINT `FK3737353B9454A7A7` FOREIGN KEY (`idPersonne`) REFERENCES `Professeur` (`idPersonne`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `PRODIC2K`.`Document`
--

/*!40000 ALTER TABLE `Document` DISABLE KEYS */;
LOCK TABLES `Document` WRITE;
UNLOCK TABLES;
/*!40000 ALTER TABLE `Document` ENABLE KEYS */;


--
-- Definition of table `PRODIC2K`.`Entreprise`
--

DROP TABLE IF EXISTS `PRODIC2K`.`Entreprise`;
CREATE TABLE  `PRODIC2K`.`Entreprise` (
  `siren` varchar(14) COLLATE utf8_unicode_ci NOT NULL,
  `codePostal` int(11) NOT NULL,
  `pays` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `rue` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ville` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `emailEntre` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nomEntrep` varchar(75) COLLATE utf8_unicode_ci DEFAULT NULL,
  `telEntre` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`siren`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `PRODIC2K`.`Entreprise`
--

/*!40000 ALTER TABLE `Entreprise` DISABLE KEYS */;
LOCK TABLES `Entreprise` WRITE;
INSERT INTO `PRODIC2K`.`Entreprise` VALUES  ('2415LK239874B',92260,'France','Rue du parc','Paris',NULL,'Lafarge',NULL),
 ('24U5LK239874B',94260,'France','Rue martin','Fontenay',NULL,'BNP Paribas',NULL),
 ('639URST',75011,'France','Rue jean jaurès','Paris',NULL,'Radio France',NULL),
 ('J4U5LK2POB',92003,'France','Rue camille des moulins','Billancourt',NULL,'Alten',NULL),
 ('OPZDSPOB',92003,'France','Rue Victor Hugo','La défense',NULL,'Accenture',NULL),
 ('PI9974EEA',92000,'France','l explanade','La defense',NULL,'Total',NULL),
 ('PI9974YZEEA',92000,'France','La grande arche','La défense',NULL,'HSBC',NULL);
UNLOCK TABLES;
/*!40000 ALTER TABLE `Entreprise` ENABLE KEYS */;


--
-- Definition of table `PRODIC2K`.`Etudiant`
--

DROP TABLE IF EXISTS `PRODIC2K`.`Etudiant`;
CREATE TABLE  `PRODIC2K`.`Etudiant` (
  `idPersonne` int(11) NOT NULL AUTO_INCREMENT,
  `codePostal` int(11) NOT NULL,
  `pays` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `rue` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ville` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `emailPers` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nomPers` varchar(55) COLLATE utf8_unicode_ci DEFAULT NULL,
  `prenomPers` varchar(55) COLLATE utf8_unicode_ci DEFAULT NULL,
  `telephone` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `delegue` bit(1) NOT NULL,
  `idClasse` int(11) NOT NULL,
  `membreBde` bit(1) NOT NULL,
  PRIMARY KEY (`idPersonne`),
  KEY `FKC55D557C8B0F98BF` (`idClasse`),
  CONSTRAINT `FKC55D557C8B0F98BF` FOREIGN KEY (`idClasse`) REFERENCES `Classe` (`idClasse`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `PRODIC2K`.`Etudiant`
--

/*!40000 ALTER TABLE `Etudiant` DISABLE KEYS */;
LOCK TABLES `Etudiant` WRITE;
INSERT INTO `PRODIC2K`.`Etudiant` VALUES  (2,78000,'France','Rue tappac','Velizy','l.ferrand@ingesup.com','Ferrand','Lori',NULL,0x01,1,0x01),
 (3,94400,'France','Rue Yorzta','Créteil','m.phejar@ingesup.com','Phejar','Manuel',NULL,0x01,1,0x01),
 (4,77600,'France','Rue de torcy','Bussy','y.bray@ingesup.com','Bray','Yohann',NULL,0x01,2,0x01),
 (5,92620,'France','Avenue du coin','Antony','j.pitou@ingesup.com','Pitou','Julien',NULL,0x01,1,0x01),
 (6,25000,'France','Rue de la foret','Orléans','s.dacalor@ingesup.com','Dacalor','Steeve',NULL,0x01,1,0x01),
 (7,777,NULL,'7 Rue de la mort','Enfer','nbalshuwet@gmail.com','BALSHUWET','Nikolas','0631323135',0x00,1,0x00),
 (8,777,NULL,'7 Rue de la mort','Enfer','psarkozy@gmail.com','SARKOZY','Patrick','0631323135',0x00,2,0x00);
UNLOCK TABLES;
/*!40000 ALTER TABLE `Etudiant` ENABLE KEYS */;


--
-- Definition of table `PRODIC2K`.`Evenement`
--

DROP TABLE IF EXISTS `PRODIC2K`.`Evenement`;
CREATE TABLE  `PRODIC2K`.`Evenement` (
  `DTYPE` varchar(31) COLLATE utf8_unicode_ci NOT NULL,
  `idEvent` int(11) NOT NULL AUTO_INCREMENT,
  `dateEvent` datetime DEFAULT NULL,
  `dureeJours` int(11) NOT NULL,
  `heureDeb` datetime DEFAULT NULL,
  `heureFin` datetime DEFAULT NULL,
  `idSalle` int(11) NOT NULL,
  `description` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `idMatiere` int(11) DEFAULT NULL,
  `idPersonne` int(11) DEFAULT NULL,
  `information` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nomCours` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `bareme` int(11) DEFAULT NULL,
  `coefficient` int(11) DEFAULT NULL,
  `libelleEval` varchar(65) COLLATE utf8_unicode_ci DEFAULT NULL,
  `typeEval` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idEvent`),
  KEY `FK78896A49A2149944` (`idEvent`),
  KEY `FK78896A4976638AB9` (`idEvent`),
  KEY `FK78896A499454A7A7` (`idPersonne`),
  KEY `FK78896A49D5638319` (`idMatiere`),
  KEY `FK78896A49610C5629` (`idSalle`),
  CONSTRAINT `FK78896A49610C5629` FOREIGN KEY (`idSalle`) REFERENCES `Salle` (`idSalle`),
  CONSTRAINT `FK78896A4976638AB9` FOREIGN KEY (`idEvent`) REFERENCES `ServicePedagogique` (`idPersonne`),
  CONSTRAINT `FK78896A499454A7A7` FOREIGN KEY (`idPersonne`) REFERENCES `Professeur` (`idPersonne`),
  CONSTRAINT `FK78896A49A2149944` FOREIGN KEY (`idEvent`) REFERENCES `Matiere` (`idMatiere`),
  CONSTRAINT `FK78896A49D5638319` FOREIGN KEY (`idMatiere`) REFERENCES `Matiere` (`idMatiere`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `PRODIC2K`.`Evenement`
--

/*!40000 ALTER TABLE `Evenement` DISABLE KEYS */;
LOCK TABLES `Evenement` WRITE;
INSERT INTO `PRODIC2K`.`Evenement` VALUES  ('',1,'2012-05-06 13:09:48',0,'2012-05-06 13:10:12','2012-05-06 13:10:43',7,NULL,13,2,NULL,NULL,20,2,'devoir final','QCM'),
 ('',2,'2012-05-06 13:12:29',0,'2012-05-06 13:12:35','2012-05-06 13:12:43',1,'Test description evenement',12,1,NULL,NULL,NULL,NULL,NULL,NULL);
UNLOCK TABLES;
/*!40000 ALTER TABLE `Evenement` ENABLE KEYS */;


--
-- Definition of table `PRODIC2K`.`Matiere`
--

DROP TABLE IF EXISTS `PRODIC2K`.`Matiere`;
CREATE TABLE  `PRODIC2K`.`Matiere` (
  `idMatiere` int(11) NOT NULL AUTO_INCREMENT,
  `libelleMatiere` varchar(75) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idMatiere`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `PRODIC2K`.`Matiere`
--

/*!40000 ALTER TABLE `Matiere` DISABLE KEYS */;
LOCK TABLES `Matiere` WRITE;
INSERT INTO `PRODIC2K`.`Matiere` VALUES  (1,'Admin Mysql'),
 (2,'C#'),
 (3,'C++'),
 (4,'JEE/Jboss'),
 (5,'Java Objet'),
 (6,'Admin Oracle'),
 (7,'Merise'),
 (8,'UML'),
 (9,'ASP.net'),
 (10,'Ria Flex'),
 (11,'Management de projet'),
 (12,'Servlet/jsp'),
 (13,'Ruby'),
 (14,'Ruby on Rails'),
 (15,'Anglais'),
 (16,'Agile');
UNLOCK TABLES;
/*!40000 ALTER TABLE `Matiere` ENABLE KEYS */;


--
-- Definition of table `PRODIC2K`.`Note`
--

DROP TABLE IF EXISTS `PRODIC2K`.`Note`;
CREATE TABLE  `PRODIC2K`.`Note` (
  `idNote` int(11) NOT NULL AUTO_INCREMENT,
  `idEvent` int(11) NOT NULL,
  `idPersonne` int(11) NOT NULL,
  `note` double DEFAULT NULL,
  PRIMARY KEY (`idNote`),
  KEY `FK2524123B3850A5` (`idEvent`),
  KEY `FK2524128EEE00CD` (`idPersonne`),
  CONSTRAINT `FK2524123B3850A5` FOREIGN KEY (`idEvent`) REFERENCES `Evenement` (`idEvent`),
  CONSTRAINT `FK2524128EEE00CD` FOREIGN KEY (`idPersonne`) REFERENCES `Etudiant` (`idPersonne`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `PRODIC2K`.`Note`
--

/*!40000 ALTER TABLE `Note` DISABLE KEYS */;
LOCK TABLES `Note` WRITE;
INSERT INTO `PRODIC2K`.`Note` VALUES  (1,1,4,12),
 (2,2,6,8);
UNLOCK TABLES;
/*!40000 ALTER TABLE `Note` ENABLE KEYS */;


--
-- Definition of table `PRODIC2K`.`Professeur`
--

DROP TABLE IF EXISTS `PRODIC2K`.`Professeur`;
CREATE TABLE  `PRODIC2K`.`Professeur` (
  `idPersonne` int(11) NOT NULL AUTO_INCREMENT,
  `codePostal` int(11) NOT NULL,
  `pays` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `rue` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ville` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `emailPers` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nomPers` varchar(55) COLLATE utf8_unicode_ci DEFAULT NULL,
  `prenomPers` varchar(55) COLLATE utf8_unicode_ci DEFAULT NULL,
  `telephone` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `competence` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `statut` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idPersonne`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `PRODIC2K`.`Professeur`
--

/*!40000 ALTER TABLE `Professeur` DISABLE KEYS */;
LOCK TABLES `Professeur` WRITE;
INSERT INTO `PRODIC2K`.`Professeur` VALUES  (1,94230,'France','avenue fortifrene','Alforville','per5@ingesup.com','Liaudet','Bertrand',NULL,NULL,'tps complet'),
 (2,95300,'France','avenus Camille zoé','Val doise','per9@ingesup.com','olifirenkoff','Jean michel',NULL,NULL,'partiel');
UNLOCK TABLES;
/*!40000 ALTER TABLE `Professeur` ENABLE KEYS */;


--
-- Definition of table `PRODIC2K`.`Salle`
--

DROP TABLE IF EXISTS `PRODIC2K`.`Salle`;
CREATE TABLE  `PRODIC2K`.`Salle` (
  `idSalle` int(11) NOT NULL AUTO_INCREMENT,
  `libSalle` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idSalle`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `PRODIC2K`.`Salle`
--

/*!40000 ALTER TABLE `Salle` DISABLE KEYS */;
LOCK TABLES `Salle` WRITE;
INSERT INTO `PRODIC2K`.`Salle` VALUES  (1,'1.6'),
 (2,'1.2'),
 (3,'Labo srt'),
 (4,'1.'),
 (5,'1.4'),
 (6,'1.3'),
 (7,'2.5'),
 (8,'2.3'),
 (9,'1.1'),
 (10,'1.0'),
 (11,'2.2'),
 (12,'2.4');
UNLOCK TABLES;
/*!40000 ALTER TABLE `Salle` ENABLE KEYS */;


--
-- Definition of table `PRODIC2K`.`ServicePedagogique`
--

DROP TABLE IF EXISTS `PRODIC2K`.`ServicePedagogique`;
CREATE TABLE  `PRODIC2K`.`ServicePedagogique` (
  `idPersonne` int(11) NOT NULL AUTO_INCREMENT,
  `codePostal` int(11) NOT NULL,
  `pays` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `rue` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `ville` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `emailPers` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nomPers` varchar(55) COLLATE utf8_unicode_ci DEFAULT NULL,
  `prenomPers` varchar(55) COLLATE utf8_unicode_ci DEFAULT NULL,
  `telephone` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  `telService` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idPersonne`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `PRODIC2K`.`ServicePedagogique`
--

/*!40000 ALTER TABLE `ServicePedagogique` DISABLE KEYS */;
LOCK TABLES `ServicePedagogique` WRITE;
INSERT INTO `PRODIC2K`.`ServicePedagogique` VALUES  (1,75019,'France','Rue oplazz','Paris','pers@ingesup.com','Ondrejeck','Christophe',NULL,'0153987021'),
 (2,75003,'France','rue GSD','Paris','per8s@ingesup.com','Kabre','Sali',NULL,'0153987594');
UNLOCK TABLES;
/*!40000 ALTER TABLE `ServicePedagogique` ENABLE KEYS */;


--
-- Definition of table `PRODIC2K`.`TypeContrat`
--

DROP TABLE IF EXISTS `PRODIC2K`.`TypeContrat`;
CREATE TABLE  `PRODIC2K`.`TypeContrat` (
  `idTypContr` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `libelleTypContr` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idTypContr`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Dumping data for table `PRODIC2K`.`TypeContrat`
--

/*!40000 ALTER TABLE `TypeContrat` DISABLE KEYS */;
LOCK TABLES `TypeContrat` WRITE;
INSERT INTO `PRODIC2K`.`TypeContrat` VALUES  (1,'statut etudiant','Convention stage'),
 (2,'statut salarié','Professionnalisation');
UNLOCK TABLES;
/*!40000 ALTER TABLE `TypeContrat` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
