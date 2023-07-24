package com.endava.ProiectEndava.models;

import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.io.Serializable;

@Entity
@Table(name="venues")
public class Venues implements Serializable {
    @Id
    @Column(name="venue_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer venueId;
    @Column(name="location")
    private String location;
    @Column(name = "type")
    private String type;
    @Column(name = "capacity")
    private Integer capacity;

    public Venues() {}
    public Integer getVenueId() {return venueId;}
    public void setVenueId(Integer venueId) {this.venueId = venueId;}
    public String getLocation() {return location;}
    public void setLocation(String location) {this.location = location;}
    public String getType() {return type;}
    public void setType(String type) {this.type = type;}
    public Integer getCapacity() {return capacity;}
    public void setCapacity(Integer capacity) {this.capacity = capacity;}

    public Venues( String location, String type, Integer capacity) {

        this.location = location;
        this.type = type;
        this.capacity = capacity;
    }
}
