package com.endava.ProiectEndava.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "orders")
public class Orders implements Serializable {
    @Id
    @Column(name="orders_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer ordersId;
    @Column(name = "ordered_at")
    private LocalDateTime orderedAt;
    @Column(name="number_of_tickets")
    private Integer numberOfTickets;
    @Column(name = "total_price")
    private double totalPrice;

    public Integer getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    public LocalDateTime getOrderedAt() {
        return orderedAt;
    }

    public void setOrderedAt(LocalDateTime orderedAt) {
        this.orderedAt = orderedAt;
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

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public TicketsCategory getTicketCategory() {
        return ticketCategory;
    }

    public void setTicketCategory(TicketsCategory ticketCategory) {
        this.ticketCategory = ticketCategory;
    }

    public Orders( Users userId, TicketsCategory ticketCategoryId, LocalDateTime orderedAt, Integer numberOfTickets, double totalPrice, Users user, TicketsCategory ticketCategory) {
        this.orderedAt = orderedAt;
        this.numberOfTickets = numberOfTickets;
        this.totalPrice = totalPrice;
        this.user = user;
        this.ticketCategory = ticketCategory;
    }



    public Orders() {}

    @ManyToOne
    @JoinColumn(name="user_id")
    private Users user;
    @ManyToOne
    @JoinColumn(name = "ticket_category_id")
    private TicketsCategory ticketCategory;

}
