/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Date;

/**
 *
 * @author THIEN
 */
public class Donor {
    private int id;
    private String name;
    private int gender;
    private String phone;
    private Date date_of_birth;
    private String photo;
    private String email;
    private int score;
    private int address_id;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setAddress_id(int address_id) {
        this.address_id = address_id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public String getPhoto() {
        return photo;
    }

    public String getEmail() {
        return email;
    }

    public int getScore() {
        return score;
    }

    public int getAddress_id() {
        return address_id;
    }
    
    
}
