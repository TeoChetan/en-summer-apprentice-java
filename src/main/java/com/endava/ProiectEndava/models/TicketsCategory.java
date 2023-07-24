package com.endava.ProiectEndava.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name="tickets_category")
public class TicketsCategory implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ticket_category_id")
    private Integer ticketCategoryId;

    @Column(name="description")
    private String description;
    @Column(name="price")
    private double price;

    public TicketsCategory() {}

    public Integer getTicketCategoryId() {
        return ticketCategoryId;
    }

    public void setTicketCategoryId(Integer ticketCategoryId) {
        this.ticketCategoryId = ticketCategoryId;
    }

    public Events getEvent() {
        return event;
    }

    public void setEvent(Events event) {
        this.event = event;
    }

    public String getDescription() {return description;}
    public void setDescription(String description) {this.description = description;}
    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}
    public TicketsCategory( Events eventId, String description, double price) {
        this.event = eventId;
        this.description = description;
        this.price = price;
    }

    @ManyToOne
    @JoinColumn(name="event_id")
    private Events event;

}
