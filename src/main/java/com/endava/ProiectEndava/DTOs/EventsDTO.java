package com.endava.ProiectEndava.DTOs;

import com.endava.ProiectEndava.models.EventsType;

import java.time.LocalDate;
import java.util.List;

import java.time.LocalDate;
import java.util.List;

public class EventsDTO {
    private Integer id;
    private VenuesDTO venue;
    private String type;
    private String description;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private List<TicketCategoryDTO> ticketCategories;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public VenuesDTO getVenue() {
        return venue;
    }

    public void setVenue(VenuesDTO venue) {
        this.venue = venue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<TicketCategoryDTO> getTicketCategories() {
        return ticketCategories;
    }

    public void setTicketCategories(List<TicketCategoryDTO> ticketCategories) {
        this.ticketCategories = ticketCategories;
    }
}
