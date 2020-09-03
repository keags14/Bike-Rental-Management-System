/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.BikeRentalApp.controllers;

import com.test.BikeRentalApp.beans.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

/**
 *
 * @author Keagan Nigel Gonsalves <kg19aaj@herts.ac.uk>
 */
@Controller
public class CartController {
    @RequestMapping("/show")
    public String showCart(@SessionAttribute("product")Product product, Model model){
        
        model.addAttribute("userClickShowCart", true);
        model.addAttribute("cartLines", "User Cart");
        model.addAttribute("userClickShowCart", null);
        model.addAttribute("product", product);
        
        return "cart";
    }
}
