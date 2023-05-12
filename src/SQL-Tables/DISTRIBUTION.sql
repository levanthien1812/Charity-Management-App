/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  THIEN
 * Created: May 10, 2023
 */

CREATE TABLE DISTRIBUTION
(
    RECEIVER_ID INTEGER NOT NULL,
    EVENT_ID INTEGER NOT NULL,
    CATEGORY_ID INTEGER NOT NULL,
    AMOUNT INTEGER NOT NULL,
    PRIMARY KEY (RECEIVER_ID, EVENT_ID, CATEGORY_ID)
);

-- SET FOREIGN KEY
ALTER TABLE DISTRIBUTION
ADD CONSTRAINT FK_DISTRI_RECEIVER_ID FOREIGN KEY (RECEIVER_ID)
REFERENCES RECEIVER(ID);

ALTER TABLE DISTRIBUTION
ADD CONSTRAINT FK_DISTRI_EVENT_ID FOREIGN KEY (EVENT_ID)
REFERENCES DISTRIBUTE_EVENT(ID);

ALTER TABLE DISTRIBUTION
ADD CONSTRAINT FK_DISTRI_CATEGORY_ID FOREIGN KEY (CATEGORY_ID)
REFERENCES CATEGORY(ID);