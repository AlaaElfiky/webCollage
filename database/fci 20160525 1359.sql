-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.0.51b-community-nt


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema faculty
--

CREATE DATABASE IF NOT EXISTS faculty;
USE faculty;

--
-- Definition of table `contact`
--

DROP TABLE IF EXISTS `contact`;
CREATE TABLE `contact` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `email` varchar(45) NOT NULL,
  `name` varchar(45) NOT NULL,
  `subject` varchar(45) NOT NULL,
  `message` varchar(200) NOT NULL,
  `tooo` varchar(45) NOT NULL,
  `message_date` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `contact`
--

/*!40000 ALTER TABLE `contact` DISABLE KEYS */;
INSERT INTO `contact` (`id`,`email`,`name`,`subject`,`message`,`tooo`,`message_date`) VALUES 
 (1,'ghonem@yahoo','mohamed','exme','hjfhgfhgdghdgh','ghonem',''),
 (2,'ghonem@yahoo','محمد احمد غنيم ','Assessment','','محمد',''),
 (3,'admin','admin','eeeeeee','errrrrrrrrreeeeeeeeeeeeeeedffdrerrrrrrrrrrrredr','ghonem@yahoo',''),
 (4,'admin','admin','fghhjjjjjjjjjjjjjjjjj','vhvhvhvhvhvhvhvhvvhv','ghonem@yahoo','2-3-2012'),
 (5,'mahed@yahoo','علي احمد غنيم','ali@yahoo','jkfkbvjbf','admin','5/5/2016'),
 (6,'mahed@yahoo','علي احمد غنيم','ali@yahoo','jkfkbvjbf','admin','12/5/2016'),
 (7,'ghonem@yahoo','محمد احمد غنيم ','rkrvnrvl','knknknknknknn','nnnknkn','12/5/2016'),
 (8,'mahed@yahoo','علي احمد غنيمhh','ali@yahoo','jkfkbvjbf','admin','12/5/2016'),
 (9,'ghonem@yahoo','محمد احمد غنيم ','التريخ','','admin','12/5/2016'),
 (10,'ghonem@yahoo','محمد احمد غنيم ','kkkk','kkkkk','admin','12/5/2016'),
 (11,'ghonem@yahoo','ÙØ­ÙØ¯ Ø§Ø­ÙØ¯ ØºÙÙÙ ','sheet','نتلتنبتياتيتياتي تايتايايا','admin','15/5/2016'),
 (12,'mahed@yahoo','علي احمد غنيم','ali@yahoo','jkfkbvjbf','admin','19/5/2016');
INSERT INTO `contact` (`id`,`email`,`name`,`subject`,`message`,`tooo`,`message_date`) VALUES 
 (13,'mm','mm','mm','mm','mm','mm'),
 (14,'mm','mm','mm','mm','mm','mm'),
 (15,'admin','admin','learning is diffuclt','','ghonem@yahoo','admin'),
 (16,'admin','admin','sdg','','sfs','admin'),
 (17,'admin','admin','quest','','ghonem@yahoo','admin'),
 (18,'admin','admin','er','errr','ghonem@yahoo','admin'),
 (19,'admin','admin','er','ftyf','ghonem@yahoo','admin'),
 (20,'ghonem@yahoo','ÙØ­ÙØ¯ Ø§Ø­ÙØ¯ ØºÙÙÙ ','dsf','jadio','admin','19/5/2016'),
 (21,'ghonem@yahoo','ÙØ­ÙØ¯ Ø§Ø­ÙØ¯ ØºÙÙÙ ','welcom','ahmed emad','admin','19/5/2016'),
 (22,'admin','admin','kgjkj','jbjjhj','klkjgjkgggggg','admin'),
 (23,'admin','admin','ننتعبتبتاب','نتنبتباباا','تابابابابابايلي','admin'),
 (24,'admin','admin','jfjfjhfhjf','hgdgdgdgdg','jhjfhfhf','admin'),
 (25,'admin','admin','jhfjhfhjfh','jfhfh','hgdgdgdg','admin'),
 (26,'الايميل','الاسم','الموضوع','الرسالة','admin','19/5/2016'),
 (27,'','','','الرسالة','admin','19/5/2016');
