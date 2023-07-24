package com.endava.ProiectEndava.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="events_type")
public class EventsType implements Serializable {
    @Id
    @Column(name = "event_type_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer eventTypeId;

    @Column(name = "event_type_name")
    private String eventTypeName;

    public EventsType(){}

    public Integer getEventTypeId() {
        return eventTypeId;
    }

    public void setEventTypeId(Integer eventTypeId) {
        this.eventTypeId = eventTypeId;
    }

    public String getEventTypeName() {
        return eventTypeName;
    }

    public void setEventTypeName(String eventTypeName) {
        this.eventTypeName = eventTypeName;
    }

    public EventsType(Integer eventTypeId, String eventTypeName) {
        this.eventTypeId = eventTypeId;
        this.eventTypeName = eventTypeName;
    }
}
