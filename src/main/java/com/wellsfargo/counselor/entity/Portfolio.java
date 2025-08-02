package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Portfolio {
    @Id
    @GeneratedValue()
    private long portfolioId;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @Column(name = "creation_date", nullable = false)
    private LocalDate creationDate;

    @Column(name = "last_updated")
    private LocalDateTime lastUpdated;

    @Column(name = "is_active", nullable = false)
    private boolean isActive;

    protected Portfolio(){

    }

    public Portfolio(Client client, LocalDate creationDate, boolean isActive){
        this.client = client;
        this.creationDate = creationDate;
        this.isActive = isActive;
    }

    public long getPortfolioId() {
        return portfolioId;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    @PrePersist
    @PreUpdate
    public void setLastUpdated() {
        this.lastUpdated = LocalDateTime.now();
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }
}
