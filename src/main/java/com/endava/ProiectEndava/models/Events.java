package com.endava.ProiectEndava.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "events")
public class Events implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "event_id")
    private Integer eventId;
    @Column(name="event_description")
    private String eventDescription;
    @Column(name="event_name")
    private String eventName;
    @Column(name="start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;


    public Events() {
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }
    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Events(Venues venueId, EventsType eventTypeId, String eventDescription, String eventName, LocalDate startDate, LocalDate endDate) {
        this.venueID = venueId;
        this.eventType = eventTypeId;
        this.eventDescription = eventDescription;
        this.eventName = eventName;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Event{" +
                "eventId=" + eventId +
                ", venueId=" + venueID+
                ", eventTypeId=" + eventType +
                ", eventDescription='" + eventDescription + '\'' +
                ", eventName='" + eventName + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }



    public Venues getVenueID() {
        return venueID;
    }

    public void setVenueID(Venues venueID) {
        this.venueID = venueID;
    }

    public EventsType getEventType() {
        return eventType;
    }

    public void setEventType(EventsType eventType) {
        this.eventType = eventType;
    }

    @ManyToOne
    @JoinColumn(name="venue_id")
    private Venues venueID;

    @ManyToOne
    @JoinColumn(name="event_type_id")
    private EventsType eventType;




//    @OneToMany(fetch =  FetchType.EAGER,mappedBy = "event_id")
//    @JsonIgnoreProperties("eventId")
//    List<TicketCategory> ticketCategoryList;


//    public List<TicketCategory> getTicketCategoryList() {
//        return ticketCategoryList;
//    }
//
//    public void setTicketCategoryList(List<TicketCategory> ticketCategoryList) {
//        this.ticketCategoryList = ticketCategoryList;
//    }
}

