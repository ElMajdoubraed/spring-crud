package com.worldwidelogistics.invitationforshowcase.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class VisitorTModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    
    @Size(min=1, max=200, message="First name is required")
    private String firstName;
    @Size(min=1, max=200, message="Last name is required")
    private String lastName;
    @Min(4)
    private int invitationNumber;

    @Column(updatable = false)
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date createdAt;

    @PrePersist
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date updatedAt;
    @PreUpdate
    protected void onUpdate(){
        this.updatedAt = new Date();
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getInvitationNumber() {
        return this.invitationNumber;
    }

    public void setInvitationNumber(int invitationNumber) {
        this.invitationNumber = invitationNumber;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    

    
}