INSERT INTO `contact` (`id`,`email`,`name`,`subject`,`message`,`tooo`,`message_date`) VALUES 
 (28,'','','','الرسالة','admin','19/5/2016'),
 (29,'','','','الرسالة','admin','19/5/2016'),
 (30,'ghonem@yahoo','ÙØ­ÙØ¯ Ø§Ø­ÙØ¯ ØºÙÙÙ ','jjhfhjf','الرسالة','admin','19/5/2016'),
 (31,'admin','admin','ahmed','5gu7`','ghonem@yahoo','admin');
/*!40000 ALTER TABLE `contact` ENABLE KEYS */;


--
-- Definition of table `doctor`
--

DROP TABLE IF EXISTS `doctor`;
CREATE TABLE `doctor` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `name_doctor` varchar(45) NOT NULL,
  `specialization` varchar(45) NOT NULL,
  `connected` varchar(45) NOT NULL,
  `qualification` varchar(45) NOT NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `doctor`
--

/*!40000 ALTER TABLE `doctor` DISABLE KEYS */;
INSERT INTO `doctor` (`id`,`name_doctor`,`specialization`,`connected`,`qualification`) VALUES 
 (1,'mohamed','cs','0123','a'),
 (2,'mohamed ahmed ghonem','cs','doctor','01001682882'),
 (3,'mohamed ahmed ghonem','cs','01001682882','doctor'),
 (4,'ahmed ahmed ghonem','cs','01001682882','doctor');
/*!40000 ALTER TABLE `doctor` ENABLE KEYS */;


--
-- Definition of table `material`
--

