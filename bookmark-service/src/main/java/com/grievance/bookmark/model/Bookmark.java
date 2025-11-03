package com.grievance.bookmark.model;

import jakarta.persistence.*;

@Entity
public class Bookmark {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long userId;
    private Long grievanceId;
    private String note;

    // getters/setters
    public Long getId(){return id;}
    public void setId(Long id){this.id=id;}
    public Long getUserId(){return userId;}
    public void setUserId(Long userId){this.userId=userId;}
    public Long getGrievanceId(){return grievanceId;}
    public void setGrievanceId(Long grievanceId){this.grievanceId=grievanceId;}
    public String getNote(){return note;}
    public void setNote(String note){this.note=note;}
}
