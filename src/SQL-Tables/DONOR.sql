/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  THIEN
 * Created: May 10, 2023
 */

CREATE TABLE DONOR
(
    ID INTEGER PRIMARY KEY,
    NAME NVARCHAR(50) NOT NULL,
    GENDER INTEGER NOT NULL,
    PHONE CHAR(10) NOT NULL UNIQUE,
    DATE_OF_BIRTH DATE NOT NULL,
    PHOTO VARCHAR (255),
    EMAIL VARCHAR(255) UNIQUE NOT NULL ,
    SCORE INTEGER NOT NULL,
    ADDRESS_ID INTEGER NOT NULL
);

DROP TABLE DONOR

-- SET FOREIGN KEY
ALTER TABLE DONOR
ADD CONSTRAINT FK_DONOR_ADDRESS_ID FOREIGN KEY (ADDRESS_ID)
REFERENCES ADDRESS(ID);
