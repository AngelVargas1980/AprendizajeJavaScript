-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema universidad
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema universidad
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `universidad` DEFAULT CHARACTER SET latin1 ;
USE `universidad` ;

-- -----------------------------------------------------
-- Table `universidad`.`genero`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `universidad`.`genero` (
  `idgenero` INT(11) NOT NULL AUTO_INCREMENT,
  `descripcion` VARCHAR(45) NOT NULL COMMENT 'Este es un ejemplo de notas en las tablas',
  PRIMARY KEY (`idgenero`))
ENGINE = InnoDB
AUTO_INCREMENT = 3
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `universidad`.`alumno`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `universidad`.`alumno` (
  `numero_carne` INT(11) NOT NULL,
  `nombre` VARCHAR(75) NOT NULL,
  `correo` VARCHAR(45) NULL DEFAULT NULL,
  `telefono` VARCHAR(15) NULL DEFAULT NULL,
  `direccion` VARCHAR(105) NULL DEFAULT NULL,
  `genero_idgenero` INT(11) NOT NULL,
  PRIMARY KEY (`numero_carne`),
  INDEX `fk_Alumno_genero_idx` (`genero_idgenero` ASC) VISIBLE,
  CONSTRAINT `fk_Alumno_genero`
    FOREIGN KEY (`genero_idgenero`)
    REFERENCES `universidad`.`genero` (`idgenero`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `universidad`.`curso`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `universidad`.`curso` (
  `codigo_curso` INT(11) NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`codigo_curso`))
ENGINE = InnoDB
AUTO_INCREMENT = 52
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `universidad`.`inscripcion`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `universidad`.`inscripcion` (
  `idinscripcion` INT(11) NOT NULL AUTO_INCREMENT,
  `fecha_inscripcion` DATE NOT NULL,
  `Alumno_numero_carne` INT(11) NOT NULL,
  PRIMARY KEY (`idinscripcion`),
  INDEX `fk_inscripcion_Alumno1_idx` (`Alumno_numero_carne` ASC) VISIBLE,
  CONSTRAINT `fk_inscripcion_Alumno1`
    FOREIGN KEY (`Alumno_numero_carne`)
    REFERENCES `universidad`.`alumno` (`numero_carne`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `universidad`.`asignacion_curso`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `universidad`.`asignacion_curso` (
  `idasignacion_curso` INT(11) NOT NULL AUTO_INCREMENT,
  `inscripcion_idinscripcion` INT(11) NOT NULL,
  `curso_codigo_curso` INT(11) NOT NULL,
  PRIMARY KEY (`idasignacion_curso`),
  INDEX `fk_asignacion_curso_inscripcion1_idx` (`inscripcion_idinscripcion` ASC) VISIBLE,
  INDEX `fk_asignacion_curso_curso1_idx` (`curso_codigo_curso` ASC) VISIBLE,
  CONSTRAINT `fk_asignacion_curso_curso1`
    FOREIGN KEY (`curso_codigo_curso`)
    REFERENCES `universidad`.`curso` (`codigo_curso`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_asignacion_curso_inscripcion1`
    FOREIGN KEY (`inscripcion_idinscripcion`)
    REFERENCES `universidad`.`inscripcion` (`idinscripcion`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
