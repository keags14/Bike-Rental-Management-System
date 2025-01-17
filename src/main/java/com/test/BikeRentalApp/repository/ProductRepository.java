package com.test.BikeRentalApp.repository;

import com.test.BikeRentalApp.beans.Product;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends CrudRepository<Product, Integer> {

    @Query("select p from Product p where p.name like %:name%")
    public List<Product> searchByName(@Param("name") String name);
    
    @Query("select p from Product p where p.name = :name")
    public Product selectByProductName(@Param("name") String name);
}
