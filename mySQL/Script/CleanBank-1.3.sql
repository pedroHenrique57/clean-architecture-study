-- MySQL Script generated by MySQL Workbench
-- Mon May 20 20:48:42 2024
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `mydb` DEFAULT CHARACTER SET utf8 ;
USE `mydb` ;

-- -----------------------------------------------------
-- Table `mydb`.`checking__account`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`checking__account` (
  `id__checking__account` INT NOT NULL AUTO_INCREMENT,
  `balance` INT NULL,
  PRIMARY KEY (`id__checking__account`),
  UNIQUE INDEX `idconta__corrente_UNIQUE` (`id__checking__account` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`savings__account`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`savings__account` (
  `id__savings__account` INT NOT NULL AUTO_INCREMENT,
  `balance` INT NULL,
  PRIMARY KEY (`id__savings__account`),
  UNIQUE INDEX `idconta__corrente_UNIQUE` (`id__savings__account` ASC) VISIBLE)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`client`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`client` (
  `id__client` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `id__checking__account` INT NOT NULL,
  `id__savings__account` INT NOT NULL,
  PRIMARY KEY (`id__client`, `id__checking__account`),
  INDEX `fk_cliente2_conta__corrente_idx` (`id__checking__account` ASC) VISIBLE,
  UNIQUE INDEX `id__client_UNIQUE` (`id__client` ASC) VISIBLE,
  UNIQUE INDEX `id__checking__account_UNIQUE` (`id__checking__account` ASC) VISIBLE,
  INDEX `fk_client_savings__account1_idx` (`id__savings__account` ASC) VISIBLE,
  CONSTRAINT `fk_cliente2_conta__corrente`
    FOREIGN KEY (`id__checking__account`)
    REFERENCES `mydb`.`checking__account` (`id__checking__account`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_client_savings__account1`
    FOREIGN KEY (`id__savings__account`)
    REFERENCES `mydb`.`savings__account` (`id__savings__account`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `mydb`.`bank`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `mydb`.`bank` (
  `id__bank` INT NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(45) NOT NULL,
  `clients__id__client` INT NULL,
  PRIMARY KEY (`id__bank`),
  UNIQUE INDEX `id__banco_UNIQUE` (`id__bank` ASC) VISIBLE,
  INDEX `fk_bank_client1_idx` (`clients__id__client` ASC) VISIBLE,
  UNIQUE INDEX `client_id__client_UNIQUE` (`clients__id__client` ASC) VISIBLE,
  CONSTRAINT `fk_bank_client1`
    FOREIGN KEY (`clients__id__client`)
    REFERENCES `mydb`.`client` (`id__client`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
