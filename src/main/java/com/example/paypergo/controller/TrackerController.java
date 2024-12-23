package com.example.paypergo.controller;

import com.example.paypergo.dto.LinkDto;
import com.example.paypergo.model.Product;
import com.example.paypergo.service.ProductService;
import com.example.paypergo.service.TrackerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/link")
public class TrackerController {

    @Autowired
    private TrackerService trackerService;

    @Autowired
    private ProductService productService;

    @PostMapping("/generate")
    public String generateLink(@RequestBody LinkDto linkDto) {
        Long productId = linkDto.getProductId();
        Product product = productService.getProductById(productId);
        if (product == null) {
            return "Product not found";
        }
        Long user_id = linkDto.getUserId();
        Long product_id = product.getProductId();
        String product_baseurl = product.getProductBaseurl();

        return trackerService.generateLink(user_id, product_id, product_baseurl);
    }

    @GetMapping("/track")
    public String trackClick(@RequestParam String encodedUrl){
        trackerService.trackClick(encodedUrl);
//        return "redirect:/";
        return "Click tracked successfully!";
    }

}
