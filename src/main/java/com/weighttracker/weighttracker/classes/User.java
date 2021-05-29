package com.weighttracker.weighttracker.classes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "user")
public class User {
    
    @Id
    @Column(unique = true)
    private String username;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "country", nullable = false)
    private String country;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "age", nullable = false)
    private Integer age;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "weight", nullable = false)
    private Integer weight;

    @CreationTimestamp
    @Column(name = "createdOn", nullable = false)
    private Date createdOn;

    @UpdateTimestamp
    @Column(name = "updatedOn", nullable = false)
    private Date updatedOn;

    @Column(name = "password", nullable = false)
    private String password;

    public Integer getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public String getUsername() {
        return username;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public User(){}

}
