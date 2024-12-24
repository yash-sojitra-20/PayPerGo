package com.example.paypergo.model;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Entity
//@Data
//@NoArgsConstructor
//@AllArgsConstructor
@Component
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long productId;

    String productName;
    String productBaseurl;

    @OneToMany(mappedBy = "product")
    private List<Tracker> trackers;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Product() {}

    public Product(Long productId, String productName, String productBaseurl, List<Tracker> trackers) {
        this.productId = productId;
        this.productName = productName;
        this.productBaseurl = productBaseurl;
        this.trackers = trackers;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long product_id) {
        this.productId = product_id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String product_name) {
        this.productName = product_name;
    }

    public String getProductBaseurl() {
        return productBaseurl;
    }

    public void setProductBaseurl(String product_baseurl) {
        this.productBaseurl = product_baseurl;
    }

    public List<Tracker> getTrackers() {
        return trackers;
    }

    public void setTrackers(List<Tracker> trackers) {
        this.trackers = trackers;
    }
}