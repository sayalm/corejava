-- Database: employee
CREATE TABLE EMPLOYEE
(
    ID INT NOT NULL,
    NAME VARCHAR(100) NOT NULL,
    SALARY int NOT NULL,
    PRIMARY KEY (ID)
);

-- DROP DATABASE employee;

CREATE DATABASE employee
  WITH OWNER = postgres
       ENCODING = 'UTF8'
       TABLESPACE = pg_default
       LC_COLLATE = 'English_United States.1252'
       LC_CTYPE = 'English_United States.1252'
       CONNECTION LIMIT = -1;

