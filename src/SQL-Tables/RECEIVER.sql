/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  THIEN
 * Created: May 10, 2023
 */

CREATE TABLE RECEIVER
(
    ID INTEGER PRIMARY KEY,
    NAME NVARCHAR2(50) NOT NULL,
    GENDER INTEGER NOT NULL,
    PHONE CHAR(10) NOT NULL UNIQUE,
    DATE_OF_BIRTH DATE NOT NULL,
    PHOTO VARCHAR2 (255),
    DISADVANTAGE NVARCHAR2 (1000) NOT NULL,
    ADDRESS INTEGER NOT NULL,
);

-- SET FOREIGN KEY
ALTER TABLE RECEIVER
ADD CONSTRAINT FK_ADDRESS_ID FOREIGN KEY (ADDRESS_ID)
REFERENCES ADDRESS(ID);