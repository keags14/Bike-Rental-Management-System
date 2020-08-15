package com.test.BikeRentalApp.controllers;

import com.test.BikeRentalApp.beans.Login;
import com.test.BikeRentalApp.beans.User;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

@ControllerAdvice
public class DefaultModelAttributeController {

    @ModelAttribute("newuser")
    public User getDefaultUser(){
        return new User();
    }

    @ModelAttribute("genderItems")
    public List<String> getGenderItems(){
        return Arrays.asList(new String[]{"Male", "Female", "Other"});
    }
    
    @ModelAttribute("userRole")
    public List<String> getUserRoles(){
        return Arrays.asList(new String[]{"Admin", "Supplier", "Customer"});
    }
    
    @ModelAttribute("categories")
    public List<String> getCategories(){
        return Arrays.asList(new String[]{"Bike", "Bike helmets", "Accessories"});
    }

    @ModelAttribute("login")
    public Login getDefaultLogin(){
        return new Login();
    }
}
