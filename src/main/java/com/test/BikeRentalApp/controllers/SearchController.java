/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.BikeRentalApp.controllers;

import com.test.BikeRentalApp.beans.Product;
import com.test.BikeRentalApp.repository.ProductRepository;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.AsyncTaskExecutor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.context.request.async.DeferredResult;

/**
 *
 * @author Keagan Nigel Gonsalves <kg19aaj@herts.ac.uk>
 */
@Controller
public class SearchController {
    
    @Autowired
    private ProductRepository productRepository;
    
    @Autowired
    private AsyncTaskExecutor taskExecutor;

    @GetMapping("/search")
    public DeferredResult<String> search(@RequestParam("search") String search, Model model, HttpServletRequest request){
        DeferredResult<String> deferredResult = new DeferredResult<String>();
        System.out.println("in search controller");
        System.out.println("search criteria: "+search);
        System.out.println("Async supported in application: " + request.isAsyncSupported());
        System.out.println("Thread from the servlet container" + Thread.currentThread().getName());
        
//        return ()->{
//            Thread.sleep(3000);
//            System.out.println("Thread from the spring mvc task executor" + Thread.currentThread().getName());
//            List<Product> products = new ArrayList<>();
//            products = productRepository.searchByName(search);
//            model.addAttribute("products", products);
//            return "search";
//        };
        taskExecutor.execute(()->{
            try{
            Thread.sleep(3000);
            } catch(InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println("Thread from the spring mvc task executor" + Thread.currentThread().getName());
            List<Product> products = new ArrayList<>();
            products = productRepository.searchByName(search);
            model.addAttribute("products", products);
            deferredResult.setResult("search");
        });
        
        return deferredResult;
    }
}
