package com.endava.ProiectEndava.repositories;

import com.endava.ProiectEndava.models.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventsRepository extends JpaRepository<Events,Integer> {
    List<Events> findAllByVenueID_VenueIdAndEventType_EventTypeName(Integer venueId,String eventType);
}
