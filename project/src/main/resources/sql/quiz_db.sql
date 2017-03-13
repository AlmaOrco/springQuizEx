CREATE DATABASE IF NOT EXISTS `quiz` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `quiz`;


# Dumping structure for table pregunta
DROP TABLE IF EXISTS `Pregunta`;
CREATE TABLE IF NOT EXISTS `Pregunta` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `texto` varchar(60) NOT NULL,
  `link`  varchar(100) NOT NULL,
  `op1` varchar(20) NOT NULL,
  `op2` varchar(20) NOT NULL,
  `op3` varchar(20) NOT NULL,
  `op4` varchar(20) NOT NULL,
  `well` varchar(5) NOT NULL,
  `trabajo_id` varchar(25) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Contains information about pregunta table';

INSERT INTO Pregunta (texto,link,op1,op2,op3,op4,well,trabajo_id) VALUES ('Autor del lenguaje','http://servidor.iespoligonosur.org/Materiales/Modulos/ED/fotos/b1.jpg','python','ruby','rust','ninguna','4','1');

INSERT INTO Pregunta (texto,link,op1,op2,op3,op4,well,trabajo_id) VALUES ('Quién descubrió América','http://servidor.iespoligonosur.org','rebeca','lopera','Colón','ninguna','3','1');

INSERT INTO Pregunta (texto,link,op1,op2,op3,op4,well,trabajo_id) VALUES ('Disfrutamos sus tutoriales de','http://servidor.iespoligonosur.org/Materiales/Modulos/ED/fotos/b0.jpg','java8','nokogiri','java/spring/jsf','ninguna','4','1');

DROP TABLE IF EXISTS `Trabajo`;
CREATE TABLE IF NOT EXISTS `Trabajo` (
  `trabajo_id` int(25) NOT NULL,
  `titulo` varchar(60) NOT NULL,
  `grupo`  varchar(100) NOT NULL,
  PRIMARY KEY (`trabajo_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COMMENT='Contains information about pregunta table';

insert into Trabajo (trabajo_id, titulo, grupo) VALUES ('1','trabajo examen','daw');

insert into Trabajo (trabajo_id, titulo, grupo) VALUES ('2','trabajo dos','daw2');
