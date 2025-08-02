package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Security {
    @Id
    @GeneratedValue()
    private long securityId;

    @ManyToOne
    @JoinColumn(name = "portfolio_id", nullable = false)
    private Portfolio portfolioId;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String category;

    @Column(name = "purchase_price", precision = 10, scale = 2, nullable = false)
    private BigDecimal purchasePrice;

    @Column(name = "purchase_date", nullable = false)
    private LocalDate purchaseDate;

    @Column(nullable = false)
    private int quantity;

    @Column(name = "date_removed")
    private LocalDate dateRemoved;

    @Column(name = "is_active", nullable = false)
    private boolean isActive;

    @Column(name = "last_updated")
    private LocalDateTime lastUpdated;

    protected Security(){

    }

    protected Security(Portfolio portfolioId, String name, String category,
                       BigDecimal purchasePrice, LocalDate purchaseDate, int quantity,
                       LocalDate dateRemoved, boolean isActive){
        this.portfolioId = portfolioId;
        this.name = name;
        this.category = category;
        this.purchasePrice = purchasePrice;
        this.purchaseDate = purchaseDate;
        this.quantity = quantity;
        this.dateRemoved = dateRemoved;
        this.isActive = isActive;
    }

    public long getSecurityId() {
        return securityId;
    }

    public Portfolio getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(Portfolio portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public LocalDate getDateRemoved() {
        return dateRemoved;
    }

    public void setDateRemoved(LocalDate dateRemoved) {
        this.dateRemoved = dateRemoved;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    @PrePersist
    @PreUpdate
    public void setLastUpdated() {
        this.lastUpdated = LocalDateTime.now();
    }
}
