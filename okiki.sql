-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 02, 2019 at 03:19 PM
-- Server version: 10.1.39-MariaDB
-- PHP Version: 7.1.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `okiki`
--

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `nPregnant` int(16) NOT NULL,
  `pGlucose` int(16) NOT NULL,
  `bloodPressure` int(16) NOT NULL,
  `skinThickness` int(16) NOT NULL,
  `insulin` int(16) NOT NULL,
  `bodyMass` double NOT NULL,
  `dPFUnction` double NOT NULL,
  `age` int(16) NOT NULL,
  `classLabel` varchar(150) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`nPregnant`, `pGlucose`, `bloodPressure`, `skinThickness`, `insulin`, `bodyMass`, `dPFUnction`, `age`, `classLabel`) VALUES
(3, 42, 24, 23, 24, 42.5, 32, 32, '?'),
(2, 43, 32, 43, 32, 22, 33, 23, '?'),
(23, 32, 32, 23, 32, 32.5, 34.1, 29, '?'),
(1, 85, 66, 29, 0, 26.6, 0.351, 31, '?'),
(0, 34, 12, 32, 22, 54.7, 4, 25, '?'),
(0, 12, 12, 12, 12, 0, 0, 25, '?'),
(5, 12, 12, 12, 23, 0, 0, 34, '?'),
(5, 45, 32, 32, 43, 2, 1, 55, '?'),
(8, 32, 32, 23, 32, 32.5, 34.5, 29, '?'),
(8, 21, 21, 23, 32, 32.5, 34.5, 29, '?'),
(6, 45, 23, 43, 56, 45.2, 34.7, 45, '?'),
(3, 45, 23, 43, 56, 45.2, 34.7, 45, '?'),
(0, 32, 23, 32, 32, 32.5, 35.6, 35, '?'),
(3, 43, 23, 32, 32, 35.2, 34.5, 34, '?'),
(0, 88, 58, 11, 54, 24, 0, 23, '?'),
(6, 32, 32, 65, 32, 32, 32, 7, '?'),
(5, 32, 43, 23, 33, 23, 32, 35, '?'),
(2, 32, 33, 32, 32, 32, 32, 35, '?'),
(2, 32, 32, 34, 32, 32, 32, 35, '?');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