DROP TABLE IF EXISTS `material`;
CREATE TABLE `material` (
  `name_material` varchar(45) NOT NULL,
  `year` int(10) unsigned NOT NULL,
  `specialization` varchar(45) NOT NULL,
  `doctor_id` int(10) unsigned NOT NULL,
  `source_material` varchar(45) NOT NULL,
  PRIMARY KEY  USING BTREE (`name_material`),
  KEY `FK_material_1` (`doctor_id`),
  CONSTRAINT `FK_material_1` FOREIGN KEY (`doctor_id`) REFERENCES `doctor` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `material`
--

/*!40000 ALTER TABLE `material` DISABLE KEYS */;
INSERT INTO `material` (`name_material`,`year`,`specialization`,`doctor_id`,`source_material`) VALUES 
 ('ab',1,'',1,'http://www.googel.com'),
 ('ai',4,'cs',1,'www.google.com'),
 ('ar',2,'',1,'http://www.googel.com'),
 ('cd',1,'',1,'http://www.googel.com'),
 ('ee',2,'',1,'www.google.com'),
 ('ef',1,'',1,'http://www.googel.com'),
 ('en',1,'',1,'http://www.googel.com'),
 ('hh',4,'cs',3,'www'),
 ('ir',4,'is',1,'http://www.googel.com'),
 ('kk',1,'',3,'www.google'),
 ('mm',1,'',1,'http://www.googel.com');
/*!40000 ALTER TABLE `material` ENABLE KEYS */;


--
-- Definition of table `student`
--

DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `name` varchar(45) NOT NULL,
  `year` int(10) unsigned NOT NULL,
  `user_name` varchar(100) NOT NULL,
  `password` varchar(45) NOT NULL,
  `specialization` varchar(45) NOT NULL,
  PRIMARY KEY  USING BTREE (`id`,`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `student`
--

/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` (`id`,`name`,`year`,`user_name`,`password`,`specialization`) VALUES 
 (2,'Ø¹ÙÙ Ø§Ø­ÙØ¯ ØºÙÙÙ',8,'ali@yahoo','123','cs'),
 (3,'احمد عماد الشوربجي ',1,'ahmed@yahoo','123',''),
 (4,'محمد حسن النحراوي',3,'mohamed@yahoo','123','cs'),
 (5,'عمرو السيد هاشم',3,'hamseElRwesh@yahoo','123','cs'),
 (10,'ÙØ­ÙØ¯ Ø§Ø­ÙØ¯ ØºÙÙÙ ',1,'ghonem@yahoo','12345',''),
 (12,'سالم السيد البهوار',2,'salem@yahoo','123',''),
 (23,'Ø®Ø­ÙØ®ØºÙÙÙØ¹ÙÙÙØ¹ÙØ¨',1,'ghgjgjgngjgjg','123',''),
 (24,'ÙØ´Ø¨ÙÙØªØ¨ÙØªØ´ÙÙØ±Øª',2,'hjgghdkhvkdh','123',''),
 (25,'ÙØ´Ø¨ÙÙØªØ¨ÙØªØ´ÙÙØ±ØªØ§ÙØ§',2,'hjgghdkhvkdh','123',''),
 (26,'ÙØ­ÙØ¯ Ø§Ø­ÙØ¯ ',2,'klhfkhk','123',''),
 (27,'ÙØ­ÙØ¯ Ø§Ø­ÙØ¯ ',2,'jfgjgjqgj','123',''),
 (28,'ÙØ­ÙØ¯ Ø§Ø­ÙØ¯ ',2,'ghonem','123',''),
 (31,'Ø§Ø³ÙØ§Ù Ø¹Ø¨Ø¯Ø§ÙÙØ·ÙÙ ØºÙÙÙ ',3,'ghonem11@yhaoo','123','cs');
INSERT INTO `student` (`id`,`name`,`year`,`user_name`,`password`,`specialization`) VALUES 
 (32,'Ø§Ø³ÙØ§Ù Ø¹Ø¨Ø¯Ø§ÙÙØ·ÙÙ ØºÙÙÙ ',3,'ghonem12@yhaoo','123','cs'),
 (33,'  eslam el seed mohamed',2,'ghonem121@yhaoo','123',''),
 (34,'mohamed saad elnehrawy',3,'mohamed  elnehrawy','123','cs'),
 (35,'ahmed ali mohamed',4,'ahmed','123','or'),
 (36,'mohamed',1,'mohamed@yahoo','12345','');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;


--
-- Definition of table `student_material`
--

DROP TABLE IF EXISTS `student_material`;
CREATE TABLE `student_material` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `student_id` int(10) unsigned NOT NULL,
  `material_name` varchar(45) NOT NULL,
  `applied` int(10) unsigned NOT NULL,
  `final` int(10) unsigned NOT NULL,
  `year` int(10) unsigned NOT NULL,
  PRIMARY KEY  (`id`),
  KEY `FK_student_material_1` (`student_id`),
  KEY `FK_student_material_2` (`material_name`),
  CONSTRAINT `FK_student_material_1` FOREIGN KEY (`student_id`) REFERENCES `student` (`id`),
  CONSTRAINT `FK_student_material_2` FOREIGN KEY (`material_name`) REFERENCES `material` (`name_material`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `student_material`
--

/*!40000 ALTER TABLE `student_material` DISABLE KEYS */;
INSERT INTO `student_material` (`id`,`student_id`,`material_name`,`applied`,`final`,`year`) VALUES 
 (2,10,'ab',50,30,2016),
 (3,10,'mm',59,25,2016),
 (4,10,'ef',60,20,2016),
 (5,10,'cd',55,33,2016),
 (6,10,'ar',44,20,2013),
 (7,3,'en',30,70,2018);
/*!40000 ALTER TABLE `student_material` ENABLE KEYS */;


--
-- Definition of table `weekly`
--

DROP TABLE IF EXISTS `weekly`;
CREATE TABLE `weekly` (
  `id` int(10) unsigned NOT NULL auto_increment,
  `name_material` varchar(45) NOT NULL,
  `task_lecture` varchar(45) NOT NULL,
  `task_sec` varchar(45) NOT NULL,
  `task_project` varchar(45) NOT NULL,
  `week_number` int(10) unsigned default NULL,
  `month_number` int(10) unsigned default NULL,
  PRIMARY KEY  (`id`),
  KEY `FK_weekly_1` (`name_material`),
  CONSTRAINT `FK_weekly_1` FOREIGN KEY (`name_material`) REFERENCES `material` (`name_material`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `weekly`
--

/*!40000 ALTER TABLE `weekly` DISABLE KEYS */;
INSERT INTO `weekly` (`id`,`name_material`,`task_lecture`,`task_sec`,`task_project`,`week_number`,`month_number`) VALUES 
 (1,'en','khkggk','yfgffggg','kjgjkgjgjgjj',4,4),
 (2,'ar','عمل بحث عن ar','عمل بحث عن ar في السكشن','تلاتباتباياليليفغيف',1,5),
 (3,'ar','عمل بحث عن ar','عمل بحث عن ar في السكشن','hkhkjjkgj',1,5),
 (4,'ai','عمل بحث عن ai','عمل بحث عن ai في السكشن','jhfjhfhdhdghdghd',1,5),
 (6,'cd','hilgkgkjgjkgj','lkkgkgkg','kgkgklglgk',3,2);
/*!40000 ALTER TABLE `weekly` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
