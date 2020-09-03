/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.BikeRentalApp.controllers;

import com.test.BikeRentalApp.beans.Product;
import com.test.BikeRentalApp.repository.ProductRepository;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 *
 * @author Keagan Nigel Gonsalves <kg19aaj@herts.ac.uk>
 */
@Controller
@SessionAttributes("product")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;
    
    @Autowired
    private AsyncTaskExecutor taskExecutor;
    
    @GetMapping("/product/{name}")
    public String goToProduct(@PathVariable("name") String name, Model model, HttpServletRequest request){
        System.out.println("in product controller");
        System.out.println("Product user selected is " + name);
        
        Product product = new Product();
        
        product = productRepository.selectByProductName(name);
       
        model.addAttribute("product", product);
        
        return "product";
    }
}
