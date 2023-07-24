package com.endava.ProiectEndava.DTOs;

import java.time.LocalDateTime;

public class OrdersDTO {
    //private Integer userId;
    private Integer eventId;
    private LocalDateTime timeStamp;
    private Integer numberOfTickets;
    private double totalPrice;
    private Integer ticketCategoryId;

//    public Integer getUserId() {
//        return userId;
//    }
//
//    public void setUserId(Integer userId) {
//        this.userId = userId;
//    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Integer getNumberOfTickets() {
        return numberOfTickets;
    }

    public void setNumberOfTickets(Integer numberOfTickets) {
        this.numberOfTickets = numberOfTickets;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Integer getTicketCategoryId() {
        return ticketCategoryId;
    }

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public void setTicketCategoryId(Integer ticketCategoryId) {
        this.ticketCategoryId = ticketCategoryId;
    }

    public OrdersDTO(Integer eventId, LocalDateTime timeStamp, Integer numberOfTickets, double totalPrice, Integer ticketCategoryId) {
        this.eventId = eventId;
        this.timeStamp = timeStamp;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
        this.ticketCategoryId = ticketCategoryId;
    }

    public OrdersDTO() {}
}
