package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class SecurityUpdate {

    @Id
    @GeneratedValue()
    private long securityUpdateId;

    @ManyToOne
    @JoinColumn(name = "advisor_id", nullable = false)
    private Advisor advisor;

    @ManyToOne
    @JoinColumn(name = "security_id", nullable = false)
    private Security security;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @Column(columnDefinition = "TEXT")
    private String desc;

    protected SecurityUpdate(){

    }

    public SecurityUpdate(Advisor advisor, Security security, LocalDateTime updatedAt,
                        String desc){
        this.advisor = advisor;
        this.security = security;
        this.updatedAt = updatedAt;
        this.desc = desc;
    }

    public Long getSecurityUpdateId() {
        return securityUpdateId;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
