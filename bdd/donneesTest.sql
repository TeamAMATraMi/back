-- phpMyAdmin SQL Dump
-- version 4.6.6deb5
-- https://www.phpmyadmin.net/
--
-- Client :  localhost:3306
-- Généré le :  Jeu 06 Décembre 2018 à 15:21
-- Version du serveur :  5.7.22-0ubuntu0.17.10.1
-- Version de PHP :  7.1.17-0ubuntu0.17.10.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `applitrami`
--

-- --------------------------------------------------------

--
-- Structure de la table `apprenant`
--

--
-- Contenu de la table `apprenant`
--

INSERT INTO `apprenant` (`id`, `nom`, `prenom`, `telephone`, `adresse`, `codepostal`, `commune`, `idgroupe`, `dateinscription`,
                         `auteurdossier`, `majeur`, `datenaissance`, `genre`, `paysorigine`, `nationalite`, `datearrivee`, `quartierprioritaire`,
                         `situationpersonnelle`, `prisecharge`, `rsa`, `tempsscolarisation`, `diplome`, `milieuscolaire`, `niveaulangue`, `lirelangue`,
                         `ecrirelangue`, `lirealphalatin`, `ecrirealphalatin`, `cotisationpayee`, `remarques`, `statutsejour`,
                         `datecartesejour`, `datefincartesejour`, `statutpro`, `typecontrat`) VALUES
