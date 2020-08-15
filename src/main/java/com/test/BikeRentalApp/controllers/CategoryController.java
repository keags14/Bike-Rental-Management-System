/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.BikeRentalApp.controllers;

import com.test.BikeRentalApp.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.task.AsyncTaskExecutor;

/**
 *
 * @author Keagan Nigel Gonsalves <kg19aaj@herts.ac.uk>
 */
public class CategoryController {
    @Autowired
    private CategoryRepository categoryRepository;
    
    @Autowired
    private AsyncTaskExecutor taskExecutor;
}
