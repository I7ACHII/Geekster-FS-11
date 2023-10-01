package com.geekster.UniversityEventManagement.Service;

import com.geekster.UniversityEventManagement.Model.Event;
import com.geekster.UniversityEventManagement.Model.Student;
import com.geekster.UniversityEventManagement.Repository.IEventRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EventService {
    
    @Autowired
    IEventRepo iEventRepo;
    public String addEvent(Event event) {
        iEventRepo.save(event);
        return "event has been added";
    }


    public List<Event> getAllEventsByDate(String localDate) {

        return iEventRepo.findByDate(localDate);

//        List<Event> allEvents = iEventRepo.findAll();
//        List<Event> eventsByDate = new ArrayList<>();
//        for(Event event : allEvents){
//            if(event.getDate().equals(localDate)){
//                eventsByDate.add(event);
//            }
//        }

//        return eventsByDate;
    }

    public String deleteById(Long eventId) {
        iEventRepo.deleteById(eventId);
        return "event has been added!!";
    }

    public String updateLocationOfEventById(Long eventId, String location) {
        Optional<Event> event = iEventRepo.findById(eventId);
        Event eventObj = null;
        if(event.isPresent()){
            eventObj = event.get();
        }
        else{
            return "Id not found!!";
        }
        eventObj.setLocationOfEvent(location);
        iEventRepo.save(eventObj);
        return "location has been updated!!";

    }
}
