package com.example.paypergo.dto;

import java.util.List;

public class ProfileResponseDTO {
    private String username;
    private List<EarningDTO> earnings;
    private double totalEarnings;
    private List<PayableDTO> payableAmounts;
    private double totalPayableAmount;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<EarningDTO> getEarnings() {
        return earnings;
    }

    public void setEarnings(List<EarningDTO> earnings) {
        this.earnings = earnings;
    }

    public double getTotalEarnings() {
        return totalEarnings;
    }

    public void setTotalEarnings(double totalEarnings) {
        this.totalEarnings = totalEarnings;
    }

    public List<PayableDTO> getPayableAmounts() {
        return payableAmounts;
    }

    public void setPayableAmounts(List<PayableDTO> payableAmounts) {
        this.payableAmounts = payableAmounts;
    }

    public double getTotalPayableAmount() {
        return totalPayableAmount;
    }

    public void setTotalPayableAmount(double totalPayableAmount) {
        this.totalPayableAmount = totalPayableAmount;
    }

    public static class EarningDTO {
        private Long tId;
        private String productGeneratedUrl;
        private String productName;
        private double perClickPrice;
        private long count;
        private double perBuyPrice;
        private long buyCount;
        private boolean active;

        // Getters and setters


        public boolean isActive() {
            return active;
        }

        public void setActive(boolean active) {
            this.active = active;
        }

        public String getProductGeneratedUrl() {
            return productGeneratedUrl;
        }

        public void setProductGeneratedUrl(String productGeneratedUrl) {
            this.productGeneratedUrl = productGeneratedUrl;
        }

        public Long gettId() {
            return tId;
        }

        public void settId(Long tId) {
            this.tId = tId;
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

        public long getCount() {
            return count;
        }

        public void setCount(long count) {
            this.count = count;
        }

        public double getPerBuyPrice() {
            return perBuyPrice;
        }

        public void setPerBuyPrice(double perBuyPrice) {
            this.perBuyPrice = perBuyPrice;
        }

        public long getBuyCount() {
            return buyCount;
        }

        public void setBuyCount(long buyCount) {
            this.buyCount = buyCount;
        }
    }

    public static class PayableDTO {
        private Long productId;
        private String productBaseurl;
        private String productName;
        private double perClickPrice;
        private long count;
        private double perBuyPrice;
        private long buyCount;
        private boolean active;

        // Getters and setters


        public boolean isActive() {
            return active;
        }

        public void setActive(boolean active) {
            this.active = active;
        }

        public String getProductBaseurl() {
            return productBaseurl;
        }

        public void setProductBaseurl(String productBaseurl) {
            this.productBaseurl = productBaseurl;
        }

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

        public long getCount() {
            return count;
        }

        public void setCount(long count) {
            this.count = count;
        }

        public double getPerBuyPrice() {
            return perBuyPrice;
        }

        public void setPerBuyPrice(double perBuyPrice) {
            this.perBuyPrice = perBuyPrice;
        }

        public long getBuyCount() {
            return buyCount;
        }

        public void setBuyCount(long buyCount) {
            this.buyCount = buyCount;
        }
    }
}
