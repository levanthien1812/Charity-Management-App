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

INSERT INTO ADDRESS VALUES (1, 'Đông Lâm 2', 'An Nhơn', 'Bình Định');
INSERT INTO ADDRESS VALUES (2, '', 'Tri Tôn', 'An Giang');
INSERT INTO ADDRESS VALUES (3, '', 'Ngũ Hành Sơn', 'Đà Nẵng');
INSERT INTO ADDRESS VALUES (4, '', 'Cao Lãnh', 'Đồng Tháp');