(1234567, 'CENA', 'John', '+33656985698', '6, rue du ring', '55100', 'Verdun', 12345678, '2018-12-02', 'Isabelle', 1, '2000-12-02', 'M', 'France', 'Française', '2018-12-02', 123, 'Célibataire', 1234, 0, 0, NULL, 0, 'A2', 1, 1, 1, 0, 1, NULL, NULL, NULL, NULL, NULL, NULL),
(1765432, 'BOND', 'James', '+33600700715', '87, rue Aston Martin', '55700', 'Stenay', 81234567, '2018-12-02', 'Isabelle', 1, '1965-12-03', 'M', 'Royaume_Uni', 'Anglaise', '2018-12-02', NULL, 'Célibataire', 3412, 1, 1, 'CAP', 0, 'A2', 1, 1, 1, 1, 0, NULL, NULL, NULL, NULL, NULL, NULL),
(2176543, 'WAYNE', 'Bruce', '+33622115566', '98, boulevard du Batman', '55700', 'Baalon', 81234567, '2018-12-02', 'Isabelle', 1, '1978-02-03', 'M', 'Afghanistan', 'Afghane', '2018-12-02', 312, 'Célibataire', 3412, 0, 3, 'Bac', 0, 'A2', 1, 1, 0, 0, 1, NULL, NULL, NULL, NULL, NULL, NULL),
(2345671, 'WILLIAMS', 'Robie', '+33654785964', '4, avenue de la tombe', '55100', 'Verdun', 12345678, '2018-12-02', 'Isabelle', 1, '1995-07-17', 'M', 'Royaume_Uni', 'Anglaise', '2018-12-02', NULL, 'Veuf(ve)', 1234, 0, 2, 'Brevet', 0, 'B2', 1, 1, 0, 0, 0, NULL, NULL, NULL, NULL, NULL, NULL),
(3217654, 'ALGUL', 'Raz', '+33699551144', '8, rue du Demon', '55700', 'Mouzay', 78123456, '2018-12-02', 'Isabelle', 1, '1970-12-14', 'M', 'Bulgarie', 'Bulgare', '2018-12-02', NULL, 'Célibataire', 3412, 1, 2, 'CAP', 0, 'B2', 1, 1, 1, 1, 0, NULL, NULL, NULL, NULL, NULL, NULL),
(3456712, 'ROBBIE', 'Margot', '+33659658874', '6, rue des paillettes', '55100', 'VERDUN', 23456781, '2012-12-02', 'Isabelle', 1, '1985-02-15', 'F', 'Australie', 'Australienne', '2018-12-02', 123, 'Célibataire', 1234, 0, 5, 'Bac', 1, 'A2', 1, 1, 1, 1, 0, NULL, NULL, NULL, NULL, NULL, NULL),
(4321765, 'QUEEN', 'Oliver', '+33659988897', '87, avenue de la fleche', '55700', 'Stenay', 78123456, '2018-12-02', 'Isabelle', 1, '1985-04-12', 'M', 'Brésil', 'Brésilienne', '2018-12-02', 312, 'Marié(e)', 3412, 0, 2, 'DUT', 0, 'Analphabete', 0, 0, 0, 0, 1, NULL, NULL, NULL, NULL, NULL, NULL),
(4567123, 'JACKSON', 'Mickael', '+33652364129', '8, avenue Hollywood', '55100', 'VERDUN', 23456781, '2018-12-02', 'Isabelle', 0, '1960-11-25', 'M', 'Etats_Unis', 'Américaine', '2018-12-02', NULL, 'Marié(e)', 1234, 0, 0, NULL, 0, 'Analphabete', 0, 0, 0, 0, 1, NULL, NULL, NULL, NULL, NULL, NULL),
(5432176, 'SIMPSON', 'Bart', '+33659874898', '5, rue jaune', '55000', 'Bar le Duc', 67812345, '2018-12-02', 'Isabelle', 1, '1998-12-02', 'M', 'Canada', 'Canadienne', '2018-12-02', 231, 'Célibataire', 2341, 1, 2, 'Brevet', 0, 'A2', 1, 1, 1, 1, 1, NULL, NULL, NULL, NULL, NULL, NULL),
(5671234, 'CHAN', 'Jacky', '+33659862147', '54, rue du karate', '55100', 'VERDUN', 34567812, '2018-12-02', 'Isabelle', 1, '2000-12-05', 'M', 'Chine', 'Chinoise', '2018-12-02', 123, 'Marié(e)', 1234, 0, 7, 'Master', 1, 'A2', 1, 1, 1, 1, 1, NULL, NULL, NULL, NULL, NULL, NULL),
(6543217, 'PARKER', 'Peter', '+33622001155', '8, boulevard de la toile', '55000', 'Bar le Duc', 56781234, '2018-12-02', 'Isabelle', 0, '2002-12-02', 'M', 'Etats_Unis', 'Américaine', '2018-12-02', NULL, 'Célibataire', 2341, 0, 0, NULL, 0, NULL, 0, 0, 0, 0, 1, NULL, NULL, NULL, NULL, NULL, NULL),
(6712345, 'CONNOR', 'Sarah', '+33654123698', '8, rue du jugement dernier', '55000', 'Bar le Duc', 45678123, '2018-12-02', 'Isabelle', 1, '1975-07-08', 'F', 'Etats_Unis', 'Américaine', '2018-12-02', 231, 'Marié(e)', 2341, 1, 0, NULL, 0, 'B2', 1, 1, 1, 1, 0, NULL, NULL, NULL, NULL, NULL, NULL),
(7123456, 'JEANDEL', 'ManuManu', '+33699663322', '1664, avenue Heineken', '55000', 'Bar le Duc', 45678123, '2018-12-02', 'Isabelle', 1, '1975-12-02', 'M', 'Monaco', 'Monégasque', '2018-12-02', NULL, 'Célibataire', 2341, 1, 7, 'Ingenieur', 1, 'C2', 1, 1, 1, 1, 0, NULL, NULL, NULL, NULL, NULL, NULL),
(7654321, 'CIRSTEA', 'Horatiu', '+33659884455', '7, rue du Triomphe', '55000', 'Bar le Duc', 56781234, '2018-12-02', 'Isabelle', 0, '1975-12-02', 'M', 'Roumanie', 'Roumaine', '2018-12-02', 231, 'Marié(e)', 2341, 0, 0, NULL, 0, 'A2', 1, 1, 0, 0, 1, NULL, NULL, NULL, NULL, NULL, NULL),
(54125867, 'CHU', 'Pika', '+33698954112', '45, rue du compteur electrique', '55700', 'Cervizy', 12345687, '2018-12-02', 'Isabelle', 0, '2005-12-03', 'M', 'Japon', 'Japonaise', '2018-12-02', 312, 'Célibataire', 3412, 0, 1, NULL, 1, 'Analphabete', 0, 0, 0, 0, 1, NULL, NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `association`
--

INSERT INTO `association` (`id`, `nom`) VALUES
(1234, 'Verdun Trami'),
(2341, 'BarLeDuc Trami'),
(3412, 'Stenay Trami');

-- --------------------------------------------------------

--
-- Structure de la table `cours`
--

-- --------------------------------------------------------

--
-- Structure de la table `enfant`
--

--
-- Contenu de la table `enfant`
--

INSERT INTO `enfant` (`id`, `idapprenantref`, `age`) VALUES
(4567123, 5671234, 15),
(5432176, 4321765, 12),
(6543217, 7654321, 16);

-- --------------------------------------------------------

--
-- Structure de la table `formateur`
--

--
-- Contenu de la table `formateur`
--

INSERT INTO `formateur` (`id`, `idsite`, `salarie`, `nom`, `prenom`, `telephone`, `adresse`, `codepostal`, `commune`) VALUES
(123456, 12345, 1, 'DUPONT', 'Jean', '+33645896541', '6, rue du ruisseau', 55100, 'Verdun'),
(234561, 12345, 0, 'SMITH', 'John', '+33645893321', '2, avenue du Cora', 55100, 'Verdun'),
(345612, 23451, 1, 'GRAND', 'David', '+33645983265', '5, ruelle Chantoneau', 55000, 'Bar le Duc'),
(456123, 23451, 0, 'THEKID', 'Billy', '+33697468513', '7, rue du Fou', 55000, 'Bar le Duc'),
(561234, 34512, 1, 'RAMBO', 'John', '+33698743658', '5, route du massacre', 55700, 'Stenay'),
(612345, 34512, 0, 'STARK', 'Tony', '+33654126987', '8, ruelle du Chat', 55700, 'Mouzay');

-- --------------------------------------------------------

--
-- Structure de la table `groupe`
--

--
-- Contenu de la table `groupe`
--

INSERT INTO `groupe` (`id`, `idsite`, `nom`) VALUES
(1000, 12345, 'NouveauxArrivants'),
(1001, 23451, 'NouveauxArrivants'),
(1011, 34512, 'NouveauxArrivants'),
(12345678, 12345, 'Verdun 1'),
(12345687, 34512, 'Stenay 3'),
(23456781, 12345, 'Verdun 2'),
(34567812, 12345, 'Verdun 3'),
(45678123, 23451, 'BarLeDuc 1'),
(56781234, 23451, 'BarLeDuc 2'),
(67812345, 23451, 'BarLeDuc 3'),
(78123456, 34512, 'Stenay 1'),
(81234567, 34512, 'Stenay 2');



INSERT INTO `quartierprioritaire` (`id`, `nom`) VALUES
(123, 'Verdun Prio'),
(231, 'BarLeDuc Prio'),
(312, 'Stenay Prio');



-- --------------------------------------------------------

--
-- Structure de la table `site`
--

--
-- Contenu de la table `site`
--

INSERT INTO `site` (`id`, `ville`) VALUES
(12345, 'Verdun'),
(23451, 'Bar le Duc'),
(34512, 'Stenay');


/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
