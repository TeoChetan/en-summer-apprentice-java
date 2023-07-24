package com.endava.ProiectEndava.controllers;

import com.endava.ProiectEndava.DTOs.EventsDTO;
import com.endava.ProiectEndava.DTOs.TicketCategoryDTO;
import com.endava.ProiectEndava.DTOs.VenuesDTO;
import com.endava.ProiectEndava.models.Events;
import com.endava.ProiectEndava.models.TicketsCategory;
import com.endava.ProiectEndava.models.Venues;
import com.endava.ProiectEndava.services.EventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@RestController
public class EventsController {

    @Autowired
    private EventsService eventsService;

    @Autowired
    public EventsController(EventsService eventsService) {
        this.eventsService = eventsService;
    }

    @GetMapping("/events")
    List<EventsDTO> getEventsByVenueIdAndEventType(@RequestParam Integer venueId, @RequestParam String eventType) {
        List<Events> events = eventsService.getEvents(venueId, eventType);
        List<EventsDTO> eventDTOList = new ArrayList<>();

        for (Events event : events){
            EventsDTO eventsDTO = new EventsDTO();
            VenuesDTO venuesDTO =new VenuesDTO();


            venuesDTO.setId(event.getVenueID().getVenueId());
            venuesDTO.setName(event.getVenueID().getType());
            venuesDTO.setLocation(event.getVenueID().getLocation());
            venuesDTO.setCapacity(event.getVenueID().getCapacity());

            eventsDTO.setId(event.getEventId());
            eventsDTO.setDescription(event.getEventDescription());
            eventsDTO.setName(event.getEventName());
            eventsDTO.setStartDate(event.getStartDate());
            eventsDTO.setEndDate(event.getEndDate());
            eventsDTO.setType(event.getEventType().getEventTypeName());


            eventsDTO.setVenue(venuesDTO);

            List<TicketCategoryDTO> ticketCategoryDTOS = new ArrayList<>();
            List<TicketsCategory> ticketsCategories = eventsService.getTicketCategoriesForEvent(event.getEventId());
            for (TicketsCategory ticketCategory: ticketsCategories) {
                TicketCategoryDTO ticketCategoryDTO = new TicketCategoryDTO();
                ticketCategoryDTO.setId(ticketCategory.getTicketCategoryId());
                ticketCategoryDTO.setDescription(ticketCategory.getDescription());
                ticketCategoryDTO.setPrice(ticketCategory.getPrice());
                ticketCategoryDTOS.add(ticketCategoryDTO);
            }
            eventsDTO.setTicketCategories(ticketCategoryDTOS);
            eventDTOList.add(eventsDTO);
        }
        return eventDTOList;

    }

}



