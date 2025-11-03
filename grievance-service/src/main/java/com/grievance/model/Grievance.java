package com.grievance.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Grievance {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String customerName;
    private String product;
    private String company;
    @Column(columnDefinition = "TEXT")
    private String description;
    private String state;
    private LocalDateTime createdAt = LocalDateTime.now();

    // getters/setters
    public Long getId(){return id;}
    public void setId(Long id){this.id=id;}
    public String getCustomerName(){return customerName;}
    public void setCustomerName(String customerName){this.customerName=customerName;}
    public String getProduct(){return product;}
    public void setProduct(String product){this.product=product;}
    public String getCompany(){return company;}
    public void setCompany(String company){this.company=company;}
    public String getDescription(){return description;}
    public void setDescription(String description){this.description=description;}
    public String getState(){return state;}
    public void setState(String state){this.state=state;}
    public LocalDateTime getCreatedAt(){return createdAt;}
    public void setCreatedAt(LocalDateTime createdAt){this.createdAt=createdAt;}
}
