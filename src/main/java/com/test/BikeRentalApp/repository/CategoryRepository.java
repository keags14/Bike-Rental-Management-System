/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.BikeRentalApp.repository;

import com.test.BikeRentalApp.beans.Category;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Keagan Nigel Gonsalves <kg19aaj@herts.ac.uk>
 */
@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {
    
    @Query("select c from Category c")
    public List<Category> getCategoryList();
    
    @Query("select c from Category c where c.id = :id")
    public Category getCategoryById(int id);
}
