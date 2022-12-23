-- phpMyAdmin SQL Dump
-- version 5.3.0-dev+20221020.10dfc6d641
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 02-12-2022 a las 21:04:50
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.5

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `mundial`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `continente`
--

CREATE TABLE `continente` (
  `id` int(15) NOT NULL,
  `nombre` varchar(15) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `continente`
--

INSERT INTO `continente` (`id`, `nombre`) VALUES
(1, 'SurAmerica'),
(2, 'NorteAmerica'),
(3, 'Africa'),
(4, 'Europa'),
(5, 'Asia'),
(6, 'Oceania');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `seleccion`
--

CREATE TABLE `seleccion` (
  `id` int(15) NOT NULL,
  `nombre` varchar(15) COLLATE utf8_bin NOT NULL,
  `continente_id` int(15) NOT NULL,
  `tecnico` varchar(15) COLLATE utf8_bin NOT NULL,
  `goles_favor` int(15) NOT NULL,
  `goles_contra` int(15) NOT NULL,
  `partidos_ganados` int(15) NOT NULL,
  `partidos_perdidos` int(15) NOT NULL,
  `partidos_jugados` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Volcado de datos para la tabla `seleccion`
--

INSERT INTO `seleccion` (`id`, `nombre`, `continente_id`, `tecnico`, `goles_favor`, `goles_contra`, `partidos_ganados`, `partidos_perdidos`, `partidos_jugados`) VALUES
(1, 'Colombia', 1, 'josefa', 6, 4, 6, 2, 8),
(2, 'argelia', 3, 'manuel', 4, 2, 3, 2, 5),
(3, 'eeuu', 2, 'will', 7, 2, 7, 2, 9);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `continente`
--
ALTER TABLE `continente`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `seleccion`
--
ALTER TABLE `seleccion`
  ADD PRIMARY KEY (`id`),
  ADD KEY `continente_id` (`continente_id`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `seleccion`
--
ALTER TABLE `seleccion`
  ADD CONSTRAINT `seleccion_ibfk_1` FOREIGN KEY (`continente_id`) REFERENCES `continente` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
