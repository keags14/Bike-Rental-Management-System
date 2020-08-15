/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.BikeRentalApp.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Keagan Nigel Gonsalves <kg19aaj@herts.ac.uk>
 */
@Entity
public class Product {
    @Id
    private int id;
    private String name;
    private String imagePath;
    
    @Column(name = "priceperminute")
    private float pricePerMinute;
    
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public float getPricePerMinute() {
        return pricePerMinute;
    }

    public void setPricePerMinute(float pricePerMinute) {
        this.pricePerMinute = pricePerMinute;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
