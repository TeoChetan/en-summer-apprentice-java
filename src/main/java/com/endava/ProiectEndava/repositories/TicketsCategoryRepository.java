package com.endava.ProiectEndava.repositories;

import com.endava.ProiectEndava.models.Events;
import com.endava.ProiectEndava.models.TicketsCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TicketsCategoryRepository extends JpaRepository<TicketsCategory,Integer> {
    List<TicketsCategory> findAllByEvent_EventId(Integer venueId);

}
