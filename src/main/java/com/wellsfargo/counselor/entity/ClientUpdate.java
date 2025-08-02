package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class ClientUpdate {

    @Id
    @GeneratedValue()
    private long clientUpdateId;

    @ManyToOne
    @JoinColumn(name = "advisor_id", nullable = false)
    private Advisor advisor;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client;

    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;

    @Column(columnDefinition = "TEXT")
    private String desc;

    protected ClientUpdate(){

    }

    public ClientUpdate(Advisor advisor, Client client, LocalDateTime updatedAt,
                        String desc){
        this.advisor = advisor;
        this.client = client;
        this.updatedAt = updatedAt;
        this.desc = desc;
    }

    public Long getClientUpdateId() {
        return clientUpdateId;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
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
