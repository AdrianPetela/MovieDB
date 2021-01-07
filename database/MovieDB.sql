-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: mysql:3306
-- Generation Time: Nov 01, 2020 at 05:51 PM
-- Server version: 8.0.21
-- PHP Version: 7.4.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `MovieDB`
--

-- --------------------------------------------------------

--
-- Table structure for table `ACTOR`
--

CREATE TABLE `ACTOR` (
  `ACT_ID` int NOT NULL,
  `ACT_FNAME` varchar(30) NOT NULL,
  `ACT_LNAME` varchar(30) NOT NULL,
  `ACT_GENDER` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `ACTOR`
--

INSERT INTO `ACTOR` (`ACT_ID`, `ACT_FNAME`, `ACT_LNAME`, `ACT_GENDER`) VALUES
(1, 'Harvey', 'Keitel', 'M'),
(2, 'Michael', 'Madsen', 'M'),
(3, 'Tim', 'Roth', 'M'),
(4, 'Steve', 'Buscemi', 'M'),
(5, 'Quentin', 'Tarantino', 'M'),
(6, 'Edward', 'Bunker', 'M'),
(7, 'Chris', 'Penn', 'M'),
(8, 'Kirk', 'Baltz', 'M'),
(9, 'John', 'Travolta', 'M'),
(10, 'Samuel', 'L. Jackson', 'M'),
(11, 'Uma', 'Thurman', 'F'),
(12, 'Bruce', 'Willis', 'M'),
(13, 'Amanda', 'Plummer', 'F'),
(14, 'David', 'Carradine', 'M'),
(15, 'Lucy', 'Liu', 'F'),
(16, 'Daryl', 'Hannah', 'F'),
(17, 'Vivica', 'A. Fox', 'F'),
(18, 'Michael', 'Parks', 'M'),
(19, 'Brad', 'Pitt', 'M'),
(20, 'Mélanie', 'Laurent', 'F'),
(21, 'Diane', 'Kruger', 'F'),
(22, 'Kerry', 'Washington', 'F'),
(23, 'Christoph', 'Waltz', 'M'),
(24, 'Eli', 'Roth', 'M'),
(25, 'Michael', 'Fassbender', 'M'),
(26, 'Daniel', 'Brühl', 'M'),
(27, 'Til', 'Schweiger', 'M'),
(28, 'Jamie', 'Foxx', 'M'),
(29, 'Leonardo', 'DiCaprio', 'M'),
(30, 'Walton', 'Goggins', 'M'),
(31, 'James', 'Remar', 'M'),
(32, 'Dennis', 'Christopher', 'M'),
(33, 'Kurt', 'Russell', 'M'),
(34, 'Jennifer', 'Jason Leigh', 'F'),
(35, 'Margot', 'Robbie', 'F'),
(36, 'Dakota', 'Fanning', 'F'),
(37, 'Emile', 'Hirsch', 'M'),
(38, 'Al', 'Pacino', 'M'),
(39, 'Bruce', 'Dern', 'M'),
(40, 'Demián', 'Bichir', 'M');

-- --------------------------------------------------------

--
-- Table structure for table `DIRECTOR`
--

CREATE TABLE `DIRECTOR` (
  `DIR_ID` int NOT NULL,
  `DIR_FNAME` varchar(30) NOT NULL,
  `DIR_LNAME` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `DIRECTOR`
--

INSERT INTO `DIRECTOR` (`DIR_ID`, `DIR_FNAME`, `DIR_LNAME`) VALUES
(1, 'Quentin', 'Tarantino');

-- --------------------------------------------------------

--
-- Table structure for table `GENRES`
--

CREATE TABLE `GENRES` (
  `GEN_ID` int NOT NULL,
  `GEN_TITLE` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `GENRES`
--

INSERT INTO `GENRES` (`GEN_ID`, `GEN_TITLE`) VALUES
(1, 'Thriller'),
(2, 'Gangster'),
(3, 'Black Comedy'),
(4, 'Crime'),
(5, 'Action'),
(6, 'War'),
(7, 'Western'),
(8, 'Drama');

-- --------------------------------------------------------

--
-- Table structure for table `MOVIE`
--

CREATE TABLE `MOVIE` (
  `MOV_ID` int NOT NULL,
  `MOV_TITLE` varchar(50) NOT NULL,
  `MOV_YEAR` varchar(4) NOT NULL,
  `MOV_TIME` varchar(10) NOT NULL,
  `MOV_LANG` varchar(30) NOT NULL,
  `MOV_DT_REL` varchar(10) NOT NULL,
  `MOV_REL_COUNTRY` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `MOVIE`
--

INSERT INTO `MOVIE` (`MOV_ID`, `MOV_TITLE`, `MOV_YEAR`, `MOV_TIME`, `MOV_LANG`, `MOV_DT_REL`, `MOV_REL_COUNTRY`) VALUES
(1, 'Reservoir Dogs', '1992', '99', 'English', '21/01/1992', 'USA'),
(2, 'Pulp Fiction', '1994', '154', 'English', '19/05/1994', 'USA'),
(3, 'Four Rooms', '1995', '98', 'English', '21/02/1995', 'USA'),
(4, 'Jackie Brown', '1997', '154', 'English', '20/11/1998', 'USA'),
(5, 'Kill Bill', '2003', '111', 'English', '17/10/2003', 'USA'),
(6, 'Kill Bill 2', '2004', '136', 'English', '23/04/2004', 'USA'),
(7, 'Sin City', '2005', '124', 'English', '10/05/2005', 'USA'),
(8, 'Grindhouse: Death Proof ', '2007', '114', 'English', '20/06/2007', 'USA'),
(9, 'Inglourious Basterds', '2009', '153', 'English', '09/09/2009', 'USA'),
(10, 'Django Unchained', '2012', '165', 'English', '13/01/2013', 'USA'),
(11, 'The Hateful Eight', '2015', '187', 'English', '21/12/2015', 'USA'),
(12, 'Once Upon a Time in Hollywood', '2019', '165', 'English', '21/05/2019', 'USA');

-- --------------------------------------------------------

--
-- Table structure for table `MOVIE_CAST`
--

CREATE TABLE `MOVIE_CAST` (
  `ACT_ID` int NOT NULL,
  `MOV_ID` int NOT NULL,
  `ROLE` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `MOVIE_CAST`
--

INSERT INTO `MOVIE_CAST` (`ACT_ID`, `MOV_ID`, `ROLE`) VALUES
(1, 1, 'Larry Dimmick'),
(1, 2, 'Winston Wolfe'),
(2, 1, 'Vic Vega'),
(2, 5, 'Budd'),
(2, 6, 'Budd'),
(2, 7, 'Bob'),
(2, 11, 'Joe Gage'),
(17, 5, 'Vernita Green'),
(3, 1, 'Freddy Newandyke'),
(3, 2, 'Ringo'),
(3, 3, 'Ted'),
(3, 11, 'Oswaldo Mobray'),
(4, 1, 'Mr. Pink'),
(4, 2, 'Buddy Holly'),
(5, 1, 'Mr. Brown'),
(5, 2, 'Jimmie Dimmick'),
(5, 3, 'Chester'),
(5, 9, 'Nazi soldier'),
(6, 1, 'Mr. Blue'),
(7, 1, 'Eddie Cabot'),
(8, 1, 'Marvin Nash'),
(9, 2, 'Vincent Vega'),
(10, 2, 'Jules Winnfield'),
(10, 4, 'Ordell Robbie'),
(10, 5, 'Rufus'),
(10, 10, 'Stephen'),
(10, 11, 'Major Marquis Warren'),
(11, 2, 'Mia Wallace'),
(11, 5, 'Bride'),
(11, 6, 'Bride'),
(12, 2, 'Butch Coolidge'),
(12, 3, 'Leo'),
(12, 7, 'John Hartigan'),
(13, 2, 'Yolanda'),
(14, 5, 'Bill'),
(14, 6, 'Bill'),
(15, 5, 'O-Ren Ishii'),
(16, 5, 'Elle Driver'),
(16, 6, 'Elle Driver'),
(18, 5, 'Earl McGraw'),
(18, 6, 'Esteban Vihaio'),
(20, 9, 'Aldo Raine'),
(20, 12, 'Cliff Booth'),
(21, 9, 'Shosanna Dreyfus'),
(22, 9, 'Bridget Von Hammersmark'),
(23, 10, 'Broomhilda von Schaft'),
(24, 9, 'Hans Landa'),
(24, 10, 'Dr King Schultz'),
(25, 8, 'Dov'),
(25, 9, 'Donny Donowitz'),
(26, 9, 'Archie Hicox'),
(27, 9, 'Frederick Zoller'),
(28, 9, 'Hugo Stiglitz'),
(29, 10, 'Django'),
(30, 10, 'Calvin Candie'),
(30, 12, 'Rick Dalton'),
(31, 10, 'Billy Crash'),
(31, 11, 'Chris Mannix'),
(32, 10, 'Butch Pooch'),
(33, 10, 'Leonide Moguy'),
(34, 11, 'John Ruth'),
(34, 12, 'Randy'),
(35, 11, 'Daisy Domergue'),
(36, 12, 'Sharon Tate'),
(37, 12, 'Fromme'),
(38, 12, 'Jay Sebring'),
(39, 12, 'Marvin Schwarzs'),
(40, 11, 'Sandy Smithers'),
(40, 12, 'George Spahn');

-- --------------------------------------------------------

--
-- Table structure for table `MOVIE_DIRECTION`
--

CREATE TABLE `MOVIE_DIRECTION` (
  `DIR_ID` int NOT NULL,
  `MOV_ID` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `MOVIE_DIRECTION`
--

INSERT INTO `MOVIE_DIRECTION` (`DIR_ID`, `MOV_ID`) VALUES
(1, 1),
(1, 2),
(1, 3),
(1, 4),
(1, 5),
(1, 6),
(1, 7),
(1, 8),
(1, 9),
(1, 10),
(1, 11),
(1, 12);

-- --------------------------------------------------------

--
-- Table structure for table `MOVIE_GENRES`
--

CREATE TABLE `MOVIE_GENRES` (
  `MOV_ID` int NOT NULL,
  `GEN_ID` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `MOVIE_GENRES`
--

INSERT INTO `MOVIE_GENRES` (`MOV_ID`, `GEN_ID`) VALUES
(1, 2),
(2, 2),
(3, 3),
(4, 1),
(5, 5),
(6, 5),
(7, 4),
(8, 5),
(9, 6),
(10, 7),
(11, 7),
(12, 8);

-- --------------------------------------------------------

--
-- Table structure for table `RATING`
--

CREATE TABLE `RATING` (
  `MOV_ID` int NOT NULL,
  `REV_ID` int NOT NULL,
  `REV_STARS` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `RATING`
--

INSERT INTO `RATING` (`MOV_ID`, `REV_ID`, `REV_STARS`) VALUES
(1, 1, 9),
(2, 1, 10),
(3, 1, 7),
(4, 1, 7),
(5, 1, 7),
(6, 1, 8),
(7, 1, 7),
(8, 1, 6),
(9, 1, 8),
(10, 1, 9),
(11, 1, 9),
(12, 1, 10),
(1, 2, 8),
(2, 2, 9),
(3, 2, 7),
(4, 2, 7),
(5, 2, 7),
(6, 2, 7),
(7, 2, 8),
(8, 2, 7),
(9, 2, 8),
(10, 2, 8),
(11, 2, 8),
(12, 2, 9),
(1, 3, 8),
(2, 3, 9),
(3, 3, 7),
(4, 3, 7),
(5, 3, 7),
(6, 3, 7),
(7, 3, 8),
(8, 3, 7),
(9, 3, 8),
(10, 3, 8),
(11, 3, 8),
(12, 3, 9),
(1, 4, 10),
(2, 4, 10),
(3, 4, 7),
(4, 4, 9),
(5, 4, 9),
(6, 4, 8),
(7, 4, 7),
(8, 4, 7),
(9, 4, 8),
(10, 4, 10),
(11, 4, 10),
(12, 4, 10),
(1, 5, 9),
(2, 5, 9),
(3, 5, 7),
(4, 5, 8),
(5, 5, 8),
(6, 5, 8),
(7, 5, 6),
(8, 5, 7),
(9, 5, 8),
(10, 5, 9),
(11, 5, 8),
(12, 5, 9);

-- --------------------------------------------------------

--
-- Table structure for table `REVIEWER`
--

CREATE TABLE `REVIEWER` (
  `REV_ID` int NOT NULL,
  `REV_NAME` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `REVIEWER`
--

INSERT INTO `REVIEWER` (`REV_ID`, `REV_NAME`) VALUES
(1, 'Morty'),
(2, 'Rick'),
(3, 'Albert'),
(4, 'Tom'),
(5, 'Frank');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ACTOR`
--
ALTER TABLE `ACTOR`
  ADD PRIMARY KEY (`ACT_ID`);

--
-- Indexes for table `DIRECTOR`
--
ALTER TABLE `DIRECTOR`
  ADD PRIMARY KEY (`DIR_ID`);

--
-- Indexes for table `GENRES`
--
ALTER TABLE `GENRES`
  ADD PRIMARY KEY (`GEN_ID`);

--
-- Indexes for table `MOVIE`
--
ALTER TABLE `MOVIE`
  ADD PRIMARY KEY (`MOV_ID`);

--
-- Indexes for table `MOVIE_CAST`
--
ALTER TABLE `MOVIE_CAST`
  ADD KEY `FK_MOV_CAST_ACT` (`ACT_ID`),
  ADD KEY `FK_MOV_CAST_MOV` (`MOV_ID`);

--
-- Indexes for table `MOVIE_DIRECTION`
--
ALTER TABLE `MOVIE_DIRECTION`
  ADD KEY `FK_DIR_D` (`DIR_ID`),
  ADD KEY `FK_DIR_M` (`MOV_ID`);

--
-- Indexes for table `MOVIE_GENRES`
--
ALTER TABLE `MOVIE_GENRES`
  ADD KEY `FK_GEN_MOV` (`MOV_ID`),
  ADD KEY `FK_GEN_GEN` (`GEN_ID`);

--
-- Indexes for table `RATING`
--
ALTER TABLE `RATING`
  ADD KEY `FK_RATING_MOV` (`MOV_ID`),
  ADD KEY `FK_RATING_REV` (`REV_ID`);

--
-- Indexes for table `REVIEWER`
--
ALTER TABLE `REVIEWER`
  ADD PRIMARY KEY (`REV_ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `ACTOR`
--
ALTER TABLE `ACTOR`
  MODIFY `ACT_ID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=41;

--
-- AUTO_INCREMENT for table `DIRECTOR`
--
ALTER TABLE `DIRECTOR`
  MODIFY `DIR_ID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `GENRES`
--
ALTER TABLE `GENRES`
  MODIFY `GEN_ID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `MOVIE`
--
ALTER TABLE `MOVIE`
  MODIFY `MOV_ID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT for table `REVIEWER`
--
ALTER TABLE `REVIEWER`
  MODIFY `REV_ID` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `MOVIE_CAST`
--
ALTER TABLE `MOVIE_CAST`
  ADD CONSTRAINT `FK_MOV_CAST_ACT` FOREIGN KEY (`ACT_ID`) REFERENCES `ACTOR` (`ACT_ID`),
  ADD CONSTRAINT `FK_MOV_CAST_MOV` FOREIGN KEY (`MOV_ID`) REFERENCES `MOVIE` (`MOV_ID`);

--
-- Constraints for table `MOVIE_DIRECTION`
--
ALTER TABLE `MOVIE_DIRECTION`
  ADD CONSTRAINT `FK_DIR_D` FOREIGN KEY (`DIR_ID`) REFERENCES `DIRECTOR` (`DIR_ID`),
  ADD CONSTRAINT `FK_DIR_M` FOREIGN KEY (`MOV_ID`) REFERENCES `MOVIE` (`MOV_ID`);

--
-- Constraints for table `MOVIE_GENRES`
--
ALTER TABLE `MOVIE_GENRES`
  ADD CONSTRAINT `FK_GEN_GEN` FOREIGN KEY (`GEN_ID`) REFERENCES `GENRES` (`GEN_ID`),
  ADD CONSTRAINT `FK_GEN_MOV` FOREIGN KEY (`MOV_ID`) REFERENCES `MOVIE` (`MOV_ID`);

--
-- Constraints for table `RATING`
--
ALTER TABLE `RATING`
  ADD CONSTRAINT `FK_RATING_MOV` FOREIGN KEY (`MOV_ID`) REFERENCES `MOVIE` (`MOV_ID`),
  ADD CONSTRAINT `FK_RATING_REV` FOREIGN KEY (`REV_ID`) REFERENCES `REVIEWER` (`REV_ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
