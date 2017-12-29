DROP DATABASE IF EXISTS Department;

CREATE DATABASE Department;

USE Department;

CREATE TABLE employees(
  employeeId INT PRIMARY KEY AUTO_INCREMENT,
  name_employee VARCHAR(128) NOT NULL,
  salary_employee DOUBLE,
  date__of_adoption DATE NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE `departments` (
  `department_id` int PRIMARY KEY AUTO_INCREMENT,
  `name_department` varchar(128) NOT NULL UNIQUE ,
  `name_employee` varchar(128),
  `employeeId` INT
#    FOREIGN KEY (employeeId) REFERENCES employees(employeeId)
#    ON DELETE CASCADE
#    ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
