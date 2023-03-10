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
    
    @Size(min=1, max=200, message="Article name is required")
    private String articleName;
    @Size(min=1, max=200, message="Article model required")
    private String articleModel;
    @Min(0)
    private int price;

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

    public String getArticleName() {
        return this.articleName;
    }

    public void setArticleName(String articleName) {
        this.articleName = articleName;
    }

    public String getArticleModel() {
        return this.articleModel;
    }

    public void setArticleModel(String model) {
        this.articleModel = model;
    }

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
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