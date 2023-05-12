/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  THIEN
 * Created: May 10, 2023
 */

USE charity_management_app

CREATE TABLE ADDRESS 
(
    ID INTEGER PRIMARY KEY,
    STREET NVARCHAR (200),
    CITY NVARCHAR (50) NOT NULL,
    PROVINCE NVARCHAR (50) NOT NULL
);