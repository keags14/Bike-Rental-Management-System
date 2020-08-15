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
public class Category {
    @Id
    private int id;
    
    private String name;
    
    private String description;
    
    @Column(name = "image_url")
    private String imageURL;
    
    @Column(name = "is_active")
    private boolean active = true;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "Category{" + "id=" + id + ", name=" + name + ", description=" + description + ", imageURL=" + imageURL + ", active=" + active + '}';
    }
    
}
