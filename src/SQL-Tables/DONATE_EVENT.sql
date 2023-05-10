/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  THIEN
 * Created: May 10, 2023
 */

CREATE TABLE DONATE_EVENT
(
    ID INTEGER PRIMARY KEY,
    NAME NVARCHAR2(400) NOT NULL,
    DESCRIPTION NVARCHAR2(1000) NOT NULL,
    DATE DATE NOT NULL,
    ADDRESS INTEGER NOT NULL,
);

-- SET FOREIGN KEY
ALTER TABLE DONATE_EVENT
ADD CONSTRAINT FK_ADDRESS FOREIGN KEY (ADDRESS_ID)
REFERENCES ADDRESS(ID);