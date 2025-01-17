package com.example.paypergo.controller;

import com.example.paypergo.dto.ProductDTO;
import com.example.paypergo.model.Product;
import com.example.paypergo.model.User;
import com.example.paypergo.repository.UserRepository;
import com.example.paypergo.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
@CrossOrigin("http://localhost:5173")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private UserRepository userRepository;

    // Endpoint to add a new product
    @PostMapping("/add")
    public ResponseEntity<Product> addProduct(@RequestBody Product product, Principal principal) {

        //debug
        System.out.println("------------------------------------------------->inside addProduct - controller : "+product);
        System.out.println("Product received: " + product.getProductName() + ", " + product.getProductBaseurl() + ", " + product.getPerClickPrice());

        //Get User
        System.out.println("------------------------------------------------->finding the user");
        String username = principal.getName();
        System.out.println("------------------------------------------------->Username is " + username);
        Optional<User> user = userRepository.findByUsername(username);
        if (user.isEmpty()) {
            return ResponseEntity.badRequest().body(product);
        }
        //debug
        System.out.println("-------------------------------------------------->User found :"+user);

        //set User to Product
        product.setUser(user.get());

        Product savedProduct = productService.addProduct(product);
        return ResponseEntity.ok(savedProduct);
    }

    @GetMapping("/list")
    public ResponseEntity<List<ProductDTO>> listProduct() {
        System.out.println("Fetching the list of products...(Controller)");
        List<ProductDTO> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }
}
