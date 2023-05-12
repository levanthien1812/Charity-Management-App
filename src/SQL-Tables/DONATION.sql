/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  THIEN
 * Created: May 10, 2023
 */

CREATE TABLE DONATION
(
    DONOR_ID INTEGER NOT NULL,
    EVENT_ID INTEGER NOT NULL,
    CATEGORY_ID INTEGER NOT NULL,
    AMOUNT INTEGER NOT NULL,
    PRIMARY KEY (DONOR_ID, EVENT_ID, CATEGORY_ID)
);

-- SET FOREIGN KEY
ALTER TABLE DONATION
ADD CONSTRAINT FK_DONATE_DONOR_ID FOREIGN KEY (DONOR_ID)
REFERENCES DONOR(ID);

ALTER TABLE DONATION
ADD CONSTRAINT FK_DONATE_EVENT_ID FOREIGN KEY (EVENT_ID)
REFERENCES DONATE_EVENT(ID);

ALTER TABLE DONATION
ADD CONSTRAINT FK_DONATE_CATEGORY_ID FOREIGN KEY (CATEGORY_ID)
REFERENCES CATEGORY(ID);