-- phpMyAdmin SQL Dump
-- version 3.3.9
-- http://www.phpmyadmin.net
--
-- Serveur: 127.0.0.1
-- Généré le : Dim 06 Mai 2012 à 13:35
-- Version du serveur: 5.1.54
-- Version de PHP: 5.3.5

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données: `PRODIC2K`
--

-- --------------------------------------------------------

--
-- Structure de la table `absence`
--

DROP TABLE IF EXISTS `Absence`;
CREATE TABLE IF NOT EXISTS `Absence` (
  `idAbsence` int(11) NOT NULL,
  `idEvent` int(11) NOT NULL,
  `idPersonne` int(11) NOT NULL,
  `justifier` bit(1) DEFAULT NULL,
  PRIMARY KEY (`idAbsence`),
  KEY `FK1C341A1D5F75869F` (`idEvent`),
  KEY `FK1C341A1D8EEE00CD` (`idPersonne`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Contenu de la table `absence`
--

INSERT INTO `Absence` (`idAbsence`, `idEvent`, `idPersonne`, `justifier`) VALUES
(0, 1, 6, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `chargeplacement`
--

DROP TABLE IF EXISTS `ChargePlacement`;
CREATE TABLE IF NOT EXISTS `ChargePlacement` (
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
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=4 ;

--
-- Contenu de la table `chargeplacement`
--

INSERT INTO `ChargePlacement` (`idPersonne`, `codePostal`, `pays`, `rue`, `ville`, `emailPers`, `nomPers`, `prenomPers`, `telephone`) VALUES
(1, 75000, 'France', 'Avenue ', 'ville', 'a.petrose@ingesup.com', 'Petrose', 'Audrey', NULL),
(2, 0, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(3, 75000, 'France', 'rue forestier', 'Paris', 'h.peller@ingesup.com', 'Peller', 'Hugo', NULL);

-- --------------------------------------------------------

--
-- Structure de la table `chargeplacement_entreprise`
--

DROP TABLE IF EXISTS `ChargePlacement_Entreprise`;
CREATE TABLE IF NOT EXISTS `ChargePlacement_Entreprise` (
  `chargePlacements_idPersonne` int(11) NOT NULL,
  `entreprises_siren` varchar(14) COLLATE utf8_unicode_ci NOT NULL,
  PRIMARY KEY (`chargePlacements_idPersonne`,`entreprises_siren`),
  KEY `FK195E944914C27A63` (`entreprises_siren`),
  KEY `FK195E9449ACD082B` (`chargePlacements_idPersonne`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Contenu de la table `chargeplacement_entreprise`
--

INSERT INTO `ChargePlacement_Entreprise` (`chargePlacements_idPersonne`, `entreprises_siren`) VALUES
(2, '24U5LK239874B'),
(3, '639URST'),
(3, 'J4U5LK2POB'),
(3, 'OPZDSPOB');

-- --------------------------------------------------------

--
-- Structure de la table `classe`
--

DROP TABLE IF EXISTS `Classe`;
CREATE TABLE IF NOT EXISTS `Classe` (
  `idClasse` int(11) NOT NULL AUTO_INCREMENT,
  `anneeCycle` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `no_agenda` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nomClasse` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `specialite` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idClasse`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=10 ;

--
-- Contenu de la table `classe`
--

INSERT INTO `Classe` (`idClasse`, `anneeCycle`, `no_agenda`, `nomClasse`, `specialite`) VALUES
(1, '2', '222777888A', 'SIGL', 'SIGL'),
(2, '1', '22277obv88A', 'SIGL', 'SIGL'),
(3, '3', 'F22277obv88A', 'SIGL', 'SIGL'),
(4, '1', 'F277obv88A', 'TRSE', 'TRSE'),
(5, '2', 'F2POv6388A', 'TRSE', 'TRSE'),
(6, '3', 'F2POv638A', 'TRSE', 'TRSE'),
(7, '2', '5P66499TE', 'EM', 'EM'),
(8, '2', 'JLMOHGU', 'EM', 'EM'),
(9, '3', 'PECGTV 588', 'EM', 'EM');

-- --------------------------------------------------------

--
-- Structure de la table `classe_evenement`
--

DROP TABLE IF EXISTS `Classe_Evenement`;
CREATE TABLE IF NOT EXISTS `Classe_Evenement` (
  `classes_idClasse` int(11) NOT NULL,
  `evenements_idEvent` int(11) NOT NULL,
  PRIMARY KEY (`classes_idClasse`,`evenements_idEvent`),
  KEY `FKFE756A975E595CB8` (`classes_idClasse`),
  KEY `FKFE756A976F781469` (`evenements_idEvent`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Contenu de la table `classe_evenement`
--

INSERT INTO `Classe_Evenement` (`classes_idClasse`, `evenements_idEvent`) VALUES
(2, 1),
(3, 1),
(5, 2),
(7, 1),
(7, 2),
(9, 2);

-- --------------------------------------------------------

--
-- Structure de la table `classe_matiere`
--

DROP TABLE IF EXISTS `Classe_Matiere`;
CREATE TABLE IF NOT EXISTS `Classe_Matiere` (
  `classes_idClasse` int(11) NOT NULL,
  `matieres_idMatiere` int(11) NOT NULL,
  PRIMARY KEY (`classes_idClasse`,`matieres_idMatiere`),
  KEY `FKE7458D5DEE1FD3E` (`matieres_idMatiere`),
  KEY `FKE7458D5D5E595CB8` (`classes_idClasse`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Contenu de la table `classe_matiere`
--

INSERT INTO `Classe_Matiere` (`classes_idClasse`, `matieres_idMatiere`) VALUES
(4, 4),
(9, 7),
(9, 10),
(8, 11),
(9, 11),
(7, 12),
(8, 12),
(4, 14),
(6, 14),
(2, 15);

-- --------------------------------------------------------

--
-- Structure de la table `contact`
--

DROP TABLE IF EXISTS `Contact`;
CREATE TABLE IF NOT EXISTS `Contact` (
  `idContact` int(11) NOT NULL AUTO_INCREMENT,
  `emailContact` varchar(64) COLLATE utf8_unicode_ci DEFAULT NULL,
  `nomContact` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `posteContact` varchar(50) COLLATE utf8_unicode_ci DEFAULT NULL,
  `prenomContact` varchar(55) COLLATE utf8_unicode_ci DEFAULT NULL,
  `siren` varchar(14) COLLATE utf8_unicode_ci DEFAULT NULL,
  `telContact` varchar(10) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idContact`),
  KEY `FK9BEFBC001562232A` (`siren`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=1 ;

--
-- Contenu de la table `contact`
--


-- --------------------------------------------------------

--
-- Structure de la table `contrat`
--

DROP TABLE IF EXISTS `Contrat`;
CREATE TABLE IF NOT EXISTS `Contrat` (
  `idContrat` int(11) NOT NULL AUTO_INCREMENT,
  `dateDebutCont` datetime DEFAULT NULL,
  `dateFinCont` datetime DEFAULT NULL,
  `dureeCont` int(11) NOT NULL,
  `libelleContrat` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `siren` varchar(15) COLLATE utf8_unicode_ci DEFAULT NULL,
  `idTypContr` int(11) DEFAULT NULL,
  PRIMARY KEY (`idContrat`),
  KEY `FK9BEFFB931562232A` (`siren`),
  KEY `FK9BEFFB9359B4433F` (`idTypContr`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=6 ;

--
-- Contenu de la table `contrat`
--

INSERT INTO `Contrat` (`idContrat`, `dateDebutCont`, `dateFinCont`, `dureeCont`, `libelleContrat`, `siren`, `idTypContr`) VALUES
(1, '2012-05-06 12:40:01', '2013-05-24 12:40:07', 12, 'Apprentit SI', 'PI9974YZEEA', 1),
(2, '2012-05-31 12:43:02', '2013-05-06 12:42:56', 12, 'Apprentit dével', 'J4U5LK2POB', 1),
(3, '2012-05-31 12:43:02', '2013-05-06 12:42:56', 12, 'Stagiaire admin', 'PI9974EEA', 1),
(4, '2012-05-06 12:45:02', '2013-05-06 12:42:56', 12, 'Apprentit ingén', '639URST', 2),
(5, '2012-05-06 12:45:02', '2013-05-06 12:45:02', 12, 'Stagiaire Assis', 'PI9974YZEEA', 2);

-- --------------------------------------------------------

--
-- Structure de la table `document`
--

DROP TABLE IF EXISTS `Document`;
CREATE TABLE IF NOT EXISTS `Document` (
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
  KEY `FK3737353B9454A7A7` (`idPersonne`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=1 ;

--
-- Contenu de la table `document`
--


-- --------------------------------------------------------

--
-- Structure de la table `entreprise`
--

DROP TABLE IF EXISTS `Entreprise`;
CREATE TABLE IF NOT EXISTS `Entreprise` (
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
-- Contenu de la table `entreprise`
--

INSERT INTO `Entreprise` (`siren`, `codePostal`, `pays`, `rue`, `ville`, `emailEntre`, `nomEntrep`, `telEntre`) VALUES
('2415LK239874B', 92260, 'France', 'Rue du parc', 'Paris', NULL, 'Lafarge', NULL),
('24U5LK239874B', 94260, 'France', 'Rue martin', 'Fontenay', NULL, 'BNP Paribas', NULL),
('639URST', 75011, 'France', 'Rue jean jaurès', 'Paris', NULL, 'Radio France', NULL),
('J4U5LK2POB', 92003, 'France', 'Rue camille des moulins', 'Billancourt', NULL, 'Alten', NULL),
('OPZDSPOB', 92003, 'France', 'Rue Victor Hugo', 'La défense', NULL, 'Accenture', NULL),
('PI9974EEA', 92000, 'France', 'l explanade', 'La defense', NULL, 'Total', NULL),
('PI9974YZEEA', 92000, 'France', 'La grande arche', 'La défense', NULL, 'HSBC', NULL);

-- --------------------------------------------------------

--
-- Structure de la table `etudiant`
--

DROP TABLE IF EXISTS `Etudiant`;
CREATE TABLE IF NOT EXISTS `Etudiant` (
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
  KEY `FKC55D557C8B0F98BF` (`idClasse`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=7 ;

--
-- Contenu de la table `etudiant`
--

INSERT INTO `Etudiant` (`idPersonne`, `codePostal`, `pays`, `rue`, `ville`, `emailPers`, `nomPers`, `prenomPers`, `telephone`, `delegue`, `idClasse`, `membreBde`) VALUES
(2, 78000, 'France', 'Rue tappac', 'Velizy', 'l.ferrand@ingesup.com', 'Ferrand', 'Lori', NULL, '0', 1, '0'),
(3, 94400, 'France', 'Rue Yorzta', 'Créteil', 'm.phejar@ingesup.com', 'Phejar', 'Manuel', NULL, '0', 1, '0'),
(4, 77600, 'France', 'Rue de torcy', 'Bussy', 'y.bray@ingesup.com', 'Bray', 'Yohann', NULL, '0', 1, '0'),
(5, 92620, 'France', 'Avenue du coin', 'Antony', 'j.pitou@ingesup.com', 'Pitou', 'Julien', NULL, '0', 1, '0'),
(6, 25000, 'France', 'Rue de la foret', 'Orléans', 's.dacalor@ingesup.com', 'Dacalor', 'Steeve', NULL, '0', 1, '0');

-- --------------------------------------------------------

--
-- Structure de la table `evenement`
--

DROP TABLE IF EXISTS `Evenement`;
CREATE TABLE IF NOT EXISTS `Evenement` (
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
  KEY `FK78896A49610C5629` (`idSalle`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=6 ;

--
-- Contenu de la table `evenement`
--

INSERT INTO `Evenement` (`DTYPE`, `idEvent`, `dateEvent`, `dureeJours`, `heureDeb`, `heureFin`, `idSalle`, `description`, `idMatiere`, `idPersonne`, `information`, `nomCours`, `bareme`, `coefficient`, `libelleEval`, `typeEval`) VALUES
('', 1, '2012-05-06 13:09:48', 0, '2012-05-06 13:10:12', '2012-05-06 13:10:43', 7, NULL, 13, 2, NULL, NULL, 20, 2, 'devoir final', 'QCM'),
('', 2, '2012-05-06 13:12:29', 0, '2012-05-06 13:12:35', '2012-05-06 13:12:43', 1, 'Test description evenement', 12, 1, NULL, NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `matiere`
--

DROP TABLE IF EXISTS `Matiere`;
CREATE TABLE IF NOT EXISTS `Matiere` (
  `idMatiere` int(11) NOT NULL AUTO_INCREMENT,
  `libelleMatiere` varchar(75) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idMatiere`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=17 ;

--
-- Contenu de la table `matiere`
--

INSERT INTO `Matiere` (`idMatiere`, `libelleMatiere`) VALUES
(1, 'Admin Mysql'),
(2, 'C#'),
(3, 'C++'),
(4, 'JEE/Jboss'),
(5, 'Java Objet'),
(6, 'Admin Oracle'),
(7, 'Merise'),
(8, 'UML'),
(9, 'ASP.net'),
(10, 'Ria Flex'),
(11, 'Management de projet'),
(12, 'Servlet/jsp'),
(13, 'Ruby'),
(14, 'Ruby on Rails'),
(15, 'Anglais'),
(16, 'Agile');

-- --------------------------------------------------------

--
-- Structure de la table `note`
--

DROP TABLE IF EXISTS `Note`;
CREATE TABLE IF NOT EXISTS `Note` (
  `idNote` int(11) NOT NULL AUTO_INCREMENT,
  `idEvent` int(11) NOT NULL,
  `idPersonne` int(11) NOT NULL,
  `note` double DEFAULT NULL,
  PRIMARY KEY (`idNote`),
  KEY `FK2524123B3850A5` (`idEvent`),
  KEY `FK2524128EEE00CD` (`idPersonne`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=3 ;

--
-- Contenu de la table `note`
--

INSERT INTO `Note` (`idNote`, `idEvent`, `idPersonne`, `note`) VALUES
(1, 1, 4, 12),
(2, 2, 6, 8);

-- --------------------------------------------------------

--
-- Structure de la table `professeur`
--

DROP TABLE IF EXISTS `Professeur`;
CREATE TABLE IF NOT EXISTS `Professeur` (
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
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=3 ;

--
-- Contenu de la table `professeur`
--

INSERT INTO `Professeur` (`idPersonne`, `codePostal`, `pays`, `rue`, `ville`, `emailPers`, `nomPers`, `prenomPers`, `telephone`, `competence`, `statut`) VALUES
(1, 94230, 'France', 'avenue fortifrene', 'Alforville', 'per5@ingesup.com', 'Liaudet', 'Bertrand', NULL, NULL, 'tps complet'),
(2, 95300, 'France', 'avenus Camille zoé', 'Val doise', 'per9@ingesup.com', 'olifirenkoff', 'Jean michel', NULL, NULL, 'partiel');

-- --------------------------------------------------------

--
-- Structure de la table `salle`
--

DROP TABLE IF EXISTS `Salle`;
CREATE TABLE IF NOT EXISTS `Salle` (
  `idSalle` int(11) NOT NULL AUTO_INCREMENT,
  `libSalle` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idSalle`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=13 ;

--
-- Contenu de la table `salle`
--

INSERT INTO `Salle` (`idSalle`, `libSalle`) VALUES
(1, '1.6'),
(2, '1.2'),
(3, 'Labo srt'),
(4, '1.'),
(5, '1.4'),
(6, '1.3'),
(7, '2.5'),
(8, '2.3'),
(9, '1.1'),
(10, '1.0'),
(11, '2.2'),
(12, '2.4');

-- --------------------------------------------------------

--
-- Structure de la table `servicepedagogique`
--

DROP TABLE IF EXISTS `ServicePedagogique`;
CREATE TABLE IF NOT EXISTS `ServicePedagogique` (
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
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=3 ;

--
-- Contenu de la table `servicepedagogique`
--

INSERT INTO `ServicePedagogique` (`idPersonne`, `codePostal`, `pays`, `rue`, `ville`, `emailPers`, `nomPers`, `prenomPers`, `telephone`, `telService`) VALUES
(1, 75019, 'France', 'Rue oplazz', 'Paris', 'pers@ingesup.com', 'Ondrejeck', 'Christophe', NULL, '0153987021'),
(2, 75003, 'France', 'rue GSD', 'Paris', 'per8s@ingesup.com', 'Kabre', 'Sali', NULL, '0153987594');

-- --------------------------------------------------------

--
-- Structure de la table `typecontrat`
--

DROP TABLE IF EXISTS `TypeContrat`;
CREATE TABLE IF NOT EXISTS `TypeContrat` (
  `idTypContr` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  `libelleTypContr` varchar(255) COLLATE utf8_unicode_ci DEFAULT NULL,
  PRIMARY KEY (`idTypContr`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci AUTO_INCREMENT=3 ;

--
-- Contenu de la table `typecontrat`
--

INSERT INTO `TypeContrat` (`idTypContr`, `description`, `libelleTypContr`) VALUES
(1, 'statut etudiant', 'Convention stage'),
(2, 'statut salarié', 'Professionnalisation');

--
-- Contraintes pour les tables exportées
--

--
-- Contraintes pour la table `absence`
--
ALTER TABLE `Absence`
  ADD CONSTRAINT `FK1C341A1D8EEE00CD` FOREIGN KEY (`idPersonne`) REFERENCES `Etudiant` (`idPersonne`),
  ADD CONSTRAINT `FK1C341A1D5F75869F` FOREIGN KEY (`idEvent`) REFERENCES `Evenement` (`idEvent`);

--
-- Contraintes pour la table `chargeplacement_entreprise`
--
ALTER TABLE `Chargeplacement_Entreprise`
  ADD CONSTRAINT `FK195E9449ACD082B` FOREIGN KEY (`chargePlacements_idPersonne`) REFERENCES `ChargePlacement` (`idPersonne`),
  ADD CONSTRAINT `FK195E944914C27A63` FOREIGN KEY (`entreprises_siren`) REFERENCES `Entreprise` (`siren`);

--
-- Contraintes pour la table `classe_evenement`
--
ALTER TABLE `Classe_Evenement`
  ADD CONSTRAINT `FKFE756A976F781469` FOREIGN KEY (`evenements_idEvent`) REFERENCES `Evenement` (`idEvent`),
  ADD CONSTRAINT `FKFE756A975E595CB8` FOREIGN KEY (`classes_idClasse`) REFERENCES `Classe` (`idClasse`);

--
-- Contraintes pour la table `classe_matiere`
--
ALTER TABLE `Classe_Matiere`
  ADD CONSTRAINT `FKE7458D5D5E595CB8` FOREIGN KEY (`classes_idClasse`) REFERENCES `Classe` (`idClasse`),
  ADD CONSTRAINT `FKE7458D5DEE1FD3E` FOREIGN KEY (`matieres_idMatiere`) REFERENCES `Matiere` (`idMatiere`);

--
-- Contraintes pour la table `contact`
--
ALTER TABLE `Contact`
  ADD CONSTRAINT `FK9BEFBC001562232A` FOREIGN KEY (`siren`) REFERENCES `Entreprise` (`siren`);

--
-- Contraintes pour la table `contrat`
--
ALTER TABLE `Contrat`
  ADD CONSTRAINT `FK9BEFFB9359B4433F` FOREIGN KEY (`idTypContr`) REFERENCES `TypeContrat` (`idTypContr`),
  ADD CONSTRAINT `FK9BEFFB931562232A` FOREIGN KEY (`siren`) REFERENCES `Entreprise` (`siren`);

--
-- Contraintes pour la table `document`
--
ALTER TABLE `Document`
  ADD CONSTRAINT `FK3737353B9454A7A7` FOREIGN KEY (`idPersonne`) REFERENCES `Professeur` (`idPersonne`),
  ADD CONSTRAINT `FK3737353B5F75869F` FOREIGN KEY (`idEvent`) REFERENCES `Evenement` (`idEvent`);

--
-- Contraintes pour la table `etudiant`
--
ALTER TABLE `Etudiant`
  ADD CONSTRAINT `FKC55D557C8B0F98BF` FOREIGN KEY (`idClasse`) REFERENCES `Classe` (`idClasse`);

--
-- Contraintes pour la table `evenement`
--
ALTER TABLE `Evenement`
  ADD CONSTRAINT `FK78896A49610C5629` FOREIGN KEY (`idSalle`) REFERENCES `Salle` (`idSalle`),
  ADD CONSTRAINT `FK78896A4976638AB9` FOREIGN KEY (`idEvent`) REFERENCES `ServicePedagogique` (`idPersonne`),
  ADD CONSTRAINT `FK78896A499454A7A7` FOREIGN KEY (`idPersonne`) REFERENCES `Professeur` (`idPersonne`),
  ADD CONSTRAINT `FK78896A49A2149944` FOREIGN KEY (`idEvent`) REFERENCES `Matiere` (`idMatiere`),
  ADD CONSTRAINT `FK78896A49D5638319` FOREIGN KEY (`idMatiere`) REFERENCES `Matiere` (`idMatiere`);

--
-- Contraintes pour la table `note`
--
ALTER TABLE `Note`
  ADD CONSTRAINT `FK2524128EEE00CD` FOREIGN KEY (`idPersonne`) REFERENCES `Etudiant` (`idPersonne`),
  ADD CONSTRAINT `FK2524123B3850A5` FOREIGN KEY (`idEvent`) REFERENCES `Evenement` (`idEvent`);
