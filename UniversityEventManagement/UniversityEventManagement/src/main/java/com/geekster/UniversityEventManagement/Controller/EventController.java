package com.geekster.UniversityEventManagement.Controller;


import com.geekster.UniversityEventManagement.Model.Event;
import com.geekster.UniversityEventManagement.Service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
public class EventController {

    @Autowired
    EventService eventService;

    @PostMapping("event")
    public String addEvent(@RequestBody Event event){
        return eventService.addEvent(event);
    }

    @GetMapping("event/date/{localDate}")
    public List<Event> getAllEventsByDate(@PathVariable String localDate){
        return eventService.getAllEventsByDate(localDate);
    }

    @DeleteMapping("event/id/{eventId}")
    public String deleteById(@PathVariable Long eventId){
        return eventService.deleteById(eventId);
    }

    @PutMapping("event/id/{eventId}/location/{location}")
    public String updateLocationOfEventById(@PathVariable Long eventId, @PathVariable String location){
        return eventService.updateLocationOfEventById(eventId, location);
    }
}
