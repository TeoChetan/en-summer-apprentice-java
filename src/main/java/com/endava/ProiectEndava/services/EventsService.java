package com.endava.ProiectEndava.services;

import com.endava.ProiectEndava.models.Events;
import com.endava.ProiectEndava.models.TicketsCategory;
import com.endava.ProiectEndava.repositories.EventsRepository;
import com.endava.ProiectEndava.repositories.TicketsCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EventsService implements IEventsService {

    @Autowired
    private EventsRepository eventsRepository;
    @Autowired
    private TicketsCategoryRepository ticketsCategoryRepository;
    @Autowired
    private EventsService(EventsRepository eventsRepository){
        this.eventsRepository = eventsRepository;
    }
    @Override
    public List<Events> getEvents(Integer venueId, String evenType) {
        return eventsRepository.findAllByVenueID_VenueIdAndEventType_EventTypeName(venueId,evenType);
    }

    public List<TicketsCategory> getTicketCategoriesForEvent(Integer eventId) {
        return ticketsCategoryRepository.findAllByEvent_EventId(eventId);
    }
}
