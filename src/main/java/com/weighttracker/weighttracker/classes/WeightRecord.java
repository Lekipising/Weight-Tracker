package com.weighttracker.weighttracker.classes;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "WeightRecord")
public class WeightRecord {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer recordId;

    @Column(name = "recordWeight", nullable = false)
    private Integer recordWeight;

    @CreationTimestamp
    @Column(name = "recordDate", nullable = false)
    private Date recordDate;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "username", referencedColumnName = "username")
    private User user;

    public Date getRecordDate() {
        return recordDate;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public Integer getRecordWeight() {
        return recordWeight;
    }
    
    public void setRecordDate(Date recordDate) {
        this.recordDate = recordDate;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public void setRecordWeight(Integer recordWeight) {
        this.recordWeight = recordWeight;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
