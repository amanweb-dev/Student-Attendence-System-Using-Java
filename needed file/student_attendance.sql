-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1:3306
-- Generation Time: Sep 02, 2019 at 09:01 AM
-- Server version: 5.7.24
-- PHP Version: 7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `student_attendance`
--

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE IF NOT EXISTS `student` (
  `s_id` varchar(255) NOT NULL,
  `s_name` varchar(255) NOT NULL,
  `s_dept` varchar(255) NOT NULL,
  `s_shift` varchar(255) NOT NULL,
  `s_intake` int(11) NOT NULL,
  `s_section` int(11) NOT NULL,
  `s_crs_code` varchar(255) NOT NULL,
  `s_crs_name` varchar(255) NOT NULL,
  PRIMARY KEY (`s_id`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`s_id`, `s_name`, `s_dept`, `s_shift`, `s_intake`, `s_section`, `s_crs_code`, `s_crs_name`) VALUES
('16173103074', 'amanullah aman', 'cse', 'Day', 36, 2, 'cse 101', 'computer fundamentals'),
('16173103046', 'angkon', 'cse', 'Day', 36, 2, 'cse-317', 'sad'),
('16173103069', 'mahbub', 'cse', 'Day', 36, 2, 'cse 111', 'cse fundntl');

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

DROP TABLE IF EXISTS `teacher`;
CREATE TABLE IF NOT EXISTS `teacher` (
  `t_id` varchar(255) NOT NULL,
  `t_name` varchar(255) NOT NULL,
  `t_pass` varchar(255) NOT NULL,
  PRIMARY KEY (`t_id`)
) ENGINE=MyISAM AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`t_id`, `t_name`, `t_pass`) VALUES
('16173103074', 'sumi khatun', '123'),
('12345678910', 'tammim', '123');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
