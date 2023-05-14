/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  THIEN
 * Created: May 10, 2023
 */

set dmy 

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

-- INSERT DATA
INSERT INTO DONOR VALUES (1, 'Lê Văn Thiện', 1, '0343130769', '2002-12-18', '', 'levanthienabc@gmail.com', 0, 1);
INSERT INTO DONOR VALUES (2, 'Nguyễn Hùng Thịnh', 0, '0343130768', '2002-01-05', '', 'thinhintro@gmail.com', 0, 2);
INSERT INTO DONOR VALUES (3, 'Nguyễn Đỗ Nhã Khuyên', 1, '0343136769', '2002-01-01', '', 'nguyendonhakhuyen@gmail.com', 0, 3);
INSERT INTO DONOR VALUES (4, 'Nguyễn Lê Thái Hoàng', 1, '0343138769', '2002-01-01', '', 'nguyenlethaihoang@gmail.com', 0, 4);
