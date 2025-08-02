package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Client {

    @Id
    @GeneratedValue()
    private long clientId;

    @ManyToOne
    @JoinColumn(name = "advisor_id", nullable = false)
    private Advisor advisor;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(nullable = false)
    private String address;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String email;

    @Column(name = "date_joined", nullable = false)
    private LocalDate dateJoined;

    @Column(name = "date_removed")
    private LocalDate dateRemoved;

    @Column(name = "is_active", nullable = false)
    private boolean isActive;

    @Column(name = "last_updated")
    private LocalDateTime lastUpdated;

    protected Client(){

    }

    public Client(Advisor advisor, String firstName, String lastName, String address, String phone,
                  String email, LocalDate dateJoined, LocalDate dateRemoved, boolean isActive){
        this.advisor = advisor;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.dateJoined = dateJoined;
        this.dateRemoved = dateRemoved;
        this.isActive = isActive;
    }

    public Long getClientId(){
        return clientId;
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

    public LocalDate getDateRemoved() {
        return dateRemoved;
    }

    public void setDateRemoved(LocalDate dateRemoved) {
        this.dateRemoved = dateRemoved;
    }

    public LocalDate getDateJoined() {
        return dateJoined;
    }

    public void setDateJoined(LocalDate dateJoined) {
        this.dateJoined = dateJoined;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
