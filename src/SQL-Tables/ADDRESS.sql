/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  THIEN
 * Created: May 10, 2023
 */

CREATE TABLE ADDRESS 
(
    ID INTEGER PRIMARY KEY,
    STREET NVARCHAR2 (200),
    CITY NVARCHAR2 (50) NOT NULL,
    PROVINCE NVARCHAR2 (50) NOT NULL
);