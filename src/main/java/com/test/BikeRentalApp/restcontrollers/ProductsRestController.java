package com.test.BikeRentalApp.restcontrollers;

import com.test.BikeRentalApp.beans.Product;
import com.test.BikeRentalApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class ProductsRestController {

    @Autowired
    private ProductRepository productRepository;

  /*  @GetMapping("/BikeRentalApp/rest/products")
    @ResponseBody
    public List<Product> getProducts() {
        //calll product repo
        List<Product> products = new ArrayList<>();
        productRepository.findAll().forEach(product -> products.add(product));
        return products;

    }*/

    @GetMapping("/BikeRentalApp/rest/products")
      public ResponseEntity getProductsByRequestParam(@RequestParam("name") String name){
        List<Product> products = productRepository.searchByName(name);
        return new ResponseEntity<>(products, HttpStatus.OK);
    }
    
    @GetMapping("/BikeRentalApp/rest/products/{name}")
    public ResponseEntity getProductsByPathVariable(@PathVariable("name") String name){
      List<Product> products = productRepository.searchByName(name);
      return new ResponseEntity<>(products, HttpStatus.OK);
  }
    
}
