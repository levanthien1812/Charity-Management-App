/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  THIEN
 * Created: May 10, 2023
 */

CREATE TABLE DISTRIBUTE_EVENT
(
    ID INTEGER PRIMARY KEY,
    NAME NVARCHAR (400) NOT NULL,
    DESCRIPTION NVARCHAR (1000) NOT NULL,
    DATE DATE NOT NULL,
    ADDRESS_ID INTEGER NOT NULL
);

-- SET FOREIGN KEY
ALTER TABLE DISTRIBUTE_EVENT
ADD CONSTRAINT FK_DISTRI_ADDRESS_ID FOREIGN KEY (ADDRESS_ID)
REFERENCES ADDRESS(ID);
