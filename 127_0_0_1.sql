-- phpMyAdmin SQL Dump
-- version 4.0.9
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-03-2014 a las 07:30:45
-- Versión del servidor: 5.5.34
-- Versión de PHP: 5.4.22

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `grandslam`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `arbitro`
--

CREATE TABLE IF NOT EXISTS `arbitro` (
  `idarbitro` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `nacionalidad` varchar(45) NOT NULL,
  `tiempo` varchar(45) NOT NULL,
  PRIMARY KEY (`idarbitro`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `arbitro`
--

INSERT INTO `arbitro` (`idarbitro`, `nombre`, `nacionalidad`, `tiempo`) VALUES
(1, 'Luis Rangel', 'Mexicano', 'Primer');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `entrenador`
--

CREATE TABLE IF NOT EXISTS `entrenador` (
  `identrenador` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `fecha_inicio` date NOT NULL,
  `fecha_final` date NOT NULL,
  PRIMARY KEY (`identrenador`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `entrenador`
--

INSERT INTO `entrenador` (`identrenador`, `nombre`, `fecha_inicio`, `fecha_final`) VALUES
(2, 'Jesus Cagide', '2014-03-02', '2014-06-26');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `grandslam`
--

CREATE TABLE IF NOT EXISTS `grandslam` (
  `idgrandslam` int(11) NOT NULL AUTO_INCREMENT,
  `nombreTorneo` varchar(45) NOT NULL,
  `año` date NOT NULL,
  `idpais` int(11) NOT NULL,
  PRIMARY KEY (`idgrandslam`,`idpais`),
  KEY `fk_grandslam_Pais1_idx` (`idpais`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `grandslam`
--

INSERT INTO `grandslam` (`idgrandslam`, `nombreTorneo`, `año`, `idpais`) VALUES
(1, 'Mexican', '2014-03-02', 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `jugador`
--

CREATE TABLE IF NOT EXISTS `jugador` (
  `idjugador` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `edad` varchar(45) NOT NULL,
  `ganancias` float NOT NULL,
  `identrenador` int(11) NOT NULL,
  `idnacionalidad` int(11) NOT NULL,
  PRIMARY KEY (`idjugador`,`identrenador`,`idnacionalidad`),
  KEY `fk_jugador_entrenador_idx` (`identrenador`),
  KEY `fk_jugador_nacionalidad1_idx` (`idnacionalidad`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `jugador`
--

INSERT INTO `jugador` (`idjugador`, `nombre`, `edad`, `ganancias`, `identrenador`, `idnacionalidad`) VALUES
(1, 'Carlos Cervantes Bedoy', '23', 0, 2, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `lugar`
--

CREATE TABLE IF NOT EXISTS `lugar` (
  `idlugar` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `idpais` int(11) NOT NULL,
  PRIMARY KEY (`idlugar`,`idpais`),
  KEY `fk_Lugar_Pais1_idx` (`idpais`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `lugar`
--

INSERT INTO `lugar` (`idlugar`, `nombre`, `idpais`) VALUES
(1, 'DF', 10),
(2, 'Aguascalientes', 10);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `nacionalidad`
--

CREATE TABLE IF NOT EXISTS `nacionalidad` (
  `idnacionalidad` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`idnacionalidad`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Volcado de datos para la tabla `nacionalidad`
--

INSERT INTO `nacionalidad` (`idnacionalidad`, `nombre`) VALUES
(1, 'Mexicana'),
(2, 'Americana');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pais`
--

CREATE TABLE IF NOT EXISTS `pais` (
  `idpais` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  PRIMARY KEY (`idpais`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=13 ;

--
-- Volcado de datos para la tabla `pais`
--

INSERT INTO `pais` (`idpais`, `nombre`) VALUES
(10, 'Mexico'),
(11, 'Italia'),
(12, 'España');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `partido`
--

CREATE TABLE IF NOT EXISTS `partido` (
  `idpartido` int(11) NOT NULL AUTO_INCREMENT,
  `modalidad` varchar(45) NOT NULL,
  `idarbitro` int(11) NOT NULL,
  `idjugador` int(11) NOT NULL,
  `identrenador` int(11) NOT NULL,
  `idgrandslam` int(11) NOT NULL,
  PRIMARY KEY (`idpartido`,`idarbitro`,`idjugador`,`identrenador`,`idgrandslam`),
  KEY `fk_partido_arbitro1_idx` (`idarbitro`),
  KEY `fk_partido_jugador1_idx` (`idjugador`,`identrenador`),
  KEY `fk_partido_grandslam1_idx` (`idgrandslam`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `partido`
--

INSERT INTO `partido` (`idpartido`, `modalidad`, `idarbitro`, `idjugador`, `identrenador`, `idgrandslam`) VALUES
(1, 'Solo', 1, 1, 2, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `premio`
--

CREATE TABLE IF NOT EXISTS `premio` (
  `idpremio` int(11) NOT NULL AUTO_INCREMENT,
  `monto` varchar(45) NOT NULL,
  `categoria` varchar(45) NOT NULL,
  `idgrandslam` int(11) NOT NULL,
  `idjugador` int(11) NOT NULL,
  `identrenador` int(11) NOT NULL,
  PRIMARY KEY (`idpremio`,`idgrandslam`,`idjugador`,`identrenador`),
  KEY `fk_premio_grandslam1_idx` (`idgrandslam`),
  KEY `fk_premio_jugador1_idx` (`idjugador`,`identrenador`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=2 ;

--
-- Volcado de datos para la tabla `premio`
--

INSERT INTO `premio` (`idpremio`, `monto`, `categoria`, `idgrandslam`, `idjugador`, `identrenador`) VALUES
(1, '35000', 'Masculino', 1, 1, 2);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `grandslam`
--
ALTER TABLE `grandslam`
  ADD CONSTRAINT `fk_grandslam_Pais1` FOREIGN KEY (`idpais`) REFERENCES `pais` (`idpais`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `jugador`
--
ALTER TABLE `jugador`
  ADD CONSTRAINT `fk_jugador_entrenador` FOREIGN KEY (`identrenador`) REFERENCES `entrenador` (`identrenador`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_jugador_nacionalidad1` FOREIGN KEY (`idnacionalidad`) REFERENCES `nacionalidad` (`idnacionalidad`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `lugar`
--
ALTER TABLE `lugar`
  ADD CONSTRAINT `fk_Lugar_Pais1` FOREIGN KEY (`idpais`) REFERENCES `pais` (`idpais`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `partido`
--
ALTER TABLE `partido`
  ADD CONSTRAINT `fk_partido_arbitro1` FOREIGN KEY (`idarbitro`) REFERENCES `arbitro` (`idarbitro`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_partido_grandslam1` FOREIGN KEY (`idgrandslam`) REFERENCES `grandslam` (`idgrandslam`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_partido_jugador1` FOREIGN KEY (`idjugador`, `identrenador`) REFERENCES `jugador` (`idjugador`, `identrenador`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `premio`
--
ALTER TABLE `premio`
  ADD CONSTRAINT `fk_premio_grandslam1` FOREIGN KEY (`idgrandslam`) REFERENCES `grandslam` (`idgrandslam`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `fk_premio_jugador1` FOREIGN KEY (`idjugador`, `identrenador`) REFERENCES `jugador` (`idjugador`, `identrenador`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
