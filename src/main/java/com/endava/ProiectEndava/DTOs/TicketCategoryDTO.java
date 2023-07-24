package com.endava.ProiectEndava.DTOs;

import org.springframework.data.relational.core.sql.In;

public class TicketCategoryDTO {
    private Integer id;
    private String description;
    private double price;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
