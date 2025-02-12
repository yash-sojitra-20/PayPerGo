package com.example.affiliateadda.dto;

public class ProductDTO {

    private Long productId;
    private String productName;
    private double perClickPrice;
    private String productType;
    private double perBuyPrice;

    public ProductDTO(Long productId, String productName, double perClickPrice, String productType, double perBuyPrice) {
        this.productId = productId;
        this.productName = productName;
        this.perClickPrice = perClickPrice;
        this.productType = productType;
        this.perBuyPrice = perBuyPrice;
    }

    public ProductDTO(Long productId, String productName, double perClickPrice, String productType) {
        this.productId = productId;
        this.productName = productName;
        this.perClickPrice = perClickPrice;
        this.productType = productType;
    }

    // Getters and Setters
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPerClickPrice() {
        return perClickPrice;
    }

    public void setPerClickPrice(double perClickPrice) {
        this.perClickPrice = perClickPrice;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public double getPerBuyPrice() {
        return perBuyPrice;
    }

    public void setPerBuyPrice(double perBuyPrice) {
        this.perBuyPrice = perBuyPrice;
    }

}
