/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.BikeRentalApp.controllers;

import com.test.BikeRentalApp.beans.Login;
import com.test.BikeRentalApp.beans.User;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

/**
 *
 * @author Keagan Nigel Gonsalves <kg19aaj@herts.ac.uk>
 */
@Controller
public class HomeController {
    @GetMapping("/home")
    public String goHome(){
        System.out.println("in home controller");
        return "index";
    }
    
    @GetMapping("/goToSearch")
    public String goToSearch(){
        System.out.println("going to search page");
        return "search";
    }
    
    @GetMapping("/goToLogin")
    public String goToLogin(){
        System.out.println("going to login page");
        return "login";
    }

    @GetMapping("/goToRegistration")
    public String goToRegistration(){
        System.out.println("going to register page");
        return "register";
    }

//    @ModelAttribute("newuser")
//    public User getDefaultUser(){
//        return new User();
//    }
//
//    @ModelAttribute("genderItems")
//    public List<String> getGenderItems(){
//        return Arrays.asList(new String[]{"Male", "Female", "Other"});
//    }
//    
//    @ModelAttribute("login")
//    public Login getDefaultLogin(){
//        return new Login();
//    }
}
