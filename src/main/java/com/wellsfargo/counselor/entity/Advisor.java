package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Advisor {

    @Id
    @GeneratedValue()
    private long advisorId;

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

    //new vars
    @Column(name = "date_hired", nullable = false)
    private LocalDate dateHired;

    @Column(name = "is_active", nullable = false)
    private boolean isActive;

    @Column(name = "password_hash", nullable = false)
    private String passwordHash;

    protected Advisor() {

    }

    public Advisor(String firstName, String lastName, String address, String phone, String email, LocalDate dateHired, boolean isActive, String passwordHash) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.dateHired = dateHired;
        this.isActive = isActive;
        this.passwordHash = passwordHash;
    }

    public Long getAdvisorId() {
        return advisorId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //new methods for new vars
    public LocalDate getDateHired() {
        return dateHired;
    }

    public void setDateHired(LocalDate dateHired) {
        this.dateHired = dateHired;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getPasswordHash() {
        return passwordHash;
    }

    public void setPasswordHash(String passwordHash) {
        this.passwordHash = passwordHash;
    }
}
