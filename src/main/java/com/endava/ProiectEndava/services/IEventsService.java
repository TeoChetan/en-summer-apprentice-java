package com.endava.ProiectEndava.services;

import com.endava.ProiectEndava.models.Events;

import java.util.List;

public interface IEventsService {
    public List<Events> getEvents(Integer venueId,String evenType);

}
