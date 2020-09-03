/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.test.BikeRentalApp.repository;

import com.test.BikeRentalApp.beans.Product;
import com.test.BikeRentalApp.beans.User;
import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Keagan Nigel Gonsalves <kg19aaj@herts.ac.uk>
 */
public interface UserRepository extends CrudRepository<User, Integer>{
    @Query("select u from User u where u.username= :name")
    public User searchByName(@Param("name") String username);
    
    @Query("select u from User u where u.username= :name")
    public Optional<User> searchUserByName(@Param("name") String username);
    
}
